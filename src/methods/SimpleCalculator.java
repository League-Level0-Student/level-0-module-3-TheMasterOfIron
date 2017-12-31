//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Are you color blind? click <html><p style=\\\"color:red\\\">Red</p></html> to find out.", "Question", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "<html><p style=\"color:blue\">Red</p></html>", "<html><p style=\"color:green\">Black</p></html>", "<html><p style=\"color:red\">Green</p></html>", "<html><p style=\"color:Black\">Blue</p></html>" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}