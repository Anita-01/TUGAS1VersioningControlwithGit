/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKPL_JUnitIntro;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ACER
 */
public class JUnit_IntroTest3 {
    
    public JUnit_IntroTest3() {
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
     * Test of addDouble method, of class JUnit_Introduction.
     */
    @Test
    public void testAddDouble() {
        System.out.println("addDouble");
        double n1 = 2.5;
        double n2 = 5.0;
        JUnit_Intro instance = new JUnit_Intro();
        double expResult = 7.5;
        double result = instance.addDouble(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of addString method, of class JUnit_Introduction.
     */
    @Test
    public void testAddString() {
        System.out.println("addString");
        String s1 = "Semangat menuju";
        String s2 = " UAS PKPL";
        JUnit_Intro instance = new JUnit_Intro();
        String expResult = "Semangat menuju UAS PKPL";
        String result = instance.addString(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addInt method, of class JUnit_Introduction.
     */
    @Test
    public void testAddInt() {
        System.out.println("addInt");
        int n1 = 25;
        int n2 = 8;
        JUnit_Intro instance = new JUnit_Intro();
        int expResult = 33;
        int result = instance.addInt(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //  fail("The test case is a prototype.");
    }

    /**
     * Test of isOdd method, of class JUnit_Introduction.
     */
    @Test
    public void testIsOdd() {
        System.out.println("isOdd");
        int number = 1;
        JUnit_Intro instance = new JUnit_Intro();
        boolean expResult = true;
        boolean result = instance.isOdd(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    /**
     * Test of isEven method, of class JUnit_Introduction.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        int number = 10;
        JUnit_Intro instance = new JUnit_Intro();
        boolean expResult = true;
        boolean result = instance.isEven(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
