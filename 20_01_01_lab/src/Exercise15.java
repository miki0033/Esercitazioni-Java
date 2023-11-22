import java.util.Scanner;

public class Exercise15 {
    public static void main(Scanner scan) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("Equal");
        } else {
            System.out.println("Numbers are not equal!");
        }

    }
}
