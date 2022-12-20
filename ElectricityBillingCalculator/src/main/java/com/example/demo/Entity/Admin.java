package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="admin")
public class Admin {
	@Id
	private int adminId;
	private String adminName;
	private String password;
	

	public Admin(int adminId,String adminName,String password) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.adminName = adminName;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}	

}
