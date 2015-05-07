//package com.joelchristophel;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JFrame;
//other imports

/**
 * @author Joel Christophel
 * @authorEdit Nora Osei
 * Date: 1/20/2015
 * Course: CS 220
 * Assignment: Lab 1
 *  * Help from http://docs.oracle.com/javase/tutorial/2d/advanced/transforming.html
 */

public class FaceTester {
	public static void main(String[] args) {
		int numberOfFaces = 2; // The number of faces you wish to display
		int faceSize = 800; // The width and height of each face in pixels

		//Read In info for Surprised face
		Scanner in = new Scanner(System.in);
		System.out.println("To create your SURPRISED face");
		System.out.println("Please Enter");
		System.out.println(" '1' for BLACK eyes and BLUE mouth");
		System.out.println(" '2' for PINK eyes and CYAN mouth");
		System.out.println(" '3' for RED eyes and BLACK mouth");
		System.out.println(" '4' for GREEN eyes and GRAY mouth");
		System.out.print("Please Enter Number Here then push 'ENTER' --> ");


		int UserInput = in.nextInt();

		//Instance Variable to change eye and mouth color
		Color eyeColor = null;
		Color mouthColor = null;

		if (UserInput == 1) {
			eyeColor = Color.BLACK;
			mouthColor = Color.BLUE;
		}
		else if (UserInput == 2 ) {
			eyeColor = Color.PINK;
			mouthColor = Color.CYAN;
		}
		else if (UserInput == 3 ) {
			eyeColor = Color.RED;
			mouthColor = Color.BLACK;
		}
		else if (UserInput == 4 ) {
			eyeColor = Color.GREEN;
			mouthColor = Color.GRAY;
		}
		System.out.println();

		//Read In info for Bored face
		System.out.println("To create your BORED face");
		System.out.println("Please Enter:");
		System.out.println(" '5' for ORANGE skin and BLUE eyes");
		System.out.println(" '6' for GREEN skin and RED eyes");
		System.out.println(" '7' for CYAN skin and GRAY eyes");
		System.out.println(" '8' for MAGENTA skin and BLACK eyes");
		System.out.print("Please Enter Number Here then push 'ENTER' --> ");
		int UserInput2 = in.nextInt();

		//Instance Variable to change eye color
		Color skinColor = null;
		Color eyeColor_ = null;

		if (UserInput2 == 5) {	
			skinColor = Color.ORANGE;
			eyeColor_ = Color.BLUE;
		}
		else if (UserInput2 == 6){
			skinColor = Color.GREEN;
			eyeColor_ = Color.RED;
		}
		else if (UserInput2 == 7 ) {
			skinColor = Color.CYAN;
			eyeColor_ = Color.GRAY;
		}
		else if (UserInput2 == 8 ) {
			skinColor = Color.MAGENTA;
			eyeColor_ = Color.BLACK;
		}

		in.close();

		
		
		// Creates new Surprised face object (Skin Color, Eye Color, Mouth Color)
		Face face1 = new Face(Color.WHITE, eyeColor, mouthColor);

		// Creates new Bored face object (Skin Color, Eye Color, Pupil Color)
		BoredFace face2 = new BoredFace(skinColor, eyeColor_, Color.WHITE);

		// Create and set up the window
		JFrame window = new JFrame("Opposite Faces");
		setUpFrame(window, numberOfFaces, faceSize);

		// Add your faces to the window
		window.add(face1);
		window.add(face2);

		System.out.println(face1.toString());
		System.out.println();
		System.out.println(face2.toString());




	}

	/**
	 * Sets up our window so that we may begin adding Face objects.
	 * 
	 * You may ignore the details of this method.
	 */
	private static void setUpFrame(JFrame frame, int numberOfFaces, int faceSize) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(faceSize * numberOfFaces, faceSize);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(1, numberOfFaces));
	}
}