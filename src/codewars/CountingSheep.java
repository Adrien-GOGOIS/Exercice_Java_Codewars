package codewars;

// Consider an array/list of sheep where some sheep may be missing from their place.
// We need a function that counts the number of sheep present in the array (true means present).

public class CountingSheep {

        public int countSheeps(Boolean[] arrayOfSheeps){
            int res = 0;

            for (int i = 0; i < arrayOfSheeps.length; i++) {
                try {
                    if (arrayOfSheeps[i]) {
                        ++res;
                    }
                } catch(Exception e) {
                    System.out.println(e);
                }

            }

            // CORRECTION :
            for (Boolean present : arrayOfSheeps) {
                if (present != null && present) {
                    ++res;
                }
            }

            return res;
    }
}

// APPEL DANS LA CLASSE MAIN :
/*Boolean[] arr = {null,  true,  false,  false,
        true,  true,  true,  true ,
        true,  false, false,  false,
        true,  false, false, true ,
        true,  true,  true,  true ,
        false, false, true,  true};
    CountingSheep c = new CountingSheep();
        System.out.println(c.countSheeps(arr));*/
