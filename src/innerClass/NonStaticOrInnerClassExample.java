package innerClass;

class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class Engine {
        String engineType;

        void setEngine() {

            // Accessing the carType property of innerClass.Car
            if (Car.this.carType.equals("4WD")) {

                // Invoking method getCarName() of innerClass.Car
                if (Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            } else {
                this.engineType = "Bigger";
            }
        }

        String getEngineType() {
            return this.engineType;
        }
    }
}

public class NonStaticOrInnerClassExample{

    public static void main(String[] args) {

        // create an object of the outer class innerClass.Car
        // create an object of inner class using the outer class
        Car car1 = new Car("Mazda", "8WD");
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }

}
