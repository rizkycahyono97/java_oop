package package1.data;

public enum Level {
    STANDARD("Standard Lefel"),
    PREMIUM("Premium Level"),
    VIP("Vip Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
