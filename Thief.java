package dungeon;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;

public class Thief extends Hero
{
	public Thief(ViewController controller) throws FileNotFoundException 
	{
		super("Thief", 75, 6, .8, 20, 40, .5, 4, 
		      new File("sprites/ThiefSprite.txt"), 
		      controller, 
		      new String[] {"1. Attack", "2. Surprise Attack"}
		);
	}

	public void surpriseAttack(DungeonCharacter opponent) throws Exception 
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
//			numTurns++;
			controller.updateView(this, "Surprise!");
			TimeUnit.SECONDS.sleep(1);
			attack(opponent);
		}
		else if (surprise >= .9)
		{
			controller.updateView(opponent, "Block!");
		}
		else
		{
			attack(opponent);
		}
	}
}
