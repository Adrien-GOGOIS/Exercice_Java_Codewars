package codewars;

/* You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
Array can contain numbers or strings. X can be either.
Return true if the array contains the value, false if not. */

public class Solution {
    public static boolean check(Object[] a, Object x) {
        boolean res = false;
        for (Object i : a) {
            if (i == x) {
                res = true;
            }
        }
        System.out.println(res);
        return res;
    }

    // CORRECTION : return Arrays.asList(a).contains(x);
}
