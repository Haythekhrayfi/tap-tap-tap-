package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.hn;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.nz0;
import com.yandex.mobile.ads.impl.x51;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomClickHandler f27821a;

    public final x51 a(Context context, k2 k2Var, AdResultReceiver adResultReceiver) {
        nz0 nz0VarA = i01.b().a(context);
        boolean z10 = nz0VarA != null && nz0VarA.z();
        CustomClickHandler customClickHandler = this.f27821a;
        return (customClickHandler == null || !z10) ? new hn(context, k2Var, adResultReceiver) : new d(customClickHandler, adResultReceiver);
    }

    public final void a(CustomClickHandler customClickHandler) {
        this.f27821a = customClickHandler;
    }
}
