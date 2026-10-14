package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.ds;
import com.yandex.mobile.ads.impl.fw0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.oi0;
import com.yandex.mobile.ads.impl.w20;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ds, w20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.impl.a0 f27761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oi0 f27762b;

    public k(Context context, k2 k2Var) {
        oi0 oi0Var = new oi0();
        this.f27762b = oi0Var;
        this.f27761a = new com.yandex.mobile.ads.impl.a0(context, k2Var, oi0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ds
    public final void a() {
        this.f27762b.a();
    }

    @Override // com.yandex.mobile.ads.impl.w20.a
    public final void a(AdImpressionData adImpressionData) {
        this.f27762b.b(adImpressionData);
    }

    public final void a(fw0.a aVar) {
        this.f27761a.a(aVar);
    }

    public final void a(m80 m80Var) {
        this.f27761a.a(m80Var.c());
    }

    public final void a(NativeAdEventListener nativeAdEventListener) {
        this.f27762b.a(nativeAdEventListener);
    }

    public final void b() {
        x60.b("onAdClicked", new Object[0]);
        this.f27761a.a();
    }

    public final void c() {
        this.f27761a.e();
    }

    public final void d() {
        this.f27762b.onLeftApplication();
        this.f27761a.d();
    }

    public final void e() {
        this.f27762b.onLeftApplication();
        this.f27761a.f();
    }

    public final void f() {
        this.f27761a.b();
    }

    public final void g() {
        this.f27762b.onLeftApplication();
        this.f27761a.c();
    }
}
