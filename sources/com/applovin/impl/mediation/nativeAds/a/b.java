package com.applovin.impl.mediation.nativeAds.a;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f10003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<MaxAd> f10004c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10005d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10006e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f10007f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public b(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f10002a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f10007f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f10003b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.a.NATIVE_AD_PLACER);
    }

    public void a() {
        this.f10007f = null;
        e();
        this.f10003b.destroy();
    }

    public void a(MaxAd maxAd) {
        this.f10003b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f10003b.render(maxNativeAdView, maxAd);
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f10006e) {
            z10 = !this.f10004c.isEmpty();
        }
        return z10;
    }

    public void c() {
        synchronized (this.f10006e) {
            if (!this.f10005d && this.f10004c.size() < this.f10002a) {
                this.f10005d = true;
                this.f10003b.loadAd();
            }
        }
    }

    public MaxAd d() {
        MaxAd maxAdRemove;
        synchronized (this.f10006e) {
            maxAdRemove = null;
            while (!this.f10004c.isEmpty() && (maxAdRemove == null || maxAdRemove.getNativeAd().isExpired())) {
                maxAdRemove = this.f10004c.remove();
            }
            c();
        }
        return maxAdRemove;
    }

    public void e() {
        synchronized (this.f10006e) {
            Iterator<MaxAd> it = this.f10004c.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            this.f10004c.clear();
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f10007f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f10007f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f10007f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f10006e) {
            this.f10004c.add(maxAd);
            this.f10005d = false;
            c();
        }
        a aVar = this.f10007f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
