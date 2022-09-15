public class ForLoopExample {
    public static void main(String[] args) {
        simpleForLoop();
        nestedForLoop();
        forEachLoop();

    }


    private static void simpleForLoop() {
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }

    public static void nestedForLoop() {
        int number=5;


        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* " );
            }
            System.out.println();
        }

    }

    private static void forEachLoop(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }


}
