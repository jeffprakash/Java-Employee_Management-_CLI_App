package model;

public class Employee {


   int id;
   String firstname;
   String lastname;
   
 
public Employee(int jeff, String firstname, String lastname) {
	
	id = jeff;
	this.firstname = firstname;
	this.lastname = lastname;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

  
public double Calculatepay()
{
	
	
	return 0.0;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
}










}
