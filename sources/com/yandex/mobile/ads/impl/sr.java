package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x41 f25174a = new x41();

    public final String a(Context context, String str) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(str, "rawQuery");
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA == null || !nz0VarA.C()) {
            return str;
        }
        Objects.requireNonNull(this.f25174a);
        String strA = x41.a(context, str);
        return strA == null ? str : strA;
    }
}
