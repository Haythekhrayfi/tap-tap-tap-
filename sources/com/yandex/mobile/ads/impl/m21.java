package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m21 implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n21 f22886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f22887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yh f22888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final th0 f22889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jj0 f22890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final iq f22891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.y f22892g;

    public m21(n21 n21Var, uk ukVar, yh yhVar, vh0 vh0Var, jj0 jj0Var, iq iqVar, aq aqVar) {
        this.f22886a = n21Var;
        this.f22887b = ukVar;
        this.f22888c = yhVar;
        this.f22889d = vh0Var;
        this.f22890e = jj0Var;
        this.f22891f = iqVar;
        this.f22892g = new com.yandex.mobile.ads.nativeads.y(aqVar.a(n21Var));
    }

    public m21(n21 n21Var, uk ukVar, NativeAdEventListener nativeAdEventListener, yh yhVar) {
        this(n21Var, ukVar, yhVar, new vh0(), new jj0(n21Var, nativeAdEventListener), new iq(), new aq());
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        try {
            NativeAdViewBinder nativeAdViewBinderA = this.f22892g.a(nativeAdView, this.f22889d);
            iq iqVar = this.f22891f;
            Context context = nativeAdView.getContext();
            Objects.requireNonNull(iqVar);
            if (iq.a(context)) {
                this.f22886a.b(nativeAdViewBinderA, this.f22888c);
            } else {
                this.f22886a.bindSliderAd(nativeAdViewBinderA);
            }
            fq.a().a(this.f22890e);
        } catch (NativeAdException unused) {
            this.f22887b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        fq.a().b(this.f22890e);
        Iterator<NativeAd> it = this.f22886a.getNativeAds().iterator();
        while (it.hasNext()) {
            it.next().setNativeAdEventListener(null);
        }
    }
}
