package com.zipoapps.blytics;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28226a;

    public e(Context context) {
        this.f28226a = context.getSharedPreferences("com.zipoapps.blytics.properties.global", 0);
    }
}
