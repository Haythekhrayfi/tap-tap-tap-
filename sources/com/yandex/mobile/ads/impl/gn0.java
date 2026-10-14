package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class gn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21112a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xw0 f21113b;

    public static xw0 a(Context context) {
        if (f21113b == null) {
            synchronized (f21112a) {
                if (f21113b == null) {
                    f21113b = yw0.a(context, 1);
                    f21113b.a();
                }
            }
        }
        return f21113b;
    }
}
