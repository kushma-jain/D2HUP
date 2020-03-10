package com.algorithms.frequentpatterns.hmine;


import java.util.ArrayList;
import java.util.List;


class Row {
	/** the item **/
	int item;  
	/** its support **/
	int support;
	/** the list of pointers to items in transactions */
	List<Integer> pointers = new ArrayList<Integer>();

	/**
	 * Constructor.
	 * @param item the item that is used for this row
	 */
	public Row(int item){
		this.item = item;
	}
	
	/**
	 * Get a string representation of this cell.
	 * @return a string representation
	 */
	public String toString() {
		String temp = item + " s:" + support + " pointers: " + pointers;
		return temp;
	}
	
}
