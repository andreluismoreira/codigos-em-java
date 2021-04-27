package entities;

public abstract class IncomeTax {

	protected String name;
	protected Double annualIncome;
	
	public IncomeTax () {
		super();
	}

	public IncomeTax(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	//methods
	abstract double incomeTax();
	
	
	
	
}
