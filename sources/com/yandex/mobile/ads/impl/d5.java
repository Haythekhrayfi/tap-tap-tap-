package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class d5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f19760b = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w4 f19761a = new w4();

    public final lo a(Context context) {
        return a(context, f19760b);
    }

    public final lo a(Context context, int i10) {
        Integer numD;
        Objects.requireNonNull(this.f19761a);
        nz0 nz0VarA = i01.b().a(context);
        return new lo(1.0f, i10, (nz0VarA == null || (numD = nz0VarA.d()) == null) ? 0 : numD.intValue());
    }
}
