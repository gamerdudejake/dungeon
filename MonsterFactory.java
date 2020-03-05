import java.util.Random;
public class MonsterFactory {

	
	
	public static Monster generateMonster(ViewController controller) 
			throws Exception  
			{
				int choice;

				choice = (int)(Math.random() * 3) + 1;

				switch(choice)
				{

					case 1: return new Ogre(controller);

					case 2: return new Gremlin(controller);

					case 3: return new Skeleton(controller);

					default: return new Skeleton(controller);
				}
			}
	
	
		public static Monster randomMonster(ViewController controller)
		{
			Random random = new Random();
			int ran = random.nextInt(3);
			if(ran==0)
			{
				return new Ogre(controller);
			}
			else if(ran==1)
			{
				return new Gremlin(controller);

			}
			else if(ran==2)
			{
				return new Skeleton(controller);
			}
			else
			{
				return new Skeleton(controller);
			}
		}
}
