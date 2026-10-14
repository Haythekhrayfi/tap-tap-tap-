package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.ww0;
import com.yandex.mobile.ads.impl.yk0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f27831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NativeAdRequestConfiguration f27832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wk0 f27833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yk0 f27834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ww0 f27835h;

    public /* synthetic */ t0(p pVar, NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0 ww0Var, int i10) {
        this.f27830c = i10;
        this.f27831d = pVar;
        this.f27832e = nativeAdRequestConfiguration;
        this.f27833f = wk0Var;
        this.f27834g = yk0Var;
        this.f27835h = ww0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27830c) {
            case 0:
                this.f27831d.b(this.f27832e, this.f27833f, this.f27834g, this.f27835h);
                break;
            default:
                this.f27831d.a(this.f27832e, this.f27833f, this.f27834g, this.f27835h);
                break;
        }
    }
}
