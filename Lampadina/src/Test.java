import java.util.Scanner;

public class Test {
    /* Scrivere una classe di test che verifichi il funzionamento delle classi */
    public static void main(String[] args) throws Exception {
        Lampadina l1 = new Lampadina();
        Lampadina l2 = new Lampadina(5);

        Lampadina.setCorrente(true);
        //testLampadina(l1);
        testLampadina(l2);

        Interruttore i1 = new Interruttore(l1);
        Interruttore i2 = new Interruttore(l1);

        testInterruttore(i1, i2);

    }

    public static int testLampadina(Lampadina l) {
        System.out.println(l.getStato());
        int azionamenti = l.maxAzionamenti;
        for (int i = 0; i < azionamenti; i++) {
            l.setStato();
            System.out.println(i);
            System.out.println(l.getStato());
        }
        return 0;
    }

    public static int testInterruttore(Interruttore i1, Interruttore i2) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("0=exit, 1=interruttore1, 2=interruttore2");
            int cmd = input.nextInt();
            if (cmd == 1) {
                i1.click();
            } else if (cmd == 2) {
                i2.click();
            } else if (cmd == 0) {
                flag = false;
            }
        }
        input.close();
        return 0;
    }
}
