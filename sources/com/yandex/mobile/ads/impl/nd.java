package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hd f23336a;

    public /* synthetic */ nd() {
        this(new hd());
    }

    public nd(hd hdVar) {
        fd.j0.i(hdVar, "designProvider");
        this.f23336a = hdVar;
    }

    public final md a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, com.yandex.mobile.ads.banner.g gVar, pj0 pj0Var, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(uVar, "nativeAdPrivate");
        fd.j0.i(gVar, "container");
        fd.j0.i(pj0Var, "nativeAdEventListener");
        fd.j0.i(onPreDrawListener, "preDrawListener");
        gd gdVarA = this.f23336a.a(context, uVar);
        return new md(new ld(context, gVar, kc.l.d(gdVarA != null ? gdVarA.a(context, adResponse, uVar, pj0Var) : null), onPreDrawListener));
    }
}
