package java_8.interfaceDefaultMethod;

interface Sayable{

    // Abstract method
    void say(String msg);

    // Default method
    default void sayMore(){
        System.out.println("Hello, this is default method...");
    }
}

class sayableImpl implements Sayable{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        sayableImpl simple = new sayableImpl();

        // calling abstract method
        simple.say("Hello, This is abstract method...");

        // calling default method
        simple.sayMore();
    }
}
