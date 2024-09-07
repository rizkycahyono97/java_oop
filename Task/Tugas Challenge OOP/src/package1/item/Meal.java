package package1.item;

import java.util.ArrayList;
import java.util.List;

public class Meal extends Item { // extends untuk inheritance
    // Encapsulasi
    private List<Item> extras;  // Variable untuk Array

    // Constructor
    public Meal(String name, double price) {
        super("Meal", name, price);
        this.extras = new ArrayList<>();
    }

    // Method
    public void addExtra(Item extra) {
        extras.add(extra);
    }

    public List<Item> getExtras() {
        return extras;
    }

    public double getExtrasPrice() {
        double total = 0;
        for (Item extra : extras) {
            total += extra.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BASE MEAL:").append(String.format("%.2f", getPrice())).append("\n");
        for (Item extra : extras) {
            sb.append(" ").append(extra.toString()).append("\n");
        }
        sb.append("--------------------\n");
        return sb.toString();
    }
}
