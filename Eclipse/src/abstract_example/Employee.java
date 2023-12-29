package abstract_example;

public abstract class Employee {
    protected long salary;
    protected long baseSalary = 2000;
    
    protected abstract void calculateSalary();
    protected long getSalary() {
    	return salary;
    }
}
