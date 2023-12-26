package com.kotlindemo

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


class ToastModule(reactContext: ReactApplicationContext?) :
    ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        //define method name
        return "demo"
    }

    //    all of functionality
    @ReactMethod
    fun play(callback: Callback) {
        val result = "Hello World"
        callback.invoke(null, result)
    }
}