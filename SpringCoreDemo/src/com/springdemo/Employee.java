//https://www.youtube.com/watch?v=rMLP-NEPgnM - program video link


package com.springdemo;

//Bean or model or POJO

public class Employee {

//Attributes
	int eid;
	String ename;
	//String address;
    Address address;
	
//methods

	public Employee() {
		System.out.println("Employee object constructed");
	}
//constructor Injection
	public Employee(Address address){
		this.address = address;
	}

	public Employee(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
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

		public Address getAddress() {
			return address;
		}
//Setter Injection
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", address="
					+ address + "]";

		}
		
		public void myInit(){
			System.out.println("--object Initialized");
		}
		public void myDestroy(){
			System.out.println("--object Initialized");

		}

	}

	
	
	

