package package1.app;

import package1.mealOrder.MealOrder;

public class App {
    public static void main(String[] args) {
        MealOrder regularMeal = new MealOrder("Nasi Goreng", 5000, "Coke", 3000);

        String[] lauk = {"SAYUR", "IKAN", "TAHU"};
        regularMeal.addExtras(lauk);
        regularMeal.setDrinkSize("LARGE");

        regularMeal.printItemizedList();
    }
}
