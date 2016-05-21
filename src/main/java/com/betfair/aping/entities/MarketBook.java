package com.betfair.aping.entities;

import java.util.Date;
import java.util.List;

import com.betfair.aping.enums.MarketStatus;

/** The dynamic data in a market */
public class MarketBook {
	private String marketId;
	private Boolean isMarketDataDelayed;
	private MarketStatus status;
	private int betDelay;
	private Boolean bspReconciled;
	private Boolean complete;
	private Boolean inplay;
	private int numberOfWinners;
	private int numberOfRunners;
	private int numberOfActiveRunners;
	private Date lastMatchTime;
	private Double totalMatched;
	private Double totalAvailable;
	private Boolean crossMatching;
	private Boolean runnersVoidable;
	private Long version;
	private List<Runner> runners;

	public List<Runner> getRunners() {
		return runners;
	}

	public void setRunners(List<Runner> runners) {
		this.runners = runners;
	}

	/** The unique identifier for the market.
	 * MarketId's are prefixed with '1.' or '2.' 1. = UK Exchange 2. = AUS Exchange. */
	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	/** True if the data returned by listMarketBook will be delayed.
	 * The data may be delayed because you are not logged in with a funded account
	 * or you are using an Application Key that does not allow up to date data. */
	public Boolean getIsMarketDataDelayed() {
		return isMarketDataDelayed;
	}

	public void setIsMarketDataDelayed(Boolean isMarketDataDelayed) {
		this.isMarketDataDelayed = isMarketDataDelayed;
	}

	public MarketStatus getStatus() {
		return status;
	}

	public void setStatus(MarketStatus status) {
		this.status = status;
	}

	/** The number of seconds an order is held until it is submitted into the market.
	 * Orders are usually delayed when the market is in-play */
	public int getBetDelay() {
		return betDelay;
	}

	public void setBetDelay(int betDelay) {
		this.betDelay = betDelay;
	}

	/** True if the market starting price has been reconciled */
	public Boolean getBspReconciled() {
		return bspReconciled;
	}

	public void setBspReconciled(Boolean bspReconciled) {
		this.bspReconciled = bspReconciled;
	}

	/** If false, runners may be added to the market */
	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	/** True if the market is currently in play */
	public Boolean getInplay() {
		return inplay;
	}

	public void setInplay(Boolean inplay) {
		this.inplay = inplay;
	}

	/** The number of selections that could be settled as winners */
	public int getNumberOfWinners() {
		return numberOfWinners;
	}

	public void setNumberOfWinners(int numberOfWinners) {
		this.numberOfWinners = numberOfWinners;
	}

	/** The number of runners in the market */
	public int getNumberOfRunners() {
		return numberOfRunners;
	}

	public void setNumberOfRunners(int numberOfRunners) {
		this.numberOfRunners = numberOfRunners;
	}

	/** The number of runners that are currently active.
	 * An active runner is a selection available for betting */
	public int getNumberOfActiveRunners() {
		return numberOfActiveRunners;
	}

	public void setNumberOfActiveRunners(int numberOfActiveRunners) {
		this.numberOfActiveRunners = numberOfActiveRunners;
	}

	/** The most recent time an order was executed */
	public Date getLastMatchTime() {
		return lastMatchTime;
	}

	public void setLastMatchTime(Date lastMatchTime) {
		this.lastMatchTime = lastMatchTime;
	}

	/** The total amount matched */
	public Double getTotalMatched() {
		return totalMatched;
	}

	public void setTotalMatched(Double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/** The total amount of orders that remain unmatched */
	public Double getTotalAvailable() {
		return totalAvailable;
	}

	public void setTotalAvailable(Double totalAvailable) {
		this.totalAvailable = totalAvailable;
	}

	/** True if cross matching is enabled for this market */
	public Boolean getCrossMatching() {
		return crossMatching;
	}

	public void setCrossMatching(Boolean crossMatching) {
		this.crossMatching = crossMatching;
	}

	/** True if runners in the market can be voided */
	public Boolean getRunnersVoidable() {
		return runnersVoidable;
	}

	public void setRunnersVoidable(Boolean runnersVoidable) {
		this.runnersVoidable = runnersVoidable;
	}

	/** The version of the market.
	 * The version increments whenever the market status changes,
	 * for example, turning in-play, or suspended when a goal is scored. */
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "{" + "" + "marketId=" + getMarketId() + ","
				+ "isMarketDataDelayed=" + getIsMarketDataDelayed() + ","
				+ "status=" + getStatus() + "," + "betDelay=" + getBetDelay()
				+ "," + "bspReconciled=" + getBspReconciled() + ","
				+ "complete=" + getComplete() + "," + "inplay=" + getInplay()
				+ "," + "numberOfWinners=" + getNumberOfWinners() + ","
				+ "numberOfRunners=" + getNumberOfRunners() + ","
				+ "numberOfActiveRunners=" + getNumberOfActiveRunners() + ","
				+ "lastMatchTime=" + getLastMatchTime() + "," + "totalMatched="
				+ getTotalMatched() + "," + "totalAvailable="
				+ getTotalAvailable() + "," + "crossMatching="
				+ getCrossMatching() + "," + "runnersVoidable="
				+ getRunnersVoidable() + "," + "version=" + getVersion() + ","
				+ "runners=" + getRunners() + "," + "}";
	}
}
