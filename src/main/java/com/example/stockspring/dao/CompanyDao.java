package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyDao {
	  public Company insertCompany(Company company) throws SQLException;
	    public Company updateCompany(Company company);
		public List<Company> getCompanyList() throws SQLException;

}
