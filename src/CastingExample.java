
// Parent class
class Parent {
    int id;
    void method() {
        System.out.println("Method from Parent");
    }
}

// Child class
class Child extends Parent {
    String name;
    @Override
    void method() {
        System.out.println("Method from Child");
    }
}

public class CastingExample {
    public static void main(String[] args) {

        // Upcasting
        Parent object = new Child();
        object.id = 111;
        System.out.println(object.id);
        object.method();

        // Downcasting
        Child object2 = (Child)object;

        object2.id = 112;
        object2.name = "Milon Sheikh";
        System.out.println(object2.id);
        System.out.println(object2.name);
        object2.method();
    }
}
