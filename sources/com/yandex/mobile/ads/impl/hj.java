package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class hj {
    public static ij a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new ij(new jj(), new kj(), d90.a(context, context.getPackageName() + "_preferences"));
    }
}
