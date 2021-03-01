package com.chanda.parseinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CKFh3Q22aIoVRXzY8K880CoZsHUBYeHU0BA3Wgv1")
                .clientKey("YNnpkGrZBbWba4XQR1eqrekmA2Ag4TzO6D8RhP6f")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
