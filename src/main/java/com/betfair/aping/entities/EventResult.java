package com.betfair.aping.entities;

public class EventResult {
	private Event event;
	private int marketCount;
	
	public Event getEvent() {
		return event;
	}
	
	public void setEvent(Event event) {
		this.event = event;
	}
	
	/** Count of markets associated with this event */
	public int getMarketCount() {
		return marketCount;
	}
	
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
}
