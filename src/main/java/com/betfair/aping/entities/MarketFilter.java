package com.betfair.aping.entities;

import com.betfair.aping.enums.MarketBettingType;
import com.betfair.aping.enums.OrderStatus;

import java.util.Set;

public class MarketFilter {
	private String textQuery;
	private Set<String> exchangeIds;
	private Set<String> eventTypeIds;
	private Set<String> marketIds;
	private Boolean inPlayOnly;
	private Set<String> eventIds;
	private Set<String> competitionIds;
	private Set<String> venues;
	private Boolean bspOnly;
	private Boolean turnInPlayEnabled;
	private Set<MarketBettingType> marketBettingTypes;
	private Set<String> marketCountries;
	private Set<String> marketTypeCodes;
	private TimeRange marketStartTime;
	private Set<OrderStatus> withOrders;

	public String getTextQuery() {
		return textQuery;
	}

	/** Restrict markets by any text associated with the market such as the Name, Event, Competition, etc.
	 * You can include a wildcard (*) character as long as it is not the first character. */
	public void setTextQuery(String textQuery) {
		this.textQuery = textQuery;
	}

	public Set<String> getExchangeIds() {
		return exchangeIds;
	}

	/** Restrict markets by the Exchange where the market operates.
	 * Not currently in use, requests for Australian markets should be sent to the
	 * <a href="http://docs.developer.betfair.com/docs/display/1smk3cen4v3lu3yomq5qye0ni/Betting+on+Australian+Events">Aus Exchange endpoint</a>. */
	public void setExchangeIds(Set<String> exchangeIds) {
		this.exchangeIds = exchangeIds;
	}

	public Set<String> getEventTypeIds() {
		return eventTypeIds;
	}

	/** Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc) */
	public void setEventTypeIds(Set<String> eventTypeIds) {
		this.eventTypeIds = eventTypeIds;
	}

	public Set<String> getMarketIds() {
		return marketIds;
	}

	public void setMarketIds(Set<String> marketIds) {
		this.marketIds = marketIds;
	}

	public Boolean getInPlayOnly() {
		return inPlayOnly;
	}

	/** Restrict to markets that are currently in play if True or are not currently in play if false.
	 * If not specified, returns both. */
	public void setInPlayOnly(Boolean inPlayOnly) {
		this.inPlayOnly = inPlayOnly;
	}

	public Set<String> getEventIds() {
		return eventIds;
	}

	public void setEventIds(Set<String> eventIds) {
		this.eventIds = eventIds;
	}

	public Set<String> getCompetitionIds() {
		return competitionIds;
	}

	public void setCompetitionIds(Set<String> competitionIds) {
		this.competitionIds = competitionIds;
	}

	public Set<String> getVenues() {
		return venues;
	}

	/** Restrict markets by the venue associated with the market.
	 * Currently only Horse Racing markets have venues. */
	public void setVenues(Set<String> venues) {
		this.venues = venues;
	}

	public Boolean getBspOnly() {
		return bspOnly;
	}

	/** Restrict to bsp markets only, if True or non-bsp markets if False.
	 * If not specified then returns both BSP and non-BSP markets */
	public void setBspOnly(Boolean bspOnly) {
		this.bspOnly = bspOnly;
	}

	public Boolean getTurnInPlayEnabled() {
		return turnInPlayEnabled;
	}

	/** Restrict to markets that will turn in play if True or will not turn in play if false.
	 * If not specified, returns both. */
	public void setTurnInPlayEnabled(Boolean turnInPlayEnabled) {
		this.turnInPlayEnabled = turnInPlayEnabled;
	}

	public Set<MarketBettingType> getMarketBettingTypes() {
		return marketBettingTypes;
	}

	/** Restrict to markets that match the betting type of the market
	 * (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles */
	public void setMarketBettingTypes(Set<MarketBettingType> marketBettingTypes) {
		this.marketBettingTypes = marketBettingTypes;
	}

	public Set<String> getMarketCountries() {
		return marketCountries;
	}

	public void setMarketCountries(Set<String> marketCountries) {
		this.marketCountries = marketCountries;
	}

	public Set<String> getMarketTypeCodes() {
		return marketTypeCodes;
	}

	/** Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE).
	 * You should use this instead of relying on the market name as the market type codes are the same in all locales */
	public void setMarketTypeCodes(Set<String> marketTypeCodes) {
		this.marketTypeCodes = marketTypeCodes;
	}

	public TimeRange getMarketStartTime() {
		return marketStartTime;
	}

	public void setMarketStartTime(TimeRange marketStartTime) {
		this.marketStartTime = marketStartTime;
	}

	public Set<OrderStatus> getWithOrders() {
		return withOrders;
	}

	/** Restrict to markets that have one or more orders in these status */
	public void setWithOrders(Set<OrderStatus> withOrders) {
		this.withOrders = withOrders;
	}

	@Override
	public String toString() {
		return "{" + "" + "textQuery=" + getTextQuery() + "," + "exchangeIds="
				+ getExchangeIds() + "," + "eventTypeIds=" + getEventTypeIds()
				+ "," + "eventIds=" + getEventIds() + "," + "competitionIds="
				+ getCompetitionIds() + "," + "marketIds=" + getMarketIds()
				+ "," + "venues=" + getVenues() + "," + "bspOnly="
				+ getBspOnly() + "," + "turnInPlayEnabled="
				+ getTurnInPlayEnabled() + "," + "inPlayOnly="
				+ getInPlayOnly() + "," + "marketBettingTypes="
				+ getMarketBettingTypes() + "," + "marketCountries="
				+ getMarketCountries() + "," + "marketTypeCodes="
				+ getMarketTypeCodes() + "," + "marketStartTime="
				+ getMarketStartTime() + "," + "withOrders=" + getWithOrders()
				+ "," + "}";
	}
}
