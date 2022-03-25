package codewars;

// Write a function called repeatStr which repeats the given string string exactly n times

public class RepeatString {
    public static String solution(final int repeat, final String str) {
            String res = "";
        for (int i = 0; i < repeat; i++) {
            res = res + str;
        }

        return res;
    }
}

// Autre solution : utiliser StringBuilder :
/* StringBuilder sb = new StringBuilder();
     for (int i = 0; i < repeat; i++) {
     sb.append(string);
    }

   return sb.toString(); */
