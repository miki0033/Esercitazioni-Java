import java.util.Scanner;

public class Es3 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di minuti:");
        int minutes = input.nextInt();
        int year = minutes / 525600;
        int day = (minutes - (525600 * year)) / 1440;
        input.close();
        System.out.println(minutes + " minuti sono: " + year + " anni e " + day + " giorni ");
    }
}
