import java.util.Scanner;

public class Es5 {
    /*
     * Write a Java program to compare a given string to the specified character
     * sequence
     */

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str1 = scan.nextLine();
        System.out.println("Inserire la seconda stringa: ");
        String seq = scan.nextLine();

        int of = str1.compareTo(seq);
        boolean check = (of == 0 ? true : false);
        System.out.println(check ? "true" : "false");
        scan.close();
    }
}
