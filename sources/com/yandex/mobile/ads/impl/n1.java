package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23192b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile n1 f23193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23194d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f23195a;

    public static final class a {
        public static n1 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (n1.f23193c == null) {
                synchronized (n1.f23192b) {
                    if (n1.f23193c == null) {
                        n1.f23193c = new n1(d90.a(context));
                    }
                }
            }
            n1 n1Var = n1.f23193c;
            if (n1Var != null) {
                return n1Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public /* synthetic */ n1(b90 b90Var) {
        this(new m1(b90Var));
    }

    private n1(m1 m1Var) {
        this.f23195a = m1Var;
    }

    public final m1 c() {
        return this.f23195a;
    }
}
