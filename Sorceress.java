package dungeon;

import java.io.File;

public class Sorceress extends Hero
{
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

	public Sorceress(ViewController controller)
	{
		super("Sorceress", 75, 5, .7, 25, 50, .3, 5, 
		      new File("sprites/SorceressSprite.txt"), 
		      controller, 
		      new String[] {"1. Attack", "2. Heal"}
		);
	}

	public void heal() throws Exception 
	{
		int hitPointChange = (int) (Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		super.modifyHitPoints(hitPointChange);
	}
}
