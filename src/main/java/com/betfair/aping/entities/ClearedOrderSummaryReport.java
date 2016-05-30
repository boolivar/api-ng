package com.betfair.aping.entities;

import java.util.List;

/** A container representing search results */
public class ClearedOrderSummaryReport {
	private List<ClearedOrderSummary> clearedOrders;
	private boolean moreAvailable;
	
	/** The list of cleared orders returned by your query.
	 * This will be a valid list (i.e. empty or non-empty but never 'null'). */
	public List<ClearedOrderSummary> getClearedOrders() {
		return clearedOrders;
	}
	
	public void setClearedOrders(List<ClearedOrderSummary> clearedOrders) {
		this.clearedOrders = clearedOrders;
	}
	
	/** Indicates whether there are further result items beyond this page.
	 * Note that underlying data is highly time-dependent and the subsequent search orders query
	 * might return an empty result. */
	public boolean isMoreAvailable() {
		return moreAvailable;
	}
	
	public void setMoreAvailable(boolean moreAvailable) {
		this.moreAvailable = moreAvailable;
	}
}
