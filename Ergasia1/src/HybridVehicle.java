public class HybridVehicle extends Vehicle implements Communication,Navigation {
	public HybridVehicle(String model, String make,int year) {
		super();
	}
	public void communicate() {
		   System.out.println("Hybrid Vehicle communication logic");
    }

 
    public void navigate() {
        System.out.println("Hybrid Vehicle navigation logic");
    }
}
