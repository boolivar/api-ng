package com.betfair.aping.entities;

public class CountryCodeResult {
	private String countryCode;
	private int marketCount;
	
	/** The ISO-2 code for the event.
	 * A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	/** Count of markets associated with this Country Code */
	public int getMarketCount() {
		return marketCount;
	}
	
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
}
