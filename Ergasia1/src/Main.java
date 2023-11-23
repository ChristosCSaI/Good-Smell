public class Main {
    public static void main(String[] args) {
    	
        Car car = new Car("Model13","Tesla",2022,true);
        Truck truck = new Truck("Truck","Volvo",2023,false);
        ElectricVehicle electricVehicle= new ElectircVehicle("EV1","Tesla",2022,true);
        Vehicle Rcar = new Vehicle("Camry","Toyota",2020,false);
        VehicleDetailsPrinter printer = new VehicleDetailsPrinter();
        Motorcycle motorcycle = new Motorcycle("Ninja", "Kawasaki", 2021, false);
        HybridVehicle hybridVehicle = new HybridVehicle("Prius", "Toyota", 2021);
        
        printer.printVehicleDetails(car);
        printer.printVehicleDetails(Rcar);
        printer.printVehicleDetails(truck);
        printer.printVehicleDetails(electricVehicle);
        printer.printVehicleDetails(motorcycle);
        printer.printVehicleDetails(hybridVehicle);
    

        car.navigate(); 
        car.communicate(); 

        truck.navigate(); 
        truck.communicate(); 
        
        electricVehicle.navigate(); 
        electricVehicle.communicate(); 
        
        motorcycle.communicate();
        motorcycle.navigate();

        hybridVehicle.communicate();
        hybridVehicle.navigate();
    }
}

