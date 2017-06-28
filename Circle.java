package JTSprograms;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

/**
 * A class object for demonstrating parameter-passing.
 * 
 * @author Joshua Kuehn
 *
 */
public class Circle {
	CircleInner inner;
	
	/**
	 * The constructor for the Circle class object.
	 */
	public Circle() {
		inner = new CircleInner();
	}

	/**
	 * Draws a circle to the screen.
	 * 
	 * @param radius
	 *            (50 - 500) The radius of the circle.
	 * @param red
	 *            (0 - 255) The red portion of the circle's color.
	 * @param green
	 *            (0 - 255) The green portion of the circle's color.
	 * @param blue
	 *            (0 - 255) The blue portion of the circle's color
	 */
	public void draw(int radius, int red, int green, int blue) {
		inner.draw(radius, red, green, blue);
	}

	/**
	 * This inner class hides all of the crazy JFrame methods that would be
	 * visible and confusing.
	 * 
	 * @author Joshua Kuehn
	 *
	 */
	private class CircleInner extends JFrame {
		private static final long serialVersionUID = -5068012649643927178L;

		// Variables and such
		int radius = 0;
		int frameSize = 0;
		int r = 0, g = 0, b = 0;
		Color drawColor = Color.RED;

		public CircleInner() {

		}

		public void draw(int toRadius, int red, int green, int blue) {
			r = (red > 255) ? 255 : ((red < 0) ? 0 : red);
			g = (green > 255) ? 255 : ((green < 0) ? 0 : green);
			b = (blue > 255) ? 255 : ((blue < 0) ? 0 : blue);
			radius = (toRadius > 500) ? 500 : ((toRadius < 50) ? 50 : toRadius);
			frameSize = 2 * radius;
			drawColor = new Color(r, g, b);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			setTitle("Parameter Demo Using Circles");
			setSize(frameSize, frameSize);
			setLocation(150, 150);
			setVisible(true);
		}

		/**
		 * The following method is not explicitly called in the program, but it
		 * definitely executes sometime around the setVisible(true) method.
		 */
		public void paint(Graphics g) {
			g.setColor(drawColor);
			g.fillOval(radius / 2, radius / 2, radius, radius);
		}

	}
}
