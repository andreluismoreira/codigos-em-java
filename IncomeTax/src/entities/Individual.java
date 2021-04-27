package entities;

public class Individual extends IncomeTax {

	protected double healthIncome;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, double healthIncome) {
		super(name, annualIncome);
		this.healthIncome = healthIncome;
	}

	public double getHealthIncome() {
		return healthIncome;
	}

	public void setHealthIncome(double healthIncome) {
		this.healthIncome = healthIncome;
	}
	
	@Override
	public String toString() {
		return name +": $ " + incomeTax();
	}
	
	//methods
	public double incomeTax() {
		if (annualIncome < 20000 ) {
			return (annualIncome * 0.15) - (healthIncome * 0.5);
		} else {
			return (annualIncome * 0.25) - (healthIncome * 0.5);
		}
	}
}
