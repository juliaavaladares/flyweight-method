package main;

public class Pedido {
    protected Cafe Cafe;

    public Pedido(Cafe Cafe) {
        super();
        this.Cafe = Cafe;
    }

    public static Pedido of(CafeSabores nomeSabor, CafeLatteArte latteArte, int tableNumber) {
        Cafe Cafe = CafeFactory.makeCafe(nomeSabor, latteArte);
        System.out.printf("Serving to table '%d'.\n", tableNumber);
        System.out.println("------------------------------------------------------");

        return new Pedido(Cafe);
    }

    public Cafe getCafe() {
        return Cafe;
    }

}