package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class oj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f23831a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile oj0 f23832b;

    private oj0() {
    }

    public static oj0 a() {
        if (f23832b == null) {
            synchronized (f23831a) {
                if (f23832b == null) {
                    f23832b = new oj0();
                }
            }
        }
        return f23832b;
    }
}
