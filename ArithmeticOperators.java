public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        int num3 = 10;
        num3++;
        int num4 = 10;
        num4--;
        int num5 = 10;
        num5 *= 1;
        int num6 = 10;
        num6 /= 1;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        int num7 = 20;
        ++num7;
        int num8 = 20;
        --num8;
        System.out.println(num7);
        System.out.println(num8);
    }
}