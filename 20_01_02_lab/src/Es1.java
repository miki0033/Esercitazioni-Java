import java.util.Scanner;

public class Es1 {
    public static void main() {
        // Write a Java program to convert temperature from Fahrenheit to Celsius
        // degrees.
        // (32 °F - 32) × 5/9 = 0
        System.out.println("Immettere il valore della temperatura in Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        float fahrenheit = scan.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("La temperatura in Celsius è di: " + celsius);
        scan.close();
    }
}
