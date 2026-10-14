package com.applovin.impl.sdk.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    int a();

    default void b() {
        StringBuilder sbA = defpackage.a.a("Java 8 Default method feature test getDummyInteger(): ");
        sbA.append(a());
        Log.d("Java8FeatureTest", sbA.toString());
    }
}
