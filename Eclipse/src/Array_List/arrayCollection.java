package Array_List;

import java.util.ArrayList;

public class arrayCollection {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		for (int i = 0; i < 50; i++) {
			a.add("MyData"+i);
			//a.contains("data(5)");
			//a.remove(i);
			System.out.println(a.indexOf("MyData"+i));
		}
	}
}      
          

