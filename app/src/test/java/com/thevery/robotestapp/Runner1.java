package com.thevery.robotestapp;

import android.support.annotation.NonNull;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

public class Runner1 extends RobolectricTestRunner {
    public Runner1(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    @NonNull
    protected Config buildGlobalConfig() {
        return new Config.Builder().setPackageName("package1").build();
    }
}
