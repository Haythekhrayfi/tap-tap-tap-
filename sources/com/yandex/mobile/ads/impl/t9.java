package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.IIdentifierCallback;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t9 {
    public static String a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            return com.yandex.metrica.p.gdid(context);
        } catch (Throwable unused) {
            x60.c("Failed to request deviceId", new Object[0]);
            return null;
        }
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, List list) throws RuntimeException {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(iIdentifierCallback, "callback");
        fd.j0.i(list, "requestParameters");
        com.yandex.metrica.p.a(context, iIdentifierCallback, (List<String>) list);
    }

    public static void a(Context context, boolean z10) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            com.yandex.metrica.p.slte(context, z10);
        } catch (Throwable th) {
            x60.a(th, th.getMessage(), new Object[0]);
        }
    }

    public static String b(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            return com.yandex.metrica.p.guid(context);
        } catch (Throwable unused) {
            x60.c("Failed to request uuid", new Object[0]);
            return null;
        }
    }
}
