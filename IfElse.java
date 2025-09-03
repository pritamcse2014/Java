public class IfElse {
    public static void main(String[] args) {
        int x = 18;
        if (x > 10) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        if (true) {
            System.out.println("Hi");
        }

        if (x >= 10 && x <= 20) {
            System.out.println("Ten to Twenty");
        } else {
            System.out.println("Not a Number");
        }

        int a = 5;
        int b = 7;
        if (a > b) {
            System.out.println(a);
            System.out.println("Thank You");
        } else {
            System.out.println(b);
            System.out.println("Welcome");
        }
    }
}