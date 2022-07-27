public class Main {

    public static void main(String[] args) {
        int a = Calculator.plus(1, 2);
        int b = Calculator.minus(2,1);
        int c = Calculator.multiply(a, b);
        System.out.println("results: " + a + ", " + b + ", " + c);
    }

}
