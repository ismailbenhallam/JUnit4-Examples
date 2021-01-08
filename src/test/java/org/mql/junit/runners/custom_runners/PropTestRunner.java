package org.mql.junit.runners.custom_runners;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class PropTestRunner extends BlockJUnit4ClassRunner {

    public PropTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface SystemProperty {
        String value();

        String name();
    }

    @Override
    protected void runChild(FrameworkMethod method, RunNotifier notifier) {
        SystemProperty annotation = method.getAnnotation(SystemProperty.class);

        if (annotation == null) {
            notifier.fireTestIgnored(describeChild(method));
            return;
        }

        String propertyName = annotation.name();
        String propertyValue = annotation.value();

        if (!propertyValue.equals(System.getProperty(propertyName))) {
            notifier.fireTestIgnored(describeChild(method));
            return;
        }

        super.runChild(method, notifier);
    }

}
