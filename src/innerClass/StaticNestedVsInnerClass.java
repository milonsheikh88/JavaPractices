package innerClass;

class Animals {

    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile....");
        }
    }

    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal....");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // object creation of the outer class
        Animals animals = new Animals();

        // object creation of the non-static class
        Animals.Reptile reptile = animals.new Reptile();
        reptile.displayInfo();

        /** To access the static nested class, we don’t need objects of the outer class.*/
        // object creation of the static nested class
        Animals.Mammal mammal = new Animals.Mammal();
        mammal.displayInfo();

    }
}