package com.betfair.aping.entities;

import java.util.Date;
import java.util.List;

/** Information about a market */
public class MarketCatalogue {
	private String marketId;
	private String marketName;
	private Date marketStartTime;
	private MarketDescription description;
	private Double totalMatched;
	private List<RunnerCatalog> runners;
	private EventType eventType;
	private Competition competition;
	private Event event;

	/** The unique identifier for the market.
	 * MarketId's are prefixed with '1.' or '2.' 1. = UK Exchange 2. = AUS Exchange. */
	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	/** The time this market starts at,
	 * only returned when the MARKET_START_TIME enum is passed in the marketProjections */
	public Date getMarketStartTime() {
		return marketStartTime;
	}

	public void setMarketStartTime(Date marketStartTime) {
		this.marketStartTime = marketStartTime;
	}

	/** Details about the market */
	public MarketDescription getDescription() {
		return description;
	}

	public void setDescription(MarketDescription description) {
		this.description = description;
	}

	/** The total amount of money matched on the market */
	public Double getTotalMatched() {
		return totalMatched;
	}

	public void setTotalMatched(Double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/** The runners (selections) contained in the market */
	public List<RunnerCatalog> getRunners() {
		return runners;
	}

	public void setRunners(List<RunnerCatalog> runners) {
		this.runners = runners;
	}

	/** The Event Type the market is contained within */
	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	/** The competition the market is contained within.
	 * Usually only applies to Football competitions */
	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	/** The event the market is contained within */
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return getMarketName();
	}
}
