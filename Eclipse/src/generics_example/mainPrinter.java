package generics_example;

public class mainPrinter <A, B> {

	 A data;
	 B data2;
	 
	 public void dataPrint() {
		 System.out.println(data);
		 System.out.println(data2);
	 }
	 
	 public void getData(A inputdata){
	 data = inputdata;
	 }
	 
	 public void getData2(B inputdata) {
		 data2 = inputdata;
	 }
}
	 
		 
	
	 
	 
	 



