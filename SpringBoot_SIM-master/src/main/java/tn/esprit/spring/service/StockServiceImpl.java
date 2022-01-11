package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.StockRepository;
import tn.esprit.spring.entity.Stock;

@Service
public class StockServiceImpl implements StockSerivce {
	@Autowired
	StockRepository stocktRepository;

	public List<Stock> retrieveAllStock() {
		List<Stock> stock = (List<Stock>) stocktRepository.findAll();

		return stock;
	}

	public Long addStock(Stock s) {
		stocktRepository.save(s);
		return s.getIdStock();
	}

	public Long updateStock(Stock s) {

		stocktRepository.save(s);
		return s.getIdStock();
	}

	public Stock retrieveStock(Long id) {
		return stocktRepository.findById(id).get();
	}

}
