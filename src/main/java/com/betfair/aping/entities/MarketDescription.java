package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.MarketBettingType;

public class MarketDescription {
	private Boolean persistenceEnabled;
	private Boolean bspMarket;
	private Date marketTime;
	private Date suspendTime;
	private Date settleTime;
	private MarketBettingType bettingType;
	private Boolean turnInPlayEnabled;
	private String marketType;
	private String regulator;
	private Double marketBaseRate;
	private Boolean discountAllowed;
	private String wallet;
	private String rules;
	private Boolean rulesHasDate;
	private Double eachWayDivisor;
	private String clarifications;

	/** If 'true' the market supports 'Keep' bets if the market is to be turned in-play */
	public Boolean getPersistenceEnabled() {
		return persistenceEnabled;
	}

	public void setPersistenceEnabled(Boolean persistenceEnabled) {
		this.persistenceEnabled = persistenceEnabled;
	}

	/** If 'true' the market supports Betfair SP betting */
	public Boolean getBspMarket() {
		return bspMarket;
	}

	public void setBspMarket(Boolean bspMarket) {
		this.bspMarket = bspMarket;
	}

	/** The market start time */
	public Date getMarketTime() {
		return marketTime;
	}

	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}

	/** The market suspend time */
	public Date getSuspendTime() {
		return suspendTime;
	}

	public void setSuspendTime(Date suspendTime) {
		this.suspendTime = suspendTime;
	}

	public Date getSettleTime() {
		return settleTime;
	}

	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public MarketBettingType getBettingType() {
		return bettingType;
	}

	public void setBettingType(MarketBettingType bettingType) {
		this.bettingType = bettingType;
	}

	/** If 'true' the market is set to turn in-play */
	public Boolean getTurnInPlayEnabled() {
		return turnInPlayEnabled;
	}

	public void setTurnInPlayEnabled(Boolean turnInPlayEnabled) {
		this.turnInPlayEnabled = turnInPlayEnabled;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public String getRegulator() {
		return regulator;
	}

	public void setRegulator(String regulator) {
		this.regulator = regulator;
	}

	/** The commission rate applicable to the market */
	public Double getMarketBaseRate() {
		return marketBaseRate;
	}

	public void setMarketBaseRate(Double marketBaseRate) {
		this.marketBaseRate = marketBaseRate;
	}

	/** Indicates whether or not the user's discount rate is taken into account on this market.
	 * If 'false' all users will be charged the same commission rate, regardless of discount rate. */
	public Boolean getDiscountAllowed() {
		return discountAllowed;
	}

	public void setDiscountAllowed(Boolean discountAllowed) {
		this.discountAllowed = discountAllowed;
	}

	/** The wallet to which the market belongs (UK/AUS) */
	public String getWallet() {
		return wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public Boolean getRulesHasDate() {
		return rulesHasDate;
	}

	public void setRulesHasDate(Boolean rulesHasDate) {
		this.rulesHasDate = rulesHasDate;
	}

	/** Any additional information regarding the market */
	public String getClarifications() {
		return clarifications;
	}

	public void setClarifications(String clarifications) {
		this.clarifications = clarifications;
	}

	/** The divisor is returned for the marketType EACH_WAY only and
	 * refers to the fraction of the win odds at which the place portion of an each way bet is settled */
	public Double getEachWayDivisor() {
		return eachWayDivisor;
	}

	public void setEachWayDivisor(Double eachWayDivisor) {
		this.eachWayDivisor = eachWayDivisor;
	}

	@Override
	public String toString() {
		return "{" + "" + "persistenceEnabled=" + getPersistenceEnabled() + ","
				+ "bspMarket=" + getBspMarket() + "," + "marketTime="
				+ getMarketTime() + "," + "suspendTime=" + getSuspendTime()
				+ "," + "settleTime=" + getSettleTime() + "," + "bettingType="
				+ getBettingType() + "," + "turnInPlayEnabled="
				+ getTurnInPlayEnabled() + "," + "marketType="
				+ getMarketType() + "," + "regulator=" + getRegulator() + ","
				+ "marketBaseRate=" + getMarketBaseRate() + ","
				+ "discountAllowed=" + getDiscountAllowed() + "," + "wallet="
				+ getWallet() + "," + "rules=" + getRules() + ","
				+ "rulesHasDate=" + getRulesHasDate() + "," + "clarifications="
				+ getClarifications() + "," + "}";
	}
}
