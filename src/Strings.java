import java.util.Scanner;

public class Strings {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullName = input.nextLine();

        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());

        String[] parts = fullName.split(" ");
        System.out.println(parts[0]);



    }
}