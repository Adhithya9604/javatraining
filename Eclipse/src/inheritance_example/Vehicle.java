package inheritance_example;

public class Vehicle {
	int speed;

    Vehicle(int speed) {
    this.speed = speed;
    }

    void displaySpeed() {
     System.out.println("Speed: " + speed + " km/h");
    }
}
