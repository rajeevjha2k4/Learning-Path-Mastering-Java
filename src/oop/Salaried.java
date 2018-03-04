package oop;

public class Salaried extends Employee {
	
	public static final double DEFAULT_SALARY = 120000;
	
	private double salary = DEFAULT_SALARY;
	
	

	public Salaried() {}    

	public Salaried(String name, double salary) {
		super(name);
		this.salary = salary;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
