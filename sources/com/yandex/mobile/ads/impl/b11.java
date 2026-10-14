package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19083a = a.f19084a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile c11 f19085b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f19084a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Object f19086c = new Object();

        private a() {
        }

        public static b11 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (f19085b == null) {
                synchronized (f19086c) {
                    if (f19085b == null) {
                        f19085b = new c11(d90.a(context));
                    }
                }
            }
            c11 c11Var = f19085b;
            if (c11Var != null) {
                return c11Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static b11 a(Context context) {
        Objects.requireNonNull(f19083a);
        return a.a(context);
    }

    String a();

    void a(String str);
}
