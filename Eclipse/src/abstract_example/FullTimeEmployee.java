package abstract_example;

public class FullTimeEmployee extends Employee{
private final int WORKING_HOURS = 6;
protected final long BASE_SALARY = 1000;

@Override
protected void calculateSalary() {
	salary = WORKING_HOURS * BASE_SALARY;
}
}
