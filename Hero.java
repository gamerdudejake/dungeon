package dungeon;

import java.io.File;

public abstract class Hero extends DungeonCharacter
{
	protected double chanceToBlock;
	protected String[] actionList;

	public Hero(String name, 
                    int hitPoints, 
                    int attackSpeed, 
                    double chanceToHit, 
                    int damageMin, 
                    int damageMax,
                    double chanceToBlock,
		    int height,
		    File sprite,
                    ViewController controller,
		    String[] actionList
                   )
	{
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, height, sprite, controller);
		this.chanceToBlock = chanceToBlock;
		this.actionList = actionList;
		readName();
	}

	public void readName()
	{
		System.out.print("Enter character name: ");
		name = Keyboard.readString();
	}

	public boolean defend()
	{
		return Math.random() <= chanceToBlock;
	}

	public void modifyHitPoints(int hitPointChange) throws Exception 
	{
		if (hitPointChange < 0) 
		{
			if (defend())
			{
				controller.updateView(this, "Block!");
			} else {
				super.modifyHitPoints(hitPointChange);
			}
		} 
		else 
		{
			super.modifyHitPoints(hitPointChange);
		}
	}

	public String[] getActionList() 
	{
		return actionList;
	}

	public int getTurns(Monster opponent)
	{
		int turns = attackSpeed/opponent.getAttackSpeed();

		if (turns == 0)
		{
			turns++;
		}

		return turns;
	}

	public int chooseAction(Monster opponent)
	{
		String actionChoice = Integer.toString(Keyboard.readInt());

		for (String choice : actionList) 
		{
			if (choice.substring(0, 1).compareTo(actionChoice) == 0) 
			{
				return Integer.parseInt(actionChoice);
			}
		}

		if (Integer.parseInt(actionChoice) == actionList.length + 1)
		{
			return Integer.parseInt(actionChoice);
		}

		return 1;
	}
}
