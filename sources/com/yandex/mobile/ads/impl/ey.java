package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile dy f20380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20381b = new Object();

    public static final dy a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (f20380a == null) {
            synchronized (f20381b) {
                if (f20380a == null) {
                    f20380a = new dy(d90.a(context));
                }
            }
        }
        dy dyVar = f20380a;
        if (dyVar != null) {
            return dyVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
