public class Car extends Vehicle implements Navigation, Communication {
	
	public Car(String model,String make,int year,boolean isElectric) {
		super(model,make,year,isElectric);
	}
    public void navigate() {
        System.out.println("Car navigation logic");
        }

    public void communicate() {
    	  System.out.println("Car communication logic");
    }
}
