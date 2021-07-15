package com.dem;

public class Reg {	
	private String Firstname;
	private String Lastname;
	private Integer Age;
	private String Email;
	private long ContactNo;
	private long PanNo;
	private long AadharNo;
	public Reg(String firstname, String lastname, Integer age, String email,
			long contactNo, long panNo, long aadharNo ) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Age = age;
		ContactNo = contactNo;
		Email = email;
		PanNo = panNo;
		AadharNo = aadharNo;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}
	public long getPanNo() {
		return PanNo;
	}
	public void setPanNo(int panNo) {
		PanNo = panNo;
	}
	public long getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(int aadharNo) {
		AadharNo = aadharNo;
	}

}
