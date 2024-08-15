package package1.app;

import package1.data.Avanza;
import package1.data.Bus;
import package1.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();

        Avanza avanza = new Avanza();
        System.out.println(avanza.getTier());
        avanza.drive();
        System.out.println(avanza.getBrand());
        System.out.println(avanza.IsMaintenence());

        Bus bus = new Bus();
        System.out.println(bus.getBrand());
        System.out.println(bus.isBig());

        bus.setName("Pahala Kencana");
        bus.setPrice(1.5);
        
        System.out.println(bus);
    }
}
