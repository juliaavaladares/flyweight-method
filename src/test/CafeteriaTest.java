package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import main.*;

public class CafeteriaTest {
    @Test

    public void deveRetornarTotalNumeroPedidos() {
        Cafeteria cafeteria = new Cafeteria();

        cafeteria.fazerPedido(CafeSabores.EXPRESSO, CafeLatteArte.COELHO, 2);
        cafeteria.fazerPedido(CafeSabores.AFFOGATO, CafeLatteArte.CORACAO, 3);
        cafeteria.fazerPedido(CafeSabores.CAPPUCCINO, CafeLatteArte.DISNEY, 4);
        cafeteria.fazerPedido(CafeSabores.LATTE, CafeLatteArte.ESPINHA_PEIXE, 5);

        assertEquals(4, cafeteria.getNumeroDePedidos());
    }

}
