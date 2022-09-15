public class BreakContinueExample {
    public static void main(String[] args) {
//        breakStatement();

        continueStatement();
    }

    private static void breakStatement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
    }

    private static void continueStatement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }
}
