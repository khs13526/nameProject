package com.name.paging;

import lombok.ToString;

@ToString
public class Criteria {
	
	private int currentPageNo;
	
	private double recordsPerPage;
	
	private int startPage;
	
	private String searchKeyword;
	
	public int getStartPage() {
		return (currentPageNo-1) * recordsPerPage;
	}
	
	public Criteria() {
		this.currentPageNo = 1;
		this.recordsPerPage = 10;
//		this.startrasd = (this.currentPageNo-1) * this.recordsPerPage;
	}
	
	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	

}
