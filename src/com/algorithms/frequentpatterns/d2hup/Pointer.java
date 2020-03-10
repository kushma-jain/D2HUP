package com.algorithms.frequentpatterns.d2hup;

import com.algorithms.frequentpatterns.hmine.AlgoHMine;



/**
 * This class represents a pointer to a transaction item in the CAUL structure.
 * It indicates the position of the item in the transaction and the utility
 * of the current prefix ending with that item.
 * 
 * @author Surya
 */
class Pointer {
	/** the item **/
	int pos;  
	/** prefix utility **/
	int prefixUtility; 

	/**
	 * Constructor.
	 * @param item the item 
	 * @param pos  a position
	 */
	public Pointer(int prefixUtility, int pos){
		this.prefixUtility = prefixUtility;
		this.pos = pos;
	}
}
