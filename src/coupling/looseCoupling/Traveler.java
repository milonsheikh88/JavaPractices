package coupling.looseCoupling;

class Traveler {
    private Vehicle vehicle;

    public void setVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void startJourney() {
        vehicle.move();
    }
}
