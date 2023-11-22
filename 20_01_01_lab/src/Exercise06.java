import java.util.Scanner;

public class Exercise06 {
    public static void main(Scanner scan) {
        int a = scan.nextInt();
        System.out.println("FIRST INPUT: " + a);
        int b = scan.nextInt();
        System.out.println("SECOND INPUT: " + b);

        int add = a + b;
        System.out.println(a + "+" + b + " = " + add);
        int sub = a * b;
        System.out.println(a + "-" + b + " = " + sub);

        int mol = a * b;
        System.out.println(a + "x" + b + " = " + mol);
        int div = a / b;
        System.out.println(a + "x" + b + " = " + div);
        int mod = a * b;
        System.out.println(a + "mod" + b + " = " + mod);

    }
}