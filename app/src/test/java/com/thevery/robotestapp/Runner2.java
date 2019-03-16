package com.thevery.robotestapp;

import android.support.annotation.NonNull;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

public class Runner2 extends RobolectricTestRunner {
    public Runner2(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    @NonNull
    protected Config buildGlobalConfig() {
        return new Config.Builder().setPackageName("package2").build();
    }
}
