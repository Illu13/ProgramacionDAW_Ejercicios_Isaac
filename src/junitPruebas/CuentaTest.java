package junitPruebas;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

public class CuentaTest {

    private static Cuenta cuenta;

    @BeforeAll
    public static void inicializarCuenta() {
        cuenta = new Cuenta("123456", 500);
    }

    @Test
    public void testGetSaldo() {
        float saldo = cuenta.getSaldo();
        Assertions.assertEquals(700, saldo);
    }

    @Test
    public void testSetSaldo() {
        cuenta.setSaldo(1000);
        Assertions.assertEquals(1000, cuenta.getSaldo());
    }

    @Test
    public void testIngresarDinero() {
        cuenta.ingresarDinero(200);
        Assertions.assertEquals(700, cuenta.getSaldo());
    }

    @Test
    public void testExtraerDinero() {
        try {
            cuenta.extraerDinero(1500);
            Assertions.assertEquals(200, cuenta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testExtraerDineroSaldoNegativo() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> cuenta.extraerDinero(800));
        Assertions.assertEquals("Saldo negativo", exception.getMessage());
    }

    @Test
    public void testEsSaldoMayorA100() {
        Assertions.assertTrue(cuenta.esSaldoMayorA100());
    }

    @After
    public void testResetearCuenta() {
        cuenta.resetearCuenta();
        Assertions.assertEquals(0, cuenta.getSaldo());
    }

}
