public class Literal {
    public static void main(String[] args) {
        int num1 = 0b101;
        System.out.println(num1);

        int num2 = 0x7E;
        System.out.println(num2);

        int num3 = 10_00_00_000;
        System.out.println(num3);

        float num4 = 55;
        System.out.println(num4);

        double num5 = 12e10;
        System.out.println(num5);

        char c = 'A';
        System.out.println(c);

        char ch = 'A';
        ch++;
        System.out.println(ch);
    }
}