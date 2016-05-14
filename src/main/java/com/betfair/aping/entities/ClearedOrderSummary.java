package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.OrderType;
import com.betfair.aping.enums.PersistenceType;
import com.betfair.aping.enums.Side;

public class ClearedOrderSummary {
	private String eventTypeId;
	private String eventId;
	private String marketId;
	private long selectionId;
	private double handicap;
	private String betId;
	private Date placedDate;
	private PersistenceType persistenceType;
	private OrderType orderType;
	private Side side;
	private ItemDescription itemDescription;
	private String betOutcome;
	private double priceRequested;
	private Date settledDate;
	private Date lastMatchedDate;
	private int betCount;
	private double commission;
	private double priceMatched;
	private boolean priceReduced;
	private double sizeSettled;
	private double profit;
	private double sizeCancelled;
	
	/** The id of the event type bet on. Available at EVENT_TYPE groupBy level or lower. */
	public String getEventTypeId() {
		return eventTypeId;
	}
	
	public void setEventTypeId(String eventTypeId) {
		this.eventTypeId = eventTypeId;
	}
	
	/** The id of the event bet on. Available at EVENT groupBy level or lower. */
	public String getEventId() {
		return eventId;
	}
	
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	
	/** The id of the market bet on. Available at MARKET groupBy level or lower. */
	public String getMarketId() {
		return marketId;
	}
	
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	
	/** The id of the selection bet on. Available at RUNNER groupBy level or lower. */
	public long getSelectionId() {
		return selectionId;
	}
	
	public void setSelectionId(long selectionId) {
		this.selectionId = selectionId;
	}
	
	/** The handicap associated with the runner in case of Asian handicap markets, null otherwise. */
	public double getHandicap() {
		return handicap;
	}
	
	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}
	
	/** The id of the bet. Available at BET groupBy level. */
	public String getBetId() {
		return betId;
	}
	
	public void setBetId(String betId) {
		this.betId = betId;
	}
	
	/** The date the bet order was placed by the customer. Only available at BET groupBy level. */
	public Date getPlacedDate() {
		return placedDate;
	}
	
	public void setPlacedDate(Date placedDate) {
		this.placedDate = placedDate;
	}
	
	/** The turn in play persistence state of the order at bet placement time. This field will be empty or omitted on true SP bets. Only available at BET groupBy level. */
	public PersistenceType getPersistenceType() {
		return persistenceType;
	}
	
	public void setPersistenceType(PersistenceType persistenceType) {
		this.persistenceType = persistenceType;
	}
	
	/** The type of bet (e.g standard limited-liability Exchange bet (LIMIT), a standard BSP bet (MARKET_ON_CLOSE), or a minimum-accepted-price BSP bet (LIMIT_ON_CLOSE)). If the bet has a OrderType of MARKET_ON_CLOSE and a persistenceType of MARKET_ON_CLOSE then it is a bet which has transitioned from LIMIT to MARKET_ON_CLOSE. Only available at BET groupBy level. */
	public OrderType getOrderType() {
		return orderType;
	}
	
	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}
	
	/** Whether the bet was a back or lay bet. Available at SIDE groupBy level or lower. */
	public Side getSide() {
		return side;
	}
	
	public void setSide(Side side) {
		this.side = side;
	}
	
	/** A container for all the ancillary data and localised text valid for this Item */
	public ItemDescription getItemDescription() {
		return itemDescription;
	}
	
	public void setItemDescription(ItemDescription itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	/** The settlement outcome of the bet. Tri-state (WIN/LOSE/PLACE) to account for Each Way bets where the place portion of the bet won but the win portion lost. The profit/loss amount in this case could be positive or negative depending on the price matched at. Only available at BET groupBy level. */
	public String getBetOutcome() {
		return betOutcome;
	}
	
	public void setBetOutcome(String betOutcome) {
		this.betOutcome = betOutcome;
	}
	
	/** The average requested price across all settled bet orders under this Item. Available at SIDE groupBy level or lower. */
	public double getPriceRequested() {
		return priceRequested;
	}
	
	public void setPriceRequested(double priceRequested) {
		this.priceRequested = priceRequested;
	}
	
	/** The date and time the bet order was settled by Betfair. Available at SIDE groupBy level or lower. */
	public Date getSettledDate() {
		return settledDate;
	}
	
	public void setSettledDate(Date settledDate) {
		this.settledDate = settledDate;
	}
	
	/** The date and time the last bet order was matched by Betfair. Available on Settled orders only. */
	public Date getLastMatchedDate() {
		return lastMatchedDate;
	}
	
	public void setLastMatchedDate(Date lastMatchedDate) {
		this.lastMatchedDate = lastMatchedDate;
	}
	
	/** The number of actual bets within this grouping (will be 1 for BET groupBy) */
	public int getBetCount() {
		return betCount;
	}
	
	public void setBetCount(int betCount) {
		this.betCount = betCount;
	}
	
	/** The cumulative amount of commission paid by the customer across all bets under this Item, in the account currency. Available at EXCHANGE, EVENT_TYPE, EVENT and MARKET level groupings only. */
	public double getCommission() {
		return commission;
	}
	
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	/** The average matched price across all settled bets or bet fragments under this Item. Available at SIDE groupBy level or lower. */
	public double getPriceMatched() {
		return priceMatched;
	}
	
	public void setPriceMatched(double priceMatched) {
		this.priceMatched = priceMatched;
	}
	
	/** If true, then the matched price was affected by a reduction factor due to of a runner removal from this Horse Racing market. */
	public boolean isPriceReduced() {
		return priceReduced;
	}
	
	public void setPriceReduced(boolean priceReduced) {
		this.priceReduced = priceReduced;
	}
	
	/** The cumulative bet size that was settled as matched or voided under this Item, in the account currency. Available at SIDE groupBy level or lower. */
	public double getSizeSettled() {
		return sizeSettled;
	}
	
	public void setSizeSettled(double sizeSettled) {
		this.sizeSettled = sizeSettled;
	}
	
	/** The profit or loss (negative profit) gained on this line, in the account currency */
	public double getProfit() {
		return profit;
	}
	
	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	/** The amount of the bet that was available to be matched, before cancellation or lapsing, in the account currency */
	public double getSizeCancelled() {
		return sizeCancelled;
	}
	
	public void setSizeCancelled(double sizeCancelled) {
		this.sizeCancelled = sizeCancelled;
	}
}
