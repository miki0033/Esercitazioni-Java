public class Customer implements Comparable<Customer> {
    private static int nextId;
    private String nome;
    private String cognome;
    private int eta;
    private int id;

    public Customer(String nome, String cognome, int eta, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.id = nextId;
        nextId++;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Customer))
            return false;
        Customer o = (Customer) obj;
        boolean equals = (this.id == o.id);
        return equals;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) id;
        hash = 31 * hash + (this.getNome() == null ? 0 : this.getNome().hashCode());
        hash = 31 * hash + (this.getCognome() == null ? 0 : this.getCognome().hashCode());
        return hash;
    }

    /*
     * @Override
     * public int compareTo(Customer c1){
     * if(c1.getEta()==this.getEta()){
     * return 0;
     * }
     * else if (c1.getEta()>this.getEta()) {
     * return 1;
     * }
     * else if (c1.getEta()<this.getEta()) {
     * return -1;
     * }
     * if(c1==null)
     * }
     */
    @Override
    public int compareTo(Customer a) {
        if (this.eta == a.eta)
            return 0;
        else if (this.eta > a.eta)
            return 1;
        else
            return -1;
    }
}
