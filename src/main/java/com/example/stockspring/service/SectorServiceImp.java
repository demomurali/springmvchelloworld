package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Sector;

@Service
public class SectorServiceImp implements SectorService{

	@Autowired
	private SectorDao sectorDao;
	
	@Override
	public List<Sector> getSectors() {
		// TODO Auto-generated method stub
		return sectorDao.findAll();
		
	}

}
