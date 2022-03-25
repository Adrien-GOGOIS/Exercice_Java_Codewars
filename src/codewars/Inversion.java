package codewars;

// Given a set of numbers, return the additive inverse of each.
// Each positive becomes negatives, and the negatives become positives.

public class Inversion {
    public static int[] invert(int[] array) {
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }
}

// Autre solution :
/*
for(int i = 0; i < array.length; i++) {
        array[i] *= -1;
        }

        return array;
        }*/
