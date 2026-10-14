package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class cy0 implements ex<by0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vt0 f19681b;

    public cy0(Context context, vt0 vt0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(vt0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f19680a = context;
        this.f19681b = vt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ex
    public final nx a(AdResponse adResponse, k2 k2Var, pw pwVar) {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(pwVar, "fullScreenController");
        return new by0(this.f19680a, adResponse, k2Var, pwVar, this.f19681b);
    }
}
