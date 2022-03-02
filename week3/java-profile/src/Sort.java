import java.util.Random;

public class Sort {
    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) return false;
        }
        return true;
    }

    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
                int tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = new Random().nextInt(10000);
        }
        assert !isSorted(a);
        sort(a);
        assert isSorted(a);
    }
}
