public class CalculatorArea {
         public static void main(String[] args) {

           double radius = 10.0;
            double length = 15.0;
            double width = 12.0;
            double side = 5.0;

            double circleArea = calculateArea(radius);
                System.out.println("Area of the circle: " + circleArea);

             double rectangleArea = calculateArea(length, width);
             System.out.println("Area of the rectangle: " + rectangleArea);

             double squareArea = calculateArea(side);
             System.out.println("Area of the square: " + squareArea);
            }

                public static double calculateArea(double radius) {
                return 3.14 * radius * radius;
                }

                public static double calculateArea(double length, double width) {
                return length * width;
                }

                public static double CalculatorArea(double side) {
                return side * side;
            }
            }
