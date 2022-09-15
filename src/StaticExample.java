public class StaticExample {

    // static variable
    static int age;
    static int a = m1();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    public static void main(String[] args) {
        StaticExample.age = 20;
        StaticExample.m1();


    }
}
