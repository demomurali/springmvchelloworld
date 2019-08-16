package com.example.stockspring.service;

import java.util.List;

import com.example.stockspring.model.Stock;

public interface StockService {

	
	public List<Stock> getStockList();

	public void insertStock(Stock stock);
}
