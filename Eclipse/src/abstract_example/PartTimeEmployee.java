package abstract_example;

public class PartTimeEmployee extends Employee {
	private int workingHours = 8;
	protected final long BASE_SALARY =1000;
	
	public void PartTimeEmployee(int workingHours) {
		this.workingHours = workingHours;
	}
	
	@Override
	protected void calculateSalary() {
		salary = workingHours * BASE_SALARY;
	}
}
