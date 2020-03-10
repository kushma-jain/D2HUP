package com.algorithms.frequentpatterns.d2hup;

import com.algorithms.frequentpatterns.hmine.AlgoHMine;


/**
 * This class represents an item and its utility in a transaction.
 * It is used for storing items from transaction in the CAUL structure.
 *
 * @author Surya
 */
class Cell {
	/** an item occurene in a transaction */
	int item; 
	/* the corresponding profit */
	int utility;

	/**
	 * Constructor
	 */
	public Cell() {
		
	}
	
	/**
	 * Constructor.
	 * @param item the item that is used for this cell
	 * @param utility the item utility 
	 */
	public Cell(int item, int utility){
		this.item = item;
		this.utility = utility;
	}
	
	/**
	 * Get a string representation of this cell.
	 * @return a string representation
	 */
	public String toString() {
		return "(" + item + "," + utility + ")";
	}
	

}
