package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u10 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f25528h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25529i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9 f25530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aa f25531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y9 f25532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f25533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w9 f25534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v10 f25535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25536g;

    public static final class a {
        public static Object a() {
            return u10.f25528h;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u10(Context context) {
        this(context, new t9(), new aa(), new y9(new t9(), new x9()));
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public /* synthetic */ u10(Context context, t9 t9Var, aa aaVar, y9 y9Var) {
        this(context, t9Var, aaVar, y9Var, new oa0(d90.a(context)));
    }

    public u10(Context context, t9 t9Var, aa aaVar, y9 y9Var, oa0 oa0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(t9Var, "appMetricaBridge");
        fd.j0.i(aaVar, "appMetricaIdentifiersValidator");
        fd.j0.i(y9Var, "appMetricaIdentifiersLoader");
        fd.j0.i(oa0Var, "mauidManager");
        this.f25530a = t9Var;
        this.f25531b = aaVar;
        this.f25532c = y9Var;
        this.f25535f = v10.f25772a;
        this.f25536g = oa0Var.a();
        Context applicationContext = context.getApplicationContext();
        fd.j0.h(applicationContext, "context.applicationContext");
        this.f25533d = applicationContext;
    }

    public final void a(w9 w9Var) {
        fd.j0.i(w9Var, "appMetricaIdentifiers");
        synchronized (f25528h) {
            Objects.requireNonNull(this.f25531b);
            if (aa.a(w9Var)) {
                this.f25534e = w9Var;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.mobile.ads.impl.w9] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final w9 b() {
        ?? r10;
        vc.a0 a0Var = new vc.a0();
        synchronized (f25528h) {
            w9 w9Var = this.f25534e;
            r10 = w9Var;
            if (w9Var == null) {
                t9 t9Var = this.f25530a;
                Context context = this.f25533d;
                Objects.requireNonNull(t9Var);
                String strB = t9.b(context);
                t9 t9Var2 = this.f25530a;
                Context context2 = this.f25533d;
                Objects.requireNonNull(t9Var2);
                w9 w9Var2 = new w9(null, t9.a(context2), strB);
                this.f25532c.a(this.f25533d, this);
                r10 = w9Var2;
            }
            a0Var.f36988c = r10;
        }
        return r10;
    }

    public final v10 c() {
        return this.f25535f;
    }

    public final String d() {
        return this.f25536g;
    }
}
