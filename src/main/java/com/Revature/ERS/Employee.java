/*-----------------------------------------------------
**Class creates an employee object that stores the
**employee's name and department number
**
**I felt that the employee's id was not needed here since
**the id is mostly used for work on the server side
**-----------------------------------------------------*/
package com.Revature.ERS;



public class Employee
{
	private String first_name; //first name of employee
	private String last_name; //last name of employee
	private int department_Num; //department number of employee
	private int eID; //employee id
	
	//CTOR
	public Employee() {
		first_name = "No one";
		last_name = "No one";
		department_Num = 0;
		eID = 0;
	}
	
	public Employee(String fname, String lname, int dnum, int eid) {
		this.first_name = fname;
		this.last_name = lname;
		this.department_Num = dnum;
		this.eID = eid;
	}
	
	
	
	//getters and setters for variables
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public int getDepartment_Num() {
		return department_Num;
	}
	
	public void setDepartment_Num(int department_Num) {
		this.department_Num = department_Num;
	}
	
	public int geteID() {
		return eID;
	}
	
	public void seteID(int eid) {
		this.eID = eid;
	}
	
	
}
