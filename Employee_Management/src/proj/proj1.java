package proj;

import model.*;
import model.SalaryEmployee;
import java.util.*; 

public class proj1 {
   
	
    
    public static void main(String[] args) {
    	 try (Scanner s = new Scanner(System.in)) {
			try (Scanner s1 = new Scanner(System.in)) {
				System.out.print("how many employees to create?");
    
				int n=s.nextInt();
				
				ArrayList<Employee> emp = new ArrayList<Employee> (n);
				ArrayList<Integer> id_list = new ArrayList<Integer> (n);
				
				for(int i=0;i<n;i++)
				{
					id_list.add(0);
				}
int i;
int id;
for(i=0;i<n;i++)
{
				
				System.out.println("Employee data for employee "+ (i+1) +" of "+n);
				


System.out.println("Choose type of employee to add.");
System.out.println("1.Salaried");
System.out.println("2.Hourly");
System.out.println("3.Commission");
int c=s.nextInt();

while(true){
boolean flag=false;
System.out.println("Employee ID");id=s.nextInt();
for (int j = 0; j < n; j++) {
				if(id_list.get(j)==id){
					System.out.println("That id is already taken");
					flag=true;
					
				}
}
if(flag==true)
{
				continue;
}
id_list.set(i, id);
break;
}
System.out.print("First name");String fname=s1.nextLine();
System.out.print("Last name");String lname=s1.nextLine();



   if(c==1){
				System.out.print("Salary");double sal=s.nextDouble();
				SalaryEmployee obj=new SalaryEmployee(id, fname, lname, sal);	
				emp.add(obj);
}
				
else if(c==2){

				System.out.print("Hours Worked:");double numhours=s.nextDouble();
				System.out.print("Hourly Rate:");double hourlyrate=s.nextDouble();
				HourlyEmployee obj= new HourlyEmployee(id, fname, lname, numhours, hourlyrate);
				emp.add(obj);
}
else if(c==3){

				System.out.print("Commision Rate:");double crate=s.nextDouble();
				System.out.print("Sales:");double sales=s.nextDouble();
				CommissionEmployee obj= new CommissionEmployee(id, fname, lname,crate,sales);
				emp.add(obj);
}
				
   
   }



for(int loop=0;loop<3;loop++) {

				System.out.println("Choose Report.");
				System.out.println("1.Employee listing");
				System.out.println("2.Payroll listing");
				System.out.println("3.Exit");
				int key=s.nextInt();
				
				
				
				
if(key==1)
{
				 for(int k=0;k<n;k++)
				 {
					 System.out.println("Employee "+emp.get(k).getId()+":"+emp.get(k).getFirstname()+","+emp.get(k).getLastname());
					 
					if(emp.get(k) instanceof SalaryEmployee)
					{
						 System.out.println("Salary: $"+((SalaryEmployee) emp.get(k)).getSalary());
					}
				
					if(emp.get(k) instanceof HourlyEmployee)
					{
						 System.out.println("Hours: "+((HourlyEmployee) emp.get(k)).getNumhours());
						 System.out.println("Rate: "+((HourlyEmployee) emp.get(k)).getHourlyrate());
					
					}
					 
					if(emp.get(k) instanceof CommissionEmployee)
					{
						 System.out.println("Commission Rate: "+((CommissionEmployee) emp.get(k)).getRate());
						 System.out.println("Sales: "+((CommissionEmployee) emp.get(k)).getSales());
					}
				
				 }	
				 
				 
}

if(key==2)
{
				for(int p=0;p<n;p++)
				{
					
					if(emp.get(p) instanceof SalaryEmployee)
					{
					
						System.out.print("Weekly pay for "+emp.get(p).getFirstname()+","+emp.get(p).getLastname()+" Employee "+" id "+emp.get(p).getId()+" is  $");
					    System.out.printf("%.2f",((SalaryEmployee)emp.get(p)).Calculatepay());
					    System.out.println();
					}
					
					if(emp.get(p) instanceof HourlyEmployee)
					{
					
						System.out.print("Weekly pay for "+emp.get(p).getFirstname()+","+emp.get(p).getLastname()+" Employee"+" id "+emp.get(p).getId()+" is $");
					    System.out.printf("%.2f",((HourlyEmployee)emp.get(p)).Calculatepay());
					    System.out.println();
					}
					
					if(emp.get(p) instanceof CommissionEmployee)
					{
					
						System.out.print("Weekly pay for "+emp.get(p).getFirstname()+","+emp.get(p).getLastname()+" Employee"+" id "+emp.get(p).getId()+" is $");
						System.out.printf("%.2f",((CommissionEmployee)emp.get(p)).Calculatepay());
						System.out.println();
					}
					
				
				}
				
   }
				 
if(key==3)
{
				
   break;		
				
}
				
}
			}
		}	
	
	
	
	
	




}
}