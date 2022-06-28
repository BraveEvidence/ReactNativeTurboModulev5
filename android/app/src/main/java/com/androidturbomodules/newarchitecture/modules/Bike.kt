package com.androidturbomodules.newarchitecture.modules

import com.androidturbomodules.codegen.NativeBikeSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext

class Bike(reactContext: ReactApplicationContext?) : NativeBikeSpec(reactContext) {

    companion object {
        const val NAME = "Bike"
    }

    override fun getName(): String {
        return NAME
    }

    override fun calculateAverage(average: Double, promise: Promise?) {
        promise?.resolve(average*10)
    }

    override fun getBikeName(bikeName: String?): String {
        return "Bike Name is $bikeName"
    }
}
