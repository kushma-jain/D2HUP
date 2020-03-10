package com.algorithms.frequentpatterns.d2hup;



import java.util.ArrayList;
import java.util.List;

import com.algorithms.frequentpatterns.hmine.AlgoHMine;


/**
 * This class represents a row of the table in the CAUL structure.

 * @see AlgoHMine
 * @author Surya
 */
class Row {
	/** the item **/
	int item;  
	/** its support **/
	int support; 
	/** its utility **/
	int utility; 
	/** local twu (ubitem) **/
	int ltwu;
	/** the sum of the utility and remaining utility(UbPFE) **/
	int rutil = 0; 
	/** the list of pointers to items in transactions */
	List<Pointer> pointers = new ArrayList<Pointer>();

	/**
	 * Constructor.
	 * @param item the item that is used for this utility list
	 */
	public Row(int item){
		this.item = item;
	}
	
	/**
	 * Get a string representation of this cell.
	 * @return a string representation
	 */
	public String toString() {
		String temp = item + " s:" + support + " u:" + utility
				+ " ubItem:" + ltwu + " ubPFE:" + rutil + " pointers: " + pointers;
		return temp;
	}
	
}
