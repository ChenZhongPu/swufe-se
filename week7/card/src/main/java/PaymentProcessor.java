public class PaymentProcessor {
    private CreditCardService creditCardService;

    public PaymentProcessor(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    public boolean makePayment(CreditCard card, int amount) {
        if (card.isExpired()) return false;
        return creditCardService.chargeCreditCard(card, amount);
    }
}
