import java.util.Scanner;

public class Exercise08 {
    public static void main(Scanner scan) {
        System.out.println("Inserire il raggio del cerchio: ");
        double radius = scan.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Lacirconferenza del cerchio è: " + perimeter);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("L'area del cerchio è: " + area);
    }

}