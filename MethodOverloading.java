class CalculatorTwo {
    public int add(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        CalculatorTwo obj = new CalculatorTwo();
        int result = obj.add(15, 10, 20);
        System.out.println(result);
    }
}