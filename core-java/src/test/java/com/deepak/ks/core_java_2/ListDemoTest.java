package com.deepak.ks.core_java_2;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class ListDemoTest {

    private ListDemo listDemo = new ListDemo();
    
    @Test
    public void
    whenAdd_givenNonNullString_shouldAddToList() {
        String nameToAdd = "Gopal";
        
        listDemo.addName(nameToAdd);
        
        List<String> nameList = listDemo.getNameList();
        assertThat(nameList, contains(nameToAdd));
        assertThat(nameList, not(contains("deepak")));
    }
    
    @Test public void
    whenAdd_givenSomeString_shouldBeAddedTInOrder() {
        listDemo.addName("B");
        listDemo.addName("A");
        listDemo.addName("C");
        
        assertThat(listDemo.getNameList(), contains("B", "A", "C"));
    }
}
