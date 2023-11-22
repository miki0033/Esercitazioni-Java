import java.util.Scanner;

public class Es8 {
    /* Write a Java program to get the length of a given string */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str = scan.nextLine();
        System.out.println(str.toCharArray().length);

        scan.close();
    }
}
