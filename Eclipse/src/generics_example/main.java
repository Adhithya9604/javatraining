package generics_example;

public class main {

	public static void main(String[] args) {
		IntergerPrinter intPrinter = new IntergerPrinter();
		intPrinter.data = 10;
		intPrinter.dataPrint();
		
		StringPrinter stringPrinter = new StringPrinter();
		stringPrinter.data = "Printed all the data";
		stringPrinter.dataPrint();
		
		booleanPrinter booleanPrinter = new booleanPrinter();
		booleanPrinter.data = "true";
		booleanPrinter.dataPrint();
		
		

	}

}
