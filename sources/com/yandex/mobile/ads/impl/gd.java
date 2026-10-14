package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y9.l1 f21008a;

    public gd(y9.l1 l1Var) {
        fd.j0.i(l1Var, "divData");
        this.f21008a = l1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    public final z70 a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, pj0 pj0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(uVar, "nativeAdPrivate");
        fd.j0.i(pj0Var, "nativeAdEventListener");
        yh yhVar = new yh();
        ao1 ao1Var = new uk() { // from class: com.yandex.mobile.ads.impl.ao1
            @Override // com.yandex.mobile.ads.impl.uk
            public final void e() {
                gd.a();
            }
        };
        return new z70(R.layout.yandex_ads_internal_divkit, NativeAdView.class, new vj(new up(context, this.f21008a, yhVar, ao1Var), new ki0(uVar, ao1Var, pj0Var, yhVar)), new bq(adResponse));
    }
}
