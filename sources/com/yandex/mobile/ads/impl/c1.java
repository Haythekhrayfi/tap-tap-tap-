package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n21 f19353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f19354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final th0 f19355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.y f19356d;

    public /* synthetic */ c1(n21 n21Var, uk ukVar) {
        this(n21Var, ukVar, new vh0(), new com.yandex.mobile.ads.nativeads.y());
    }

    public c1(n21 n21Var, uk ukVar, th0 th0Var, com.yandex.mobile.ads.nativeads.y yVar) {
        fd.j0.i(n21Var, "sliderAdPrivate");
        fd.j0.i(ukVar, "contentCloseListener");
        fd.j0.i(th0Var, "nativeAdAssetViewProvider");
        fd.j0.i(yVar, "nativeAdViewBinderFromProviderCreator");
        this.f19353a = n21Var;
        this.f19354b = ukVar;
        this.f19355c = th0Var;
        this.f19356d = yVar;
    }

    public final boolean a(NativeAdView nativeAdView) {
        fd.j0.i(nativeAdView, "nativeAdView");
        try {
            NativeAdViewBinder nativeAdViewBinderA = this.f19356d.a(nativeAdView, this.f19355c);
            fd.j0.h(nativeAdViewBinderA, "nativeAdViewBinderFromPr…ativeAdAssetViewProvider)");
            this.f19353a.bindSliderAd(nativeAdViewBinderA);
            return true;
        } catch (NativeAdException unused) {
            this.f19354b.e();
            return false;
        }
    }
}
