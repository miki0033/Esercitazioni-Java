import java.util.Set;
import java.util.Scanner;

public class App {
    Set<User> database;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        // MAIN

        // END
        scan.close();
    }

    // inserire un utente e i suoi interessi
    public static void newUser(Scanner scan) {
        System.out.println("Inserire il nome: ");
        String name = scan.nextLine(); // Read user input
        System.out.println("Inserire il cognome: ");
        String surname = scan.nextLine(); // Read user input
        boolean flag = false;
        String sex = "";
        while (!flag) {
            System.out.println("Inserire il sesso: (M/F) ");
            sex = scan.nextLine().toUpperCase(); // Read user input
            if (sex == "M" || sex == "F") {
                flag = true;
            }
        }
        User user = new User(name, surname, sex);
    }
    // cancellare un utente (e i suoi interessi associati)
    // dato un utente u1, ottenere l'utente u2 con più interessi in comune con u1
    // PLUS 🏍:ottenere gli utenti più simili (ossia con più interessi in comune)
}
