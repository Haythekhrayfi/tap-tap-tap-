package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20990a;

    public ga(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f20990a = context.getApplicationContext();
    }

    public final fa a(ha haVar) {
        fd.j0.i(haVar, "appOpenAdContentController");
        Context context = this.f20990a;
        fd.j0.h(context, "appContext");
        return new fa(context, haVar);
    }
}
