package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class tu0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25502b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile tu0 f25503c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f25504a = new WeakHashMap();

    private tu0() {
    }

    public static tu0 a() {
        if (f25503c == null) {
            synchronized (f25502b) {
                if (f25503c == null) {
                    f25503c = new tu0();
                }
            }
        }
        return f25503c;
    }

    public final String a(mw0<?> mw0Var) {
        String str;
        synchronized (f25502b) {
            str = (String) this.f25504a.get(mw0Var);
        }
        return str;
    }
}
