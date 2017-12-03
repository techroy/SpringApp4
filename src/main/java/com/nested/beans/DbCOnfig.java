package com.nested.beans;

public class DbCOnfig {

	private String userName;

	private String password;

	private String url;

	
	
	public DbCOnfig() {
		
		System.out.println("----dbconfig constructor----");
		
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "DbCOnfig [userName=" + userName + ", password=" + password + ", url=" + url + "]";
	}
	
	

}
