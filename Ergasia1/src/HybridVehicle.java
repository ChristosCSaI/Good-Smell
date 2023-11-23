public class HybridVehicle extends Vehicle implements Communication,Navigation {
	public HybridVehicle(String model, String make,int year) {
		super();
	}
	public void communicate() {
		   System.out.println("Hybrid Vehicle");
    }

 
    public void navigate() {
        System.out.println("Hybrid Vehicle");
    }
}
