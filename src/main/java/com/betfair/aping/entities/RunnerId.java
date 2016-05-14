package com.betfair.aping.entities;

public class RunnerId {
	private String marketId;
	private long selectionId;
	private double handicap;
	
	public String getMarketId() {
		return marketId;
	}
	
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	
	public long getSelectionId() {
		return selectionId;
	}
	
	public void setSelectionId(long selectionId) {
		this.selectionId = selectionId;
	}
	
	/** The handicap associated with the runner in case of asian handicap markets,
	 * otherwise returns '0.0'. */
	public double getHandicap() {
		return handicap;
	}
	
	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}
}
