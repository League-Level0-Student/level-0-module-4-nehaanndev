package _02_boolean._3_game_over;

import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		boolean gameOver = false;
		String answer;
		// 1. Ask the user if the game is over and save their answer.
		while(gameOver == false) {
		 answer = JOptionPane.showInputDialog("Is the game over?");
		 if(answer.equals("yes")) {
			 gameOver = true;
		 }
		}
		JOptionPane.showMessageDialog(null, "The game is over.");
		// 2. If they answer "yes" change gameOver to true.
		
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		
		// 4. Tell the user the game is over outside the while loop.
		
	}

}