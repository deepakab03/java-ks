package com.deepak.ks.core_java_2;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {

    @Test public void
    whenAdd_givenDuplicateNamesSupplied_shouldKeepOnlyUniqueNames() {
        Set<String> set = new HashSet<>();
        
        boolean hasBeenAddedToCollection = set.add("sandeep");
        set.add("deepak");
        hasBeenAddedToCollection = set.add("sandeep");
        
        assertThat(hasBeenAddedToCollection, is(false));
        assertThat(set, hasSize(2));
        assertThat(set, containsInAnyOrder("deepak", "sandeep"));
    }
}
