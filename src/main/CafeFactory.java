package main;

import java.util.Map;
import java.util.HashMap;

public class CafeFactory {
    private static Map<CafeSabores, Cafe> cafes = new HashMap<CafeSabores, Cafe>();

    public static Cafe makeCafe(CafeSabores nomeSabor, CafeLatteArte latteArte) {
        Cafe Cafe = cafes.get(nomeSabor);

        if (Cafe == null) {
            Cafe = new Cafe(nomeSabor);
            cafes.put(nomeSabor, Cafe);
        }

        Cafe.applyLatteArt(latteArte);

        return Cafe;

    }

    public static int getNumberOfCafe() {
        return cafes.size();
    }
}