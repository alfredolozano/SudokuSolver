/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CORDAZB
 */
public class SudokuTest {
    
    public SudokuTest() {
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
     * Test of solve method, of class Sudoku.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        int prueba[][]= {{0,6,0,1,0,4,0,5,0},
            {0,0,8,3,0,5,6,0,0},{2,0,0,0,0,0,0,0,1},
            {8,0,0,4,0,7,0,0,6},{0,0,6,0,0,0,3,0,0},
            {7,0,0,9,0,1,0,0,4},{5,0,0,0,0,0,0,0,2},
            {0,0,7,2,0,6,9,0,0},{0,4,0,5,0,8,0,7,0}};  
        Sudoku su = new Sudoku(prueba);
        boolean expResult = true;
        boolean result = su.solve();
        assertEquals(expResult, result);
    }

    /**
     * Test of cuadrante method, of class Sudoku.
     */
    @Test
    public void testNumCaja() {
        System.out.println("numCaja");
        int i = 8;
        int j = 8;
        Sudoku su = new Sudoku();
        int expResult = 8;
        int result = su.numCaja(i, j);
        assertEquals(expResult, result);
    }

    
}
