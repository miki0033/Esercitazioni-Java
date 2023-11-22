import java.util.Scanner;

public class Es2 {
    /*
     * Write a Java program to compare two strings lexicographically.
     * Two strings are lexicographically equal if they are the same length and
     * contain the same characters in the same positions
     */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la prima stringa: ");
        String str1 = scan.nextLine();
        System.out.println("Inserire la seconda stringa: ");
        String str2 = scan.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The two strings are lexicographically equal");
        } else
            System.out.println("The two strings are not lexicographically equal");
        scan.close();
    }
}
