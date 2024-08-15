package package1.data;

public class Equals {
    public static void main(String[] args) {
        String first = "Muhammad Alfatih";
        String second = "Muhammad";
        second = second + "Al-fatih";

        System.out.println(first==second);
        System.out.println(first.equals(second));

        String third = "Muhammad Alfatih";
        System.out.println(first==third);
        System.out.println(first.equals(third));

        Bus bus = new Bus();
        bus.setName("Pahala Kencana"); 
        bus.setPrice(1.5);
        System.out.println(bus);

        Bus bus2 = new Bus();
        bus2.setName("Pahala Kencana");
        bus2.setPrice(1.5);

        System.out.println(bus.equals(bus2));

        System.out.println(bus.equals(bus2));
        System.out.println(bus.hashCode());
        System.out.println(bus2.hashCode());
        System.out.println(bus.hashCode() == bus2.hashCode());
    }
}
