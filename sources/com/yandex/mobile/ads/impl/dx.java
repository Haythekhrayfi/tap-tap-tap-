package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cx f19997a;

    public dx() {
        this(0);
    }

    public /* synthetic */ dx(int i10) {
        this(new cx());
    }

    public dx(cx cxVar) {
        fd.j0.i(cxVar, "intentCreator");
        this.f19997a = cxVar;
    }

    public final void a(Context context, o0 o0Var, AdResultReceiver adResultReceiver) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(o0Var, "adActivityData");
        fd.j0.i(adResultReceiver, "receiver");
        long jA = q10.a();
        Objects.requireNonNull(this.f19997a);
        Intent intentA = cx.a(context, jA, adResultReceiver);
        p0 p0VarA = p0.a();
        fd.j0.h(p0VarA, "getInstance()");
        p0VarA.a(jA, o0Var);
        try {
            context.startActivity(intentA);
        } catch (Exception e10) {
            p0VarA.a(jA);
            o60.a("Failed to show Interstitial Ad. Exception: " + e10, new Object[0]);
        }
    }
}
