package com.betfair.aping.entities;

import com.betfair.aping.enums.PriceData;

import java.util.Set;

/** Selection criteria of the returning price data */
public class PriceProjection {
	private Set<PriceData> priceData;
	private ExBestOfferOverRides exBestOfferOverRides;
	private boolean virtualise;
	private boolean rolloverStakes;

	public Set<PriceData> getPriceData() {
		return priceData;
	}

	/** The basic price data you want to receive in the response */
	public void setPriceData(Set<PriceData> priceData) {
		this.priceData = priceData;
	}

	public ExBestOfferOverRides getExBestOfferOverRides() {
		return exBestOfferOverRides;
	}

	/** Options to alter the default representation of best offer prices
	 * Applicable to EX_BEST_OFFERS priceData selection */
	public void setExBestOfferOverRides(ExBestOfferOverRides exBestOfferOverRides) {
		this.exBestOfferOverRides = exBestOfferOverRides;
	}

	public boolean isVirtualise() {
		return virtualise;
	}

	/** Indicates if the returned prices should include virtual prices.
	 * Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false. */
	public void setVirtualise(boolean virtualise) {
		this.virtualise = virtualise;
	}

	public boolean isRolloverStakes() {
		return rolloverStakes;
	}

	/** Indicates if the volume returned at each price point should be the absolute value or
	 * a cumulative sum of volumes available at the price and all better prices.
	 * If unspecified defaults to false.
	 * Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections.
	 * Not supported as yet. */
	public void setRolloverStakes(boolean rolloverStakes) {
		this.rolloverStakes = rolloverStakes;
	}

}
