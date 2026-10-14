package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class cq implements ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y9.l1 f19608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yo<NativeAdView> f19609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f19610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19611d;

    public cq(y9.l1 l1Var, vj vjVar, v0 v0Var, int i10) {
        this.f19608a = l1Var;
        this.f19609b = vjVar;
        this.f19610c = v0Var;
        this.f19611d = i10;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final z70 a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener) {
        yh yhVar = new yh();
        return new z70(R.layout.yandex_ads_internal_divkit, NativeAdView.class, new vj(new ax0(this.f19610c, this.f19611d), new up(context, this.f19608a, yhVar, ukVar), new px(uVar, ukVar, nativeAdEventListener, yhVar), this.f19609b), new bq(adResponse));
    }
}
