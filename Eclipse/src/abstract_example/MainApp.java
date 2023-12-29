package abstract_example;

public class MainApp {

	public static void main(String[] args) {
		FullTimeEmployee fEmp = new FullTimeEmployee();
		
		fEmp.calculateSalary();
		System.out.println(fEmp.getSalary());
		
		
		PartTimeEmployee pEmp = new PartTimeEmployee();
		
		pEmp.calculateSalary();
		System.out.println(pEmp.getSalary());

	}

}
