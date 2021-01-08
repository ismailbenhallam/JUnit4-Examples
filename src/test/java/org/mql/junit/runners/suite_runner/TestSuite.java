package org.mql.junit.runners.suite_runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mql.junit.runners.categories_runner.OnlySlowTestSuite;
import org.mql.junit.runners.categories_runner.SlowTestSuite;
import org.mql.junit.runners.custom_runners.TranslatorTest;
import org.mql.junit.runners.parametrized_runner.CalculatorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TranslatorTest.class,
        CalculatorTest.class,
        SlowTestSuite.class,
        OnlySlowTestSuite.class,
        // ...
})
public class TestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}
