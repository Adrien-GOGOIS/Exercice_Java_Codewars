package codewars;

// Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
// Input will always be valid, i.e. no negative integers.

public class Sheeps {
    public String countingSheep(int num) {
        String res = "";
        for (int sheep = 1; sheep <= num; sheep++) {
            res += sheep + " sheep...";
        }
        return res;
    }

    // Autre solution :
    /* StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
        stringBuilder.append(i).append(" sheep...");
    }
        return stringBuilder.toString(); */
}
