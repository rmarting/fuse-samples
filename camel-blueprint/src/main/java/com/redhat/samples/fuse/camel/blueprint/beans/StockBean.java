package com.redhat.samples.fuse.camel.blueprint.beans;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.samples.fuse.camel.blueprint.model.TradeOrder;

public class StockBean {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StockBean.class);

	private HashMap<String, Double> stockprice = new HashMap<String, Double>();

	public StockBean() {
		stockpriceSetup();
	}
	
	private void stockpriceSetup() {
		this.stockprice.put("ABC", 10.55);
		this.stockprice.put("XYZ", 33.70);
		this.stockprice.put("KUJ", 100.20);
		this.stockprice.put("SOU", 3.50);
	}

	public TradeOrder calculateCost(TradeOrder order) {
		// Apply Cost
		order.setCost(this.stockprice.get(order.getStockId()) * order.getShares());
		
		LOGGER.info("Final Trade Cost: [{}]", order.getCost());
		
		return order;
	}

}
