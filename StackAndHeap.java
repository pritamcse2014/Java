class CalculatorThree {
    int num = 10;
    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;
    }
}


public class StackAndHeap {
    public static void main(String[] args) {
        int data = 20;
        CalculatorThree obj = new CalculatorThree();
        CalculatorThree obj1 = new CalculatorThree();
        int result = obj.add(15, 10);
        System.out.println(result);
        obj.num = 5;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}