package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.impl.qx;

/* JADX INFO: loaded from: classes3.dex */
public final class ox<T extends qx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hx<T> f23928a;

    public ox(hx<T> hxVar) {
        fd.j0.i(hxVar, "fullscreenAdItemControllerFactory");
        this.f23928a = hxVar;
    }

    public final gx<T> a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA != null ? nz0VarA.E() : false) {
            return new lx(context, this.f23928a, new ix(nz0VarA != null ? Long.valueOf(nz0VarA.k()) : null));
        }
        return this.f23928a.a(context);
    }
}
