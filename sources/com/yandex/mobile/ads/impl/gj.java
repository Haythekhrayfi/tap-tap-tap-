package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21079a = a.f21080a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile ij f21081b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f21080a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Object f21082c = new Object();

        private a() {
        }

        public static gj a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (f21081b == null) {
                synchronized (f21082c) {
                    if (f21081b == null) {
                        f21081b = hj.a(context);
                    }
                }
            }
            ij ijVar = f21081b;
            if (ijVar != null) {
                return ijVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
