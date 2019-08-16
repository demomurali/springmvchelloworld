package com.example.stockspring.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stock {

	@Id
	private int stockId;	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="company_code")
	private Company company;
	private double currentPrice;
	private Date date;
	private Date time;
	
	
	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
/*
	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}
*/
}
