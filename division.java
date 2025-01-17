import java.util.Scanner;

public class division {
    public static String divideNumbers(double a, double b, double c) {
        try {
            if (b == 0 || c == 0) {
                throw new ArithmeticException();
            }
            return String.format("%.2f", (a / b) / c);
        } catch (ArithmeticException e) {
            return "Error: Division by zero!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        String result = divideNumbers(num1, num2, num3);
        System.out.printf("%.2f ÷ %.2f ÷ %.2f = %s%n",
                num1, num2, num3, result);

        scanner.close();
    }
}