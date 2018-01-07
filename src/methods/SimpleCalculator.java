//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
				// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations	
for (int i = 0; i < 1000000; i++) {
		// 1. Get 2 numbers from the user and convert them to integer
		String numone = JOptionPane.showInputDialog("What is your first number?");
		String numtwo = JOptionPane.showInputDialog("What is your second number?");
		int numberone = Integer.parseInt(numone);
		int numbertwo = Integer.parseInt(numtwo);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Your numbers are " + numberone + " and " + numbertwo + ".", "Simple calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == 0) {
add(numberone,numbertwo);			
		}
		else if (operation == 1) {
			subtract(numberone,numbertwo);
		}
else if (operation == 2) {
	multiplication(numberone,numbertwo);
		}
else if (operation == 3) {
division(numberone,numbertwo);	
}
}
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int numberone,int numbertwo) {
	int sumadd = numberone + numbertwo;
	JOptionPane.showMessageDialog(null, numberone + " + " + numbertwo + " = " + sumadd + ".");
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int numberone,int numbertwo) {
		int sumsubtract = numberone - numbertwo;
		JOptionPane.showMessageDialog(null, numberone + " - " + numbertwo + " = " + sumsubtract + ".");
		}
	static void multiplication(int numberone,int numbertwo) {
		int summultiplication = numberone * numbertwo;
		JOptionPane.showMessageDialog(null, numberone + " x " + numbertwo + " = " + summultiplication + ".");
		}
	static void division(int numberone,int numbertwo) {
		int sumdivision = numberone / numbertwo;
		JOptionPane.showMessageDialog(null, numberone + " ÷ " + numbertwo + " = " + sumdivision + ".");
		}
}
//Code by: Owen™