import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * @author Joel Christophel
 * Date: 1/20/2015
 * Course: CS 220
 * Assignment: Lab 1
 */

public class ExampleFace extends JComponent {
	// Instance variables
	private String mood;
	private Color skinColor;
	private Color eyeColor;

	/**
	 * The instance variables are to be initialized here using the argument values
	 */
	public ExampleFace(String mood, Color skinColor, Color eyeColor) {
		this.mood = mood;
		this.skinColor = skinColor;
		this.eyeColor = eyeColor;
	}

	/**
	 * Paint the face using the graphics object
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		int width = this.getWidth();
		int height = this.getHeight();

		g2d.setColor(skinColor);
		g2d.fillOval(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(eyeColor);

		double eyeWidth = width * .1;
		double eyeHeight = height * .1;

		g2d.fillOval((int) (width * .5 - eyeWidth * 2), (int) (height * .2), (int) eyeWidth, (int) eyeHeight);
		g2d.fillOval((int) (width * .5 + eyeWidth), (int) (height * .2), (int) eyeWidth, (int) eyeHeight);

		if (skinColor.equals(Color.RED)) {
			g2d.setColor(Color.BLACK);
		} else {
			g2d.setColor(Color.RED);
		}

		g2d.setStroke(new BasicStroke(5));

		double mouthWidth = width * .4;
		double mouthHeight = height * .3;

		if (mood.equalsIgnoreCase("happy")) {
			g2d.drawArc((int) (width * .5 - mouthWidth * .5), (int) (height * .52), (int) mouthWidth,
					(int) mouthHeight, 200, 140);
		} else if (mood.equalsIgnoreCase("sad")) {
			g2d.drawArc((int) (width * .5 - mouthWidth * .5), (int) (height * .67), (int) mouthWidth,
					(int) mouthHeight, 20, 140);
		} else {
			g2d.drawLine((int) (width * .33), (int) (height * .7), (int) (width * .67), (int) (height * .7));
		}
	}
}