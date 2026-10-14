package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v00 {
    public static final void a(Context context, HashMap map) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(map, "headers");
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA == null || !nz0VarA.C()) {
            return;
        }
        String strA = t00.a(45);
        fd.j0.h(strA, "ENCRYPTED_REQUEST.key");
        map.put(strA, "1");
    }
}
