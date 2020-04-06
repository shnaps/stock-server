package me.shnaps.stockservice;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.time.LocalDateTime;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
record StockPrice(String symbol, double price, LocalDateTime time) {
}
