package model;

public class HourlyEmployee extends Employee {

	   double numhours;
		double hourlyrate;
		
	
		
		
		
		public double getNumhours() {
			return numhours;
		}

       public void setNumhours(double numhours) {
			this.numhours = numhours;
		}

       public double getHourlyrate() {
			return hourlyrate;
		}

       public void setHourlyrate(double hourlyrate) {
			this.hourlyrate = hourlyrate;
		}

	public HourlyEmployee(int id, String firstname, String lastname, double numhours, double hourlyrate) {
		super(id, firstname, lastname);
		this.numhours = numhours;
		this.hourlyrate = hourlyrate;
	}

	@Override
	public double Calculatepay() {
		// TODO Auto-generated method stub
		return numhours*hourlyrate;
	}








		
}