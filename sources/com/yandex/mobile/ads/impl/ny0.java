package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ny0 implements hx<RewardedAdEventListener> {
    @Override // com.yandex.mobile.ads.impl.hx
    public final gx<RewardedAdEventListener> a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new ck(context);
    }
}
