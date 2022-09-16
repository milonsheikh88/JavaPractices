
interface Printable {
    public static int num = 100;
    void print();
}

class A4 implements Printable {
    public void print() {
        System.out.println("Hello --- A4");
    }
}

class A6 implements Printable {
    public static int num = 10000;
    public void print() {
        System.out.println("Hello --- A6");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Printable obj=new A6();
        A6 a6=new A6();
        obj.print();

        System.out.println("Value of num of the interface "+Printable.num);
        System.out.println("Value of num of the class "+obj.num);
        System.out.println("Value of num of the class "+a6.num);

    }
}


//interface MyInterface{
//    public static int num = 100;
//    public void display();
//}
//
//class MyClass implements MyInterface{
//    public static int num = 10000;
//    @Override
//    public void display() {
//        System.out.println("This is the implementation of the display method");
//    }
//    public void show() {
//        System.out.println("This is the implementation of the show method");
//    }
//}
//
//public class InterfaceExample{
//    public static void main(String args[]) {
//        MyClass obj = new MyClass();
//
//        System.out.println("Value of num of the interface "+MyInterface.num);
//        System.out.println("Value of num of the class "+obj.num);
//    }
//}