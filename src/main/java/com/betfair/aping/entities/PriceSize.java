package com.betfair.aping.entities;

public class PriceSize {
	private Double price;
	private Double size;

	/** The price available */
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/** The stake available */
	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}
}
