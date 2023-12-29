package students_example;
import java.util.Scanner;

public class Student {
	 String name = "Adhithya";
     String rollNumber = "15";

    public void setStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student name:" + name );
        name = scanner.nextLine();

        System.out.print("Student roll number: " + rollNumber );
         rollNumber = scanner.nextLine();
    }

    
}

