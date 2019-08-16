package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockDao;
import com.example.stockspring.model.Stock;

@Service
public class StockServiceImpl implements StockService{

	@Autowired
	private StockDao stockDao;
	
	
	public List<Stock> getStockList(){
		return stockDao.findAll();
	}


	@Override
	public void insertStock(Stock stock) {
		stockDao.save(stock);
	}
	
	
	
	public void updateStock(Stock stock) {
		stockDao.save(stock);
	}
	
}
