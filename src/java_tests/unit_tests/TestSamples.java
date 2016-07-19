package java_tests.unit_tests;

import samples.Simple;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;


public class TestSamples {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
            Simple tester = new Simple(); 

            // assert statements
            assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
            assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
            assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
            
    }
   
}


