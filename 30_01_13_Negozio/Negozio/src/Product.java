public class Product {
    String name;
    float price;
    int quantity;
    boolean food;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.food = false;
    }

    public Product(String name, float price, int quantity, boolean food) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getType() {
        return food;
    }

    public boolean checkQuantity(int n) {
        if (this.getQuantity() >= n) {
            return true;
        } else
            return false;
    }
}
