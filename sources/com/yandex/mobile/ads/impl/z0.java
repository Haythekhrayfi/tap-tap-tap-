package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements x51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f27176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ResultReceiver f27177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27178c;

    public z0(Context context, boolean z10, ResultReceiver resultReceiver) {
        this.f27176a = new WeakReference<>(context);
        this.f27178c = z10;
        this.f27177b = resultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.x51
    public final void a(jw0 jw0Var, String str) {
        y0.a(this.f27176a.get(), jw0Var, str, this.f27177b, this.f27178c);
    }
}
