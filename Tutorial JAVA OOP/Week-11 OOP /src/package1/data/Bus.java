package package1.data;

public class Bus implements Car {
    private String name;
    private double price;

    public String getBrand() {
        return "Hino";
    }

    public boolean IsMaintenence() {
        return true;
    }

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTier() {
        return 0;
    }

    public boolean isBig() {
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Bus name: " + this.name + " with price: " + this.price;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Bus)) {
            return false;
        }

        Bus bus = (Bus) o;

        if (this.price != bus.price) {
            return false;
        }

        if (this.name != null) {
            return name.equals(bus.name);
        } else {
            return bus.name == null;
        }
    }

    public int hashCode() { 
        int result = this.name != null? this.name.hashCode(): 0;
        result = 31 * result + (int) this.price;
        return result;
    }
}
