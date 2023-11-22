import java.util.Scanner;

public class Es9 {
    /*
     * Write a Java program to replace a specified character with another character.
     */

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str1 = scan.nextLine();
        System.out.println("Inserire il carattere da rimpiazzare: ");
        String ch = scan.nextLine();
        System.out.println("Inserire il carattere con cui rimpiazzare: ");
        String rp = scan.nextLine();
        char crp = rp.toCharArray()[0];
        int of = str1.indexOf(ch, 0);
        if (of != -1) {
            char[] charr = str1.toCharArray();
            charr[of] = crp;
            for (int i = 0; i < charr.length; i++) {
                System.out.print(charr[i]);
            }
            System.out.print("\n");

        }
        // else{}

        scan.close();
    }
}
