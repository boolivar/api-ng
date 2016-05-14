package com.betfair.aping.entities;

/** Profit and loss if selection is wins or loses */
public class RunnerProfitAndLoss {
	private long selectionId;
	private double ifWin;
	private double ifLose;
	private double ifPlace;

	public long getSelectionId() {
		return selectionId;
	}

	public void setSelectionId(long selectionId) {
		this.selectionId = selectionId;
	}

	/** Profit or loss for the market if this selection is the winner. */
	public double getIfWin() {
		return ifWin;
	}

	public void setIfWin(double ifWin) {
		this.ifWin = ifWin;
	}

	/** Profit or loss for the market if this selection is the loser.
	 * Only returned for multi-winner odds markets. */
	public double getIfLose() {
		return ifLose;
	}

	public void setIfLose(double ifLose) {
		this.ifLose = ifLose;
	}

	/** Profit or loss for the market if this selection is placed.
	 * Applies to marketType EACH_WAY only. */
	public double getIfPlace() {
		return ifPlace;
	}

	public void setIfPlace(double ifPlace) {
		this.ifPlace = ifPlace;
	}
}
