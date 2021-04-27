package entities;

public class Company extends IncomeTax {

	protected Integer employee;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer employee) {
		super(name, annualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return  name +": $ " + incomeTax();
	}

	//methods 
	public double incomeTax() {
		if (employee < 10) {
			return (annualIncome * 0.16);
		} else {
			return (annualIncome * 0.14);
		}
	}
}
