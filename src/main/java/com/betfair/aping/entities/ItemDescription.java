package com.betfair.aping.entities;

import java.util.Date;

/** This object contains some text which may be useful to render a betting history view.
 * It offers no long-term warranty as to the correctness of the text. */
public class ItemDescription {
	private String eventTypeDesc;
	private String eventDesc;
	private String marketDesc;
	private String marketType;
	private Date marketStartTime;
	private String runnerDesc;
	private Integer numberOfWinners;
	private Double eachWayDivisor;
	
	/** The event type name, translated into the requested locale. Available at EVENT_TYPE groupBy or lower. */
	public String getEventTypeDesc() {
		return eventTypeDesc;
	}
	
	public void setEventTypeDesc(String eventTypeDesc) {
		this.eventTypeDesc = eventTypeDesc;
	}
	
	/** The eventName, or openDate + venue, translated into the requested locale. Available at EVENT groupBy or lower. */
	public String getEventDesc() {
		return eventDesc;
	}
	
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	
	/** The market name or racing market type ("Win", "To Be Placed (2 places)", "To Be Placed (5 places)" etc) translated into the requested locale. Available at MARKET groupBy or lower. */
	public String getMarketDesc() {
		return marketDesc;
	}
	
	public void setMarketDesc(String marketDesc) {
		this.marketDesc = marketDesc;
	}
	
	/** The market type e.g. MATCH_ODDS, PLACE, WIN etc. */
	public String getMarketType() {
		return marketType;
	}
	
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}
	
	/** The start time of the market (in ISO-8601 format, not translated). Available at MARKET groupBy or lower. */
	public Date getMarketStartTime() {
		return marketStartTime;
	}
	
	public void setMarketStartTime(Date marketStartTime) {
		this.marketStartTime = marketStartTime;
	}
	
	/** The runner name, maybe including the handicap, translated into the requested locale. Available at BET groupBy. */
	public String getRunnerDesc() {
		return runnerDesc;
	}
	
	public void setRunnerDesc(String runnerDesc) {
		this.runnerDesc = runnerDesc;
	}
	
	/** The number of winners on a market. Available at BET groupBy. */
	public Integer getNumberOfWinners() {
		return numberOfWinners;
	}
	
	public void setNumberOfWinners(Integer numberOfWinners) {
		this.numberOfWinners = numberOfWinners;
	}
	
	/** The divisor is returned for the marketType EACH_WAY only and refers to the fraction of the win odds at which the place portion of an
	 * <a href="http://docs.developer.betfair.com/docs/display/1smk3cen4v3lu3yomq5qye0ni/placeOrders#placeOrders-EachWayBetting">each way bet</a> is settled */
	public Double getEachWayDivisor() {
		return eachWayDivisor;
	}
	
	public void setEachWayDivisor(Double eachWayDivisor) {
		this.eachWayDivisor = eachWayDivisor;
	}
}
