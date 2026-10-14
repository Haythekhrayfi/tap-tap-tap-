package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class b implements ad.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f9167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ad f9168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ac f9169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0121a f9170e;

    public b(d dVar, ViewGroup viewGroup, a.InterfaceC0121a interfaceC0121a, o oVar) {
        this.f9166a = oVar;
        this.f9167b = dVar;
        this.f9170e = interfaceC0121a;
        this.f9169d = new ac(viewGroup, oVar);
        ad adVar = new ad(viewGroup, oVar, this);
        this.f9168c = adVar;
        adVar.a(dVar);
        oVar.F();
        if (y.a()) {
            oVar.F().b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    private void a(long j10) {
        if (this.f9167b.N().compareAndSet(false, true)) {
            this.f9166a.F();
            if (y.a()) {
                this.f9166a.F().b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f9166a.am().processViewabilityAdImpressionPostback(this.f9167b, j10, this.f9170e);
        }
    }

    public void a() {
        this.f9168c.a();
    }

    public void b() {
        this.f9166a.F();
        if (y.a()) {
            this.f9166a.F().b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f9167b.M().compareAndSet(false, true)) {
            this.f9166a.F();
            if (y.a()) {
                this.f9166a.F().b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f9167b.getNativeAd().isExpired()) {
                y.j("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f9166a.R().a(this.f9167b);
            }
            this.f9166a.am().processRawAdImpressionPostback(this.f9167b, this.f9170e);
        }
    }

    public d c() {
        return this.f9167b;
    }

    @Override // com.applovin.impl.sdk.ad.a
    public void onLogVisibilityImpression() {
        a(this.f9169d.a(this.f9167b));
    }
}
