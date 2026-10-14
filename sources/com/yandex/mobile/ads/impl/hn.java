package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hn implements x51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f21470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f21471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ResultReceiver f21472c;

    public hn(Context context, k2 k2Var, AdResultReceiver adResultReceiver) {
        this.f21470a = new WeakReference<>(context);
        this.f21471b = k2Var;
        this.f21472c = adResultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.x51
    public final void a(jw0 jw0Var, String str) {
        y0.a(this.f21470a.get(), jw0Var, str, this.f21472c, this.f21471b.r());
    }
}
