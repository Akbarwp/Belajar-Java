/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO.Matkul.Pertemuan13;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author akbar
 */
public class KalkuTest {
    
    public KalkuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Kalku.
     */
    @Test
    public void testTambah() {
        System.out.println("Tambah");
        double a = 10.0;
        double b = 2.0;
        Kalku ins = new Kalku();
        double expResult = 12;
        double result = ins.tambah(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testKurang() {
        System.out.println("Kurang");
        double a = 10.0;
        double b = 2.0;
        Kalku ins = new Kalku();
        double expResult = 8;
        double result = ins.kurang(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testKali() {
        System.out.println("Kali");
        double a = 10.0;
        double b = 2.0;
        Kalku ins = new Kalku();
        double expResult = 20;
        double result = ins.kali(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBagi() {
        System.out.println("Bagi");
        double a = 10.0;
        double b = 2.0;
        Kalku ins = new Kalku();
        double expResult = 5;
        double result = ins.bagi(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
}
