import java.util.Arrays;

/* Scrivere un programma che permetta di gestire una Biblioteca semplificata,
 in grado di gestire un array di indici (interi) dei libri che contiene.
  La Biblioteca viene costruita a partire da un array di indici di libri.*/
public class Biblioteca {
    int index = 1;
    int[] libri;

    public static void main(String[] args) {
        int[] values = new int[7];
        values[0] = 123;
        values[1] = 4;
        values[2] = 98;
        values[3] = 33;
        values[4] = 76;
        values[5] = 2;
        values[6] = 235;
        Biblioteca library = new Biblioteca(values);
        System.out.println(library.esisteLibro(76));
        System.out.println(library.esisteLibro(333));
        int[] libriOrdinati = library.getIndiciLibriOrdinati();
        System.out.println(libriOrdinati[0] == 2);
        System.out.println(libriOrdinati[1] == 4);
        System.out.println(libriOrdinati[2] == 33);
        System.out.println(libriOrdinati[3] == 76);
        System.out.println(libriOrdinati[4] == 98);
        System.out.println(libriOrdinati[5] == 123);
        System.out.println(libriOrdinati[6] == 235);
    }

    public Biblioteca(int[] libri) {
        this.libri = libri;

    }

    public boolean esisteLibro(int index) {
        /*
         * esisteLibro: prende un indice e restituisce true
         * se esiste il libro con questo indice, false altrimenti
         */
        boolean exist = false;
        for (int i = 0; i < libri.length; i++) {
            exist = (libri[i] == index);
            if (exist) {
                break;
            }
        }
        return exist;
    }

    public int[] getIndiciLibriOrdinati() {
        /*
         * getIndiciLibriOrdinati: ritorna la lista degli indici di libri
         * presenti nella library, in ordine ascendente
         */
        int[] sort = libri;
        Arrays.sort(sort);
        return sort;
    }

}
