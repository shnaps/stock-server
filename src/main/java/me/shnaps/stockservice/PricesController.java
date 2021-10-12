package me.shnaps.stockservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
class PricesController {
	private PriceService priceService;

	public PricesController(PriceService priceService) {
		this.priceService = priceService;
	}

	@GetMapping(value = "/stocks/{symbol}", produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.TEXT_EVENT_STREAM_VALUE
	})
	public Flux<StockPrice> prices(@PathVariable String symbol) {
		return priceService.generatePrices(symbol);
	}
}
