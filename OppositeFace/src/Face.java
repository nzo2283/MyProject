import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JComponent;
//other imports

/**
 * @TemplateAuthor Joel Christophel
 * @author Nora Osei
 * Date: 1/20/2015
 * Course: CS 220
 * Assignment: Lab 1
 */

public class Face extends JComponent {

	/**
	 * The instance variables are to be initialized here using the argument values
	 * @param skinColor: The color used in painting the face's skin
	 * @param eyeColor - The Color used in painting the face's eyes
	 * @param mouthColor - the Color used in painting the face's mouth
	 */

	private Color skinColor;
	private Color eyeColor;
	private Color mouthColor;

	/**
	 * At least two constructors
	 */

	//Default No-Argument Constructor
	public Face () {

	}

	//Surprised Face Constructor that changes the skin, eye and mouth color
	public Face (Color UserSkinColor, Color UserEyeColor, Color UserMouthColor) {

		skinColor = UserSkinColor;
		eyeColor = UserEyeColor;
		mouthColor = UserMouthColor;
	}


	/**
	 * Paint the face using the graphics object
	 * 
	 * @param g - the Graphics object used to paint the face
	 */
	public void paintComponent(Graphics g) {
		
		//Recover Graphics 2D
		Graphics2D g2 = (Graphics2D) g;

		//***Draws Surprised Face***

		//Draw Head
		Ellipse2D.Double head = new Ellipse2D.Double(100,100,300,300);
		g2.setColor(skinColor);
		g2.fill(head);
		

		//Draw Right Eye
		Ellipse2D.Double eyeR = new Ellipse2D.Double(170, 190, 45, 45);
		g2.setColor(eyeColor);
		g2.fill(eyeR);


		//Draw Left Eye
		Ellipse2D.Double eyeL = new Ellipse2D.Double(170, 190, 45, 45);
		g2.translate(100, 0);
		g2.fill(eyeL);


		//Draw Mouth
		Ellipse2D.Double mouth = new Ellipse2D.Double(120, 300, 80, 80);
		g2.setColor(mouthColor);
		g2.fill(mouth);

		// Surprised Face Label
		g2.setColor(Color.BLUE);
		g2.drawString("SURPRISED FACE", 90, 450);


	}

	
	/**
	 * @return - a String representation of this Face object
	 */
//	public String toString() {
	//	return "Surprised Face[mouth = " + mouthColor + ", skinColor = " + skinColor + ", eyeColor = " + eyeColor + "]";
	//}

	
}