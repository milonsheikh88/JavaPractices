package coupling.tightCoupling;

public class Traveler {
    /** Traveler class is tightly coupled with Car class. */
    Car car = new Car();
    public void startJourney() {
        car.move();
    }

}
