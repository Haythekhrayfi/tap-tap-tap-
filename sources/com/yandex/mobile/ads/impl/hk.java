package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21441a = a.f21442a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f21442a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Object f21443b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static volatile hk f21444c;

        private a() {
        }

        public static hk a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (f21444c == null) {
                synchronized (f21443b) {
                    if (f21444c == null) {
                        f21444c = new ik(d90.a(context));
                    }
                }
            }
            hk hkVar = f21444c;
            if (hkVar != null) {
                return hkVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    nz0 a();

    void a(nz0 nz0Var);
}
