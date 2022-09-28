package coupling.looseCoupling;

public class LooseCoupling {
    public static void main(String[] args) {

        Traveler traveler = new Traveler();

        /** Inject Car dependency */
        traveler.setVehicle(new Car());
        traveler.startJourney();

        /** Inject Bike dependency */
        traveler.setVehicle(new Bike());
        traveler.startJourney();

    }
}
