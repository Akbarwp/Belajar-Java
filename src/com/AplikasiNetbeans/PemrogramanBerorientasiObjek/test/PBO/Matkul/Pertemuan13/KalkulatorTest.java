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

import java.awt.Window;
import java.awt.Dimension;
import org.fest.swing.fixture.FrameFixture;

/**
 *
 * @author akbar
 */
public class KalkulatorTest {
    
    FrameFixture window;
    
    public KalkulatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        window = new FrameFixture(new Kalkulator());
        Kalkulator test = new Kalkulator();
        Dimension ukuran = new Dimension(test.getSize());
        
        window.show(ukuran);
    }

    @Test
    public void testTambah() {
        System.out.println("Tambah");
        window.textBox("txX").enterText("10"); 
        window.textBox("txY").enterText("4"); 
        window.button("btnTambah").click(); 
        assertEquals(window.textBox("txHasil").text(),"14.0");
    }
    
    @After
    public void after1() {
        window.cleanUp();
    }
    
    @Test
    public void testKurang() {
        System.out.println("Kurang");
        window.textBox("txX").enterText("10"); 
        window.textBox("txY").enterText("4"); 
        window.button("btnKurang").click(); 
        assertEquals(window.textBox("txHasil").text(),"6.0");
    }
    
    @After
    public void after2() {
        window.cleanUp();
    }
    
    @Test
    public void testKali() {
        System.out.println("Kali");
        window.textBox("txX").enterText("10"); 
        window.textBox("txY").enterText("4"); 
        window.button("btnKali").click(); 
        assertEquals(window.textBox("txHasil").text(),"40.0");
    }
    
    @After
    public void after3() {
        window.cleanUp();
    }
    
    @Test
    public void testBagi() {
        System.out.println("Bagi");
        window.textBox("txX").enterText("10"); 
        window.textBox("txY").enterText("4"); 
        window.button("btnBagi").click(); 
        assertEquals(window.textBox("txHasil").text(),"2.5");
    }
    
    @After
    public void after4() {
        window.cleanUp();
    }
    
    @Test
    public void testModulus() {
        System.out.println("Modulus");
        window.textBox("txX").enterText("10"); 
        window.textBox("txY").enterText("4"); 
        window.button("btnMod").click(); 
        assertEquals(window.textBox("txHasil").text(),"2.0");
    }
    
    @After
    public void after5() {
        window.cleanUp();
    }
    
    @Test
    public void testClear() {
        System.out.println("Clear");
        window.button("btnClear").click();
        assertEquals(window.textBox("txX").text(),"");
        assertEquals(window.textBox("txY").text(),"");
        assertEquals(window.textBox("txHasil").text(),"");
    }
}
