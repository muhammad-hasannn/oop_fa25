package Question02;

public class Vehicle {
    private String licensePlate;
    private String model;
    private String type;  // economy or premium

    public Vehicle(String licensePlate, String model, String type) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public String getDetails() {
        return model + " (" + type + ") - " + licensePlate;
    }
}