package me.shnaps.stockservice;

import java.time.LocalDateTime;

class StockPrice {
	public String symbol;
	public double price;
	public LocalDateTime time;

	public StockPrice(String symbol, double price, LocalDateTime time) {
		this.symbol = symbol;
		this.price = price;
		this.time = time;
	}
}
