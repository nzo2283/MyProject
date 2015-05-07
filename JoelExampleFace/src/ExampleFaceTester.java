import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * @author Joel Christophel
 * Date: 1/20/2015
 * Course: CS 220
 * Assignment: Lab 1
 */

public class ExampleFaceTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Face tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 333);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		int numberOfFaces = 3;
		
		frame.setLayout(new GridLayout(1, numberOfFaces));

		ExampleFace sadFace = new ExampleFace("sad", Color.BLUE, Color.WHITE);
		ExampleFace happyFace = new ExampleFace("happy", Color.WHITE, Color.RED);
		ExampleFace sosoFace = new ExampleFace("so-so", Color.GREEN, Color.ORANGE);

		frame.add(happyFace);
		frame.add(sadFace);
		frame.add(sosoFace);
	}
}