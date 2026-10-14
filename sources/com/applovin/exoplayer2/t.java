package com.applovin.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f8007a = androidx.fragment.app.d0.a(defpackage.a.a("ExoPlayerLib/2.15.1 (Linux; Android "), Build.VERSION.RELEASE, ") ", "ExoPlayerLib/2.15.1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet<String> f8008b = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f8009c = "goog.exo.core";

    public static synchronized String a() {
        return f8009c;
    }

    public static synchronized void a(String str) {
        if (f8008b.add(str)) {
            f8009c += ", " + str;
        }
    }
}
