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

        Sayable sayable1 = MethodReference::saySomethingStatic; // Referring static method
        sayable1.say(); // Calling interface method

        MethodReference methodReference = new MethodReference(); // Creating object
        Sayable sayable2 = methodReference::saySomethingNonStatic; // Referring non-static method using reference
        sayable2.say(); // Calling interface method

    }
}
