package Array_List;

import java.util.ArrayList;

public class arrayAssignment {

	public static void main(String[] args) {
     ArrayList<String> colours = new ArrayList();
     // for (String i = 0; i < 6; i++) {
     colours.add("Black");
      colours.add("Green");
      colours.add("Blue");
      colours.add("Red");
      colours.add("Pink");
      colours.add("Orange");
      
       System.out.println(colours);
      //System.out.println(colours.indexOf("Colours in the ArrayList"+ colours));
       System.out.println("Retrive element : "+ colours.get(0));
       System.out.println("Remove element : " + colours.remove(1) );
       System.out.println("Check element: "+ colours.contains(10));
	}
	}

	