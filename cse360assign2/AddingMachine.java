/**
 * @author Weixiang Zhang
 * Course: CSE360
 * Assignment: 2
 * Description: This file contains a class with several methods simulating a adding machine.
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	/**
	 * Constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Get the total value.
	 * This method returns the total value.
	 * @return the total value 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add to total
	 * This method add a value to total.
	 * @param value An integer to be added to the total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
		
	}
	
	/**
	 * Subtract from total
	 * This method subtract a value to total.
	 * @param value An integer to be subtracted from the total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	/**
	 * Return this history of transactions
	 * This method returns a string that indicating the computing process
	 * @return A string indicating the computing process
	 */
	public String toString () {
		return history;
	}

	/**
	 * Reset the history and total
	 * This method reset the total and history as same as their initial value.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
