package com.elly.web;

public class BoardDTO {
	private int bno, blike;
	private String btitle, bcontent, bwrite, bdate;
	
	public BoardDTO() {}
	public BoardDTO (int bno, String btitle, String bwrite, String bdate, int blike) {
		this.bno = bno;
		this.btitle = btitle;
		this.bdate = bdate;
		this.blike = blike;
		this.bwrite = bwrite;
		
		
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getBlike() {
		return blike;
	}
	public void setBlike(int blike) {
		this.blike = blike;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwrite() {
		return bwrite;
	}
	public void setBwrite(String bwrite) {
		this.bwrite = bwrite;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}


}
