package com.testography.vorba.infrastructure;

import android.app.Application;

public class VorbaApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this); // this is used since Application is a Context
    }

    public Auth getAuth() {
        return auth;
    }
}
