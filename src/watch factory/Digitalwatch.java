package lab6;

public class Digitalwatch extends watches {
    private String displayType;

    public Digitalwatch(int uniqueID, String brand, String model, double price, String displayType) {
        super(uniqueID, brand, model, price, "Digitalwatch");
        this.displayType = displayType;
    }
}
