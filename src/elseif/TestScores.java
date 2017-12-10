package elseif;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What score did you get on your test out of 100?");
	int score = Integer.parseInt(input);
	if (score >= 100) {
		JOptionPane.showMessageDialog(null, "Your score is an A++.");
		JOptionPane.showMessageDialog(null, "How could you possibly get more than 100 on your test?");
	}
	else if (score == 100) {
		JOptionPane.showMessageDialog(null, "Your score is an A+.");
		JOptionPane.showMessageDialog(null, "You aced the test.");
	}
	else if (score == 94 || score == 95 || score == 96 || score == 97 || score == 98 || score == 99) {
		JOptionPane.showMessageDialog(null, "Your score is an A.");
		JOptionPane.showMessageDialog(null, "You aced the test.");
	}
	else if (score == 90 || score == 91 || score == 92 || score == 93) {
		JOptionPane.showMessageDialog(null, "Your score is an A-.");
		JOptionPane.showMessageDialog(null, "You did exellent the test.");
	}
	else if (score == 86 || score == 87 || score == 88 || score == 89) {
		JOptionPane.showMessageDialog(null, "Your score is an B+.");
		JOptionPane.showMessageDialog(null, "You did exellent the test.");
	}
	else if (score == 83 || score == 84 || score == 85) {
		JOptionPane.showMessageDialog(null, "Your score is an B.");
		JOptionPane.showMessageDialog(null, "You did good on the test the test.");
	}
	else if (score == 80 || score == 81 || score == 82) {
		JOptionPane.showMessageDialog(null, "Your score is an B-.");
		JOptionPane.showMessageDialog(null, "You did good on the test the test.");
	}
	else if (score == 76 || score == 77 || score == 78 || score == 79) {
		JOptionPane.showMessageDialog(null, "Your score is an C+.");
		JOptionPane.showMessageDialog(null, "You did fair the test.");
	}
	else if (score == 73 || score == 74 || score == 75) {
		JOptionPane.showMessageDialog(null, "Your score is an C.");
		JOptionPane.showMessageDialog(null, "You did fair the test.");
	}
	else if (score == 70 || score == 71 || score == 72) {
		JOptionPane.showMessageDialog(null, "Your score is an C-.");
		JOptionPane.showMessageDialog(null, "You did fair the test.");
	}
	else if (score == 66 || score == 67 || score == 68 || score == 69) {
		JOptionPane.showMessageDialog(null, "Your score is an D+.");
		JOptionPane.showMessageDialog(null, "You barely passed the test.");
	}
	else if (score == 63 || score == 64 || score == 65) {
		JOptionPane.showMessageDialog(null, "Your score is an D.");
		JOptionPane.showMessageDialog(null, "You barely passed the test.");
	}
	else if (score == 60 || score == 61 || score == 62) {
		JOptionPane.showMessageDialog(null, "Your score is an D-.");
		JOptionPane.showMessageDialog(null, "You barely passed the test.");
	}
	else if (score <= 59) {
		JOptionPane.showMessageDialog(null, "Your score is an F.");
		JOptionPane.showMessageDialog(null, "You failed the test.");
		JOptionPane.showMessageDialog(null, "Better luck next test.");
	}
	else if (score <= -1) {
		JOptionPane.showMessageDialog(null, "Your score is an F-.");
		JOptionPane.showMessageDialog(null, "How could you possibly get a score that bad on a test?");
		JOptionPane.showMessageDialog(null, "Better luck next test.");
	}
}
}
