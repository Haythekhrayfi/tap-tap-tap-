package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.b.a, f.a {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d.a f9150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f9152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, MaxNativeAdView> f9153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<com.applovin.impl.mediation.a.d> f9154h;

    public class a implements com.applovin.impl.mediation.ads.a.InterfaceC0121a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MaxNativeAdView maxNativeAdView) {
            com.applovin.impl.mediation.a.d dVarC;
            b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (dVarC = adViewTracker.c()) == null) {
                return;
            }
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(dVarC);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9152f);
            }
            o.a(MaxNativeAdLoaderImpl.this.f9152f, maxAd, true, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f9152f);
            }
            o.a(MaxNativeAdLoaderImpl.this.f9152f, str, maxError, true, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Native ad loaded");
                    }
                    com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
                    dVar.e(MaxNativeAdLoaderImpl.this.f9148b);
                    dVar.f(MaxNativeAdLoaderImpl.this.f9149c);
                    MaxNativeAdLoaderImpl.this.sdk.ac().a(dVar);
                    synchronized (MaxNativeAdLoaderImpl.this.f9151e) {
                        MaxNativeAdLoaderImpl.this.f9154h.add(dVar);
                    }
                    MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(dVar.d());
                    if (maxNativeAdViewA == null) {
                        y yVar2 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                            maxNativeAdLoaderImpl2.logger.b(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                        }
                        String strJ = dVar.J();
                        if (StringUtils.isValidString(strJ)) {
                            y yVar3 = MaxNativeAdLoaderImpl.this.logger;
                            if (y.a()) {
                                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                                maxNativeAdLoaderImpl3.logger.b(maxNativeAdLoaderImpl3.tag, "Using template: " + strJ + "...");
                            }
                            maxNativeAdViewA = new MaxNativeAdView(strJ, com.applovin.impl.sdk.o.au());
                        }
                    }
                    if (maxNativeAdViewA == null) {
                        y yVar4 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                            maxNativeAdLoaderImpl4.logger.b(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        }
                        y yVar5 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                            y yVar6 = maxNativeAdLoaderImpl5.logger;
                            String str = maxNativeAdLoaderImpl5.tag;
                            StringBuilder sbA = defpackage.a.a("MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=");
                            sbA.append(maxAd);
                            sbA.append("), listener=");
                            sbA.append(MaxNativeAdLoaderImpl.this.f9152f);
                            yVar6.b(str, sbA.toString());
                        }
                        o.a(MaxNativeAdLoaderImpl.this.f9152f, (MaxNativeAdView) null, maxAd, true, true);
                        MaxNativeAdLoaderImpl.this.a(dVar);
                        return;
                    }
                    a.this.a(maxNativeAdViewA);
                    MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, dVar, dVar.getNativeAd());
                    y yVar7 = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl6.logger.b(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9152f);
                    }
                    o.a(MaxNativeAdLoaderImpl.this.f9152f, maxNativeAdViewA, maxAd, true, true);
                    MaxNativeAdLoaderImpl.this.a(dVar);
                    MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            o.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.o oVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", oVar);
        this.f9147a = new a();
        this.f9150d = d.a.PUBLISHER_INITIATED;
        this.f9151e = new Object();
        this.f9153g = new HashMap();
        this.f9154h = new HashSet();
        oVar.aj().a(this);
        if (y.a()) {
            this.logger.b(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdViewRemove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f9151e) {
            maxNativeAdViewRemove = this.f9153g.remove(str);
        }
        return maxNativeAdViewRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.d dVar) {
        if (dVar.M().get()) {
            return;
        }
        this.sdk.R().a(dVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (h.c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MaxNativeAdView maxNativeAdView, final com.applovin.impl.mediation.a.d dVar, final MaxNativeAd maxNativeAd) {
        dVar.a(maxNativeAdView);
        a((com.applovin.impl.mediation.a.a) dVar);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.2
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxNativeAdLoaderImpl.this.logger;
                if (y.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                    y yVar2 = maxNativeAdLoaderImpl.logger;
                    String str = maxNativeAdLoaderImpl.tag;
                    StringBuilder sbA = defpackage.a.a("Rendering native ad view: ");
                    sbA.append(maxNativeAdView);
                    yVar2.b(str, sbA.toString());
                }
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f9147a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                if (maxNativeAd.prepareForInteraction(maxNativeAdView.getClickableViews(), maxNativeAdView)) {
                    return;
                }
                maxNativeAd.prepareViewForInteraction(maxNativeAdView);
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        } else {
            this.sdk.G().a(new ac(this.sdk, "renderMaxNativeAd", runnable), r.b.MEDIATION_MAIN);
        }
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f9151e) {
            this.f9153g.put(str, maxNativeAdView);
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f9152f = null;
        this.sdk.aj().b(this);
        synchronized (this.f9151e) {
            this.f9153g.clear();
            this.f9154h.clear();
        }
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        b adViewTracker;
        if (!(maxAd instanceof com.applovin.impl.mediation.a.d)) {
            if (y.a()) {
                this.logger.b(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        if (dVar.L()) {
            if (y.a()) {
                this.logger.b(this.tag, "Native ad (" + dVar + ") has already been destroyed");
                return;
            }
            return;
        }
        synchronized (this.f9151e) {
            this.f9154h.remove(dVar);
        }
        MaxNativeAdView maxNativeAdViewI = dVar.I();
        if (maxNativeAdViewI != null && (adViewTracker = maxNativeAdViewI.getAdViewTracker()) != null && maxAd.equals(adViewTracker.c())) {
            maxNativeAdViewI.recycle();
        }
        MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
            nativeAd.getAdViewTracker().a();
        }
        this.sdk.R().a(dVar);
        this.sdk.am().destroyAd(dVar);
        this.sdk.ar().a(this.adUnitId, dVar.d());
    }

    public String getPlacement() {
        return this.f9148b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((com.applovin.impl.mediation.a.d) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (y.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.b();
        } else if (y.a()) {
            this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Loading native ad for '");
            sbA.append(this.adUnitId);
            sbA.append("' into '");
            sbA.append(maxNativeAdView);
            sbA.append("' and notifying ");
            sbA.append(this.f9147a);
            sbA.append("...");
            yVar.b(str, sbA.toString());
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.am().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f9150d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.o.au(), this.f9147a);
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired(g gVar) {
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Ad expired for ad unit id ");
            sbA.append(getAdUnitId());
            yVar.b(str, sbA.toString());
        }
        if (y.a()) {
            this.logger.b(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + gVar + "), listener=" + this.f9152f);
        }
        o.b(this.f9152f, (MaxAd) gVar, true, true);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.d next;
        Iterator<com.applovin.impl.mediation.a.d> it = this.f9154h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.j().equalsIgnoreCase(str));
        if (next != null) {
            next.b(str2);
            o.a(this.adReviewListener, str2, next);
            synchronized (this.f9151e) {
                this.f9154h.remove(next);
            }
        }
    }

    public void registerClickableViews(final List<View> list, final ViewGroup viewGroup, MaxAd maxAd) {
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            if (y.a()) {
                this.logger.e(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        this.sdk.ac().a(dVar);
        a((com.applovin.impl.mediation.a.a) dVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new b(dVar, viewGroup, this.f9147a, this.sdk));
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (nativeAd.prepareForInteraction(list, viewGroup)) {
                    return;
                }
                y.j(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
            }
        };
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        } else {
            this.sdk.G().a(new ac(this.sdk, "renderMaxNativeAd", runnable), r.b.MEDIATION_MAIN);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        String str;
        String str2;
        if (!(maxAd instanceof com.applovin.impl.mediation.a.d)) {
            str = this.tag;
            str2 = "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.";
        } else if (maxNativeAdView == null) {
            str = this.tag;
            str2 = "Failed to render native ad. `adView` to render cannot be null.";
        } else {
            com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd == null) {
                if (y.a()) {
                    this.logger.e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                }
                return false;
            }
            if (!nativeAd.isExpired() || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.E)).booleanValue()) {
                a(maxNativeAdView, dVar, nativeAd);
                a(maxNativeAdView);
                return true;
            }
            str = this.tag;
            str2 = "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`";
        }
        y.j(str, str2);
        return false;
    }

    public void setCustomData(String str) {
        w.a(str, this.tag);
        this.f9149c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.a)) {
            this.f9150d = (d.a) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f9152f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f9148b = str;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MaxNativeAdLoader{adUnitId='");
        l1.c.a(sbA, this.adUnitId, CoreConstants.SINGLE_QUOTE_CHAR, ", nativeAdListener=");
        sbA.append(this.f9152f);
        sbA.append(", revenueListener=");
        sbA.append(this.revenueListener);
        sbA.append('}');
        return sbA.toString();
    }
}
