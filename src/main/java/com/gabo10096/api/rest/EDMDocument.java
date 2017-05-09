package com.gabo10096.api.rest;

import java.sql.Date;

public class EDMDocument {
	
	private Integer id = -1;
	private String domain = null;
	private String type = null;
	private String situation = null;
	private String state = null;
	private Date date = null;
	private String reference = null;
	private String source = null;
	private String destination = null;
	private String format = null;
	private String schema = "";
	private String guide = "";
	private String envSource = null;
	private String envDestination = null;
	private Integer length = null;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getGuide() {
		return guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}
	public String getEnvSource() {
		return envSource;
	}
	public void setEnvSource(String envSource) {
		this.envSource = envSource;
	}
	public String getEnvDestination() {
		return envDestination;
	}
	public void setEnvDestination(String envDestination) {
		this.envDestination = envDestination;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
}
