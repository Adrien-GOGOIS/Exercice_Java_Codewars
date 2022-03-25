package codewars;

// Remove the first and last characters of the String str given in parameter :

public class RemoveChars {
    public static String remove(String str) {
        String res = str.substring(1, str.length() - 1);
        return res;
    }
}
