package com.betfair.aping.entities;

/** Instruction to fully or partially cancel an order (only applies to LIMIT orders) */
public class CancelInstruction {
	private String betId;
	private Double sizeReduction;
	
	public String getBetId() {
		return betId;
	}
	
	public void setBetId(String betId) {
		this.betId = betId;
	}
	
	public Double getSizeReduction() {
		return sizeReduction;
	}

	/** If supplied then this is a partial cancel. Should be set to 'null' if no size reduction is required. */
	public void setSizeReduction(Double sizeReduction) {
		this.sizeReduction = sizeReduction;
	}
}
