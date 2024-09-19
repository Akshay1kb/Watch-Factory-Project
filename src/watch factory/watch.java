package lab6;

public interface watch {
    int getId();
    String getBrand();
    String getModel();
    double getPrice();
    void getInfo(int uniqueID, String brand, String model, double price);
}
