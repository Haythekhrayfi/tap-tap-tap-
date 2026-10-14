package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.wi0;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.ww0;
import com.yandex.mobile.ads.impl.xi0;
import com.yandex.mobile.ads.impl.yk0;

/* JADX INFO: loaded from: classes3.dex */
final class q implements wi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f27810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xi0 f27811b;

    public q(Context context, xi0 xi0Var) {
        this.f27811b = xi0Var;
        w3 w3Var = new w3();
        t tVar = new t(context, w3Var, this);
        o oVar = new o(context, tVar, w3Var);
        this.f27810a = oVar;
        tVar.a(oVar.d());
    }

    public final void a() {
        this.f27810a.u();
    }

    public final void a(NativeAdLoadListener nativeAdLoadListener) {
        this.f27810a.a(nativeAdLoadListener);
    }

    public final void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0<cj0> ww0Var) {
        this.f27810a.a(nativeAdRequestConfiguration, wk0Var, yk0Var, ww0Var, 1);
    }

    public final void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0<cj0> ww0Var, int i10) {
        this.f27810a.a(nativeAdRequestConfiguration, wk0Var, yk0Var, ww0Var, i10);
    }

    public final void a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f27810a.a(nativeBulkAdLoadListener);
    }

    public final void a(SliderAdLoadListener sliderAdLoadListener) {
        this.f27810a.a(sliderAdLoadListener);
    }

    public final void b() {
        ((p) this.f27811b).a(this);
    }
}
