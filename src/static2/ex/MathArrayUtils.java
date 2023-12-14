package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {}

    public static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    public static int min(int[] numbers) {
        int minValue = numbers[0];
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    public static int max(int[] numbers) {
        int maxValue = numbers[0];
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }
}
