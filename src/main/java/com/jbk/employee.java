package com.jbk;

public class employee {

	int id;
	String Name;
	
	
	public employee() {
		
		
		
	}
	public employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	@Override
	public String toString() {
		return "employee [id=" + id + ", Name=" + Name + "]";
	}
	
	
}
