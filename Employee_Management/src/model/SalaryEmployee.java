package model;

public class SalaryEmployee extends Employee {

		   double salary;

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public SalaryEmployee(int id, String firstname, String lastname, double salary) {
			super(id, firstname, lastname);
			this.salary = salary;
		}
        
		
		@Override
		public
		double Calculatepay() {
			// TODO Auto-generated method stub
		
			return salary / 52;
		}
		
			
		
			
			
			
			







			
}











