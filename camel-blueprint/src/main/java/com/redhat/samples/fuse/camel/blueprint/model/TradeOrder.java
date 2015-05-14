package com.redhat.samples.fuse.camel.blueprint.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TradeOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8224386909860251043L;

	private String name;

	private String customerId;

	private Integer vip;

	private String stockId;

	private Integer shares;

	private Double cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getVip() {
		return vip;
	}

	public void setVip(Integer vip) {
		this.vip = vip;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public Integer getShares() {
		return shares;
	}

	public void setShares(Integer shares) {
		this.shares = shares;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TradeOrder [name=").append(name)
				.append(", customerId=").append(customerId).append(", vip=")
				.append(vip).append(", stockId=").append(stockId)
				.append(", shares=").append(shares).append(", cost=")
				.append(cost).append("]");
		return builder.toString();
	}

}
