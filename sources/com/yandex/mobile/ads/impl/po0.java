package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class po0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile oo0 f24216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24217b = new Object();

    public static final oo0 a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (f24216a == null) {
            synchronized (f24217b) {
                if (f24216a == null) {
                    f24216a = new oo0(d90.a(context));
                }
            }
        }
        oo0 oo0Var = f24216a;
        if (oo0Var != null) {
            return oo0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
