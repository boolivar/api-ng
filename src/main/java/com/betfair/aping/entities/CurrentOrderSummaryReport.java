package com.betfair.aping.entities;

import java.util.List;

/** A container representing search results */
public class CurrentOrderSummaryReport {
	private List<CurrentOrderSummary> currentOrders;
	private boolean moreAvailable;
	
	/** The list of current orders returned by your query.
	 * This will be a valid list (i.e. empty or non-empty but never 'null'). */
	public List<CurrentOrderSummary> getCurrentOrders() {
		return currentOrders;
	}
	
	public void setCurrentOrders(List<CurrentOrderSummary> currentOrders) {
		this.currentOrders = currentOrders;
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
