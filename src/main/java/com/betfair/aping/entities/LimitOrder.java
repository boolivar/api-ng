package com.betfair.aping.entities;

import com.betfair.aping.enums.PersistenceType;

/** Place a new LIMIT order (simple exchange bet for immediate execution) */
public class LimitOrder {
	private double size;
	private double price;
	private PersistenceType persistenceType;

	public double getSize() {
		return size;
	}

	/** The size of the bet.
	 * Please note: For market type EACH_WAY. The total stake = size x 2 */
	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PersistenceType getPersistenceType() {
		return persistenceType;
	}

	/** What to do with the order at turn-in-play */
	public void setPersistenceType(PersistenceType persistenceType) {
		this.persistenceType = persistenceType;
	}
}
