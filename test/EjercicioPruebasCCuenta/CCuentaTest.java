/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package EjercicioPruebasCCuenta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CCuentaTest {

    @Test
    public void testIngresar() {
        // Instancia de CCuenta para realizar las pruebas
        CCuenta cuentaPrueba = new CCuenta("Juan Perez", "123456789", 1000.0, 0);

        // Caso de prueba 1: Ingreso válido
        try {
            cuentaPrueba.ingresar(500.0);
            double saldoEsperado = 1000.0 + 500.0; // Saldo inicial + ingreso 
            assertEquals(saldoEsperado, cuentaPrueba.estado(), 0.01); // Verifica que el saldo sea correcto
        } catch (Exception e) {
        }

        // Caso de prueba 2: Ingreso negativo (debe lanzar una excepción)
        try {
            cuentaPrueba.ingresar(-200.0);
        } catch (Exception e) {
            assertEquals("No se puede ingresar una cantidad negativa", e.getMessage());
        }
    }

    @Test
    public void testRetirar() throws Exception {
        CCuenta cuentaPrueba2 = new CCuenta("Juan López", "192841724E", 500.0, 0);

        // Caso de prueba 1: Retiro válido
        cuentaPrueba2.retirar(300.0);
        double saldoEsperado = 500.0 - 300.0;
        System.out.println("Saldo actual: " + cuentaPrueba2.estado());
        assertEquals(saldoEsperado, cuentaPrueba2.estado(), 0);

        // Caso de prueba 2: Retiro negativo
        try {
            cuentaPrueba2.retirar(-300.0);
        } catch (Exception e) {
            assertEquals("No se puede retirar una cantidad negativa", e.getMessage());
        }

        // Caso de prueba 3: Retiro mayor al saldo actual
        try {
            cuentaPrueba2.retirar(600.0);
        } catch (Exception e) {
            assertEquals("No hay suficiente saldo", e.getMessage());
        }
    }

    @Test
    public void testIngresarRetirar() {
        // Instancia de CCuenta para realizar las pruebas
        CCuenta cuentaPrueba = new CCuenta("Juan Perez", "123456789", 1000.0, 0);

        // Caso de prueba 1: Ingreso y retiro válidos
        try {
            cuentaPrueba.ingresar(500.0);
            cuentaPrueba.retirar(200.0);
            double saldoEsperado = 1000.0 + 500.0 - 200.0; // Saldo inicial + ingreso - retiro
            assertEquals(saldoEsperado, cuentaPrueba.estado(), 0.0); // Verifica que el saldo sea correcto
        } catch (Exception e) {
        }

        // Caso de prueba 2: Ingreso válido y retiro negativo
        try {
            cuentaPrueba.ingresar(200.0);
            cuentaPrueba.retirar(-200.0);
        } catch (Exception e) {
            assertEquals("No se puede retirar una cantidad negativa", e.getMessage());
            double saldoEsperado = 1300.0 + 200.0; // Saldo + ingreso
            assertEquals(saldoEsperado, cuentaPrueba.estado(), 0.0); // Verifica que el saldo sea correcto
        }

        // Caso de prueba 3: Retiro válido e ingreso negativo
        try {
            cuentaPrueba.retirar(200.0);
            cuentaPrueba.ingresar(-200.0);
        } catch (Exception e) {
            assertEquals("No se puede ingresar una cantidad negativa", e.getMessage());
            double saldoEsperado = 1500.0 - 200.0; // Saldo - retiro
            assertEquals(saldoEsperado, cuentaPrueba.estado(), 0.0); // Verifica que el saldo sea correcto
        }

        // Caso de prueba 4: Ingreso válido y retiro mayor al saldo actual
        try {
            cuentaPrueba.ingresar(200.0);
            cuentaPrueba.retirar(2000.0);
        } catch (Exception e) {
            assertEquals("No hay suficiente saldo", e.getMessage());
            double saldoEsperado = 1300.0 + 200.0; // Saldo + ingreso
            assertEquals(saldoEsperado, cuentaPrueba.estado(), 0.0); // Verifica que el saldo sea correcto
        }
    }
}
