package Question02;

public class Driver extends User {
    private Vehicle vehicle;
    private boolean available;

    public Driver(String userId, String name, String phone, Vehicle vehicle) {
        super(userId, name, phone);
        this.vehicle = vehicle;
        this.available = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void displayProfile() {
        System.out.println("Driver: " + name + ", Phone: " + phone + ", Vehicle: " + vehicle.getDetails());
    }
}