import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your year of birth: ");
        age = input.nextInt();

        age = 2026 - age;
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");








    }
}
