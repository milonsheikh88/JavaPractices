public class WhileLoopExample {
    public static void main(String[] args) {

//        whileLoop();

        doWhileLoop();

    }

    private static void whileLoop() {
        int number = 1;
        while (number <= 5) {
            System.out.println("YES =====" + number);
            ++number;
        }
    }

    private static void doWhileLoop() {
        int number = 6;
        do {
            System.out.println("YES =====" + number);
            ++number;
        }while (number <= 5);


    }

}
