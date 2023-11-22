import java.util.Scanner;

public class Es1 {
    /*
     * Write a Java program to get the character at the given index within the
     * string.
     */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire una stringa: ");
        String str = scan.nextLine();
        char[] charr = str.toCharArray();
        System.out.println("Inserire un indice: ");
        int idx = scan.nextInt();
        System.out.printf("In posizione %d c'è la lettera %c: \n", idx, charr[idx]);
        scan.close();

    }
}
