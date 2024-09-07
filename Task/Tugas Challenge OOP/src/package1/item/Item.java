package package1.item;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    // Constructor
    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    // getter
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    // Setter
    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    @Override
    public String toString() {
        return name + ": $" + String.format("%.2f", price);
    }
}
