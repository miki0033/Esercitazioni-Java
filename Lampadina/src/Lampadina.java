/* */

public class Lampadina {

    String stato = "spenta";// accesa spenta rotta
    int maxAzionamenti = 20;
    static boolean corrente = true;

    public Lampadina() {
    }

    public Lampadina(int max) {
        maxAzionamenti = max;
    }

    public String getStato() {
        return stato;
    }

    public void setStato() {
        /*
         * metodo che cambia lo stato della lampadina da accesa a spenta o da spenta ad
         * accesa,
         * oppure che imposta lo stato a "rotta"
         * se si è raggiunto il limite massimo di azionamenti per quella lampadina
         */
        if (corrente) {
            maxAzionamenti--;
            if (maxAzionamenti <= 0) {
                this.stato = "rotta";
            } else if (stato.equals("accesa")) {
                this.stato = "spenta";
            } else if (stato.equals("spenta")) {
                this.stato = "accesa";
            }
        } else {
            if (stato.equals("rotta")) {
            } else
                this.stato = "spenta";
        }

    }

    public static void setCorrente(boolean corrente) {
        Lampadina.corrente = corrente;
    }

}
