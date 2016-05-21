package com.betfair.aping.entities;

import java.util.Date;

public class Event {
	private String id;
	private String name;
	private String countryCode;
	private String timezone;
	private String venue;
	private Date openDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** The ISO-2 code for the event.
	 * A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/** This is timezone in which the event is taking place */
	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	/** The scheduled start date and time of the event.
	 * This is Europe/London (GMT) by default */
	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String toString() {
		return "{" + "" + "id=" + getId() + "," + "name=" + getName() + ","
				+ "countryCode=" + getCountryCode() + "," + "timezone="
				+ getTimezone() + "," + "venue=" + getVenue() + ","
				+ "openDate=" + getOpenDate() + "," + "}";
	}

}
