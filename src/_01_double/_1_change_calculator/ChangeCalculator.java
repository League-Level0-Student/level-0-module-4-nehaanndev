package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
				
		// Convert their answer to an int.   Hint: Integer.parseInt()  
				int	amntN = Integer.parseInt(JOptionPane.showInputDialog("How many nickels do you have?")); 
		// Ask the user how many dimes they have, and convert their answer
				int	amntD = Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have?")); 
		// Ask the user how many quarters they have, and convert their answer
				int	amntQ = Integer.parseInt(JOptionPane.showInputDialog("How many quarters do you have?")); 
		// Calculate how much money the user has.  Hint: Use a double variable 
double  total = amntN * 0.05 + amntD * 0.10 + amntQ *0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null,"You have $" + total + "." );
	}
}

