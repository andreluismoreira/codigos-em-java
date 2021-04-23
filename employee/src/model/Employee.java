package model;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary (Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary () {
		return salary;
	}
	
	//increaseSalary Method
	public void increaseSalary(double percentage) {
		salary += salary * percentage/100.0;
	}

	@Override
	public String toString() {
		return "Employee id= " + id + ", name= " + name + ", salary= " + salary ;
	}
	
	
}
