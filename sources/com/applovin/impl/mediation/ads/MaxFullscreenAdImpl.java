package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.lifecycle.i;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.b.a, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f9099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f9101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f9102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f9106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<ViewGroup> f9107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WeakReference<i> f9108k;
    public final b listenerWrapper;

    public interface a {
        Activity getActivity();
    }

    public class b implements com.applovin.impl.mediation.ads.a.InterfaceC0121a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            o.d(MaxFullscreenAdImpl.this.adListener, maxAd, true, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z10 = MaxFullscreenAdImpl.this.f9105h;
            MaxFullscreenAdImpl.this.f9105h = false;
            final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    if (!z10 && cVar.O() && MaxFullscreenAdImpl.this.sdk.ar().a(MaxFullscreenAdImpl.this.adUnitId)) {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MaxFullscreenAdImpl.this.f9105h = true;
                                MaxFullscreenAdImpl.this.loadAd(MaxFullscreenAdImpl.this.f9098a != null ? MaxFullscreenAdImpl.this.f9098a.getActivity() : null);
                            }
                        });
                        return;
                    }
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl.logger;
                        String str = maxFullscreenAdImpl.tag;
                        StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
                        sbA.append(maxAd);
                        sbA.append(", error=");
                        sbA.append(maxError);
                        sbA.append("), listener=");
                        com.applovin.impl.mediation.ads.c.a(sbA, MaxFullscreenAdImpl.this.adListener, yVar2, str);
                    }
                    o.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f9105h = false;
            MaxFullscreenAdImpl.this.sdk.R().a((com.applovin.impl.mediation.a.c) maxAd);
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            o.b(MaxFullscreenAdImpl.this.adListener, maxAd, true, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f9105h = false;
            MaxFullscreenAdImpl.this.f9099b.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl.logger;
                        String str = maxFullscreenAdImpl.tag;
                        StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdHidden(ad=");
                        sbA.append(maxAd);
                        sbA.append("), listener=");
                        com.applovin.impl.mediation.ads.c.a(sbA, MaxFullscreenAdImpl.this.adListener, yVar2, str);
                    }
                    o.c(MaxFullscreenAdImpl.this.adListener, maxAd, true, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.c();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        y yVar2 = maxFullscreenAdImpl.logger;
                        String str2 = maxFullscreenAdImpl.tag;
                        StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdLoadFailed(adUnitId=");
                        sbA.append(str);
                        sbA.append(", error=");
                        sbA.append(maxError);
                        sbA.append("), listener=");
                        com.applovin.impl.mediation.ads.c.a(sbA, MaxFullscreenAdImpl.this.adListener, yVar2, str2);
                    }
                    o.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.sdk.V().c(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (MaxFullscreenAdImpl.this.f9103f.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MaxFullscreenAdImpl.this.f9105h) {
                            MaxFullscreenAdImpl.this.a();
                            return;
                        }
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            y yVar2 = maxFullscreenAdImpl.logger;
                            String str = maxFullscreenAdImpl.tag;
                            StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdLoaded(ad=");
                            sbA.append(maxAd);
                            sbA.append("), listener=");
                            com.applovin.impl.mediation.ads.c.a(sbA, MaxFullscreenAdImpl.this.adListener, yVar2, str);
                        }
                        o.a(MaxFullscreenAdImpl.this.adListener, maxAd, true, true);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbA = androidx.activity.result.c.a("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbA.append(MaxFullscreenAdImpl.this.requestListener);
                yVar2.b(str2, sbA.toString());
            }
            o.a(MaxFullscreenAdImpl.this.requestListener, str, true, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            o.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxRewardedAdListener.onRewardedVideoCompleted(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            o.f(MaxFullscreenAdImpl.this.adListener, maxAd, true, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxRewardedAdListener.onRewardedVideoStarted(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            o.e(MaxFullscreenAdImpl.this.adListener, maxAd, true, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                y yVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxRewardedAdListener.onUserRewarded(ad=");
                sb2.append(maxAd);
                sb2.append(", reward=");
                sb2.append(maxReward);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str);
            }
            o.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true, true);
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.o oVar) {
        super(str, maxAdFormat, str2, oVar);
        this.f9100c = new Object();
        this.f9101d = null;
        this.f9102e = c.IDLE;
        this.f9103f = new AtomicBoolean();
        this.f9106i = new WeakReference<>(null);
        this.f9107j = new WeakReference<>(null);
        this.f9108k = new WeakReference<>(null);
        this.f9098a = aVar;
        b bVar = new b();
        this.listenerWrapper = bVar;
        this.f9099b = new com.applovin.impl.mediation.b(oVar, bVar);
        oVar.aj().a(this);
        y.f(str2, "Created new " + str2 + " (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Activity activityAt = this.f9106i.get();
        if (activityAt == null) {
            activityAt = this.sdk.at();
        }
        Activity activity = activityAt;
        if (this.f9104g) {
            showAd(this.f9101d.getPlacement(), this.f9101d.aq(), this.f9107j.get(), this.f9108k.get(), activity);
        } else {
            showAd(this.f9101d.getPlacement(), this.f9101d.aq(), activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        if (!this.sdk.R().a(cVar, this)) {
            if (y.a()) {
                this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired(cVar);
            return;
        }
        if (y.a()) {
            this.logger.b(this.tag, "Handle ad loaded for regular ad: " + cVar);
        }
        this.f9101d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        y yVar;
        String str;
        String str2;
        String str3;
        String str4;
        c cVar2 = this.f9102e;
        synchronized (this.f9100c) {
            c cVar3 = c.IDLE;
            z10 = true;
            if (cVar2 != cVar3) {
                c cVar4 = c.LOADING;
                if (cVar2 != cVar4) {
                    c cVar5 = c.READY;
                    if (cVar2 != cVar5) {
                        c cVar6 = c.SHOWING;
                        if (cVar2 != cVar6) {
                            if (cVar2 == c.DESTROYED) {
                                str3 = this.tag;
                                str4 = "No operations are allowed on a destroyed instance";
                                y.j(str3, str4);
                            } else if (y.a()) {
                                yVar = this.logger;
                                str = this.tag;
                                str2 = "Unknown state: " + this.f9102e;
                                yVar.e(str, str2);
                            }
                            z10 = false;
                        } else if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                str3 = this.tag;
                                str4 = "Can not load another ad while the ad is showing";
                            } else if (cVar == cVar5) {
                                if (y.a()) {
                                    yVar = this.logger;
                                    str = this.tag;
                                    str2 = "An ad is already showing, ignoring";
                                    yVar.e(str, str2);
                                }
                                z10 = false;
                            } else if (cVar == cVar6) {
                                str3 = this.tag;
                                str4 = "The ad is already showing, not showing another one";
                            } else if (cVar != c.DESTROYED) {
                                if (y.a()) {
                                    yVar = this.logger;
                                    str = this.tag;
                                    str2 = "Unable to transition to: " + cVar;
                                    yVar.e(str, str2);
                                }
                                z10 = false;
                            }
                            y.j(str3, str4);
                            z10 = false;
                        }
                    } else if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            str3 = this.tag;
                            str4 = "An ad is already loaded";
                            y.j(str3, str4);
                            z10 = false;
                        } else if (cVar == cVar5) {
                            if (y.a()) {
                                yVar = this.logger;
                                str = this.tag;
                                str2 = "An ad is already marked as ready";
                                yVar.e(str, str2);
                            }
                            z10 = false;
                        } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                            if (y.a()) {
                                yVar = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + cVar;
                                yVar.e(str, str2);
                            }
                            z10 = false;
                        }
                    }
                } else if (cVar != cVar3) {
                    if (cVar == cVar4) {
                        str3 = this.tag;
                        str4 = "An ad is already loading";
                    } else if (cVar != c.READY) {
                        if (cVar == c.SHOWING) {
                            str3 = this.tag;
                            str4 = "An ad is not ready to be shown yet";
                        } else if (cVar != c.DESTROYED) {
                            if (y.a()) {
                                yVar = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + cVar;
                                yVar.e(str, str2);
                            }
                            z10 = false;
                        }
                    }
                    y.j(str3, str4);
                    z10 = false;
                }
            } else if (cVar != c.LOADING && cVar != c.DESTROYED) {
                if (cVar == c.SHOWING) {
                    str3 = this.tag;
                    str4 = "No ad is loading or loaded";
                    y.j(str3, str4);
                } else if (y.a()) {
                    yVar = this.logger;
                    str = this.tag;
                    str2 = "Unable to transition to: " + cVar;
                    yVar.e(str, str2);
                }
                z10 = false;
            }
            if (z10) {
                if (y.a()) {
                    this.logger.b(this.tag, "Transitioning from " + this.f9102e + " to " + cVar + "...");
                }
                this.f9102e = cVar;
            } else if (y.a()) {
                this.logger.d(this.tag, "Not allowed transition from " + this.f9102e + " to " + cVar);
            }
        }
        if (!z10 || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.R().a((com.applovin.impl.mediation.a.c) maxAd);
        b();
        this.sdk.aq().b((com.applovin.impl.mediation.a.a) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        this.f9099b.b(this.f9101d);
        this.f9101d.e(str);
        this.f9101d.f(str2);
        this.sdk.ac().a(this.f9101d);
        if (y.a()) {
            y yVar = this.logger;
            String str3 = this.tag;
            StringBuilder sbA = defpackage.a.a("Showing ad for '");
            sbA.append(this.adUnitId);
            sbA.append("'; loaded ad: ");
            sbA.append(this.f9101d);
            sbA.append("...");
            yVar.b(str3, sbA.toString());
        }
        a((com.applovin.impl.mediation.a.a) this.f9101d);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (!isReady()) {
            String strA = k.a(defpackage.a.a("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            y.j(this.tag, strA);
            this.sdk.V().a(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strA);
            com.applovin.impl.mediation.i iVar = new com.applovin.impl.mediation.i(this.adUnitId, this.adFormat, str);
            if (y.a()) {
                y yVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(iVar);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, this.adListener, yVar, str2);
            }
            o.a(this.adListener, (MaxAd) iVar, (MaxError) maxErrorImpl, true, true);
            if (this.f9101d != null) {
                this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9101d);
            }
            return false;
        }
        if (w.e(com.applovin.impl.sdk.o.au()) != 0 && this.sdk.ay().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (w.a(com.applovin.impl.sdk.o.au(), this.sdk)) {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.S)).booleanValue()) {
                y.j(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                if (y.a()) {
                    y yVar2 = this.logger;
                    String str3 = this.tag;
                    StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
                    sbA.append(this.f9101d);
                    sbA.append(", error=");
                    sbA.append(maxErrorImpl2);
                    sbA.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sbA, this.adListener, yVar2, str3);
                }
                o.a(this.adListener, (MaxAd) this.f9101d, (MaxError) maxErrorImpl2, true, true);
                this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f9101d);
                return false;
            }
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f10341z)).booleanValue() && (this.sdk.V().a() || this.sdk.V().b())) {
            y.j(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
            MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
            if (y.a()) {
                y yVar3 = this.logger;
                String str4 = this.tag;
                StringBuilder sbA2 = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
                sbA2.append(this.f9101d);
                sbA2.append(", error=");
                sbA2.append(maxErrorImpl3);
                sbA2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sbA2, this.adListener, yVar3, str4);
            }
            o.a(this.adListener, (MaxAd) this.f9101d, (MaxError) maxErrorImpl3, true, true);
            this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f9101d);
            return false;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.A)).booleanValue() && !com.applovin.impl.sdk.utils.i.a(com.applovin.impl.sdk.o.au())) {
            y.j(this.tag, "Attempting to show ad with no internet connection");
            MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-1009);
            if (y.a()) {
                y yVar4 = this.logger;
                String str5 = this.tag;
                StringBuilder sbA3 = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
                sbA3.append(this.f9101d);
                sbA3.append(", error=");
                sbA3.append(maxErrorImpl4);
                sbA3.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sbA3, this.adListener, yVar4, str5);
            }
            o.a(this.adListener, (MaxAd) this.f9101d, (MaxError) maxErrorImpl4, true, true);
            this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl4, this.f9101d);
            return false;
        }
        String str6 = this.sdk.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.BLOCK_FULLSCREEN_ADS_SHOWING_IF_ACTIVITY_FINISHING);
        if ((!(StringUtils.isValidString(str6) && Boolean.valueOf(str6).booleanValue()) && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.B)).booleanValue()) || activity == null || !activity.isFinishing()) {
            return true;
        }
        y.j(this.tag, "Attempting to show ad when activity is finishing");
        MaxErrorImpl maxErrorImpl5 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
        if (y.a()) {
            y yVar5 = this.logger;
            String str7 = this.tag;
            StringBuilder sbA4 = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
            sbA4.append(this.f9101d);
            sbA4.append(", error=");
            sbA4.append(maxErrorImpl5);
            sbA4.append("), listener=");
            com.applovin.impl.mediation.ads.c.a(sbA4, this.adListener, yVar5, str7);
        }
        o.a(this.adListener, (MaxAd) this.f9101d, (MaxError) maxErrorImpl5, true, true);
        this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl5, this.f9101d);
        return false;
    }

    private void b() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.f9100c) {
            cVar = this.f9101d;
            this.f9101d = null;
        }
        this.sdk.am().destroyAd(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.f9103f.compareAndSet(true, false)) {
            synchronized (this.f9100c) {
                cVar = this.f9101d;
                this.f9101d = null;
            }
            this.sdk.am().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f9100c) {
                    if (MaxFullscreenAdImpl.this.f9101d != null) {
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f9101d + "...");
                        }
                        MaxFullscreenAdImpl.this.sdk.am().destroyAd(MaxFullscreenAdImpl.this.f9101d);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.aj().b(MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f9100c) {
            com.applovin.impl.mediation.a.c cVar = this.f9101d;
            z10 = cVar != null && cVar.l() && this.f9102e == c.READY;
        }
        if (!z10) {
            this.sdk.V().a(this.adUnitId);
        }
        return z10;
    }

    public void loadAd(Activity activity) {
        loadAd(activity, d.a.PUBLISHER_INITIATED);
    }

    public void loadAd(final Activity activity, final d.a aVar) {
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Loading ad for '");
            sbA.append(this.adUnitId);
            sbA.append("'...");
            yVar.b(str, sbA.toString());
        }
        if (!isReady()) {
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    Context contextAt = activity;
                    if (contextAt == null) {
                        contextAt = MaxFullscreenAdImpl.this.sdk.at() != null ? MaxFullscreenAdImpl.this.sdk.at() : com.applovin.impl.sdk.o.au();
                    }
                    Context context = contextAt;
                    MediationServiceImpl mediationServiceImplAm = MaxFullscreenAdImpl.this.sdk.am();
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    mediationServiceImplAm.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, aVar, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context, maxFullscreenAdImpl.listenerWrapper);
                }
            });
            return;
        }
        if (y.a()) {
            y yVar2 = this.logger;
            String str2 = this.tag;
            StringBuilder sbA2 = defpackage.a.a("An ad is already loaded for '");
            sbA2.append(this.adUnitId);
            sbA2.append("'");
            yVar2.b(str2, sbA2.toString());
        }
        if (y.a()) {
            y yVar3 = this.logger;
            String str3 = this.tag;
            StringBuilder sbA3 = defpackage.a.a("MaxAdListener.onAdLoaded(ad=");
            sbA3.append(this.f9101d);
            sbA3.append("), listener=");
            com.applovin.impl.mediation.ads.c.a(sbA3, this.adListener, yVar3, str3);
        }
        o.a(this.adListener, (MaxAd) this.f9101d, true, true);
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired(g gVar) {
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Ad expired ");
            sbA.append(getAdUnitId());
            yVar.b(str, sbA.toString());
        }
        this.f9103f.set(true);
        a aVar = this.f9098a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.E().a()) == null) {
            c();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.am().loadAd(this.adUnitId, null, this.adFormat, d.a.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
        }
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.c cVar = this.f9101d;
        if (cVar == null || !cVar.j().equalsIgnoreCase(str)) {
            return;
        }
        this.f9101d.b(str2);
        o.a(this.adReviewListener, str2, this.f9101d);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        String strC = this.sdk.as().c();
        if (!this.sdk.as().b() || strC == null || strC.equals(this.f9101d.ac())) {
            if (activity == null) {
                activity = this.sdk.at();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxFullscreenAdImpl.this.a(str, str2);
                        MaxFullscreenAdImpl.this.f9104g = false;
                        MaxFullscreenAdImpl.this.f9106i = new WeakReference(activity);
                        MaxFullscreenAdImpl.this.sdk.am().showFullscreenAd(MaxFullscreenAdImpl.this.f9101d, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sbA = defpackage.a.a("Attempting to show ad from <");
        sbA.append(this.f9101d.ac());
        sbA.append("> which does not match selected ad network <");
        sbA.append(strC);
        sbA.append(">");
        final String string = sbA.toString();
        y.j(this.tag, string);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.f9101d;
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.f9101d);
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, string);
                y yVar = MaxFullscreenAdImpl.this.logger;
                if (y.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                    y yVar2 = maxFullscreenAdImpl2.logger;
                    String str3 = maxFullscreenAdImpl2.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(cVar);
                    sb2.append(", error=");
                    sb2.append(maxErrorImpl);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar2, str3);
                }
                o.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) cVar, (MaxError) maxErrorImpl, true, true);
                MaxFullscreenAdImpl.this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl, cVar);
            }
        });
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final i iVar, Activity activity) {
        if (viewGroup == null || iVar == null) {
            y.j(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
            if (y.a()) {
                y yVar = this.logger;
                String str3 = this.tag;
                StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
                sbA.append(this.f9101d);
                sbA.append(", error=");
                sbA.append(maxErrorImpl);
                sbA.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sbA, this.adListener, yVar, str3);
            }
            o.a(this.adListener, (MaxAd) this.f9101d, (MaxError) maxErrorImpl, true, true);
            this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9101d);
            return;
        }
        if (!viewGroup.isShown() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.T)).booleanValue()) {
            y.j(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
            MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
            o.a(this.adListener, (MaxAd) this.f9101d, (MaxError) maxErrorImpl2, true, true);
            this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f9101d);
            return;
        }
        String strC = this.sdk.as().c();
        if (!this.sdk.as().b() || strC == null || strC.equals(this.f9101d.ac())) {
            if (activity == null) {
                activity = this.sdk.at();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxFullscreenAdImpl.this.a(str, str2);
                        MaxFullscreenAdImpl.this.f9104g = true;
                        MaxFullscreenAdImpl.this.f9106i = new WeakReference(activity2);
                        MaxFullscreenAdImpl.this.f9107j = new WeakReference(viewGroup);
                        MaxFullscreenAdImpl.this.f9108k = new WeakReference(iVar);
                        MaxFullscreenAdImpl.this.sdk.am().showFullscreenAd(MaxFullscreenAdImpl.this.f9101d, viewGroup, iVar, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sbA2 = defpackage.a.a("Attempting to show ad from <");
        sbA2.append(this.f9101d.ac());
        sbA2.append("> which does not match selected ad network <");
        sbA2.append(strC);
        sbA2.append(">");
        final String string = sbA2.toString();
        y.j(this.tag, string);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.5
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.f9101d;
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.f9101d);
                MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, string);
                y yVar2 = MaxFullscreenAdImpl.this.logger;
                if (y.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                    y yVar3 = maxFullscreenAdImpl2.logger;
                    String str4 = maxFullscreenAdImpl2.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(cVar);
                    sb2.append(", error=");
                    sb2.append(maxErrorImpl3);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxFullscreenAdImpl.this.adListener, yVar3, str4);
                }
                o.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) cVar, (MaxError) maxErrorImpl3, true, true);
                MaxFullscreenAdImpl.this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, cVar);
            }
        });
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        l1.c.a(sb2, this.adUnitId, CoreConstants.SINGLE_QUOTE_CHAR, ", adListener=");
        Object obj = this.adListener;
        if (obj == this.f9098a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }
}
