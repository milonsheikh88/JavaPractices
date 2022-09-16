class Screen {

    public void display() {
        System.out.println("The NON-static method from parent class");
    }

    /*
     * public static method which can not be overridden in Java
     */
    public static void show() {
        System.out.println("The static method from parent class");
    }
}

class ColorScreen extends Screen {
    @Override
    public void display() {
        System.out.println("The NON-static method from Child class");
    }

    /*
     * static method of the same name and method signature
     * as existed in super
     * class, this is not method overriding instead this is called
     * method hiding in Java
     */
    public static void show() {
        System.out.println("Overridden static method in Child Class in Java");
    }
}

public class OverridingExample {

    public static void main(String args[]) {
        Screen scrn = new ColorScreen();
        scrn.display();

        // As per overriding rules this should call to class ColorScreen's display().
        // overridden method. Since static method can not be overridden, it
        // calls Screen's display()
        scrn.show();
    }
}

