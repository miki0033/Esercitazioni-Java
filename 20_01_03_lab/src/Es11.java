import java.util.Scanner;

public class Es11 {
    /*
     * Write a Java program to trim leading or trailing whitespace from a given
     * string
     */

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        System.out.println(str1);
        scan.close();
    }
}