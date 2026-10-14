package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fi1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final di1 f20718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final an0<T> f20719b;

    public /* synthetic */ fi1(Context context, k2 k2Var, hi1 hi1Var) {
        lx0 lx0Var = new lx0(hi1Var);
        this(context, k2Var, hi1Var, lx0Var, new di1(), um0.a(context, k2Var, lx0Var));
    }

    public fi1(Context context, k2 k2Var, hi1<T> hi1Var, kx0<T> kx0Var, di1 di1Var, an0<T> an0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(hi1Var, "volleyResponseBodyParser");
        fd.j0.i(kx0Var, "responseBodyParser");
        fd.j0.i(di1Var, "volleyMapper");
        fd.j0.i(an0Var, "responseParser");
        this.f20718a = di1Var;
        this.f20719b = an0Var;
    }

    public final AdResponse<T> a(wm0 wm0Var, Map<String, String> map, l6 l6Var) {
        fd.j0.i(wm0Var, "networkResponse");
        fd.j0.i(map, "headers");
        fd.j0.i(l6Var, "responseAdType");
        Objects.requireNonNull(this.f20718a);
        return this.f20719b.a(di1.a(wm0Var), map, l6Var);
    }
}
