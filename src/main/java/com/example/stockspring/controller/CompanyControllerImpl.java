package com.example.stockspring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.CompanyServiceImpl;
import com.example.stockspring.service.SectorService;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private SectorService sectorService;
	
	@ModelAttribute("sectors")
	public List<Sector> getSectorList(){
		return sectorService.getSectors();
	}
	
	@RequestMapping(path="/insertcompany",method = RequestMethod.GET )
	public String insertCompany(Model model)
		{
		
		Company company=new Company();
		model.addAttribute("company",company);
		return "insertCompanyPage";
		
	}
	@RequestMapping(path="/insert",method = RequestMethod.POST)
	public String insert(Company company ,Model model)
	{
		System.out.println(company);
		try {
			companyService.insertCompany(company);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:companyList";
	}
	
	
	public Company insertCompany(Company company) throws SQLException {
		companyService.insertCompany(company);
		return company;	
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}
	
	
	// try
	public static void main(String [] args) {
		CompanyController controller=new CompanyControllerImpl();
		try {
			System.out.println(controller.getCompanyList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
