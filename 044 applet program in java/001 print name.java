// A PrintName Applet
// Save file as PrintName.java
import java.applet.Applet;
import java.awt.Graphics;

// HelloWorld class extends Applet
public class PrintName extends Applet
{
	// Overriding paint() method
	@Override
	public void paint(Graphics g)
	{
		g.drawString("Guneet Malhotra", 20, 20);
	}
	
}
