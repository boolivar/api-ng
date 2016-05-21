package com.betfair.aping.entities;

import java.util.Date;
import java.util.List;

/** The dynamic data about runners in a market */
public class Runner {
	private Long selectionId;
	private Double handicap;
	private String status;
	private Double adjustmentFactor;
	private Double lastPriceTraded;
	private Double totalMatched;
	private Date removalDate;
	private StartingPrices sp;
	private ExchangePrices ex;
	private List<Order> orders;
	private List<Match> matches;

	/** The unique id of the runner (selection) */
	public Long getSelectionId() {
		return selectionId;
	}

	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	}

	/** The handicap.
	 * Enter the specific handicap value (returned by RUNNER in listMaketBook)
	 * if the market is an Asian handicap market. */
	public Double getHandicap() {
		return handicap;
	}

	public void setHandicap(Double handicap) {
		this.handicap = handicap;
	}

	/** The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER, HIDDEN)
	 * Runner status information is available for 90 days following market settlement. */
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/** The adjustment factor applied if the selection is removed */
	public Double getAdjustmentFactor() {
		return adjustmentFactor;
	}

	public void setAdjustmentFactor(Double adjustmentFactor) {
		this.adjustmentFactor = adjustmentFactor;
	}

	/** The price of the most recent bet matched on this selection */
	public Double getLastPriceTraded() {
		return lastPriceTraded;
	}

	public void setLastPriceTraded(Double lastPriceTraded) {
		this.lastPriceTraded = lastPriceTraded;
	}

	/** The total amount matched on this runner */
	public Double getTotalMatched() {
		return totalMatched;
	}

	public void setTotalMatched(Double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/** If date and time the runner was removed */
	public Date getRemovalDate() {
		return removalDate;
	}

	public void setRemovalDate(Date removalDate) {
		this.removalDate = removalDate;
	}

	/** The BSP related prices for this runner */
	public StartingPrices getSp() {
		return sp;
	}

	public void setSp(StartingPrices sp) {
		this.sp = sp;
	}

	/** The Exchange prices available for this runner */
	public ExchangePrices getEx() {
		return ex;
	}

	public void setEx(ExchangePrices ex) {
		this.ex = ex;
	}

	/** List of orders in the market */
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	/** List of matches (i.e, orders that have been fully or partially executed) */
	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "{" + "" + "selectionId=" + getSelectionId() + "," + "handicap="
				+ getHandicap() + "," + "status=" + getStatus() + ","
				+ "adjustmentFactor=" + getAdjustmentFactor() + ","
				+ "lastPriceTraded=" + getLastPriceTraded() + ","
				+ "totalMatched=" + getTotalMatched() + "," + "removalDate="
				+ getRemovalDate() + "," + "sp=" + getSp() + "," + "ex="
				+ getEx() + "," + "orders=" + getOrders() + "," + "matches="
				+ getMatches() + "," + "}";
	}
}
