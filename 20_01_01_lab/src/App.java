import java.util.Scanner;
//package app;
//import app.Exercise02;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        String name = scan.nextLine(); // Read user input
        System.out.println("Hello "); // Output user input
        System.out.println(name);
        char a = 'a';
        char b = 'b';
        /*
         * Exercise02.main(scan);
         * Exercise03.main(scan);
         * Exercise04.main(scan);
         */Exercise05.main(scan);
        Exercise06.main(scan);
        Exercise07.main(scan);
        Exercise08.main(scan);
        Exercise09.main(scan);
        Exercise10.main(scan);
        boolean es11 = Exercise11.main(a, b);
        System.out.println((es11 ? "true" : "false") + a + b);
        Exercise12.main();
        // Exercise13.main(scan);
        scan.close();
    }
}