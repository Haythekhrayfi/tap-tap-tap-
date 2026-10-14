package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f25735a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f25736b = "goog.exo.core";

    public static synchronized String a() {
        return f25736b;
    }

    public static synchronized void a(String str) {
        if (f25735a.add(str)) {
            f25736b += ", " + str;
        }
    }
}
