abstract class Bike {

    abstract void run();

    public void doStuff() {
        System.out.println("Called BaseClass Do Stuff");
    }

}

class Honda extends Bike {

    @Override
    void run() {
        System.out.println("Honda running safely");
    }

    @Override
    public void doStuff() {
        super.doStuff();
        System.out.println("Overriding BaseClass Do Stuff");
    }
}

class Pulsar extends Bike {
    @Override
    void run() {
        System.out.println("Pulsar running safely");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Bike obj = new Pulsar();
        obj.run();

        Bike obj1 = new Honda();
        obj1.doStuff();
    }
}
