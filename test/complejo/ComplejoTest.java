/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package complejo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplejoTest {

    private Complejo c1, c2, c3;

    public ComplejoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        c1 = new Complejo(1, 0);
        c2 = new Complejo(0, 1);
        c3 = new Complejo(1, 1);
    }

    @After
    public void tearDown() {
        c1 = null;
        c2 = null;
        c3 = null;

    }

    /**
     * Test of getReal method, of class Complejo.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");

        double expResult = 1.0;
        //double expResult = 0.0;
        double result = c1.getReal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getImaginario method, of class Complejo.
     */
    @Test
    public void testGetImaginario() {
        System.out.println("getImaginario");

        double expResult = 0.0;
        double result = c1.getImaginario();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of Sumar method, of class Complejo.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");

        Complejo result = c1.Sumar(c2);
        assertTrue(c3.Iguales(result));
        //assertEquals(c3, result);
    }

    /**
     * Test of Multiplicar method, of class Complejo.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");

        Complejo result = c1.Multiplicar(c2);
        //assertEquals(c3, result);
        Complejo expected = new Complejo(0.0, 1.0);
        System.out.println("c3: " + c3.getReal() + " + " + c3.getImaginario() + "i");
        System.out.println("result: " + result.getReal() + " + " + result.getImaginario() + "i");
        assertTrue(expected.Iguales(result));

    }

    /**
     * Test of Iguales method, of class Complejo.
     */
    @Test
    public void testIguales() {
        System.out.println("Iguales");

        boolean expResult = false;
        boolean result = c1.Iguales(c2);
        assertEquals(expResult, result);
    }

}
