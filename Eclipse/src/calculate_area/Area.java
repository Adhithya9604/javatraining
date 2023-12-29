package calculate_area;

public class Area {

	public static void main(String[] args) {
	        
		Circle circle = new Circle(4);
	    Rectangle rectangle = new Rectangle(5, 7);
   
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Area of Circle: " + circleArea);
	        System.out.println("Area of Rectangle: " + rectangleArea);
	    }
	
	}

