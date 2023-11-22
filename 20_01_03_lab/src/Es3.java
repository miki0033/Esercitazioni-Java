import java.util.Scanner;

public class Es3 {
    /*
     * Write a Java program to concatenate a given string to the end of another
     * string
     */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la prima stringa: ");
        String str1 = scan.nextLine();
        System.out.println("Inserire la seconda stringa: ");
        String str2 = scan.nextLine();

        System.out.printf("Le stringhe concatenate formano: %s ", str1.concat(str2));
        scan.close();
    }
}