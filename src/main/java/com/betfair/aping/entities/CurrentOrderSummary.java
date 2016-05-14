package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.OrderStatus;
import com.betfair.aping.enums.OrderType;
import com.betfair.aping.enums.PersistenceType;
import com.betfair.aping.enums.Side;

public class CurrentOrderSummary {
	private String betId;
	private String marketId;
	private long selectionId;
	private double handicap;
	private PriceSize priceSize;
	private double bspLiability;
	private Side side;
	private OrderStatus status;
	private PersistenceType persistenceType;
	private OrderType orderType;
	private Date placedDate;
	private Date matchedDate;	
	private double averagePriceMatched;
	private double sizeMatched;
	private double sizeRemaining;
	private double sizeLapsed;
	private double sizeCancelled;
	private double sizeVoided;
	private String regulatorAuthCode;
	private String regulatorCode;
	
	/** The bet ID of the original place order. */
	public String getBetId() {
		return betId;
	}
	
	public void setBetId(String betId) {
		this.betId = betId;
	}
	
	/** The market id the order is for. */
	public String getMarketId() {
		return marketId;
	}
	
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	
	/** The selection id the order is for. */
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
	
	/** The price and size of the bet. */
	public PriceSize getPriceSize() {
		return priceSize;
	}
	
	public void setPriceSize(PriceSize priceSize) {
		this.priceSize = priceSize;
	}
	
	/** Not to be confused with size. This is the liability of a given BSP bet. */
	public double getBspLiability() {
		return bspLiability;
	}
	
	public void setBspLiability(double bspLiability) {
		this.bspLiability = bspLiability;
	}
	
	/** BACK/LAY */
	public Side getSide() {
		return side;
	}
	
	public void setSide(Side side) {
		this.side = side;
	}
	
	/** Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains). */
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	/** What to do with the order at turn-in-play. */
	public PersistenceType getPersistenceType() {
		return persistenceType;
	}
	
	public void setPersistenceType(PersistenceType persistenceType) {
		this.persistenceType = persistenceType;
	}
	
	/** BSP Order type. */
	public OrderType getOrderType() {
		return orderType;
	}
	
	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}
	
	/** The date, to the second, the bet was placed. */
	public Date getPlacedDate() {
		return placedDate;
	}
	
	public void setPlacedDate(Date placedDate) {
		this.placedDate = placedDate;
	}
	
	/** The date, to the second, of the last matched bet fragment (where applicable) */
	public Date getMatchedDate() {
		return matchedDate;
	}
	
	public void setMatchedDate(Date matchedDate) {
		this.matchedDate = matchedDate;
	}
	
	/** The average price matched at. Voided match fragments are removed from this average calculation. The price is automatically adjusted in the event of non runners being declared with applicable reduction factors. */
	public double getAveragePriceMatched() {
		return averagePriceMatched;
	}
	
	public void setAveragePriceMatched(double averagePriceMatched) {
		this.averagePriceMatched = averagePriceMatched;
	}
	
	/** The current amount of this bet that was matched. */
	public double getSizeMatched() {
		return sizeMatched;
	}
	
	public void setSizeMatched(double sizeMatched) {
		this.sizeMatched = sizeMatched;
	}
	
	/** The current amount of this bet that is unmatched. */
	public double getSizeRemaining() {
		return sizeRemaining;
	}
	
	public void setSizeRemaining(double sizeRemaining) {
		this.sizeRemaining = sizeRemaining;
	}
	
	/** The current amount of this bet that was lapsed. */
	public double getSizeLapsed() {
		return sizeLapsed;
	}
	
	public void setSizeLapsed(double sizeLapsed) {
		this.sizeLapsed = sizeLapsed;
	}
	
	/** The current amount of this bet that was cancelled. */
	public double getSizeCancelled() {
		return sizeCancelled;
	}
	
	public void setSizeCancelled(double sizeCancelled) {
		this.sizeCancelled = sizeCancelled;
	}
	
	/** The current amount of this bet that was voided. */
	public double getSizeVoided() {
		return sizeVoided;
	}
	
	public void setSizeVoided(double sizeVoided) {
		this.sizeVoided = sizeVoided;
	}
	
	/** The regulator authorisation code. */
	public String getRegulatorAuthCode() {
		return regulatorAuthCode;
	}
	
	public void setRegulatorAuthCode(String regulatorAuthCode) {
		this.regulatorAuthCode = regulatorAuthCode;
	}
	
	/** The regulator Code */
	public String getRegulatorCode() {
		return regulatorCode;
	}
	
	public void setRegulatorCode(String regulatorCode) {
		this.regulatorCode = regulatorCode;
	}
}
