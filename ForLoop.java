public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Hi ");
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " Hlw ");
        }

        for (int x = 1; x <= 10; x++) {
            System.out.println(" Day " + x);

            for (int y = 1; y <= 9; y++) {
                System.out.println("  " + y);

                System.out.println("  " + (y + 8) + " - " + (y + 9));
            }
        }
    }
}