package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class kz0 implements id {
    @Override // com.yandex.mobile.ads.impl.id
    public final int a(Context context, int i10) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int iC = eh1.c(context);
        int iB = eh1.b(context);
        return xc.b.c(bd.e.a(bd.e.b(iC > iB ? 90.0f : 100.0f, iB * 0.15f), 50.0f));
    }
}
