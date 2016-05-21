package com.betfair.aping.entities;

/** Place a new MARKET_ON_CLOSE bet */
public class MarketOnCloseOrder {
	private double liability;

	public double getLiability() {
		return liability;
	}

	/** The size of the bet */
	public void setLiability(double liability) {
		this.liability = liability;
	}
}
