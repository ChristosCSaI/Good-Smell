class Vehicle {
    private String model;
    private String make;
    private int year;
    private boolean isElectric;

    public Vehicle(String model, String make, int year, boolean isElectric) {
    	this.model=model;
    	this.make=make;
    	this.year=year;
    	this.isElectric=isElectric;
    }
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public boolean isElectric() {
        return isElectric;
    }
}


