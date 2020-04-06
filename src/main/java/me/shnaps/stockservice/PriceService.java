package me.shnaps.stockservice;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@Service
class PriceService {

	public Flux<StockPrice> generatePrices(String symbol) {
		return Flux.interval(Duration.ofSeconds(3)).
				map(el -> new StockPrice(symbol, randomStockPrice(), LocalDateTime.now()));
	}

	private Double randomStockPrice() {
		return ThreadLocalRandom.current().nextDouble(100.0);
	}

}
