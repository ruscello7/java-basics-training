import java.util.Scanner;
import java.util.Locale;

public class Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double number1;
        double number2;
        double sum;
        double difference;
        double product;
        double division;
        int rest;
        boolean flag;


        System.out.println("-----Digital Calculator-----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Remainder");
        System.out.println("6. True or False");

        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        sum = number1 + number2;
        difference = number1 - number2;
        division = number1 / number2;
        product = number1 * number2;
        rest = (int) (number1 % number2);
        flag = number1 % 2 == 0 && number2 % 2 == 0;

        System.out.printf("The results are:%n Addition: %.2f%n Subtraction: %.2f%n Division: %.2f%n Multiplication: %.2f%n Rest: %d%n Flag: %B%n ", sum, difference, division, product, rest, flag );

    }
}
