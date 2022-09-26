package innerClass;

class Animals {

    // inner class
   class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile....");
        }
    }

    // static nested or inner class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal....");
        }
    }

    //Private nested or inner class
    private class InnerDisplay {
        public void display() {
            System.out.println("Private inner class method called");
        }
    }

    void display() {
        System.out.println("Outer class (Display) method called");
        // Access the private inner class
        InnerDisplay innerDisplay = new InnerDisplay();
        innerDisplay.display();
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

        /** we don’t access the Private nested or inner class directly.*/
        animals.display();

    }
}