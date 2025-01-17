import java.util.Scanner;

public class smallest {
    public static double findSmallest(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double result = findSmallest(num1, num2, num3);
        System.out.printf("The smallest number among %.2f, %.2f, and %.2f is: %.2f%n",
                num1, num2, num3, result);

        scanner.close();
    }
}