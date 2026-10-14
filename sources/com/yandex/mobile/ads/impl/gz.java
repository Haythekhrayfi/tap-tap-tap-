package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class gz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ed.f f21244a = new ed.f("(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]");

    public static boolean a(String str) {
        if (str != null) {
            return f21244a.a(str);
        }
        return false;
    }
}
