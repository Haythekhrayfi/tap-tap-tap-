package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import com.yandex.mobile.ads.nativeads.w;

/* JADX INFO: loaded from: classes3.dex */
final class n implements jm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jm0 f27601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediatedNativeAd f27602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xd0 f27603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27604d = false;

    public n(jm0 jm0Var, MediatedNativeAd mediatedNativeAd, xd0 xd0Var) {
        this.f27601a = jm0Var;
        this.f27602b = mediatedNativeAd;
        this.f27603c = xd0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a() {
        this.f27601a.a();
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a(w wVar) {
        this.f27601a.a(wVar);
        NativeAdViewBinder nativeAdViewBinderF = wVar.f();
        if (nativeAdViewBinderF != null) {
            this.f27602b.unbindNativeAd(nativeAdViewBinderF);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a(w wVar, com.yandex.mobile.ads.nativeads.b bVar) {
        this.f27601a.a(wVar, bVar);
        NativeAdViewBinder nativeAdViewBinderF = wVar.f();
        if (nativeAdViewBinderF != null) {
            this.f27602b.bindNativeAd(nativeAdViewBinderF);
        }
        if (wVar.e() == null || this.f27604d) {
            return;
        }
        this.f27604d = true;
        this.f27603c.a();
    }
}
