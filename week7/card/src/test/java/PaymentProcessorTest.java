import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PaymentProcessorTest {
    PaymentProcessor paymentProcessor;

    private static final CreditCard CREDIT_CARD =
            new CreditCard("62202778899",LocalDate.parse("2028-10-10"));

    private static final int AMOUNT = 8800;

    @Mock
    CreditCardService mockCreditCardService;

    @BeforeEach
    public void setUp() {
        paymentProcessor = new PaymentProcessor(mockCreditCardService);
    }

    @Test
    public void chargeCreditCardFails_returnFalse() {
        when(mockCreditCardService.chargeCreditCard(any(), anyInt()))
                .thenReturn(false);
        boolean success = paymentProcessor.makePayment(CREDIT_CARD, AMOUNT);
        assertFalse(success);
    }
}
