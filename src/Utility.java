import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Utility {

	/////////////////Graphics/////////////////////////////
	
	public static void setBackground(Graphics g, Color c)
	
	{
     	g.setColor(c);
      	g.fillRect(0,0,1000,650);
	}

	public static void setRandomColor(Graphics g)
	{
      int red   = random(0,255);
      int green = random(0,255);
      int blue  = random(0,255);
      g.setColor(new Color(red, green, blue));
  	}
	
	public static void applyAntialiasing(Graphics g)
	{
		Graphics2D g2=(Graphics2D)g;
		
		RenderingHints rh= new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setRenderingHints(rh);
	}
	
	
////////////////*Graphics/////////////////////////////
	
////////////////Math/////////////////////////////

	public static int random(int min, int max)
	{
      int range = max - min + 1;
      int randomNumber = (int)(Math.random() * range) + min;
	   return randomNumber;
	}
	
	public static void delay(int time)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < time)
			endDelay = System.currentTimeMillis();
	}

////////////////*Math/////////////////////////////

////////////////Strings/////////////////////////////
	
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
  		int word_count = 5;
  		
  		
  		return word_count;
  	}
  	
  	public static void animateText(String s)
	{
		int x = 0;
		
		while (x <= s.length()-1)
		{ 
			System.out.print(s.charAt(x));			
			
			delay(50);
			x++;
		}
	}

	
////////////////*Strings/////////////////////////////
	
	
	
	
}
