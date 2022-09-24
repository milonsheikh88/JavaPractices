package wrapperClass;

public class WrapperClassExample {
    public static void main(String[] args) {

        int primitiveInt = 30;
        //converting int into Integer explicitly
        Integer i = Integer.valueOf(primitiveInt);
        //autoboxing, now compiler will write Integer.valueOf(a) internally
        Integer j = primitiveInt;

        Integer objectInteger = 30;
        //converting Integer to int explicitly
        int x = objectInteger.intValue();
        //unboxing, now compiler will write a.intValue() internally.
        int y = objectInteger;

        System.out.println(primitiveInt == objectInteger);

    }

}
