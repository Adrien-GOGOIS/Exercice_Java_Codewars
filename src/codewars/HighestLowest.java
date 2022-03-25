package codewars;

import static java.lang.Float.isNaN;

public class HighestLowest {
    public static int sum( int[] numbers)
    {
        // GUARD
        if (numbers.length < 2) {
            return 0;
        }
        int resHigh = numbers[0];
        int resLow = numbers[0];
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > resHigh) {
                resHigh = numbers[i];
            }

            if (numbers[i] < resLow) {
                resLow = numbers[i];
            }

            res += numbers[i];
        }
        return res - resHigh - resLow;
    }
}
