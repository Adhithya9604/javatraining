package inheritance_example;

public class Car extends Vehicle {
	String brand;

    Car(int speed, String brand) {
        super(speed);
        this.brand = brand;
}
    
        
    void displayDetails() {
        System.out.println("Car Details:"+ brand);
        displaySpeed();
    }
}