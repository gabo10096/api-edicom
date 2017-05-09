package com.gabo10096.api.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Service;

import com.gabo10096.api.rest.EDMSecurityToken;

@Service
@Path("/login")
public class LogIn {
	/*
	@GET
	@Path("/registerSession")
	@Produces({MediaType.APPLICATION_JSON})
	public EDMSecurityToken login(@QueryParam("group") String group, 
								  @QueryParam("domain") String domain,
								  @QueryParam("user") String user,
								  @QueryParam("password") String password,
								  @QueryParam("ediwinini") String ediwinini){
		EDMSecurityToken EDMSToken = new EDMSecurityToken();
		EDMSToken.setGroup(group);
		EDMSToken.setDomain(domain);
		EDMSToken.setUser(user);
		EDMSToken.setPassword(password);
		EDMSToken.setEdiwinini(ediwinini);
		return EDMSToken;
	}
	*/
	
	@GET
	@Path("/registerSession")
	@Produces("text/plain")
	public String login(@QueryParam("group") String group, 
						@QueryParam("domain") String domain,
						@QueryParam("user") String user,
						@QueryParam("password") String password,
						@QueryParam("ediwinini") String ediwinini){
		EDMSecurityToken EDMSToken = new EDMSecurityToken();
		EDMSToken.setGroup(group);
		EDMSToken.setDomain(domain);
		EDMSToken.setUser(user);
		EDMSToken.setPassword(password);
		EDMSToken.setEdiwinini(ediwinini);
		return "group: " + EDMSToken.getGroup() + "\n" + 
			   "domain: " + EDMSToken.getDomain() + "\n" + 
			   "user: " + EDMSToken.getUser() + "\n" + 
			   "password: " + EDMSToken.getPassword() + "\n" +
			   "ediwinini: " + EDMSToken.getEdiwinini() + "\n";
	}
	

}
