package lab6;

public class Smartwatch extends watches {
    private String screenType;
    private int audioRating;

    public Smartwatch(int uniqueID, String brand, String model, double price, String screenType, int audioRating) {
        super(uniqueID, brand, model, price, "Smartwatch");
        this.screenType = screenType;
        this.audioRating = audioRating;
    }
}
