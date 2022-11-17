package main;

public class Cafe {
    protected final CafeSabores nomeDoSabor;

    protected Cafe(CafeSabores nomeDoSabor) {
        super();
        this.nomeDoSabor = nomeDoSabor;
    }

    public CafeSabores getnomeDoSabor() {
        return nomeDoSabor;
    }

    protected CafeLatteArte applyLatteArt(CafeLatteArte latteArte) {
        return latteArte;
    }
}