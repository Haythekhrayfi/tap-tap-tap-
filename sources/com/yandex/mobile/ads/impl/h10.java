package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class h10 {
    public static ie a(Context context, g10.b bVar, SSLSocketFactory sSLSocketFactory) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nz0 nz0VarA = i01.b().a(context);
        return nz0VarA != null && nz0VarA.Z() ? new i10(bVar, sSLSocketFactory) : new g10(bVar, sSLSocketFactory);
    }
}
