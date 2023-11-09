// SRP, OCP, DIP Violations
class Vehicle {
    private String model;
    private String make;
    private int year;
    private boolean isElectric;

    // God Class, Long Method, Feature Envy
    public void printVehicleDetails() {
        System.out.println("Model: " + model + ", Make: " + make + ", Year: " + year);
        if (isElectric) {
            System.out.println("Electric Vehicle");
        } else {
            System.out.println("Non-Electric Vehicle");
        }
        if (year > 2015) {
            System.out.println("Recent model");
        } else {
            System.out.println("Old model");
        }
        // State Checking
        if (model.equals("Tesla")) {
            System.out.println("Luxury vehicle");
        } else {
            System.out.println("Regular vehicle");
        }
    }
}


