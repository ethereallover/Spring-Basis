package com.ethereal.learning.aop.jdkproxy.bean;

public class User {
	
	private Integer id;
	
	private String acct_nm;
	
	private String acct_lvl;
	
	private String createts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcct_nm() {
		return acct_nm;
	}

	public void setAcct_nm(String acct_nm) {
		this.acct_nm = acct_nm;
	}

	public String getAcct_lvl() {
		return acct_lvl;
	}

	public void setAcct_lvl(String acct_lvl) {
		this.acct_lvl = acct_lvl;
	}

	public String getCreatets() {
		return createts;
	}

	public void setCreatets(String createts) {
		this.createts = createts;
	}
	
	@Override
	public String toString() {
		return "[id:"+id+",acct_nm:"+acct_nm+",acct_lvl:"+acct_lvl+",createts:"+createts+"]";
	}

}
