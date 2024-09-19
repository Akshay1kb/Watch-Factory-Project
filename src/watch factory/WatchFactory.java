package lab6;
import java.util.Scanner;

public class WatchFactory {
    private static WatchFactory instance;
    private int counter = 0;
    private WatchFactory() {
    }

    public static WatchFactory getInstance() {
        if (instance == null) {
            instance = new WatchFactory();
        }
        return instance;
    }

    public watches create(String type) {
        Scanner scanner = new Scanner(System.in);
        int id = counter++;
        	
        System.out.print("\nEnter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over
        switch (type) {
            case "Smartwatch":
            	System.out.println("For Smart watch type :");
                System.out.print("Enter screen type (TFT,LCD,OLED,AMOLED):");
                String screenType = scanner.nextLine();
                System.out.print("Enter audio rating(1-5):");
                int audioRating = scanner.nextInt();
                return new Smartwatch(id, brand, model, price, screenType, audioRating);
            case "Digitalwatch":
            	System.out.println("For digital watch type :");
                System.out.print("Enter display type (LED,VFD,LCD):");
                String displayType = scanner.nextLine();
                return new Digitalwatch(id, brand, model, price, displayType);
            case "Analoguewatch":
            	System.out.println("For analogue watch type :");
                System.out.print("Enter mechanism type (mechanical,automatic,quartz):");
                String mechanismType = scanner.nextLine();
                return new Analoguewatch(id, brand, model, price, mechanismType);
            default:
                return null;
        }
    }
}
