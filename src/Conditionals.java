import java.util.Scanner;

public class Conditionals {
    public static void main(Strings[] args) {

        Scanner input = new Scanner(System.in);

        int note;

        System.out.println("Enter your grade, student: ");
        note = input.nextInt();

        if (note >= 60) {
            System.out.println("APPROVED!"); 
        } else if (note >= 40) {
            System.out.println("RECOVERY!");
        } else {
            System.out.println("FAILED!");
        }
    }
}
