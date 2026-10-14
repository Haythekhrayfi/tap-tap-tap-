package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class iu {
    public static boolean a(Context context) {
        hu huVar = hu.f21508b;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(huVar, "toggle");
        return d90.a(context).getBoolean(huVar.a(), false);
    }
}
