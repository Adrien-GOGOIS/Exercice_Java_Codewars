package codewars;

// Write a function that takes an integer as input,
// and returns the number of bits that are equal to one in the binary representation of that number.
// You can guarantee that input is non-negative.

public class BitCounting {
    public static int countBits(int n) {
        int count = 0;
        if (n >= 0) {
            String binaryString = Integer.toBinaryString(n);
            char c = '1';
            for (int i = 0; i < binaryString.length(); i++) {
                if (Character.compare(binaryString.charAt(i), c) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

// En fait il y avait bien plus simple ==> { return Integer.bitCount(n); }