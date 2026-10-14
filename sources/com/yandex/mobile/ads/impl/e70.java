package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class e70 implements ex<d70> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tt0 f20099b;

    public e70(Context context, tt0 tt0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(tt0Var, "adShowListener");
        this.f20098a = context;
        this.f20099b = tt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ex
    public final nx a(AdResponse adResponse, k2 k2Var, pw pwVar) {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(pwVar, "fullScreenController");
        return new d70(this.f20098a, adResponse, k2Var, pwVar, this.f20099b);
    }
}
