import java.awt.Component;

import javax.swing.JFrame;

import java.util.*;

public class AlienFace {

public static void main(String[] args) {
JFrame frame = new JFrame();
frame.setSize(150, 250);
frame.setTitle("An Alien Face");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

FaceComponent component = new FaceComponent();
frame.add(component);

frame.setVisible(true);

}

}

