package com.lt.poi;

import java.io.Serializable;

public class ExcelCell implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2559441761141730008L;
	
	private int firstCell;
	
	private int lastCell;

	
	public ExcelCell() {
	
	}

	public ExcelCell(int firstCell, int lastCell) {
		this.firstCell = firstCell;
		this.lastCell = lastCell;
	}

	/**
	 * @return the firstCell
	 */
	public int getFirstCell() {
		return firstCell;
	}

	/**
	 * @param firstCell the firstCell to set
	 */
	public void setFirstCell(int firstCell) {
		this.firstCell = firstCell;
	}

	/**
	 * @return the lastCell
	 */
	public int getLastCell() {
		return lastCell;
	}

	/**
	 * @param lastCell the lastCell to set
	 */
	public void setLastCell(int lastCell) {
		this.lastCell = lastCell;
	}
	
	public boolean isMergeCell(int cellNum) {
		if(cellNum<=lastCell && cellNum>=firstCell) {
			return true;
		}	
		return false;
	}

}
