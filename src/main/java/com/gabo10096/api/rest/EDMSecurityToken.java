package com.gabo10096.api.rest;

public class EDMSecurityToken {
	
	private String group;
	private String domain;
	private String user;
	private String password;
	private String ediwinini;
	private String sourceip;
	private String type;
	private String token;
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEdiwinini() {
		return ediwinini;
	}
	public void setEdiwinini(String ediwinini) {
		this.ediwinini = ediwinini;
	}
	public String getSourceip() {
		return sourceip;
	}
	public void setSourceip(String sourceip) {
		this.sourceip = sourceip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}