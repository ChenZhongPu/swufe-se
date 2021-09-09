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
        IntMain intMain = new IntMain();
        Instant start = Instant.now();
        int result = intMain.getSum(1000000);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
        System.out.println("Result is " + result);
    }
}
