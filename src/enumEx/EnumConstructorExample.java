package enumEx;

public class EnumConstructorExample {
    public static void main(String[] args) {
        Size size = Size.SMALL;

        System.out.println(size);
        System.out.println(size.getSize());
        System.out.println( Size.SMALL.getSize());


    }
}
