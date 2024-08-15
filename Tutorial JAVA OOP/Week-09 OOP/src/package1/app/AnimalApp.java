package package1.app;

import package1.data.*;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Meow";
        animal.run();
    }
}
