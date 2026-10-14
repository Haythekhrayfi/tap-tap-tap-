package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.fw0;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.n21;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.wh0;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.yh;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends l0 implements n21, u {
    private final g20 F;
    private final j0 G;

    public k0(Context context, j0 j0Var, g20 g20Var, a aVar) {
        super(context, aVar);
        this.F = g20Var;
        this.G = j0Var;
        wh0 wh0VarD = aVar.d();
        a(a(wh0VarD.c().d(), wh0VarD.a()));
    }

    private fw0.a a(List<qh0> list, k2 k2Var) {
        String strA = wk0.f26302d.a();
        f0 f0Var = new f0(list, k2Var);
        f0Var.a(1);
        f0Var.a(strA);
        f0Var.a(this.f27775l);
        return f0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(NativeAdViewBinder nativeAdViewBinder, yh yhVar) throws NativeAdException {
        this.G.a(nativeAdViewBinder, yhVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(NativeBannerView nativeBannerView) throws NativeAdException {
        this.G.a(nativeBannerView);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.G.addImageLoadingListener(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.impl.n21
    public final void b(NativeAdViewBinder nativeAdViewBinder, yh yhVar) throws NativeAdException {
        a(nativeAdViewBinder.getNativeAdView(), this.F, new z(nativeAdViewBinder), yhVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        this.G.bindNativeAd(nativeAdViewBinder);
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final void bindSliderAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        a(nativeAdViewBinder.getNativeAdView(), this.F, new z(nativeAdViewBinder), c.f27721a);
    }

    @Override // com.yandex.mobile.ads.impl.n21
    public final ArrayList c() {
        return new ArrayList(this.G.d());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return this.G.getAdAssets();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdType getAdType() {
        return this.G.getAdType();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final String getInfo() {
        return this.G.getInfo();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    public final com.yandex.mobile.ads.nativeads.video.a getNativeAdVideoController() {
        return this.f27786w;
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final List<NativeAd> getNativeAds() {
        return new ArrayList(this.G.d());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.G.loadImages();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.G.removeImageLoadingListener(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.l0, com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.G.setNativeAdEventListener(nativeAdEventListener);
    }
}
