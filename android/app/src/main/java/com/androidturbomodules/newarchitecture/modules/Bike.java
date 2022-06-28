package com.androidturbomodules.newarchitecture.modules;

import androidx.annotation.NonNull;

import com.androidturbomodules.codegen.NativeBikeSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

public class Bike extends NativeBikeSpec {

    public static final String NAME = "Bike";

    public Bike(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public void calculateAverage(double average, Promise promise) {
        promise.resolve(average*10);
    }

    @Override
    public String getBikeName(String bikeName) {
        return "Bike Name is "+bikeName;
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }
}
