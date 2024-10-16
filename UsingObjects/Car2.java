public class Car2 {
    // Instance variables
    private String model;
    private int year;
    private double fuelLevel;

    // Constructor
    public Car2(String model, int year) {
        this.model = model;
        this.year = year;
        this.fuelLevel = 100.0; // Assume the car starts with a full tank
    }

    // Void method without parameters
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Fuel Level: " + fuelLevel);
    }

    // Void method with parameters
    public void drive(double distance) {
        fuelLevel -= distance * 0.5; // Assume the car uses 0.5 units of fuel per kilometer
        if(fuelLevel < 0) fuelLevel = 0;
        System.out.println("After driving " + distance + " km, fuel level is: " + fuelLevel);
    }

    // Non-void method
    public double getFuelLevel() {
        return fuelLevel;
    }

    public  static void main(String[]args){
        Car2 myCar = new Car2("Honda Civic", 2020);
        myCar.displayInfo();

        myCar.drive(120.5);

        double furelAmount = myCar.getFuelLevel();
        System.out.println("Current fuel level is : " + furelAmount);

        
    }
}



/*Part A:
Create an instance of the Car class in the main method with the model "Honda Civic" and year 2020. Call the displayInfo method to print the car's information.

Part B:
Call the drive method on the car object you created in Part A and pass a distance of 120.5 kilometers. Then call the displayInfo method again to check the updated fuel level.

Part C:
Use the getFuelLevel method to retrieve the car's fuel level and store it in a variable. Print out the fuel level using System.out.println. */