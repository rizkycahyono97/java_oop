package package1.app;

import package1.data.Customer;
import package1.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Fulan");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        System.out.println(customer.getLevel().getDescription());

        // Konversi
        String levelString = Level.VIP.name();
        System.out.println(levelString);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] levels = level.values();
        System.out.println(levels);

        System.out.println("Print level");
        for (var value : level.values()) {
            System.out.println(value);
        }
    }
}
