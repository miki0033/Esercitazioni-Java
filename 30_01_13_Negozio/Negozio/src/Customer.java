import java.util.Scanner;

public class Customer {
    String name;
    int age;
    int point;
    String day;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.point = 0;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public float calculateAmount(Product args[]) {
        float amount = 0;
        if ((day == "lun" || day == "mer") && age > 60) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].getType()) {
                    amount = amount + (args[i].getPrice() * 20 / 100);
                } else {
                    amount += args[i].getPrice();
                }
            }
        } else {
            for (int i = 0; i < args.length; i++) {
                amount += args[i].getPrice();
            }
        }
        if (point >= 10 && amount > 1) {
            amount -= 1;
            point -= 10;
        }

        return amount;
    }

    public float installment(float amount, Scanner scan) {
        float installment = 0;
        int nmonth = 1;
        boolean doit = false;
        while (!doit) {
            try {
                System.out.println("Inserire il numero di mesi per cui rateizzare:");
                nmonth = scan.nextInt();
                doit = true;
            } catch (Exception e) {
                doit = false;
            }
        }
        installment = amount / nmonth;
        return installment;
    }

}
