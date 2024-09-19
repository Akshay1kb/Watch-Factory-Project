package lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WatchFactory factory = WatchFactory.getInstance();
        List<watches> watchList = new ArrayList<>();
        System.out.println("Plese enter the order of the watches as :\n1> SmartWatch \n2> DigitalWatch \n3> AnalogueWatch");

        // Create 10 watches based on user input
        watchList.add(factory.create("Smartwatch"));
        watchList.add(factory.create("Digitalwatch"));
        watchList.add(factory.create("Analoguewatch"));
        watchList.add(factory.create("Smartwatch"));
        watchList.add(factory.create("Digitalwatch"));
        watchList.add(factory.create("Analoguewatch"));
        watchList.add(factory.create("Smartwatch"));
        watchList.add(factory.create("Digitalwatch"));
        watchList.add(factory.create("Analoguewatch"));
        watchList.add(factory.create("Smartwatch"));
        

        // Display the watches
        for (watches watch : watchList) {
            System.out.println("Watch Type: " + watch.getWatchType() + ", Watch ID: " + watch.getId() + ", Brand: " + watch.getBrand() +
                    ", Model: " + watch.getModel() + ", Price: " + watch.getPrice());
        }

        // Prove Singleton functionality
        WatchFactory factory1 = WatchFactory.getInstance();
        WatchFactory factory2 = WatchFactory.getInstance();

        System.out.println("the watch ID are not Repeating: " + (factory1 == factory2));
    }
}
