import java.time.LocalDate;

public class CreditCard {
    private String cardNum;
    private LocalDate expireDate;

    public CreditCard(String cardNum, LocalDate expireDate) {
        this.cardNum = cardNum;
        this.expireDate = expireDate;
    }

    public boolean isExpired() {
        return LocalDate.now().compareTo(expireDate) >= 0;
    }
}
