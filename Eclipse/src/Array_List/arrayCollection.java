package Array_List;

import java.util.ArrayList;

public class arrayCollection {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		for (int i = 0; i < 50; i++) {
			a.add("MyData"+i);
			  // a.remove(1);
			//a.contains("data(5)");
			System.out.println(a.indexOf("MyData"+i));
		}

	}

}
