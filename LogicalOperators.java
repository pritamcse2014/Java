public class LogicalOperators {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;
        boolean result1 = x > y && a > b;
        boolean result2 = x > y || a > b;
        boolean result3 = x > y && a < b;
        boolean result4 = x > y || a < b;
        boolean result5 = x < y && a < b;
        boolean result6 = x < y || a < b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}