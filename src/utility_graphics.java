import java.awt.*;
import java.applet.*;

public class utility_graphics {
	
		
	public static void setBackground(Graphics g, Color c)
	
	{
     	g.setColor(c);
      	g.fillRect(0,0,1000,650);
	}

	public static void setRandomColor(Graphics g)
	{
      int red   = utility_math.random(0,255);
      int green = utility_math.random(0,255);
      int blue  = utility_math.random(0,255);
      g.setColor(new Color(red, green, blue));
  	}
	
	public static void applyAntialiasing(Graphics g)
	{
		Graphics2D g2=(Graphics2D)g;
		
		RenderingHints rh= new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setRenderingHints(rh);
	}
}
