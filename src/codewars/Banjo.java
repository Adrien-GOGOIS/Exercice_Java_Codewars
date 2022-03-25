package codewars;

// Create a function which answers the question "Are you playing banjo?".
// If your name starts with the letter "R" or lower case "r", you are playing banjo!

public class Banjo {
    public String areYouPlayingBanjo(String name) {
        String res = name + " ";
        char index = name.charAt(0);
        char char1 = 'r';
        char char2 = 'R';
        if (Character.compare(index, char2) == 0 || Character.compare(index, char1) == 0) {
            res += "plays banjo";
        } else {
            res += "does not play banjo";
        };
        return res;
    }

}

// AUtre solution :
/* if( name.toUpperCase().startsWith("R") )
        return name + " plays banjo";
        else
        return name + " does not play banjo"; */
