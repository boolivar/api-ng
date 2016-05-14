package com.betfair.aping.entities;

public class VenueResult {
	private String venue;
	private int marketCount;
	
	public String getVenue() {
		return venue;
	}
	
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	/** Count of markets associated with this Venue */
	public int getMarketCount() {
		return marketCount;
	}
	
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
}
