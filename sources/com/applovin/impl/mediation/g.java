package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.fragment.app.d0;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f9866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f9868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAdapter f9870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.applovin.impl.mediation.a.a f9872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f9873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxNativeAd f9874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f9875l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MaxAdapterResponseParameters f9877n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f9881r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f9864a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f9876m = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f9878o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f9879p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f9880q = new AtomicBoolean(false);

    public class a implements MaxAdViewAdapterListener, MaxAppOpenAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediationServiceImpl.a f9941b;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f9941b = aVar;
        }

        private void a(String str, final Bundle bundle) {
            if (!g.this.f9872i.F().get()) {
                g.this.f9880q.set(true);
                a(str, this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (g.this.f9879p.compareAndSet(false, true)) {
                            a.this.f9941b.a(g.this.f9872i, bundle);
                        }
                    }
                });
                return;
            }
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.e("MediationAdapterWrapper", g.this.f9869f + ": blocking ad loaded callback for " + g.this.f9872i + " since onAdHidden() has been called");
            }
            g.this.f9865b.X().b(g.this.f9872i, str);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            g.this.f9864a.post(new Runnable() { // from class: com.applovin.impl.mediation.g.a.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        MaxAdListener maxAdListener2 = maxAdListener;
                        y.c("MediationAdapterWrapper", d0.a(defpackage.a.a("Failed to forward call ("), str, ") to ", maxAdListener2 != null ? maxAdListener2.getClass().getName() : null), th);
                        g.this.f9865b.ag().a("MediationAdapterWrapper", str + ":" + g.this.f9868e.ab(), th);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (!g.this.f9872i.F().get()) {
                a(str, this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (g.this.f9879p.compareAndSet(false, true)) {
                            a.this.f9941b.onAdLoadFailed(g.this.f9871h, maxError);
                        }
                    }
                });
                return;
            }
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.e("MediationAdapterWrapper", g.this.f9869f + ": blocking ad load failed callback for " + g.this.f9872i + " since onAdHidden() has been called");
            }
            g.this.f9865b.X().b(g.this.f9872i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (!g.this.f9872i.F().get()) {
                a(str, this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.14
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f9941b.a(g.this.f9872i, maxError, bundle);
                    }
                });
                return;
            }
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.e("MediationAdapterWrapper", g.this.f9869f + ": blocking ad display failed callback for " + g.this.f9872i + " since onAdHidden() has been called");
            }
            g.this.f9865b.X().b(g.this.f9872i, str);
        }

        private void b(String str, final Bundle bundle) {
            if (!g.this.f9872i.F().get()) {
                if (g.this.f9872i.E().compareAndSet(false, true)) {
                    a(str, this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.13
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f9941b.b(g.this.f9872i, bundle);
                        }
                    });
                    return;
                }
                return;
            }
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.e("MediationAdapterWrapper", g.this.f9869f + ": blocking ad displayed callback for " + g.this.f9872i + " since onAdHidden() has been called");
            }
            g.this.f9865b.X().b(g.this.f9872i, str);
        }

        private void c(String str, final Bundle bundle) {
            if (g.this.f9872i.F().compareAndSet(false, true)) {
                a(str, this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.15
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f9941b.c(g.this.f9872i, bundle);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": adview ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onAdViewAdClicked", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.d(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.9
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.onAdCollapsed(g.this.f9872i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (g.this.f9872i.u()) {
                return;
            }
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": adview ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.8
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.e(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": adview ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": adview ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            g.this.f9873j = view;
            a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": app open ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onAppOpenAdClicked", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.6
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.d(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": app open ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": app open ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": app open ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": interstitial ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onInterstitialAdClicked", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.16
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.d(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": interstitial ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": interstitial ad hidden with extra info ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": interstitial ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.10
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.d(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            if (g.this.f9872i.u()) {
                return;
            }
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": native ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": native ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            g.this.f9874k = maxNativeAd;
            a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedAdClicked", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.17
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.d(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.onRewardedVideoCompleted(g.this.f9872i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.19
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.onRewardedVideoStarted(g.this.f9872i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded interstitial ad clicked with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedInterstitialAdClicked", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.d(g.this.f9872i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded interstitial ad displayed with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded interstitial ad hidden with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            c("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.d("MediationAdapterWrapper", g.this.f9869f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            y unused = g.this.f9866c;
            if (y.a()) {
                y yVar = g.this.f9866c;
                j.a(g.this, new StringBuilder(), ": rewarded interstitial ad loaded with extra info: ", bundle, yVar, "MediationAdapterWrapper");
            }
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.onRewardedVideoCompleted(g.this.f9872i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            y unused = g.this.f9866c;
            if (y.a()) {
                g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9941b.onRewardedVideoStarted(g.this.f9872i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (g.this.f9872i instanceof com.applovin.impl.mediation.a.c) {
                final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) g.this.f9872i;
                if (cVar.T().compareAndSet(false, true)) {
                    y unused = g.this.f9866c;
                    if (y.a()) {
                        g.this.f9866c.c("MediationAdapterWrapper", g.this.f9869f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f9941b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.18
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f9941b.a(cVar, maxReward, bundle);
                        }
                    });
                }
            }
        }
    }

    public static class b implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f9980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.f f9981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f9982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f9983d;

        public b(o oVar, com.applovin.impl.mediation.a.f fVar, long j10, Runnable runnable) {
            this.f9980a = oVar;
            this.f9981b = fVar;
            this.f9982c = j10;
            this.f9983d = runnable;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            long jAo = this.f9981b.ao();
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f9980a.al().a(b.this.f9981b, SystemClock.elapsedRealtime() - b.this.f9982c, initializationStatus, str);
                    if (b.this.f9983d != null) {
                        b.this.f9983d.run();
                    }
                }
            };
            if (((Boolean) this.f9980a.a(com.applovin.impl.sdk.c.b.gI)).booleanValue()) {
                this.f9980a.G().a(new ac(this.f9980a, "MaxAdapterInitializationCompletionHandler", runnable), r.b.BACKGROUND, Math.max(jAo, 0L));
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, jAo);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.h f9987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MaxSignalCollectionListener f9988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f9989c = new AtomicBoolean();

        public c(com.applovin.impl.mediation.a.h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f9987a = hVar;
            this.f9988b = maxSignalCollectionListener;
        }
    }

    public class d extends com.applovin.impl.sdk.e.d {
        private d() {
            super("TaskTimeoutMediatedAd", g.this.f9865b);
        }

        private void a(com.applovin.impl.mediation.a.a aVar) {
            if (aVar != null) {
                this.f10534f.ao().a(aVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f9879p.get()) {
                return;
            }
            if (g.this.f9872i.s()) {
                if (y.a()) {
                    this.f10536h.b(this.f10535g, g.this.f9869f + " is timing out, considering JS Tag ad loaded: " + g.this.f9872i);
                }
                a(g.this.f9872i);
                return;
            }
            if (y.a()) {
                this.f10536h.e(this.f10535g, g.this.f9869f + " is timing out " + g.this.f9872i + "...");
            }
            a(g.this.f9872i);
            g.this.f9876m.a(this.f10535g, new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    public class e extends com.applovin.impl.sdk.e.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f9992b;

        private e(c cVar) {
            super("TaskTimeoutSignalCollection", g.this.f9865b);
            this.f9992b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9992b.f9989c.get()) {
                return;
            }
            if (y.a()) {
                this.f10536h.e(this.f10535g, g.this.f9869f + " is timing out " + this.f9992b.f9987a + "...");
            }
            g gVar = g.this;
            StringBuilder sbA = defpackage.a.a("The adapter (");
            sbA.append(g.this.f9869f);
            sbA.append(") timed out");
            gVar.b(sbA.toString(), this.f9992b);
        }
    }

    public g(com.applovin.impl.mediation.a.f fVar, MaxAdapter maxAdapter, boolean z10, o oVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f9867d = fVar.ac();
        this.f9870g = maxAdapter;
        this.f9865b = oVar;
        this.f9866c = oVar.F();
        this.f9868e = fVar;
        this.f9869f = maxAdapter.getClass().getSimpleName();
        this.f9881r = z10;
    }

    private void a(final Runnable runnable, com.applovin.impl.mediation.a.a aVar) {
        a("show_ad", aVar.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.g.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    StringBuilder sbA = defpackage.a.a("Failed to start displaying ad for ");
                    sbA.append(g.this.f9867d);
                    sbA.append(" due to: ");
                    sbA.append(th);
                    String string = sbA.toString();
                    y.j("MediationAdapterWrapper", string);
                    g.this.f9876m.a("show_ad", new MaxErrorImpl(-1, string), (Bundle) null);
                    s sVarAg = g.this.f9865b.ag();
                    StringBuilder sbA2 = defpackage.a.a("show_ad:");
                    sbA2.append(g.this.f9868e.ab());
                    sVarAg.a("MediationAdapterWrapper", sbA2.toString(), th);
                    g.this.a("show_ad");
                    g.this.f9865b.ak().a(g.this.f9868e.ab(), "show_ad", g.this.f9872i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (y.a()) {
            this.f9866c.c("MediationAdapterWrapper", d0.a(defpackage.a.a("Marking "), this.f9869f, " as disabled due to: ", str));
        }
        this.f9878o.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, c cVar) {
        if (!cVar.f9989c.compareAndSet(false, true) || cVar.f9988b == null) {
            return;
        }
        cVar.f9988b.onSignalCollected(str);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.g.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    y unused = g.this.f9866c;
                    if (y.a()) {
                        g.this.f9866c.b("MediationAdapterWrapper", g.this.f9869f + ": running " + str + "...");
                    }
                    runnable.run();
                    y unused2 = g.this.f9866c;
                    if (y.a()) {
                        g.this.f9866c.b("MediationAdapterWrapper", g.this.f9869f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    StringBuilder sbA = defpackage.a.a("Failed operation ");
                    sbA.append(str);
                    sbA.append(" for ");
                    sbA.append(g.this.f9867d);
                    y.c("MediationAdapterWrapper", sbA.toString(), th);
                    g gVar = g.this;
                    StringBuilder sbA2 = defpackage.a.a("fail_");
                    sbA2.append(str);
                    gVar.a(sbA2.toString());
                    if (str.equals("destroy")) {
                        return;
                    }
                    g.this.f9865b.ak().a(g.this.f9868e.ab(), str, g.this.f9872i);
                    g.this.f9865b.ag().a("MediationAdapterWrapper", "outer:" + str + ":" + g.this.f9868e.ab(), th);
                }
            }
        };
        if (a(str, maxAdFormat)) {
            this.f9864a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    private void a(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolShouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.f9870g;
        if (maxAdapter != null) {
            if ("initialize".equals(str)) {
                Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
                if (boolShouldInitializeOnUiThread != null) {
                    return boolShouldInitializeOnUiThread.booleanValue();
                }
            } else if ("collect_signal".equals(str)) {
                Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
                if (boolShouldCollectSignalsOnUiThread != null) {
                    return boolShouldCollectSignalsOnUiThread.booleanValue();
                }
            } else if ("load_ad".equals(str) && maxAdFormat != null) {
                Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
                if (boolShouldLoadAdsOnUiThread != null) {
                    return boolShouldLoadAdsOnUiThread.booleanValue();
                }
            } else if ("show_ad".equals(str) && maxAdFormat != null && (boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat)) != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        }
        return this.f9868e.aj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, c cVar) {
        if (!cVar.f9989c.compareAndSet(false, true) || cVar.f9988b == null) {
            return;
        }
        cVar.f9988b.onSignalCollectionFailed(str);
    }

    private boolean b(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (aVar.m() == null) {
            y.j("MediationAdapterWrapper", "Adapter has been garbage collected");
            maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
        } else {
            if (aVar.m() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            }
            if (activity == null && MaxAdFormat.APP_OPEN != aVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            if (this.f9878o.get()) {
                if (g()) {
                    return true;
                }
                throw new IllegalStateException(k.a(defpackage.a.a("Mediation adapter '"), this.f9869f, "' does not have an ad loaded. Please load an ad first"));
            }
            StringBuilder sbA = defpackage.a.a("Mediation adapter '");
            sbA.append(this.f9869f);
            sbA.append("' is disabled. Showing ads with this adapter is disabled.");
            String string = sbA.toString();
            y.j("MediationAdapterWrapper", string);
            maxErrorImpl = new MaxErrorImpl(-1, string);
        }
        this.f9876m.a("ad_show", maxErrorImpl, (Bundle) null);
        return false;
    }

    public View a() {
        return this.f9873j;
    }

    public void a(final com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.u()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.19
                    @Override // java.lang.Runnable
                    public void run() {
                        g.this.f9865b.an().a((com.applovin.impl.mediation.a.c) aVar, activity, g.this.f9876m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f9870g).showInterstitialAd(g.this.f9877n, activity, g.this.f9876m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxAppOpenAdapter) g.this.f9870g).showAppOpenAd(g.this.f9877n, activity, g.this.f9876m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f9870g).showRewardedAd(g.this.f9877n, activity, g.this.f9876m);
                    }
                };
            } else {
                if (aVar.getFormat() != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
                }
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f9870g).showRewardedInterstitialAd(g.this.f9877n, activity, g.this.f9876m);
                    }
                };
            }
            a(runnable, aVar);
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final ViewGroup viewGroup, final androidx.lifecycle.i iVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.6
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) g.this.f9870g).showInterstitialAd(g.this.f9877n, viewGroup, iVar, activity, g.this.f9876m);
                    }
                };
            } else {
                if (aVar.getFormat() != MaxAdFormat.REWARDED) {
                    throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
                }
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.7
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdViewAdapter) g.this.f9870g).showRewardedAd(g.this.f9877n, viewGroup, iVar, activity, g.this.f9876m);
                    }
                };
            }
            a(runnable, aVar);
        }
    }

    public void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        a("initialize", new Runnable() { // from class: com.applovin.impl.mediation.g.1
            @Override // java.lang.Runnable
            public void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                y unused = g.this.f9866c;
                if (y.a()) {
                    y yVar = g.this.f9866c;
                    StringBuilder sbA = defpackage.a.a("Initializing ");
                    sbA.append(g.this.f9869f);
                    sbA.append(" on thread: ");
                    sbA.append(Thread.currentThread());
                    sbA.append(" with 'run_on_ui_thread' value: ");
                    sbA.append(g.this.f9868e.aj());
                    yVar.b("MediationAdapterWrapper", sbA.toString());
                }
                g.this.f9870g.initialize(maxAdapterInitializationParameters, activity, new b(g.this.f9865b, g.this.f9868e, jElapsedRealtime, runnable));
            }
        });
    }

    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final com.applovin.impl.mediation.a.h hVar, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (this.f9878o.get()) {
            final c cVar = new c(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f9870g;
            if (!(maxAdapter instanceof MaxSignalProvider)) {
                b(k.a(defpackage.a.a("The adapter ("), this.f9869f, ") does not support signal collection"), cVar);
                return;
            } else {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g.9
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.9.1
                                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                                public void onSignalCollected(String str) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    g.this.a(str, cVar);
                                }

                                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                                public void onSignalCollectionFailed(String str) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    g.this.b(str, cVar);
                                }
                            });
                        } catch (Throwable th) {
                            StringBuilder sbA = defpackage.a.a("Failed signal collection for ");
                            sbA.append(g.this.f9867d);
                            sbA.append(" due to: ");
                            sbA.append(th);
                            String string = sbA.toString();
                            y.j("MediationAdapterWrapper", string);
                            g.this.b(string, cVar);
                            s sVarAg = g.this.f9865b.ag();
                            StringBuilder sbA2 = defpackage.a.a("collect_signal:");
                            sbA2.append(g.this.f9868e.ab());
                            sVarAg.a("MediationAdapterWrapper", sbA2.toString(), th);
                            g.this.a("collect_signal");
                            g.this.f9865b.ak().a(g.this.f9868e.ab(), "collect_signal", g.this.f9872i);
                        }
                        if (cVar.f9989c.get()) {
                            return;
                        }
                        if (hVar.an() == 0) {
                            y unused = g.this.f9866c;
                            if (y.a()) {
                                y yVar = g.this.f9866c;
                                StringBuilder sbA3 = defpackage.a.a("Failing signal collection ");
                                sbA3.append(hVar);
                                sbA3.append(" since it has 0 timeout");
                                yVar.b("MediationAdapterWrapper", sbA3.toString());
                            }
                            g gVar = g.this;
                            StringBuilder sbA4 = defpackage.a.a("The adapter (");
                            sbA4.append(g.this.f9869f);
                            sbA4.append(") has 0 timeout");
                            gVar.b(sbA4.toString(), cVar);
                            return;
                        }
                        if (hVar.an() <= 0) {
                            y unused2 = g.this.f9866c;
                            if (y.a()) {
                                y yVar2 = g.this.f9866c;
                                StringBuilder sbA5 = defpackage.a.a("Negative timeout set for ");
                                sbA5.append(hVar);
                                sbA5.append(", not scheduling a timeout");
                                yVar2.b("MediationAdapterWrapper", sbA5.toString());
                                return;
                            }
                            return;
                        }
                        y unused3 = g.this.f9866c;
                        if (y.a()) {
                            y yVar3 = g.this.f9866c;
                            StringBuilder sbA6 = defpackage.a.a("Setting timeout ");
                            sbA6.append(hVar.an());
                            sbA6.append("ms. for ");
                            sbA6.append(hVar);
                            yVar3.b("MediationAdapterWrapper", sbA6.toString());
                        }
                        g.this.f9865b.G().a(new e(cVar), r.b.MEDIATION_TIMEOUT, hVar.an());
                    }
                });
                return;
            }
        }
        StringBuilder sbA = defpackage.a.a("Mediation adapter '");
        sbA.append(this.f9869f);
        sbA.append("' is disabled. Signal collection ads with this adapter is disabled.");
        y.j("MediationAdapterWrapper", sbA.toString());
        maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f9869f + ") is disabled");
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f9875l = maxNativeAdView;
    }

    public void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.f9871h = str;
        this.f9872i = aVar;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, MediationServiceImpl.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.f9878o.get()) {
            StringBuilder sbA = defpackage.a.a("Mediation adapter '");
            sbA.append(this.f9869f);
            sbA.append("' was disabled due to earlier failures. Loading ads with this adapter is disabled.");
            String string = sbA.toString();
            y.j("MediationAdapterWrapper", string);
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, string));
            return;
        }
        this.f9877n = maxAdapterResponseParameters;
        this.f9876m.a(aVar2);
        final MaxAdFormat maxAdFormatT = aVar.u() ? aVar.t() : aVar.getFormat();
        if (maxAdFormatT == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.12
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) g.this.f9870g).loadInterstitialAd(maxAdapterResponseParameters, activity, g.this.f9876m);
                }
            };
        } else if (maxAdFormatT == MaxAdFormat.APP_OPEN) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.13
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAppOpenAdapter) g.this.f9870g).loadAppOpenAd(maxAdapterResponseParameters, activity, g.this.f9876m);
                }
            };
        } else if (maxAdFormatT == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.14
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) g.this.f9870g).loadRewardedAd(maxAdapterResponseParameters, activity, g.this.f9876m);
                }
            };
        } else if (maxAdFormatT == MaxAdFormat.REWARDED_INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.15
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedInterstitialAdapter) g.this.f9870g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, g.this.f9876m);
                }
            };
        } else if (maxAdFormatT == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.16
                @Override // java.lang.Runnable
                public void run() {
                    ((MediationAdapterBase) g.this.f9870g).loadNativeAd(maxAdapterResponseParameters, activity, g.this.f9876m);
                }
            };
        } else {
            if (!maxAdFormatT.isAdViewAd()) {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " (" + aVar.t() + ") is not a supported ad format");
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.17
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAdViewAdapter) g.this.f9870g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormatT, activity, g.this.f9876m);
                }
            };
        }
        a("load_ad", maxAdFormatT, new Runnable() { // from class: com.applovin.impl.mediation.g.18
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    StringBuilder sbA2 = defpackage.a.a("Failed to start loading ad for ");
                    sbA2.append(g.this.f9867d);
                    sbA2.append(" due to: ");
                    sbA2.append(th);
                    String string2 = sbA2.toString();
                    y.j("MediationAdapterWrapper", string2);
                    g.this.f9876m.a("load_ad", new MaxErrorImpl(-1, string2));
                    s sVarAg = g.this.f9865b.ag();
                    StringBuilder sbA3 = defpackage.a.a("load_ad:");
                    sbA3.append(g.this.f9868e.ab());
                    sVarAg.a("MediationAdapterWrapper", sbA3.toString(), th);
                    g.this.a("load_ad");
                    g.this.f9865b.ak().a(g.this.f9868e.ab(), "load_ad", g.this.f9872i);
                }
                if (g.this.f9879p.get()) {
                    return;
                }
                long jAn = g.this.f9868e.an();
                if (jAn > 0) {
                    y unused = g.this.f9866c;
                    if (y.a()) {
                        y yVar = g.this.f9866c;
                        StringBuilder sbA4 = i2.a.a("Setting timeout ", jAn, "ms. for ");
                        sbA4.append(aVar);
                        yVar.b("MediationAdapterWrapper", sbA4.toString());
                    }
                    g.this.f9865b.G().a(new d(), r.b.MEDIATION_TIMEOUT, jAn);
                    return;
                }
                y unused2 = g.this.f9866c;
                if (y.a()) {
                    y yVar2 = g.this.f9866c;
                    StringBuilder sbA5 = defpackage.a.a("Negative timeout set for ");
                    sbA5.append(aVar);
                    sbA5.append(", not scheduling a timeout");
                    yVar2.b("MediationAdapterWrapper", sbA5.toString());
                }
            }
        });
    }

    public MaxNativeAd b() {
        return this.f9874k;
    }

    public MaxNativeAdView c() {
        return this.f9875l;
    }

    public String d() {
        return this.f9867d;
    }

    public MediationServiceImpl.a e() {
        return this.f9876m.f9941b;
    }

    public boolean f() {
        return this.f9878o.get();
    }

    public boolean g() {
        return this.f9879p.get() && this.f9880q.get();
    }

    public String h() {
        MaxAdapter maxAdapter = this.f9870g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            StringBuilder sbA = defpackage.a.a("Failed to get adapter's SDK version for ");
            sbA.append(this.f9867d);
            y.c("MediationAdapterWrapper", sbA.toString(), th);
            s sVarAg = this.f9865b.ag();
            StringBuilder sbA2 = defpackage.a.a("sdk_version:");
            sbA2.append(this.f9868e.ab());
            sVarAg.a("MediationAdapterWrapper", sbA2.toString(), th);
            a("sdk_version");
            this.f9865b.ak().a(this.f9868e.ab(), "sdk_version", this.f9872i);
            return null;
        }
    }

    public String i() {
        MaxAdapter maxAdapter = this.f9870g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            StringBuilder sbA = defpackage.a.a("Failed to get adapter version for ");
            sbA.append(this.f9867d);
            y.c("MediationAdapterWrapper", sbA.toString(), th);
            s sVarAg = this.f9865b.ag();
            StringBuilder sbA2 = defpackage.a.a("adapter_version:");
            sbA2.append(this.f9868e.ab());
            sVarAg.a("MediationAdapterWrapper", sbA2.toString(), th);
            a("adapter_version");
            this.f9865b.ak().a(this.f9868e.ab(), "adapter_version", this.f9872i);
            return null;
        }
    }

    public void j() {
        if (this.f9881r) {
            return;
        }
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g.10
            @Override // java.lang.Runnable
            public void run() {
                g.this.a("destroy");
                g.this.f9870g.onDestroy();
                g.this.f9870g = null;
                g.this.f9873j = null;
                g.this.f9874k = null;
                g.this.f9875l = null;
            }
        });
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediationAdapterWrapper{adapterTag='");
        sbA.append(this.f9869f);
        sbA.append("'");
        sbA.append('}');
        return sbA.toString();
    }
}
