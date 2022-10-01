package innerClass.AnonymousClass;

class Polygon {
    public void display() {
        System.out.println("Inside the innerClass.AnonymousClass.Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {

        // creation of anonymous class extending class innerClass.AnonymousClass.Polygon
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClassExample {

    public static void main(String[] args) {
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.createClass();
    }

}
