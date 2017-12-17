import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot badger = new Robot();
	
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What color do you want the shape to be? Red, blue, or green.");
 if (color.equalsIgnoreCase("red")) {
	 badger.setPenColor(Color.RED);
 }
 if (color.equalsIgnoreCase("blue")) {
	 badger.setPenColor(Color.BLUE);
 }
 if (color.equalsIgnoreCase("green")) {
	 badger.setPenColor(Color.GREEN);
 }
 String shape = JOptionPane.showInputDialog("What shape do you want the robot to draw? Square, triangle, or circle.");
 if (shape.equalsIgnoreCase("square")) {
	drawSquare();
}
 else if(shape.equalsIgnoreCase("triangle")) {
	 drawTriangle();
 }
 else if(shape.equalsIgnoreCase("circle")) {
	 drawCircle();
 }
 
}
public static void drawSquare() {
	badger.setSpeed(100);
	badger.penDown();
	badger.move(100);
	badger.turn(90);
	badger.move(100);
	badger.turn(90);
	badger.move(100);
	badger.turn(90);
	badger.move(100);
	badger.turn(90);
}
public static void drawTriangle() {
	badger.setSpeed(100);
	badger.penDown();
	badger.turn(45);
	badger.move(100);
	badger.turn(90);
	badger.move(100);
	badger.turn(135);
	badger.move(140);
	badger.turn(135);
}
public static void drawCircle() {
for (int i = 0; i <= 360; i++) {
		badger.setSpeed(100);
		badger.penDown();
		badger.move(1);
		badger.turn(1);
	}	
}
}
