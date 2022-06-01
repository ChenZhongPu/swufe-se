import com.swufe.se.BankService;
import com.swufe.se.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BankServiceTest {
    private BankService service;

    @Mock
    Payment mockPayment;

    @BeforeEach
    public void setUp() {
        service = new BankService(mockPayment);
    }

    @Test
    public void payMoreThan1000_returnFalse() {
        when(mockPayment.pay(anyInt())).thenReturn(false);
        assertFalse(service.performPay(1200));
    }
}