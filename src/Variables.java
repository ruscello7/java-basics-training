import java.util.Locale;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String name;
        int age;
        double height;
        String student;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your Height: ");
        height = input.nextDouble();

        input.nextLine();
        System.out.print("You are a student: ");
        student = input.nextLine();

        System.out.printf("Your name is: %s%n Your Age is: %d%n Your Height is: %.1f%n You a student: %s%n ", name, age, height, student);

        












    }
}
