class Car implements VehicleFeatures {
    // ISP Violation: Car should not implement methods that are irrelevant
    public void navigate() {
        // car navigation logic
    }

    public void communicate() {
        // car communication logic
    }
}
