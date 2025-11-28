package Question02;

public class PaymentInfo {
    private String maskedCard;
    private String expiry;

    public PaymentInfo(String cardNumber, String expiry) {
        this.maskedCard = mask(cardNumber);
        this.expiry = expiry;
    }

    private String mask(String card) {
        if (card == null || card.length() < 4) return "";
        return "---" + card.substring(card.length()-4);
    }

    public String getMasked() { return maskedCard; }
    public String getExpiry() {return expiry;}
   
}