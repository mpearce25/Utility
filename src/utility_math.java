
public class utility_math 
{

	public static int random(int min, int max)
	{
      int range = max - min + 1;
      int randomNumber = (int)(Math.random() * range) + min;
	   return randomNumber;
	}
	
}
