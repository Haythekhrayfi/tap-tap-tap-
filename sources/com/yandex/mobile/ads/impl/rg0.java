package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class rg0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24709c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile rg0 f24710d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<wa0, kg0> f24712b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final rg0 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            rg0 rg0Var = rg0.f24710d;
            if (rg0Var == null) {
                synchronized (this) {
                    rg0Var = rg0.f24710d;
                    if (rg0Var == null) {
                        nz0 nz0VarA = i01.b().a(context);
                        rg0 rg0Var2 = new rg0(nz0VarA != null ? nz0VarA.o() : 0, 0);
                        rg0.f24710d = rg0Var2;
                        rg0Var = rg0Var2;
                    }
                }
            }
            return rg0Var;
        }
    }

    private rg0(int i10) {
        this.f24711a = i10;
        this.f24712b = new WeakHashMap<>();
    }

    public /* synthetic */ rg0(int i10, int i11) {
        this(i10);
    }

    public final void a(kg0 kg0Var, wa0 wa0Var) {
        fd.j0.i(wa0Var, "media");
        fd.j0.i(kg0Var, "mraidWebView");
        if (this.f24712b.size() < this.f24711a) {
            this.f24712b.put(wa0Var, kg0Var);
        }
    }

    public final boolean a(wa0 wa0Var) {
        fd.j0.i(wa0Var, "media");
        return this.f24712b.containsKey(wa0Var);
    }

    public final kg0 b(wa0 wa0Var) {
        fd.j0.i(wa0Var, "media");
        return this.f24712b.remove(wa0Var);
    }

    public final boolean b() {
        return this.f24712b.size() == this.f24711a;
    }
}
