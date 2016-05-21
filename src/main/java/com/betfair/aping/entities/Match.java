package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.Side;

/** An individual bet Match, or rollup by price or avg price.
 * Rollup depends on the requested MatchProjection */
public class Match {
	private String betId;
	private String matchId;
	private Side side;
	private Double price;
	private Double Size;
	private Date matchDate;

	/** Only present if no rollup */
	public String getBetId() {
		return betId;
	}

	public void setBetId(String betId) {
		this.betId = betId;
	}

	/** Only present if no rollup */
	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	/** Either actual match price or avg match price depending on rollup */
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/** Size matched at in this fragment, or at this price or avg price depending on rollup */
	public Double getSize() {
		return Size;
	}

	public void setSize(Double size) {
		Size = size;
	}
	
	/** Only present if no rollup */
	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	@Override
	public String toString() {
		return "{" + "" + "betId=" + getBetId() + "," + "matchId="
				+ getMatchId() + "," + "side=" + getSide() + "," + "price="
				+ getPrice() + "," + "Size=" + getSize() + "," + "matchDate="
				+ getMatchDate() + "," + "}";
	}
}
