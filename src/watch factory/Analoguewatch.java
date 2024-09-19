package lab6;

public class Analoguewatch extends watches {
    private String mechanismType;

    public Analoguewatch(int uniqueID, String brand, String model, double price, String mechanismType) {
        super(uniqueID, brand, model, price, "Analoguewatch");
        this.mechanismType = mechanismType;
    }
}
