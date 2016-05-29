package com.betfair.aping.entities;

/** Profit and loss if selection is wins or loses */
public class RunnerProfitAndLoss {
	private long selectionId;
	private Double ifWin;
	private Double ifLose;
	private Double ifPlace;

	public long getSelectionId() {
		return selectionId;
	}

	public void setSelectionId(long selectionId) {
		this.selectionId = selectionId;
	}

	/** Profit or loss for the market if this selection is the winner. */
	public Double getIfWin() {
		return ifWin;
	}

	public void setIfWin(Double ifWin) {
		this.ifWin = ifWin;
	}

	/** Profit or loss for the market if this selection is the loser.
	 * Only returned for multi-winner odds markets. */
	public Double getIfLose() {
		return ifLose;
	}

	public void setIfLose(Double ifLose) {
		this.ifLose = ifLose;
	}

	/** Profit or loss for the market if this selection is placed.
	 * Applies to marketType EACH_WAY only. */
	public Double getIfPlace() {
		return ifPlace;
	}

	public void setIfPlace(Double ifPlace) {
		this.ifPlace = ifPlace;
	}
}
