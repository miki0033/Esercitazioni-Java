import java.util.Scanner;

public class Es10 {
    /*
     * Write a Java program to check whether a given string starts with another
     * string.
     */

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str1 = scan.nextLine();
        System.out.println("Inserire la seconda stringa: ");
        String str2 = scan.nextLine();

        System.out.println(str1.startsWith(str2, 0) ? "true" : "false");
        scan.close();

    }
}