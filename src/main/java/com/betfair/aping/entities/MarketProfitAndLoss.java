package com.betfair.aping.entities;

import java.util.List;

/** Profit and loss in a market */
public class MarketProfitAndLoss {
	private String marketId;
	private Double commissionApplied;
	private List<RunnerProfitAndLoss> profitAndLosses;
	
	public String getMarketId() {
		return marketId;
	}
	
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	
	/** The commission rate applied to P&L values.
	 * Only returned if netOfCommision option is requested */
	public Double getCommissionApplied() {
		return commissionApplied;
	}
	
	public void setCommissionApplied(Double commissionApplied) {
		this.commissionApplied = commissionApplied;
	}
	
	/** Calculated profit and loss data. */
	public List<RunnerProfitAndLoss> getProfitAndLosses() {
		return profitAndLosses;
	}
	
	public void setProfitAndLosses(List<RunnerProfitAndLoss> profitAndLosses) {
		this.profitAndLosses = profitAndLosses;
	}
}
