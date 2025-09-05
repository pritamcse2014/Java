public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " Hi ");
            i++;
        }
        System.out.println(i + " Hlw ");

        int j = 1;
        while (j <= 5) {
            System.out.println(j + " Hi ");
            int x= 1;
            while (x <= 3) {
                System.out.println(x + " Bye ");
                x++;
            }
            j++;
        }
        System.out.println(j + " Hlw ");
    }
}