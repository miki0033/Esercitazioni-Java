
import java.util.Scanner;

public class Es6 {
    /* Write a Java program to create a distinct identifier for a given string. */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa: ");
        String str1 = scan.nextLine();
        char[] charr = str1.toCharArray();
        int[] codarr = new int[charr.length];
        for (int i = 0; i < codarr.length; i++) {
            codarr[i] = ((int) charr[i]);
        }

        String id = "";
        for (int j = 0; j < codarr.length; j++) {
            id = id.concat(String.valueOf(codarr[j]));
        }
        System.out.printf("L' id della stringa è: %s \n", id);

        scan.close();
    }
}
