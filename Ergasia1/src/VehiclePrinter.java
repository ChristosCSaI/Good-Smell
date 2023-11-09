
class VehicleDetailsPrinter {
    // Handles the responsibility of printing vehicle details
    public void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Model: " + vehicle.getModel() + ", Make: " + vehicle.getMake() + ", Year: " + vehicle.getYear());
        if (vehicle.isElectric()) {
            System.out.println("Electric Vehicle");
        } else {
            System.out.println("Non-Electric Vehicle");
        }
        if (vehicle.getYear() > 2015) {
            System.out.println("Recent model");
        } else {
            System.out.println("Old model");
        }
        if (vehicle.getModel().equals("Tesla")) {
            System.out.println("Luxury vehicle");
        } else {
            System.out.println("Regular vehicle");
        }
    }
}