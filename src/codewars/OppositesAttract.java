package codewars;

// 2 fleurs : return true si nb de pétale de la fleur 1 est pair et fleur 2 impair ou inversement.
// return false si nb de pétales des 2 fleurs impair ou pair.

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean res;

        if (((flower1 | 1) > flower1 && (flower2 | 1) <= flower2) || ((flower1 | 1) <= flower1 && (flower2 | 1) > flower2)) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }
    // Sinon plus simple : return flower1 % 2 != flower2 % 2;
}
