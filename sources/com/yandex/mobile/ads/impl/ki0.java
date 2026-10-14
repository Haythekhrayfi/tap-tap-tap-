package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ki0 implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.u f22416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f22417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NativeAdEventListener f22418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final th0 f22419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final iq f22420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yh f22421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.y f22422g;

    public ki0(com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener, vh0 vh0Var, aq aqVar, yh yhVar, iq iqVar) {
        this.f22416a = uVar;
        this.f22417b = ukVar;
        this.f22418c = nativeAdEventListener;
        this.f22419d = vh0Var;
        this.f22422g = new com.yandex.mobile.ads.nativeads.y(aqVar.a(uVar));
        this.f22421f = yhVar;
        this.f22420e = iqVar;
    }

    public ki0(com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener, yh yhVar) {
        this(uVar, ukVar, nativeAdEventListener, new vh0(), new aq(), yhVar, new iq());
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        NativeAdViewBinder nativeAdViewBinderA = this.f22422g.a(nativeAdView, this.f22419d);
        try {
            iq iqVar = this.f22420e;
            Context context = nativeAdView.getContext();
            Objects.requireNonNull(iqVar);
            if (iq.a(context)) {
                this.f22416a.a(nativeAdViewBinderA, this.f22421f);
            } else {
                this.f22416a.bindNativeAd(nativeAdViewBinderA);
            }
            this.f22416a.setNativeAdEventListener(this.f22418c);
        } catch (NativeAdException unused) {
            this.f22417b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        this.f22416a.setNativeAdEventListener(null);
    }
}
