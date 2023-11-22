import java.util.Scanner;

public class Exercise10 {
    public static void main(Scanner scan) {
        System.out.println("Inserire la base del rettangolo: ");
        double b = scan.nextDouble();
        System.out.println("Inserire la base del rettangolo: ");
        double h = scan.nextDouble();
        double perimeter = 2 * b + 2 * h;
        System.out.println("Il perimetro del rettangolo è: " + "2 * (" + b + "+" + h + ") = " + perimeter);
        double area = b * h / 2;
        System.out.println("L'area del rettangolo è: " + b + " * " + h + " = " + area);

    }
}
