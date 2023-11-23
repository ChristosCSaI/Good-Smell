class Truck extends Vehicle implements Navigation, Communication {
	public Truck(String model,String make,int year,boolean isElectric){
        super();
		
	}
    public void navigate() {
    	  System.out.println("Truck navigation ");
    }

    public void communicate() {
    	  System.out.println("Truck communication ");
    }
}
