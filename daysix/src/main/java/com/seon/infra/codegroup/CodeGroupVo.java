package com.seon.infra.codegroup;

public class CodeGroupVo {
	
//	search
	private Integer shDelNy;
	private Integer shcgUseNy;
	private Integer shcgOption;
	private String shcgValue;
	private String shcgDateStart;
	private String shcgDateEnd;
	private String shcgOptionDate;
	
//	paging
	private int thisPage = 1;									// 현재 페이지
	private int rowNumToShow = 5;								// 화면에 보여줄 데이터 줄 갯수 Constants.ROW_NUM_TO_SHOW;
	private int pageNumToShow = 5;								// 화면에 보여줄 페이징 번호 갯수 Constants.PAGE_NUM_TO_SHOW;		

	private int totalRows;										// 전체 데이터 갯수
	private int totalPages;										// 전체 페이지 번호
	private int startPage;										// 시작 페이지 번호
	private int endPage;										// 마지막 페이지 번호
	
	private int StartRnumForOracle;
	private int EndRnumForOracle;

	private int startRnumForMysql = 0;							// 쿼리 시작 row
	
	
	public void setParamsPaging(int totalRows) {
		
//		setThisPage(1);
		
		setTotalRows(totalRows);

		if (getTotalRows() == 0) {
			setTotalPages(1);
		} else {
			setTotalPages(getTotalRows() / getRowNumToShow());
		}

		if (getTotalRows() % getRowNumToShow() > 0) {
			setTotalPages(getTotalPages() + 1);
		}

		if (getTotalPages() < getThisPage()) {
			setThisPage(getTotalPages());
		}
		
		setStartPage(((getThisPage() - 1) / getPageNumToShow()) * getPageNumToShow() + 1);

		setEndPage(getStartPage() + getPageNumToShow() - 1);

		if (getEndPage() > getTotalPages()) {
			setEndPage(getTotalPages());
		}
		
		setEndRnumForOracle((getRowNumToShow() * getThisPage()));
		setStartRnumForOracle((getEndRnumForOracle() - getRowNumToShow()) + 1);
		if (getStartRnumForOracle() < 1) setStartRnumForOracle(1);
		
		if (thisPage == 1) {
			setStartRnumForMysql(0);
		} else {
			setStartRnumForMysql((getRowNumToShow() * (getThisPage()-1)));
		}
		
		System.out.println("getThisPage() 현재 페이지 : " + getThisPage());
		System.out.println("getRowNumToShow() 화면에 보여줄 데이터 줄 개수 : " + getRowNumToShow());
		System.out.println("getPageNumToShow() 화면에 보여줄 페이징 번호 개수 : " + getPageNumToShow());
		System.out.println("getTotalRows() 전체 데이터 개수 : " + getTotalRows());
		System.out.println("getTotalPages() 전체 페이지 번호 : " + getTotalPages());
		System.out.println("getStartPage() 시작 페이지 번호 : " + getStartPage());
		System.out.println("getEndPage() 마지막 페이지 번호 : " + getEndPage());
		System.out.println("getStartRnumForMysql() 쿼리 시작 row : " + getStartRnumForMysql());
	}

	
//	search
	public Integer getShDelNy() {
		return shDelNy;
	}

	public void setShDelNy(Integer shDelNy) {
		this.shDelNy = shDelNy;
	}

	public Integer getShcgUseNy() {
		return shcgUseNy;
	}

	public void setShcgUseNy(Integer shcgUseNy) {
		this.shcgUseNy = shcgUseNy;
	}

	public Integer getShcgOption() {
		return shcgOption;
	}

	public void setShcgOption(Integer shcgOption) {
		this.shcgOption = shcgOption;
	}

	public String getShcgValue() {
		return shcgValue;
	}

	public void setShcgValue(String shcgValue) {
		this.shcgValue = shcgValue;
	}

	public String getShcgDateStart() {
		return shcgDateStart;
	}

	public void setShcgDateStart(String shcgDateStart) {
		this.shcgDateStart = shcgDateStart;
	}

	public String getShcgDateEnd() {
		return shcgDateEnd;
	}

	public void setShcgDateEnd(String shcgDateEnd) {
		this.shcgDateEnd = shcgDateEnd;
	}

	public String getShcgOptionDate() {
		return shcgOptionDate;
	}

	public void setShcgOptionDate(String shcgOptionDate) {
		this.shcgOptionDate = shcgOptionDate;
	}
//	paging
	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	public int getRowNumToShow() {
		return rowNumToShow;
	}

	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}

	public int getPageNumToShow() {
		return pageNumToShow;
	}

	public void setPageNumToShow(int pageNumToShow) {
		this.pageNumToShow = pageNumToShow;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}

	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}
	
	public int getStartRnumForOracle() {
		return StartRnumForOracle;
	}

	public void setStartRnumForOracle(int startRnumForOracle) {
		StartRnumForOracle = startRnumForOracle;
	}

	public int getEndRnumForOracle() {
		return EndRnumForOracle;
	}

	public void setEndRnumForOracle(int endRnumForOracle) {
		EndRnumForOracle = endRnumForOracle;
	}

	
	

}
