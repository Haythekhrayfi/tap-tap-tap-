package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class xz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f26664a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xz f26665b;

    private xz() {
    }

    public static wz a(boolean z10) {
        return z10 ? new cg0() : new he();
    }

    public static xz a() {
        if (f26665b == null) {
            synchronized (f26664a) {
                if (f26665b == null) {
                    f26665b = new xz();
                }
            }
        }
        return f26665b;
    }
}
