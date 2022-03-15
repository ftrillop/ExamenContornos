import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrienteTest {

    @Test
    void setGestor() {
    }

    @Test
    void sacarDinero() {
        CuentaCorriente cuentaCorriente = new CuentaCorriente("49684704N",200);
        boolean resultado= cuentaCorriente.sacarDinero(100);
        assertEquals(100, cuentaCorriente.saldo);
        System.out.println(cuentaCorriente.saldo);
    }

    @Test
    void ingresarDinero() {
        CuentaCorriente cuentaCorriente = new CuentaCorriente("49684704N", 100);
        double cantidad=300;
        assertEquals(400,cuentaCorriente.saldo);
    }

    @Test
    void mostrarInformacion() {
    }
}