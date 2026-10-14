package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class mq0 extends ke<wm0> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f23135r = (int) TimeUnit.SECONDS.toMillis(10);

    public mq0(Context context, String str, ke.a<wm0> aVar) {
        super(0, str, aVar);
        a(context);
    }

    private void a(Context context) {
        Integer numQ;
        nz0 nz0VarA = i01.b().a(context);
        a(new lo(1.0f, f23135r, (nz0VarA == null || (numQ = nz0VarA.q()) == null) ? 0 : numQ.intValue()));
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final gx0<wm0> a(wm0 wm0Var) {
        return gx0.a(wm0Var, u00.a(wm0Var));
    }
}
