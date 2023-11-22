import java.util.PriorityQueue;

public class MarketQueue extends PriorityQueue<Customer> {
    private static PriorityQueue<Customer> queue = new PriorityQueue<Customer>();

    // inserimento in coda di un Customer
    public boolean add(Customer c) {
        return queue.add(c);
    }

    // rimozione dalla coda di un Customer
    public boolean remove(Customer c) {
        return queue.remove(c);
    }

    // ottenere prossimo Customer da servire
    public static Customer nextCostumer() {
        return queue.poll();
    }

    // ottenere il numero di clienti attualmente in coda
    public static int customerNumber() {
        return queue.size();

    }
}
