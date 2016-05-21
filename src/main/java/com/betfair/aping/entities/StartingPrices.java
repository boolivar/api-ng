package com.betfair.aping.entities;

import java.util.List;

/** Information about the Betfair Starting Price. Only available in BSP markets */
public class StartingPrices {
	private Double nearPrice;
	private Double farPrice;
	private List<PriceSize> backStakeTaken;
	private List<PriceSize> layLiabilityTaken;
	private Double actualSP;

	/** What the starting price would be if the market was reconciled now taking into
	 * account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
	 * This data is cached and update every 60 seconds.
	 * Please note: Type Double may contain numbers, INF, -INF, and NaN. */
	public Double getNearPrice() {
		return nearPrice;
	}

	public void setNearPrice(Double nearPrice) {
		this.nearPrice = nearPrice;
	}
	
	/** What the starting price would be if the market was reconciled now taking into account only the currently place SP bets.
	 * The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
	 * This data is cached and updated every 60 seconds.
	 * Please note: Type Double may contain numbers, INF, -INF, and NaN. */
	public Double getFarPrice() {
		return farPrice;
	}

	public void setFarPrice(Double farPrice) {
		this.farPrice = farPrice;
	}

	/** The total amount of back bets matched at the actual Betfair Starting Price */
	public List<PriceSize> getBackStakeTaken() {
		return backStakeTaken;
	}

	public void setBackStakeTaken(List<PriceSize> backStakeTaken) {
		this.backStakeTaken = backStakeTaken;
	}

	/** The lay amount matched at the actual Betfair Starting Price */
	public List<PriceSize> getLayLiabilityTaken() {
		return layLiabilityTaken;
	}

	public void setLayLiabilityTaken(List<PriceSize> layLiabilityTaken) {
		this.layLiabilityTaken = layLiabilityTaken;
	}

	/** The final BSP price for this runner. Only available for a BSP market that has been reconciled */
	public Double getActualSP() {
		return actualSP;
	}

	public void setActualSP(Double actualSP) {
		this.actualSP = actualSP;
	}

	@Override
	public String toString() {
		return "{" + "" + "nearPrice=" + getNearPrice() + "," + "farPrice="
				+ getFarPrice() + "," + "backStakeTaken=" + getBackStakeTaken()
				+ "," + "layLiabilityTaken=" + getLayLiabilityTaken() + ","
				+ "actualSP=" + getActualSP() + "," + "}";
	}
}
