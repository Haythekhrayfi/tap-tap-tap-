package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rf f25070b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sf(Context context, ResultReceiver resultReceiver) {
        this(context, new rf(context, resultReceiver));
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(resultReceiver, "receiver");
    }

    public sf(Context context, rf rfVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(rfVar, "intentCreator");
        this.f25069a = context;
        this.f25070b = rfVar;
    }

    public final void a(String str) {
        fd.j0.i(str, "browserUrl");
        try {
            this.f25069a.startActivity(this.f25070b.a(str));
        } catch (Exception e10) {
            x60.c("Failed to show Browser. Exception: " + e10, new Object[0]);
        }
    }
}
