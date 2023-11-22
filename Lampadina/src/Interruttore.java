public class Interruttore {
    Lampadina lampadina;

    public Interruttore(Lampadina l) {
        lampadina = l;
    }

    public void click() {
        lampadina.setStato();
        System.out.println(lampadina.getStato());
    }

}
