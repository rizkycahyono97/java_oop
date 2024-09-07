package package1.app;

import package1.data.*;
import package1.util.*;;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,3,5,7,9,11));

        Country.City city = new Country.City();
        city.setName("Ponorogo");

        System.out.println(city.getName());
        System.out.println(Application.PROCESSORS);
    }
}
