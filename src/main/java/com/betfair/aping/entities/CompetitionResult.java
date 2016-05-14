package com.betfair.aping.entities;

public class CompetitionResult {
	private Competition competition;
	private int marketCount;
	private String competitionRegion;
	
	public Competition getCompetition() {
		return competition;
	}
	
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	
	/** Count of markets associated with this competition */
	public int getMarketCount() {
		return marketCount;
	}
	
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
	
	/** Region in which this competition is happening */
	public String getCompetitionRegion() {
		return competitionRegion;
	}
	
	public void setCompetitionRegion(String competitionRegion) {
		this.competitionRegion = competitionRegion;
	}
}
