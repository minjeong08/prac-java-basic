package access.ex;

public class Item {
    String name;
    int price;
    int quantity;

    public Item(String productName, int price, int quantity) {
        this.name = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
