package Question02;

public class Main {
    public static void main(String[] args) {
        RideService rs = new RideService();

        // Create Drivers
        Driver d1 = new Driver("D01", "Ali", "0300-1112222", new Vehicle("ABC-123", "Toyota Corolla", "Economy"));

        Driver d2 = new Driver("D02", "Usman", "0301-5556666", new Vehicle("XYZ-456", "Honda Civic", "Premium"));

        rs.addDriver(d1);
        rs.addDriver(d2);

        // Create Rider
        Rider r1 = new Rider("R01", "Ahsan", "0300-8889999", new PaymentInfo("1234567890123456", "12/26"));

        // Show rider details BEFORE booking
        System.out.println("\n--- Rider Details ---");
        r1.displayProfile();

        // Show all drivers
        System.out.println("\n--- Available Drivers ---");
        d1.displayProfile();
        d2.displayProfile();

        System.out.println("\nFinding driver...\n");
        Driver assigned = rs.matchDriver(r1);

        if (assigned == null)
            return;

        // Show assigned driver details
        System.out.println("\n--- Assigned Driver ---");
        assigned.displayProfile();

        // Start a trip
        Trip trip = new Trip(r1, assigned, "Bahria Town", "F-7 Islamabad", 12.5);

        trip.startTrip();
        trip.endTrip();

        // Simulate payment processing
        System.out.println("\nProcessing payment using: " + r1.getPaymentInfo().getMasked());
        System.out.println("Payment successful!\n");

        // Make driver free again
        rs.makeAvailable(assigned);

        // Print Ride History
        System.out.println("\n--- Ride History ---");
        for (String h : r1.getRideHistory()) {
            System.out.println(h);
        }
    }
}