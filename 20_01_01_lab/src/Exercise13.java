import java.util.Scanner;

public class Exercise13 {
    public static void main(Scanner scan) {
        int a = scan.nextInt();
        System.out.println("FIRST INPUT: " + a);
        int b = scan.nextInt();
        System.out.println("SECOND INPUT: " + b);

        System.out.println(a + "!=" + b + " " + (a != b ? "true" : "false"));
        System.out.println(a + "<" + b + " " + (a < b ? "true" : "false"));
        System.out.println(a + "<=" + b + " " + (a <= b ? "true" : "false"));
    }
}