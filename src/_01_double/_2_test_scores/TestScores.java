package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args){
		
		String testScore = JOptionPane.showInputDialog("Enter your test score.");
		double score = Double.parseDouble(testScore);
		if (score >= 85.0) {
			JOptionPane.showMessageDialog(null, "Wow! Thats a great score.");
		}else if (score < 85.0) {
			JOptionPane.showMessageDialog(null, "Keep practicing.");
		}
		
		
		
		
		
	}
}
