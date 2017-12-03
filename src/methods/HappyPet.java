//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy.");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet " + pet + " happy?",
				"Happy pet.", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed it.", "Give it water.",
						"Groom.", "Cuddle.", "Take it for a walk.", "Clean up its poop." },
				null);

		// 5. Use user input to call the appropriate method created in step 4.
		if (task == 6) {
			feedIt();
		} else {
			System.out.println("Doesnt work.");
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static public void feedIt() {
		JOptionPane.showMessageDialog(null, "You feed your pet and it becomes happier.");
		happinessLevel += 1;
	}
}