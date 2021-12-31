package com.createiq.bean;

public class Employee {

	private int eid;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private String ename;
	private double esal;
	private Address address;

	public Employee(int eid, String ename, double esal,Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.address = address;
		System.out.println("Emp : parm Constuctor Called");
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", address=" + address + "]";
	}

	public Employee() {
		System.out.println("Emp : default Constuctor Called");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

}
