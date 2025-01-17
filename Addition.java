import java.util.Scanner;

public class Addition {
    public static double addNumbers(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double result = addNumbers(num1, num2, num3);
        System.out.printf("Sum of %.2f, %.2f, and %.2f is: %.2f%n",
                num1, num2, num3, result);

        scanner.close();
    }
}