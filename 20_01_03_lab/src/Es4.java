
import java.util.Scanner;

public class Es4 {
    /*
     * Write a Java program to test if a given string contains the specified
     * sequence of char values
     */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str1 = scan.nextLine();
        System.out.println("Inserire la sequenza: ");
        String seq = scan.nextLine();

        int of = str1.indexOf(seq, 0);
        boolean check = (of != -1 ? true : false);
        System.out.println(check ? "true" : "false");
        scan.close();
    }
}
