import java.util.Scanner;

public class Exercise09 {
    public static void main(Scanner scan) {
        System.out.println("Inserire 3 numeri per calcolarne la media: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        float av = (a + b + c) / 3;
        System.out.println(av);

    }
}
