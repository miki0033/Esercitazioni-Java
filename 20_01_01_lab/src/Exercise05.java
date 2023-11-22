import java.util.Scanner;

public class Exercise05 {
    public static void main(Scanner scan) {
        int a = scan.nextInt();
        System.out.println("FIRST INPUT: " + a);
        int b = scan.nextInt();
        System.out.println("SECOND INPUT: " + b);
        int mol = a * b;
        System.out.println(a + "x" + b + " = " + mol);
    }
}