package elseif;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What score did you get on your test out of 100?");
	int score = Integer.parseInt(input);
	if (score >= 100) {
		JOptionPane.showMessageDialog(null, "Your score is an A++.");
		JOptionPane.showMessageDialog(null, "How could you possibly get more than 100 on your test?");
		JOptionPane.showMessageDialog(null, "You aced the test.");
		JOptionPane.showMessageDialog(null, "Must have been extra credit.");
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
	else if (score == 59 || score == 58 || score == 57 || score == 56 || score == 55 || score == 54 || score == 53 || score == 52 || score == 51 || score == 50 || score == 49 || score == 48 || score == 47 || score == 46 || score == 45 || score == 44 || score == 43 || score == 42 || score == 41 || score == 40 || score == 39 || score == 38 || score == 37 || score == 36 || score == 35 || score == 34 || score == 33 || score == 32 || score == 31 || score == 30 || score == 29 || score == 28 || score == 27 || score == 26 || score == 25 || score == 24 || score == 23 || score == 22 || score == 21 || score == 20 || score == 19 || score == 18 || score == 17 || score == 16 || score == 15 || score == 14 || score == 13 || score == 12 || score == 11 || score == 10 || score == 9 || score == 8 || score == 7 || score == 6 || score == 5 || score == 4 || score == 3 || score == 2 || score == 1 || score == 0) {
		JOptionPane.showMessageDialog(null, "Your score is an F.");
		JOptionPane.showMessageDialog(null, "You failed the test.");
		JOptionPane.showMessageDialog(null, "Better luck next test.");
	}
	else if (score <= -1) {
		JOptionPane.showMessageDialog(null, "Your score is an F-.");
		JOptionPane.showMessageDialog(null, "How could you possibly get a score that bad on a test?");
		JOptionPane.showMessageDialog(null, "You failed so bad that you got a score less than 0.");
		JOptionPane.showMessageDialog(null, "Ya dun goofed.");
	}
}
}
