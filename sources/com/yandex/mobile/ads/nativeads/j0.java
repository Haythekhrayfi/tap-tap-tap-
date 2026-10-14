package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.lk0;
import com.yandex.mobile.ads.impl.yh;
import com.yandex.mobile.ads.impl.yp;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u> f27759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f27760b;

    public j0(ArrayList arrayList) {
        this.f27759a = arrayList;
        this.f27760b = arrayList.isEmpty() ? null : (u) arrayList.get(0);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final lk0 a() {
        u uVar = this.f27760b;
        return uVar != null ? uVar.a() : new lk0(null, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(NativeAdViewBinder nativeAdViewBinder, yh yhVar) throws NativeAdException {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.a(nativeAdViewBinder, yhVar);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(NativeBannerView nativeBannerView) throws NativeAdException {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.a(nativeBannerView);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.addImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final List<yp> b() {
        u uVar = this.f27760b;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.bindNativeAd(nativeAdViewBinder);
        }
    }

    public final List<u> d() {
        return this.f27759a;
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void destroy() {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.destroy();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        u uVar = this.f27760b;
        return uVar != null ? uVar.getAdAssets() : new f();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdType getAdType() {
        u uVar = this.f27760b;
        return uVar != null ? uVar.getAdType() : NativeAdType.CONTENT;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final String getInfo() {
        u uVar = this.f27760b;
        if (uVar != null) {
            return uVar.getInfo();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    public final com.yandex.mobile.ads.nativeads.video.a getNativeAdVideoController() {
        u uVar = this.f27760b;
        if (uVar == null) {
            return null;
        }
        return uVar.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.loadImages();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.removeImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickable
    public final void setCustomClickHandler(CustomClickHandler customClickHandler) {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.setCustomClickHandler(customClickHandler);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.setNativeAdEventListener(nativeAdEventListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.OpenLinksInAppProvider
    public final void setShouldOpenLinksInApp(boolean z10) {
        u uVar = this.f27760b;
        if (uVar != null) {
            uVar.setShouldOpenLinksInApp(z10);
        }
    }
}
