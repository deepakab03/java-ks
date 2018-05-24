package com.unittesting;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Demonstrating use of hamcrest matchers and superior error expressions
 * 
 * @author abrahd2
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorSimpleTest {

    private Calculator calculator = new Calculator();
    
    @Test public void
    whenAdd_given2PositiveNumbersANDUsingOnlyAssertKeyword_shouldGiveCorrectResult() {
        
        int sum = calculator.add(5, 6);
        
        assertTrue(sum == 12);
//        assertEquals(sum, 12);
    }
    
    /**
     * Matchers along with assert VS assert only (works better with containsString example)
     */
    @Test public void
    whenAdd_given2PositiveNumbers_shouldGiveCorrectResult() {
        Calculator calculator = new Calculator();
        
        int sum = calculator.add(5, 6);
        
        assertThat(sum, is(equalTo(12))); 
    }
    
    @Test public void
    whenGetName_givenNameNotNullANDUsingOnlyAssertKeyword_shouldContainCalculator() {
        calculator.setName("someName");
        
        String name = calculator.getName();
        
        assertTrue(name.contains("Calculator"));
    }
    
    @Test public void
    whenGetName_givenNameNotNull_shouldContainCalculator() {
        calculator.setName("someName");
        
        String name = calculator.getName();
        
        assertThat(name, containsString("Calculator"));
    }
}
