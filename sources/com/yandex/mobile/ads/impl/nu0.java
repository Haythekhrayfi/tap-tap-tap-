package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class nu0 implements id {
    @Override // com.yandex.mobile.ads.impl.id
    public final int a(Context context, int i10) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return xc.b.c(bd.e.a(bd.e.b((i10 * 50.0f) / 320.0f, bd.e.b(100.0f, eh1.b(context) * 0.15f)), 50.0f));
    }
}
