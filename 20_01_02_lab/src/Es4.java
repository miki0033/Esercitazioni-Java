import java.util.Scanner;

public class Es4 {
    /*
     * Write a Java program to take the user for a distance (in meters) and the time
     * taken (as three numbers: hours, minutes, seconds), and display the speed, in
     * meters per second, kilometers per hour and miles per hour (hint: 1 mile =
     * 1609 meters).
     */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la distanza percorsa: ");
        int m = scan.nextInt();
        System.out.println("Inserire le ore impiegare: ");
        int h = scan.nextInt();
        System.out.println("Inserire i minuti impiegati: ");
        int minutes = scan.nextInt();
        System.out.println("Inserire i secondi impiegati: ");
        int sec = scan.nextInt();

        float time = sec + minutes * 60 + h * 60 * 60;
        float velms = m / time;
        float velkh = velms * 3.6f;
        float velmh = velms * 2.237f;
        System.out.printf("La velocita in metri al secondo è di: %f\n", velms);
        System.out.printf("La velocita in kilometri orari è di: %f\n", velkh);
        System.out.printf("La velocita in miglia orarie è di: %f\n", velmh);

        scan.close();
    }
}
