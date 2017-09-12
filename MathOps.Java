import java.util.Scanner;
public class MathOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number, any number!");
        String x = scanner.nextLine();
        double a = Double.parseDouble(x);

        System.out.println("Pick another number!");
        String y = scanner.nextLine();
        double b = Double.parseDouble(y);

        double add = a+b;
        double subtract = a-b;
        double multiply = a*b;
        double divide = a/b;
        double modulo = a%b;

        showResults(add, subtract, multiply, divide, modulo);
    }

    public static void showResults(double a, double b, double c, double d, double e) {
        System.out.println("The sum is " + a);
        System.out.println("The difference is " + b);
        System.out.println("The product is " + c);
        System.out.println("The quotient is " + d);
        System.out.println("The modulus is " + e);
    }
}


