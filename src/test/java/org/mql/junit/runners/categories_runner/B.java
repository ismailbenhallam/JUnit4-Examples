package org.mql.junit.runners.categories_runner;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class, FastTests.class})
public class B {
    @Test
    public void c() {

    }
}