package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.c81;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.kj0;
import com.yandex.mobile.ads.impl.px0;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.wh0;
import com.yandex.mobile.ads.impl.yh;
import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends l0 implements u {
    private final r F;
    private final c G;
    private final c81 H;
    private final f0 I;
    private final zk0 J;
    public g20 K;

    public m(Context context, qh0 qh0Var, r rVar, g20 g20Var, a aVar) {
        super(context, aVar);
        this.F = rVar;
        this.K = g20Var;
        wh0 wh0VarD = aVar.d();
        this.G = c.a(wh0VarD.c().g());
        f0 f0VarA = a(qh0Var, wh0VarD.a());
        this.I = f0VarA;
        a(f0VarA);
        this.H = new c81();
        this.J = new zk0();
    }

    private f0 a(qh0 qh0Var, k2 k2Var) {
        f0 f0Var = new f0(Collections.singletonList(qh0Var), k2Var);
        int iG = qh0Var.g();
        if (iG != 0) {
            f0Var.a(px0.a(iG));
        }
        f0Var.a(this.f27775l);
        return f0Var;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroid/view/View;>(TT;Lcom/yandex/mobile/ads/impl/kj0<TT;>;Lcom/yandex/mobile/ads/nativeads/c;Ljava/lang/Object;)V */
    private void a(View view, kj0 kj0Var, c cVar, int i10) throws NativeAdException {
        this.I.a(i10);
        a(view, this.K, (kj0<View>) kj0Var, cVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.l0
    public final void a(Context context) {
        this.H.a(context);
        super.a(context);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(NativeAdViewBinder nativeAdViewBinder, yh yhVar) throws NativeAdException {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        this.H.a(nativeAdView, new l(this));
        a(nativeAdView, this.K, new z(nativeAdViewBinder), yhVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(NativeBannerView nativeBannerView) throws NativeAdException {
        com.yandex.mobile.ads.nativeads.template.c cVar = new com.yandex.mobile.ads.nativeads.template.c();
        nativeBannerView.a(this);
        a(nativeBannerView, cVar, this.G, 2);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.F.a(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        this.H.a(nativeAdView, new l(this));
        a(nativeAdView, new z(nativeAdViewBinder), c.f27721a, 1);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return this.F.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdType getAdType() {
        int iA;
        int iB = this.F.b();
        Objects.requireNonNull(this.J);
        NativeAdType nativeAdType = NativeAdType.CONTENT;
        if (iB == 0 || (iA = a6.a(iB)) == 0) {
            return nativeAdType;
        }
        if (iA != 1) {
            return iA != 2 ? nativeAdType : NativeAdType.MEDIA;
        }
        return NativeAdType.APP_INSTALL;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final String getInfo() {
        return this.F.c();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    public final com.yandex.mobile.ads.nativeads.video.a getNativeAdVideoController() {
        return this.f27786w;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.F.d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.F.b(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.l0, com.yandex.mobile.ads.nativeads.OpenLinksInAppProvider
    public final void setShouldOpenLinksInApp(boolean z10) {
        super.setShouldOpenLinksInApp(z10);
    }
}
