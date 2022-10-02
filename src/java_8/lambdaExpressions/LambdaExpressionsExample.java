package java_8.lambdaExpressions;

public class LambdaExpressionsExample {
    public static void main(String[] args) {

        FunctionalInterface lambdaConcat = (String a, String b) -> {return a + " " + b;};
        String concatenatedString = lambdaConcat.concatString("Hello ", "World");
        System.out.println("String concatenation: "+concatenatedString);

        // Lambda expression without return keyword.
        Addable addable=(a,b)->(a+b);
        System.out.println("int add: "+addable.add(100,200));

    }
}
