package com.learnnativemodule;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class helloWorldModule extends ReactContextBaseJavaModule {

    public helloWorldModule(@Nullable ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        //define method name
        return "helloWorld";
    };




//    all of functionality
    @ReactMethod
    public void sayHello (String name , Callback callback){
        try{
            String message = "hello "+name;
            callback.invoke(null, message);
        }catch (Exception e){
            callback.invoke(e,null);
        }
    }

}
