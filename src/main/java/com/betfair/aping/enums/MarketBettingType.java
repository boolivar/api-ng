package com.betfair.aping.enums;

public enum MarketBettingType {
	/** Odds Market - Any market that doesn't fit any any of the other categories */
	ODDS,
	
	/** Line Market - Now Deprecated */
	@Deprecated LINE,
	
	/** Range Market - Now Deprecated */
	@Deprecated RANGE,
	
	/** Asian Handicap Market - A traditional Asian handicap market. Can be identified by marketType ASIAN_HANDICAP */
	ASIAN_HANDICAP_DOUBLE_LINE,
	
	/** Asian Single Line Market - A market in which there can be 0 or multiple winners. e,.g marketType TOTAL_GOALS */
	ASIAN_HANDICAP_SINGLE_LINE,
	
	/** Sportsbook Odds Market. This type is deprecated and will be removed in future releases,
	 * when Sportsbook markets will be represented as ODDS market but with a different product type. */
	@Deprecated FIXED_ODDS;
}
