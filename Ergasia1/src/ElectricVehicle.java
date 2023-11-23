// Utilize inheritance correctly with meaningful behavior
class ElectricVehicle extends Vehicle implements Communication,Navigation {
    // Method specific to electric vehicles
	public ElectricVehicle(String model,String make,int year,boolean isElectric){
	        super();
    }
	        public void printElectricDetails() {
	        	System.out.println("Electric Vehicle");
    }

