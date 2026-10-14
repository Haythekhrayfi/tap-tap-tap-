package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.IReporter;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pz0 implements a01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9 f24282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IReporter f24283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kw0 f24284c;

    public pz0(t9 t9Var, IReporter iReporter, kw0 kw0Var) {
        fd.j0.i(t9Var, "appMetricaBridge");
        fd.j0.i(kw0Var, "reporterPolicyConfigurator");
        this.f24282a = t9Var;
        this.f24283b = iReporter;
        this.f24284c = kw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.a01
    public final void a(Context context, nz0 nz0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(nz0Var, "sdkConfiguration");
        boolean zA = this.f24284c.a(context);
        Objects.requireNonNull(this.f24282a);
        t9.a(context, zA);
        IReporter iReporter = this.f24283b;
        if (iReporter != null) {
            iReporter.setStatisticsSending(this.f24284c.b(context));
        }
    }
}
