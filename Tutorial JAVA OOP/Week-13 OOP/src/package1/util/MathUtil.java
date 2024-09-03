package package1.util;

public class MathUtil {
    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value; // Correct the sum logic
        }
        return total;
    }
}
