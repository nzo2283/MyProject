import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JComponent;

/**
 * @TemplateAuthor Joel Christophel
 * @author Nora Osei
 * Date: 1/20/2015
 * Course: CS 220
 * Assignment: Lab 1
 */

public class BoredFace extends JComponent {
	/**
	 * The instance variables are to be initialized here using the argument values
	 * @param skinColor: The color used in painting the face's skin
	 * @param eyeColor - The Color used in painting the face's eyes
	 * @param pupilColor - the Color used in painting the face's pupils
	 */

	private Color skinColor;
	private Color eyeColor;
	private Color pupilColor;


	/**
	 * At least two constructors
	 */
	//Default No-Argument Constructor
	public BoredFace () {

	}

	//Bored Face Constructor that changes the skin and eye color
	public BoredFace (Color UserSkinColor, Color UserEyeColor,Color UserPupilColor) {

		skinColor = UserSkinColor;
		eyeColor = UserEyeColor;
		pupilColor = UserPupilColor;

	}

	/**
	 * Paint the face using the graphics object
	 * 
	 * @param g - the Graphics object used to paint the face
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		//***Draws Bored Face***

		//Draw Head
		Ellipse2D.Double BoredHead = new Ellipse2D.Double(100,100,300,300);
		g2.translate(300, 0);
		g2.setColor(skinColor);
		g2.fill(BoredHead);

		//Draw Right Eye
		Arc2D.Double BoredEye = new Arc2D.Double(-230,-250,65,75,0,180,Arc2D.OPEN);
		g2.rotate(Math.toRadians(180));
		g2.setColor(eyeColor);
		g2.fill(BoredEye);

		//Draw Left Eye
		Arc2D.Double BoredEyeL = new Arc2D.Double(-230,-250,65,75,0,180,Arc2D.OPEN);
		g2.translate(-120,0);
		g2.fill(BoredEyeL);

		//Draw Right Pupil
		g2.rotate(Math.toRadians(180));
		Ellipse2D.Double pupilR = new Ellipse2D.Double(206, 220, 15, 15);
		g2.setColor(pupilColor);
		g2.fill(pupilR);

		//Draw Left Pupil
		Ellipse2D.Double pupilL = new Ellipse2D.Double(84, 220, 15, 15);
		g2.fill(pupilL);


		//Draw Mouth
		g2.setColor(Color.BLACK);
		Line2D BoredMouth = new Line2D.Double(100,330,200,330);
		g2.setStroke(new BasicStroke (5));
		g2.draw(BoredMouth);


		// Bored Face Label
		g2.setColor(Color.BLUE);
		g2.drawString("BORED FACE", 115, 450);

	}
	
	
	/**
	 * @return - a String representation of this Face object
	 */
//	public String toString() {
	//	return "Bored Face[pupil = " + pupilColor + ", skinColor = " + skinColor + ", eyeColor = " + eyeColor + "]";
	//}








}
