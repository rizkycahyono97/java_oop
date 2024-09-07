package package1.mealOrder;

import package1.item.*;

public class MealOrder {
    private Meal meal;
    private Item drink;

    // Constructor
    public MealOrder(String mealName, double mealPrice, String drinkName, double drinkPrice) {
        this.meal = new Meal(mealName, mealPrice);
        this.drink = new Item("Drink", drinkName, drinkPrice);
    }

    // polymorphism
    public void addExtras(String[] extras) {
        for (String extra : extras) {
            meal.addExtra(new Item("Extra", extra, 3000)); // Menetapkan harga ekstra default
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
        // Update harga berdasarkan ukuran jika perlu
        if ("LARGE".equals(size)) {
            drink = new Item("Drink", drink.getName(), 7000);
        } else {
            drink = new Item("Drink", drink.getName(), 3000);
        }
    }

    public double calculateTotalPrice() {
        double total = meal.getPrice() + drink.getPrice() + meal.getExtrasPrice();
        return total;
    }

    public void printItemizedList() {
        System.out.println(meal.toString());
        System.out.println(drink.getSize() + " " + drink.getName() + ":" + String.format("%.2f", drink.getPrice()));
        System.out.println("--------------------");
        System.out.println("TOTAL PRICE:" + String.format("%.2f", calculateTotalPrice()));
    }
}