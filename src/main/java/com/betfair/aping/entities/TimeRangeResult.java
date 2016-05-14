package com.betfair.aping.entities;

public class TimeRangeResult {
	private TimeRange timeRange;
	private int marketCount;
	
	public TimeRange getTimeRange() {
		return timeRange;
	}
	
	public void setTimeRange(TimeRange timeRange) {
		this.timeRange = timeRange;
	}
	
	/** Count of markets associated with this TimeRange */
	public int getMarketCount() {
		return marketCount;
	}
	
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
}
