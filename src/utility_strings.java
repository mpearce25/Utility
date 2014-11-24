
public class utility_strings {

	public static void skip(int n)
  	{
  		for (int j = 1; j <= n; j++)
  			System.out.println();
  	}

  	public static void rightJustify(String text)
  	{
  		int len = text.length();
  		int numSpaces = 80 - len;
  		for (int j = 1; j <= numSpaces; j++)
  			System.out.print(" ");
  		System.out.println(text);
  	}

  	public static void center(String text)
  	{
  		int len = text.length();
  		int numSpaces = (80 - len) / 2;
  		for (int j = 1; j <= numSpaces; j++)
  			System.out.print(" ");
  		System.out.println(text);
  	}
	
  	public static int wordCount(String text)
  	{
  		int word_count = 0;
  		
  		
  		return word_count;
  	}
	
}
