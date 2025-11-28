package Question02;

class Trip {
    private Rider rider;
    private Driver driver;
    private String start;
    private String end;
    private double distance;
    private double fare;

    public Trip(Rider rider, Driver driver, String start, String end, double distance) {
        this.rider = rider;
        this.driver = driver;
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.fare = calculateFare();
    }

    private double calculateFare() {
        double base = 100;
        double perKm = 50;
        return base + distance * perKm;
    }

    public void startTrip() {
        System.out.println("Trip started from " + start + " with " + driver.name);
    }

    public void endTrip() {
        System.out.println("Trip ended at " + end + ". Fare: " + fare);
        rider.addRideToHistory(start + " → " + end + " | Fare: " + fare);
    }
}