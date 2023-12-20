package students_example;
import java.util.Scanner;

public class Address {
	String address = "Trivandrum";

    public void setAddressDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student address: " + address);
        address = scanner.nextLine();
    }

    }




