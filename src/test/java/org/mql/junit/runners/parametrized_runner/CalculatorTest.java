package org.mql.junit.runners.parametrized_runner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private int a;
    private int b;
    private int expected;

    public CalculatorTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameters(name = "{index}: addition of {0} and {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {1, 1, 2}, {2, -2, 0}, {-3, 2, -1}, {4, 3, 7}, {5, 5, 10}, {-8, -8, -16}
        });
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, Calculator.addition(a, b));
    }
}