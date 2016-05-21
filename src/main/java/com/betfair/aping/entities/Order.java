package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.OrderStatus;
import com.betfair.aping.enums.OrderType;
import com.betfair.aping.enums.PersistenceType;
import com.betfair.aping.enums.Side;

public class Order {
	private String betId;
	private OrderType orderType;
	private OrderStatus status;
	private PersistenceType persistenceType;
	private Side side;
	private Double price;
	private Double size;
	private Double bspLiability;
	private Date placedDate;
	private Double avgPriceMatched;
	private Double sizeMatched;
	private Double sizeRemaining;
	private Double sizeLapsed;
	private Double sizeCancelled;
	private Double sizeVoided;

	public String getBetId() {
		return betId;
	}

	public void setBetId(String betId) {
		this.betId = betId;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public PersistenceType getPersistenceType() {
		return persistenceType;
	}

	/** What to do with the order at turn-in-play */
	public void setPersistenceType(PersistenceType persistenceType) {
		this.persistenceType = persistenceType;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	/** Not to be confused with size. This is the liability of a given BSP bet. */
	public Double getBspLiability() {
		return bspLiability;
	}

	public void setBspLiability(Double bspLiability) {
		this.bspLiability = bspLiability;
	}

	/** The date, to the second, the bet was placed */
	public Date getPlacedDate() {
		return placedDate;
	}

	public void setPlacedDate(Date placedDate) {
		this.placedDate = placedDate;
	}

	/** The average price matched at. Voided match fragments are removed from this average calculation.
	 * For MARKET_ON_CLOSE BSP bets this reports the matched SP price following the SP reconciliation process. */
	public Double getAvgPriceMatched() {
		return avgPriceMatched;
	}

	public void setAvgPriceMatched(Double avgPriceMatched) {
		this.avgPriceMatched = avgPriceMatched;
	}

	public Double getSizeMatched() {
		return sizeMatched;
	}

	public void setSizeMatched(Double sizeMatched) {
		this.sizeMatched = sizeMatched;
	}

	public Double getSizeRemaining() {
		return sizeRemaining;
	}

	public void setSizeRemaining(Double sizeRemaining) {
		this.sizeRemaining = sizeRemaining;
	}

	public Double getSizeLapsed() {
		return sizeLapsed;
	}

	public void setSizeLapsed(Double sizeLapsed) {
		this.sizeLapsed = sizeLapsed;
	}

	public Double getSizeCancelled() {
		return sizeCancelled;
	}

	public void setSizeCancelled(Double sizeCancelled) {
		this.sizeCancelled = sizeCancelled;
	}

	public Double getSizeVoided() {
		return sizeVoided;
	}

	public void setSizeVoided(Double sizeVoided) {
		this.sizeVoided = sizeVoided;
	}

	@Override
	public String toString() {
		return "{" + "" + "betId=" + getBetId() + "," + "orderType="
				+ getOrderType() + "," + "status=" + getStatus() + ","
				+ "persistenceType=" + getPersistenceType() + "," + "side="
				+ getSide() + "," + "price=" + getPrice() + "," + "size="
				+ getSize() + "," + "bspLiability=" + getBspLiability() + ","
				+ "placedDate=" + getPlacedDate() + "," + "avgPriceMatched="
				+ getAvgPriceMatched() + "," + "sizeMatched="
				+ getSizeMatched() + "," + "sizeRemaining="
				+ getSizeRemaining() + "," + "sizeLapsed=" + getSizeLapsed()
				+ "," + "sizeCancelled=" + getSizeCancelled() + ","
				+ "sizeVoided=" + getSizeVoided() + "," + "}";
	}
}
