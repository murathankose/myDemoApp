package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

 /*   public void testDivisionByZero() {
    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    assertFalse(new App().divisible(array, 0));
  }

  public void testDividedIsZero() {
    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 4, 0, 7));
    assertFalse(new App().divisible(array, 2));
  }

  public void testNotDivisible() {
    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    assertFalse(new App().divisible(array, 5));
  }

  public void testEmptyArray() {
    ArrayList<Integer> array = new ArrayList<>();
    assertFalse(new App().divisible(array, 2));
  }
  public void testNull() {
    assertFalse(new App().divisible(null, 2));
  }*/
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1));
    }

}
