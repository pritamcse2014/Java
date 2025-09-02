public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;

        System.out.println(b);
        System.out.println(a);

        int c = 12;
        byte k = (byte) c;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        byte x = 10;
        byte y = 10;
        int result = x * y;
        System.out.println(result);
    }
}
