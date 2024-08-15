package package1.data;

public interface Car extends HasBrand, IsMaintenence {
    void drive();
    int getTier();

    default boolean isBig() {
        return false;
    }
}
