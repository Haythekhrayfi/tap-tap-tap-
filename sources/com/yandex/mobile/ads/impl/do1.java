package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.Reward;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class do1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19932c = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19934e;

    public /* synthetic */ do1(BidderTokenLoadListener bidderTokenLoadListener, String str) {
        this.f19933d = bidderTokenLoadListener;
        this.f19934e = str;
    }

    public /* synthetic */ do1(a3 a3Var, e3 e3Var) {
        this.f19933d = a3Var;
        this.f19934e = e3Var;
    }

    public /* synthetic */ do1(ac.a aVar, String str) {
        this.f19933d = aVar;
        this.f19934e = str;
    }

    public /* synthetic */ do1(da0 da0Var, String str) {
        this.f19933d = da0Var;
        this.f19934e = str;
    }

    public /* synthetic */ do1(dn0 dn0Var, dn0.b bVar) {
        this.f19933d = dn0Var;
        this.f19934e = bVar;
    }

    public /* synthetic */ do1(fh0 fh0Var, ViewPager2 viewPager2) {
        this.f19933d = fh0Var;
        this.f19934e = viewPager2;
    }

    public /* synthetic */ do1(gt0 gt0Var, p01 p01Var) {
        this.f19933d = gt0Var;
        this.f19934e = p01Var;
    }

    public /* synthetic */ do1(ka kaVar, AdRequestConfiguration adRequestConfiguration) {
        this.f19933d = kaVar;
        this.f19934e = adRequestConfiguration;
    }

    public /* synthetic */ do1(m40 m40Var, InstreamAd instreamAd) {
        this.f19933d = m40Var;
        this.f19934e = instreamAd;
    }

    public /* synthetic */ do1(m40 m40Var, String str) {
        this.f19933d = m40Var;
        this.f19934e = str;
    }

    public /* synthetic */ do1(n50 n50Var, String str) {
        this.f19933d = n50Var;
        this.f19934e = str;
    }

    public /* synthetic */ do1(oi0 oi0Var, AdImpressionData adImpressionData) {
        this.f19933d = oi0Var;
        this.f19934e = adImpressionData;
    }

    public /* synthetic */ do1(pt0 pt0Var, fa faVar) {
        this.f19933d = pt0Var;
        this.f19934e = faVar;
    }

    public /* synthetic */ do1(qt0 qt0Var, AdError adError) {
        this.f19933d = qt0Var;
        this.f19934e = adError;
    }

    public /* synthetic */ do1(qt0 qt0Var, ImpressionData impressionData) {
        this.f19933d = qt0Var;
        this.f19934e = impressionData;
    }

    public /* synthetic */ do1(rs rsVar, ts.d dVar) {
        this.f19933d = rsVar;
        this.f19934e = dVar;
    }

    public /* synthetic */ do1(sf1.a aVar, wf1 wf1Var) {
        this.f19933d = aVar;
        this.f19934e = wf1Var;
    }

    public /* synthetic */ do1(sf1.a aVar, Exception exc) {
        this.f19933d = aVar;
        this.f19934e = exc;
    }

    public /* synthetic */ do1(sf1.a aVar, String str) {
        this.f19933d = aVar;
        this.f19934e = str;
    }

    public /* synthetic */ do1(st0 st0Var, AdRequestError adRequestError) {
        this.f19933d = st0Var;
        this.f19934e = adRequestError;
    }

    public /* synthetic */ do1(t2 t2Var, pt0 pt0Var) {
        this.f19933d = t2Var;
        this.f19934e = pt0Var;
    }

    public /* synthetic */ do1(ts tsVar, hr0 hr0Var) {
        this.f19933d = tsVar;
        this.f19934e = hr0Var;
    }

    public /* synthetic */ do1(tt0 tt0Var, ImpressionData impressionData) {
        this.f19933d = tt0Var;
        this.f19934e = impressionData;
    }

    public /* synthetic */ do1(ui0 ui0Var, View view) {
        this.f19933d = ui0Var;
        this.f19934e = view;
    }

    public /* synthetic */ do1(ut0 ut0Var, AdRequestError adRequestError) {
        this.f19933d = ut0Var;
        this.f19934e = adRequestError;
    }

    public /* synthetic */ do1(vt0 vt0Var, ImpressionData impressionData) {
        this.f19933d = vt0Var;
        this.f19934e = impressionData;
    }

    public /* synthetic */ do1(vt0 vt0Var, Reward reward) {
        this.f19933d = vt0Var;
        this.f19934e = reward;
    }

    public /* synthetic */ do1(w31 w31Var, SurfaceTexture surfaceTexture) {
        this.f19933d = w31Var;
        this.f19934e = surfaceTexture;
    }

    public /* synthetic */ do1(we weVar, String str) {
        this.f19933d = weVar;
        this.f19934e = str;
    }

    public /* synthetic */ do1(z30 z30Var, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f19933d = z30Var;
        this.f19934e = instreamAdRequestConfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19932c) {
            case 0:
                ((gt0) this.f19933d).b((p01) this.f19934e);
                break;
            case 1:
                ((m40) this.f19933d).b((String) this.f19934e);
                break;
            case 2:
                ((m40) this.f19933d).a((InstreamAd) this.f19934e);
                break;
            case 3:
                ((we) this.f19933d).a((String) this.f19934e);
                break;
            case 4:
                ((rs) this.f19933d).a((ts.d) this.f19934e);
                break;
            case 5:
                ((ts) this.f19933d).a((hr0) this.f19934e);
                break;
            case 6:
                ((BidderTokenLoadListener) this.f19933d).onBidderTokenLoaded((String) this.f19934e);
                break;
            case 7:
                a3.a((a3) this.f19933d, (e3) this.f19934e);
                break;
            case 8:
                ((ac.a) this.f19933d).b((String) this.f19934e);
                break;
            case 9:
                ((da0) this.f19933d).a((String) this.f19934e);
                break;
            case 10:
                ((dn0) this.f19933d).a((dn0.b) this.f19934e);
                break;
            case 11:
                fh0.a((fh0) this.f19933d, (ViewPager2) this.f19934e);
                break;
            case 12:
                ka.a((ka) this.f19933d, (AdRequestConfiguration) this.f19934e);
                break;
            case 13:
                ((n50) this.f19933d).a((String) this.f19934e);
                break;
            case 14:
                ((oi0) this.f19933d).a((AdImpressionData) this.f19934e);
                break;
            case 15:
                pt0.a((t2) this.f19933d, (pt0) this.f19934e);
                break;
            case 16:
                pt0.a((pt0) this.f19933d, (fa) this.f19934e);
                break;
            case 17:
                qt0.a((qt0) this.f19933d, (AdError) this.f19934e);
                break;
            case 18:
                qt0.a((qt0) this.f19933d, (ImpressionData) this.f19934e);
                break;
            case 19:
                ((sf1.a) this.f19933d).a((Exception) this.f19934e);
                break;
            case 20:
                ((sf1.a) this.f19933d).b((String) this.f19934e);
                break;
            case 21:
                ((sf1.a) this.f19933d).a((wf1) this.f19934e);
                break;
            case 22:
                st0.a((st0) this.f19933d, (AdRequestError) this.f19934e);
                break;
            case 23:
                tt0.a((tt0) this.f19933d, (ImpressionData) this.f19934e);
                break;
            case 24:
                ((ui0) this.f19933d).a((View) this.f19934e);
                break;
            case 25:
                ut0.a((ut0) this.f19933d, (AdRequestError) this.f19934e);
                break;
            case 26:
                vt0.a((vt0) this.f19933d, (ImpressionData) this.f19934e);
                break;
            case 27:
                vt0.a((vt0) this.f19933d, (Reward) this.f19934e);
                break;
            case 28:
                ((w31) this.f19933d).a((SurfaceTexture) this.f19934e);
                break;
            default:
                z30.a((z30) this.f19933d, (InstreamAdRequestConfiguration) this.f19934e);
                break;
        }
    }
}
