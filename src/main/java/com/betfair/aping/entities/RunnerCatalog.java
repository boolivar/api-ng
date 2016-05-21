package com.betfair.aping.entities;

import java.util.Map;

/** Information about the Runners (selections) in a market */
public class RunnerCatalog {
	private long selectionId;
	private String runnerName;
	private double handicap;
	private int sortPriority;
	private Map<String, String> metadata;

	public long getSelectionId() {
		return selectionId;
	}

	public void setSelectionId(long selectionId) {
		this.selectionId = selectionId;
	}

	public String getRunnerName() {
		return runnerName;
	}

	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}

	public double getHandicap() {
		return handicap;
	}

	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}

	public int getSortPriority() {
		return sortPriority;
	}

	public void setSortPriority(int sortPriority) {
		this.sortPriority = sortPriority;
	}

	/** Metadata associated with the runner.
	 * For a description of this data for Horse Racing, please see
	 * <a href="http://docs.developer.betfair.com/docs/display/1smk3cen4v3lu3yomq5qye0ni/Runner+Metadata+Description">Runner Metadata Description</a> */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "{" + "" + "selectionId=" + getSelectionId() + ","
				+ "runnerName=" + getRunnerName() + "," + "handicap="
				+ getHandicap() + "," + "}";
	}
}
