package me.shnaps.stockservice;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
class RSocketController {
	private PriceService priceService;

	public RSocketController(PriceService priceService) {
		this.priceService = priceService;
	}

	@MessageMapping("stockPrices")
	Flux<StockPrice> prices(String symbol) {
		return priceService.generatePrices(symbol);
	}
}
