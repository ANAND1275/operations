public class DivisionOperation {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            int div = a / b;
            System.out.println("Division result is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero");
        }
    }
}