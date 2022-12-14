package casting;

public class CastingExample {
    public static void main(String[] args) {

        // Up casting
        Parent object = new Child();
        object.id = 111;
        System.out.println(object.id);
        object.method();

        // Down casting
        Child object2 = (Child)object;

        object2.id = 112;
        object2.name = "Milon Sheikh";
        System.out.println(object2.id);
        System.out.println(object2.name);
        object2.method();
    }
}
