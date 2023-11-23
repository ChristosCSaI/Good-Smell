public class Motorcycle extends Vehicle implements Communication,Navigation{{
	
	    public Motorcycle(String model,String make,int year,boolean isElectric){
	        super();
	        }
	        public void communicate(){
	            System.out.println("Motorcycle communication logic");
	            }
	        public void navigate(){
	        System.out.println("Motorcycle navigation logic");
	        }
}
