package org.mql.junit.runners.categories_runner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {
    @Test
    public void a() {
        Assert.fail();
    }

    @Category(SlowTests.class)
    @Test
    public void b() {
    }
}