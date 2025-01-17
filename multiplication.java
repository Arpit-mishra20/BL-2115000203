import java.util.Scanner;

public class multiplication {
    public static double multiplyNumbers(double a, double b, double c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double result = multiplyNumbers(num1, num2, num3);
        System.out.printf("%.2f × %.2f × %.2f = %.2f%n",
                num1, num2, num3, result);

        scanner.close();
    }
}