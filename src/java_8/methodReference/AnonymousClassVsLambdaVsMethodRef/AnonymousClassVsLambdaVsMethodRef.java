package java_8.methodReference.AnonymousClassVsLambdaVsMethodRef;

public class AnonymousClassVsLambdaVsMethodRef {
    public static void main(String[] args) {

        // AnonymousClass
        Sayable sayableAnonymous = new Sayable() {
            public void say() {
                System.out.println("This is Anonymous class...");
            }
        };
        sayableAnonymous.say();


        Sayable sayableLambada =()->{
            System.out.println("This is Lambda Expression...");
        };
        sayableLambada.say();

        SaySomething methodReference = new SaySomething(); // Creating object

        Sayable sayable = methodReference::saySomethingMore; // Referring non-static method using reference
        sayable.say(); // Calling interface method

    }
}
