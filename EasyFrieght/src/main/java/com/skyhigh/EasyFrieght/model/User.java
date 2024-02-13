/**
 * 
 */
package com.skyhigh.EasyFrieght.model;

/**
 * 
 */
public class User {
	public int uid;
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public User() {
		
	}


	public String name;
	public String pno;
	public String email;
	public String address;
	public int nopt;
	public String country;
	
	
	public User(String name, String pno, String email, String address, int nopt, String country) {
		this.name = name;
		this.pno = pno;
		this.email = email;
		this.address = address;
		this.nopt = nopt;
		this.country = country;
	}


	public String getName() {
		return name;
	}


	public String getPno() {
		return pno;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	public int getNopt() {
		return nopt;
	}


	public String getCountry() {
		return country;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", pno=" + pno + ", email=" + email + ", address=" + address + ", nopt=" + nopt
				+ ", country=" + country + "]";
	}
	
	
	
	
	
}
