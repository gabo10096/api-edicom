package com.gabo10096.api.rest;

public class EDMFolder {
	
	private Integer cod;
	private String description;
	private Integer parentFolder;
	private String filter;
	private String filter2;
	private String order;
	private Integer temp;
	private Integer idVol;
	private String alvVol;
	private String usrVol;
	private String pwdVol;
	private Integer type;
	private Boolean activo;
	
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getParentFolder() {
		return parentFolder;
	}
	public void setParentFolder(Integer parentFolder) {
		this.parentFolder = parentFolder;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getFilter2() {
		return filter2;
	}
	public void setFilter2(String filter2) {
		this.filter2 = filter2;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public Integer getTemp() {
		return temp;
	}
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	public Integer getIdVol() {
		return idVol;
	}
	public void setIdVol(Integer idVol) {
		this.idVol = idVol;
	}
	public String getAlvVol() {
		return alvVol;
	}
	public void setAlvVol(String alvVol) {
		this.alvVol = alvVol;
	}
	public String getUsrVol() {
		return usrVol;
	}
	public void setUsrVol(String usrVol) {
		this.usrVol = usrVol;
	}
	public String getPwdVol() {
		return pwdVol;
	}
	public void setPwdVol(String pwdVol) {
		this.pwdVol = pwdVol;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
