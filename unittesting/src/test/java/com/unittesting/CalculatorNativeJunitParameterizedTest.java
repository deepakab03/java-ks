package com.unittesting;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorNativeJunitParameterizedTest {

    private Calculator calculator = new Calculator();
    
    private int var1;
    private int var2;
    private int expectedResult;
   
    public CalculatorNativeJunitParameterizedTest(int var1, int var2, int expectedResult) {
        this.var1 = var1;
        this.var2 = var2;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {{2,5,7}, {3,7,10}});
    }
    
    
    @Test
    public void testAdd() {
        int sum = calculator.add(var1, var2);
        
        assertThat(sum, is(equalTo(expectedResult)));
    }
    
    //how do we test subtract
}
