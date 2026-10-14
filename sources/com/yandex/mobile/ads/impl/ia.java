package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class ia implements ex<ha> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21650a;

    public ia(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f21650a = context;
    }

    @Override // com.yandex.mobile.ads.impl.ex
    public final nx a(AdResponse adResponse, k2 k2Var, pw pwVar) {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(pwVar, "fullScreenController");
        return new ha(this.f21650a, adResponse, k2Var, pwVar);
    }
}
