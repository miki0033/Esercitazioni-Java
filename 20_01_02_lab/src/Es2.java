import java.util.Scanner;

public class Es2 {
    public static void main() {
        // Write a Java program that reads a number in inches and converts it to meters.
        // /39,37
        System.out.println("Immettere il valore della lunghezza in inches: ");
        Scanner scan = new Scanner(System.in);
        float inc = scan.nextFloat();
        float m = (inc / 39.37f);
        System.out.println("La lunghezza in metri è di: " + m);
        scan.close();
    }
}
