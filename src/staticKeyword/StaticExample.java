package staticKeyword;

class StaticExample {
    static int count = 0;
    static String city = "Dhaka";

    public void increment() {
        count++;
    }

    static void change(){
        city = "Madaripur";
    }

    void display(){System.out.println("My city name is "+city);}

    public static void main(String args[]) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.increment();
        obj2.increment();

        System.out.println("Obj1: count is=" + obj1.count);
        System.out.println("Obj2: count is=" + obj2.count);
        obj1.display();
        StaticExample.change();
        obj2.display();
    }
}