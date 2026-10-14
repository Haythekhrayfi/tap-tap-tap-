package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class sk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nk0 f25128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cl0 f25129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gq f25130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hq f25131d;

    public interface a {
        void a(g20 g20Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sk0(Context context, w3 w3Var) {
        this(new nk0(context, w3Var), new cl0(context), new gq(), new hq());
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
    }

    public sk0(nk0 nk0Var, cl0 cl0Var, gq gqVar, hq hqVar) {
        fd.j0.i(nk0Var, "nativeMediaLoader");
        fd.j0.i(cl0Var, "nativeVerificationResourcesLoader");
        fd.j0.i(gqVar, "divKitInitializer");
        fd.j0.i(hqVar, "divKitIntegrationValidator");
        this.f25128a = nk0Var;
        this.f25129b = cl0Var;
        this.f25130c = gqVar;
        this.f25131d = hqVar;
    }

    public final void a() {
        this.f25128a.a();
        this.f25129b.a();
    }

    public final void a(Context context, k2 k2Var, wh0 wh0Var, a aVar) {
        rk0 rk0Var;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(wh0Var, "nativeAdBlock");
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Objects.requireNonNull(this.f25131d);
        if (hq.a(context) && fd.j0.d(wh0Var.b().w(), "divkit")) {
            Objects.requireNonNull(this.f25130c);
            gq.a(context);
        }
        if (k2Var.q()) {
            eq0 eq0Var = new eq0();
            rk0Var = new rk0(aVar, eq0Var, 2);
            this.f25128a.a(context, wh0Var, eq0Var, rk0Var);
        } else {
            rk0Var = new rk0(aVar, new ng(context), 1);
        }
        this.f25129b.a(wh0Var, rk0Var);
    }
}
