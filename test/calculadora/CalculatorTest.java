/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sumar method, of class Calculator.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double numl = 8.0;
        double num2 = 4.0;
        Calculator instance = new Calculator();
        double expResult = 12.0;
        double result = instance.sumar(numl, num2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of restar method, of class Calculator.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double numl = 8.0;
        double num2 = 4.0;
        Calculator instance = new Calculator();
        double expResult = 4.0;
        double result = instance.restar(numl, num2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiplicar method, of class Calculator.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double numl = 8.0;
        double num2 = 4.0;
        Calculator instance = new Calculator();
        double expResult = 32.0;
        double result = instance.multiplicar(numl, num2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of dividir method, of class Calculator.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double numl = 8.0;
        double num2 = 4.0;
        Calculator instance = new Calculator();
        double expResult = 2.0;
        double result = instance.dividir(numl, num2);
        assertEquals(expResult, result, 0);
    }
    
}
