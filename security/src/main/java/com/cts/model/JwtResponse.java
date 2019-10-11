package com.cts.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private DAOUser user;

	public JwtResponse(String jwttoken,DAOUser user) {
		this.jwttoken = jwttoken;
		this.user=user;
	}

	public String getToken() {
		return this.jwttoken;
		
	}
	public DAOUser getuser() {
	return this.user;}
}