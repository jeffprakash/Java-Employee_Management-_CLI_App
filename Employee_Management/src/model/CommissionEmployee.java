package model;

public class CommissionEmployee extends Employee {

    double rate;
	double sales;
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public CommissionEmployee(int id, String firstname, String lastname, double rate, double sales) {
		super(id, firstname, lastname);
		this.rate = rate;
		this.sales = sales;
	}
	
	
	@Override
	public double Calculatepay() {
		
		return sales * rate / 100;
	}
	
	





	
	
	
	
	
}
