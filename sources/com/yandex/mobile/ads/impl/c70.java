package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class c70 implements hx<InterstitialAdEventListener> {
    @Override // com.yandex.mobile.ads.impl.hx
    public final gx<InterstitialAdEventListener> a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new zj(context);
    }
}
