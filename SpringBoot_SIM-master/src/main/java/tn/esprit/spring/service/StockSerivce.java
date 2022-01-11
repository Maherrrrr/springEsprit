package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Stock;

public interface StockSerivce {
	public List<Stock> retrieveAllStock();
	public Long addStock(Stock s);
	public Long updateStock(Stock s);
	public Stock retrieveStock(Long id);

}
