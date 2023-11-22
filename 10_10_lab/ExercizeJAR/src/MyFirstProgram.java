import java.util.Scanner; // Import the Scanner class

public class MyFirstProgram {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        String line = scan.nextLine();
        System.out.println("Hai scritto " + line);
        scan.close();
    }
}
