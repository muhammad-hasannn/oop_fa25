package Question02;
import java.util.*;

public class RideService {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public Driver matchDriver(Rider rider) {
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                d.setAvailable(false);
                System.out.println("Matched Driver " + d.name + " with Rider " + rider.name);
                return d;
            }
        }
        System.out.println("No drivers available!");
        return null;
    }

    public void makeAvailable(Driver d) {
        d.setAvailable(true);
    }
}
