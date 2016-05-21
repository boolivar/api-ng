package com.betfair.aping.entities;

/** Place a new LIMIT_ON_CLOSE bet */
public class LimitOnCloseOrder {
	private double liability;
	private double price;

	public double getLiability() {
		return liability;
	}

	/** The size of the bet */
	public void setLiability(double liability) {
		this.liability = liability;
	}

	public double getPrice() {
		return price;
	}

	/** The limit price of the bet if LOC */
	public void setPrice(double price) {
		this.price = price;
	}
}
