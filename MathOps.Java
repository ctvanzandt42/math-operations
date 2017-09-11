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

        showResults(a, b);
    }

    public static void showResults(double num1, double num2){
        System.out.println(num1 + " plus " + num2 + " equals " + (num1+num2));
        System.out.println(num1 + " minus " + num2 + " equals " + (num1-num2));
        System.out.println(num1 + " multiplied by " + num2 + " equals " + (num1*num2));
        System.out.println(num1 + " divided by " + num2 + " equals " + (num1/num2));
        System.out.println("The modulus of " + num1 + " and " + num2 + " is " + (num1%num2) + " THEY CALL IT THE REMAINDER ITS THE NUMBER THAT REMAINS!!!");
    }
}
