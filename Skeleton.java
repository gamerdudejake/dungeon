package dungeon;

import java.io.File;
import java.io.FileNotFoundException;

public class Skeleton extends Monster
{
	public Skeleton(ViewController controller) throws FileNotFoundException 
	{
		super("Sargath the Skeleton", 100, 3, .8, .3, 30, 50, 30, 50, 5, 
		      new File("sprites/SkeletonSprite.txt"), 
		      controller
		);
	}
}
