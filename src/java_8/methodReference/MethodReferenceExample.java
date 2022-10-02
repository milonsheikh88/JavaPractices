package java_8.methodReference;

interface Sayable{
    void say();
}

class MethodReference {
    public static void saySomethingStatic(){
        System.out.println("Hello, this is static method.");
    }

    public void saySomethingNonStatic(){
        System.out.println("Hello, this is non-static method.");
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {

        // Referring static method
        Sayable sayable = MethodReference::saySomethingStatic;

        // Calling interface method
        sayable.say();
        MethodReference methodReference = new MethodReference(); // Creating object

        // Referring non-static method using reference
        Sayable sayable1 = methodReference::saySomethingNonStatic;
        // Calling interface method
        sayable1.say();

    }
}
