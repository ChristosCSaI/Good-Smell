public class Main {
    public static void main(String[] args) {
    	
        Vehicle vehicle = new Vehicle();
        ElectricVehicle electricVehicle = new ElectricVehicle();
        Car car = new Car();
        Truck truck = new Truck();

        vehicle.printVehicleDetails(); // Print vehicle details

        electricVehicle.printVehicleDetails(); // Print electric vehicle details

        car.navigate(); // Car navigation logic
        car.communicate(); // Car communication logic

        truck.navigate(); // Truck navigation logic
        truck.communicate(); // Truck communication logic
    }
}

