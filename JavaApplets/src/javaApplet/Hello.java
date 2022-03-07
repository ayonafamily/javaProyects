/**
 * Primer applet
 */
package javaApplet;
import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author jorge ayona
 *
 */
public class Hello extends Applet {
	
	/**
	 *  Dibujar Hello world en applet
	 */
	
	String welcome = "Hello world";
	private static final long serialVersionUID = 6760906842274474248L;
	
	public void init() {
		resize (200,200);
	}

	public void paint ( Graphics g ) {
		g.drawString(welcome , 60, 100); // (x,y)
	}

}
