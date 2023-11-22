
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class Shop {

    static Product[] products = new Product[100];

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        createProductByFile();


        scan.close();
    }

    public static boolean createProduct(Scanner scan) {
        // chiede i dati di inserimento del prodotto al utente
        boolean doit = false;
        while (!doit) {
            try {
                System.out.println("Inserire nome prodotto:");
                String name = scan.nextLine();
                System.out.println("Inserire il prezzo del prodotto:");
                float price = scan.nextFloat();
                System.out.println("Inserire la quantità in magazino del prodotto:");
                int quantity = scan.nextInt();
                System.out.println("E' un prodotto alimentare?");
                int type = scan.nextInt();
                Product p = new Product(name, price, quantity, castBool(type));
                doit = addProduct(p);
            } catch (Exception e) {
                doit = false;
            }
        }
        return doit;
    }

    public static boolean createProductByFile() {
        boolean doit = false;
        try {
            FileReader f;
            f = new FileReader("warehouse.csv");
            BufferedReader b;
            b = new BufferedReader(f);
            String line;
            line = b.readLine();
            while (line != null) {
                // fare il parsing del JSON
                String[] camp= new String[4];
                camp = line.split(",");
                System.out.println(Arrays. toString(camp));
                Product p=
                new Product(
                    camp[0],
                    Float.parseFloat(camp[1]),
                    Integer.parseInt(camp[2]),
                    Boolean.parseBoolean(camp[3]));
                addProduct(p);
                line = b.readLine();
                if(line == null) break;
            }
            b.close();
        }
        catch (Exception FileNotFountException) {
            System.out.println("File non trovato");
        }
        
        return doit;

    }

    public static boolean addProduct(Product p) {
        // aggiunge il prodotto all'array del negozio
        boolean doit = false;
        for (int i = 0; i < products.length && !doit; i++) {
            if (products[i] != null) {
                products[i] = p;
                doit = true;
            }
        }
        return doit;
    }

    public  static boolean removeProductByName(Scanner scan) {
        boolean doit = false;
        String name = "";
        try {
            System.out.println("Inserire nome prodotto da rimuovere:");
            name = scan.nextLine();
        } catch (Exception e) {
            System.out.println("Nome non valido");
        }
        for (int i = 0; i < products.length && !doit; i++) {
            if (products[i].getName() == name) {
                products[i] = null;
                doit = true;
            }
        }
        return doit;

    }

    public  static boolean removeProduct(Product p) {
        boolean doit = false;
        for (int i = 0; i < products.length && !doit; i++) {
            if (products[i] == p) {
                products[i] = null;
                doit = true;
            }
        }
        return doit;

    }

    public static boolean castBool(int val) {
        if (val <= 0)
            return false;
        return true;
    }

}
