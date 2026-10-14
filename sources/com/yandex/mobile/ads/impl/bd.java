package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class bd {
    public static com.yandex.mobile.ads.banner.c a(Context context, AdResponse adResponse, k2 k2Var, com.yandex.mobile.ads.banner.g gVar, od odVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(gVar, "adView");
        fd.j0.i(odVar, "bannerShowEventListener");
        return new com.yandex.mobile.ads.banner.c(context, adResponse, k2Var, gVar, odVar);
    }
}
