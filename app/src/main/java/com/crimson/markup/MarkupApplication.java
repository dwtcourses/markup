package com.crimson.markup;

import android.app.Application;
import io.realm.Realm;

public class MarkupApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Realm.init(this);
  }
}
