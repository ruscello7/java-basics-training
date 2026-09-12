public class Loops {
    public static void main(Strings[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 90) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
