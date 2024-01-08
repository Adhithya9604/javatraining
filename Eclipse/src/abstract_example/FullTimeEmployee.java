package abstract_example;

public class FullTimeEmployee extends Employee{
private final int WORKING_HOURS = 6;
protected final long BASE_SALARY = 1000;

@Override
protected void calculateSalary() {
	try{System.out.println("Something went wrong");
	} catch(Exception e) {salary = WORKING_HOURS * BASE_SALARY;
		
	}
	}
}
