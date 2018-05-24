package com.unittesting;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Testing using junitParams, illustrating:
 * <ol>
 * <li>Mix of Parameterized and non parameterized tests
 * <li>Parameters localized to method headers
 * <li>Different parameterized Tests with different parameters
 * </ol>
 * 
 * @author abrahd2
 */
@RunWith(JUnitParamsRunner.class)
public class CalculatorJUnitParamsTest {

    private Calculator calculator = new Calculator();
    
    @Test(expected=IllegalArgumentException.class) public void
    whenInit_givenMemStackNotInjected_shouldThrowEx() {
        calculator.init();
    }
    
    @Parameters(    {"2,5,7", "3,7,10"})
    @Test public void 
    testAdd(int var1, int var2, int expectedResult) {
        int sum = calculator.add(var1, var2);
        
        assertThat(sum, is(equalTo(expectedResult)));
    }
    
    @Parameters({"2,5,-3", "7,3,4"})
    @Test public void 
    testASubtract(int var1, int var2, int expectedResult) {
        int sum = calculator.sub(var1, var2);
        
        assertThat(sum, is(equalTo(expectedResult)));
    }
}
