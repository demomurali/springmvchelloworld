package com.example.stockspring.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.Stock;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.StockService;

@Controller
public class StockControllerImpl {

	@Autowired
	private StockService stockService;
	
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(path="/stockList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockList");
		mv.addObject("stockList",stockService.getStockList());
		return mv;
	}
	
	
	@RequestMapping(path="/insertStock",method = RequestMethod.GET)
	public String insert()
	{
		Stock stock=new Stock();
		stock.setCurrentPrice(3000);
		stock.setDate(new Date());
		stock.setStockId(3);
		
		Company company=new Company();
		company.setCompanyId(1025);
		company.setCompanyName("cts");
		company.setTurnover(new BigDecimal(434.45d));
		stock.setCompany(company);
		
		System.out.println();
		try {
			//companyService.insertCompany(company);
			stockService.insertStock(stock);
			List<Stock> stocks=stockService.getStockList();
			for(Stock stock1:stocks){
				System.out.println(stock1.getStockId());
				System.out.println(stock1.getCompany().getCompanyId());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:companyList";
	}
	
}
