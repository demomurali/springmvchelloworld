package com.example.stockspring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.math.BigDecimal;

@Entity
public class Company {
	
	@Id
	@Column(name="company_code")
	private int companyId; 
	private String boardofdirectors;
	//private Sector sector;
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="ceo")
	private String ceoName;
	
	private BigDecimal turnover;

	
	@ManyToOne
	@JoinColumn(name="sector_id")
	private Sector sector;
	
	
	@Column(name="breifwriteup")
	private String breifWriteUp;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	
	
	public BigDecimal getTurnover() {
		return turnover;
	}
	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	public String getBreifWriteUp() {
		return breifWriteUp;
	}
	public void setBreifWriteUp(String breifWriteUp) {
		this.breifWriteUp = breifWriteUp;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	
	/*public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}*/
	
	public String getBoardofdirectors() {
		return boardofdirectors;
	}
	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}
	public String toString(){
		return "id:"+this.getCompanyId()+" directors:"+this.getBoardofdirectors();
	}
}

/*
public class Company {

	private int companyId; 
	private String boardOfDirectors;
	private Sector sector;

	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	public String toString(){
		return "id:"+this.getCompanyId()+" directors:"+this.getBoardOfDirectors();
	}
}
*/