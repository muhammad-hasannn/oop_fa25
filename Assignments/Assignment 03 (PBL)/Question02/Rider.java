package Question02;
import java.util.*;

public class Rider extends User {
    private PaymentInfo paymentInfo;
    private List<String> rideHistory = new ArrayList<>();

    public Rider(String userId, String name, String phone, PaymentInfo paymentInfo) {
        super(userId, name, phone);
        this.paymentInfo = paymentInfo;
    }

    public void addRideToHistory(String record) {
        rideHistory.add(record);
    }

    public List<String> getRideHistory() {
        return rideHistory;
    }

    @Override
    public void displayProfile() {
        System.out.println("Rider: " + name + ", Phone: " + phone + ", Payment: " + paymentInfo.getMasked() + "Expiry: "
                + paymentInfo.getExpiry());
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }
}
