package com.betfair.aping.entities;

import com.betfair.aping.enums.RollupModel;

/** Options to alter the default representation of best offer prices */
public class ExBestOfferOverRides {
	private int bestPricesDepth;
	private RollupModel rollupModel;
	private int rollupLimit;
	private double rollupLiabilityThreshold;
	private int rollupLiabilityFactor;

	public int getBestPricesDepth() {
		return bestPricesDepth;
	}

	/** The maximum number of prices to return on each side for each runner.
	 * If unspecified defaults to 3. */
	public void setBestPricesDepth(int bestPricesDepth) {
		this.bestPricesDepth = bestPricesDepth;
	}

	public RollupModel getRollupModel() {
		return rollupModel;
	}

	/** The model to use when rolling up available sizes.
	 * If unspecified defaults to STAKE rollup model with rollupLimit of minimum stake in the specified currency. */
	public void setRollupModel(RollupModel rollupModel) {
		this.rollupModel = rollupModel;
	}

	public int getRollupLimit() {
		return rollupLimit;
	}

	/** The volume limit to use when rolling up returned sizes.
	 * The exact definition of the limit depends on the rollupModel.
	 * If no limit is provided it will use minimum stake as default the value.
	 * Ignored if no rollup model is specified. */
	public void setRollupLimit(int rollupLimit) {
		this.rollupLimit = rollupLimit;
	}

	public double getRollupLiabilityThreshold() {
		return rollupLiabilityThreshold;
	}

	/** Only applicable when rollupModel is MANAGED_LIABILITY.
	 * The rollup model switches from being stake based to liability based at
	 * the smallest lay price which is >= rollupLiabilityThreshold.service level default (TBD).
	 * Not supported as yet.
	 * @param rollupLiabilityThreshold
	 */
	public void setRollupLiabilityThreshold(double rollupLiabilityThreshold) {
		this.rollupLiabilityThreshold = rollupLiabilityThreshold;
	}

	public int getRollupLiabilityFactor() {
		return rollupLiabilityFactor;
	}

	/** Only applicable when rollupModel is MANAGED_LIABILITY.
	 * (rollupLiabilityFactor * rollupLimit) is the minimum liabilty the user is deemed to be comfortable with.
	 * After the rollupLiabilityThreshold price subsequent volumes will be
	 * rolled up to minimum value such that the liability >= the minimum liability.service level default (5).
	 * Not supported as yet. */
	public void setRollupLiabilityFactor(int rollupLiabilityFactor) {
		this.rollupLiabilityFactor = rollupLiabilityFactor;
	}
}
