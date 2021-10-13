package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("l4Nm9gqIBW4w4Ks6LGXDXVNQC0Ef5uRvAtBbfAAR")
                .clientKey("ooDPmDoIw2r9UkeMcCdfscwxCSe4nmFKyhuhJ8HI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
