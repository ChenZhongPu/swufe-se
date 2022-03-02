import java.time.Duration;
import java.time.Instant;

public class IntMain {
    public int getSum(int limit) {
        Integer sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Instant start = Instant.now();
        new IntMain().getSum(10000000);
        Instant end = Instant.now();
        System.out.println(Duration.between(start,  end).toMillis());
    }

}
