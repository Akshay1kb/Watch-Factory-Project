package lab6;

public class watches implements watch {
    protected double price;
    protected int uniqueID;
    protected String brand;
    protected String model;
    protected String watchType;

    public watches() {
    }

    public watches(int uniqueID, String brand, String model, double price, String watchType) {
        this.uniqueID = uniqueID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.watchType = watchType;
    }

    public int getId() {
        return uniqueID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getWatchType() {
        return watchType;
    }

    public void getInfo(int uniqueID, String brand, String model, double price, String watchType) {
        this.uniqueID = uniqueID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.watchType = watchType;
    }

	@Override
	public void getInfo(int uniqueID, String brand, String model, double price) {
		// TODO Auto-generated method stub
		
	}
}
