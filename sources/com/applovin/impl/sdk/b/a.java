package com.applovin.impl.sdk.b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.ad.h;
import com.applovin.impl.sdk.e.ad;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f10275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppLovinAdServiceImpl f10276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f10277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SoftReference<AppLovinAdLoadListener> f10279f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f10281h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f10274a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f10280g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f10282i = false;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.b.a$a, reason: collision with other inner class name */
    public class C0138a implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdLoadListener f10285b;

        public C0138a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f10285b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.f10277d = appLovinAd;
            if (this.f10285b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0138a.this.f10285b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            y.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                            a.this.f10275b.ag().a("IncentivizedAdController", "adLoaded", th);
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f10285b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0138a.this.f10285b.failedToReceiveAd(i10);
                        } catch (Throwable th) {
                            y.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                            a.this.f10275b.ag().a("IncentivizedAdController", "adLoadFailed", th);
                        }
                    }
                });
            }
        }
    }

    public class b implements h, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f10291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f10292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f10293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f10294e;

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f10291b = appLovinAdDisplayListener;
            this.f10292c = appLovinAdClickListener;
            this.f10293d = appLovinAdVideoPlaybackListener;
            this.f10294e = appLovinAdRewardListener;
        }

        private void a(e eVar) {
            int i10;
            String str;
            String strD = a.this.d();
            if (!StringUtils.isValidString(strD) || !a.this.f10282i) {
                a.this.f10275b.F();
                if (y.a()) {
                    y yVarF = a.this.f10275b.F();
                    StringBuilder sbA = androidx.activity.result.c.a("Invalid reward state - result: ", strD, " and wasFullyEngaged: ");
                    sbA.append(a.this.f10282i);
                    yVarF.e("IncentivizedAdController", sbA.toString());
                }
                a.this.f10275b.F();
                if (y.a()) {
                    a.this.f10275b.F().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.aM();
                if (a.this.f10282i) {
                    a.this.f10275b.F();
                    if (y.a()) {
                        a.this.f10275b.F().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    a.this.f10275b.F();
                    if (y.a()) {
                        a.this.f10275b.F().e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.a(c.a(str));
                a.this.f10275b.F();
                if (y.a()) {
                    a.this.f10275b.F().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                com.applovin.impl.sdk.utils.o.a(this.f10294e, eVar, i10);
            }
            a.this.a(eVar);
            a.this.f10275b.F();
            if (y.a()) {
                a.this.f10275b.F().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            com.applovin.impl.sdk.utils.o.b(this.f10291b, eVar);
            if (eVar.al().getAndSet(true)) {
                return;
            }
            a.this.f10275b.F();
            if (y.a()) {
                a.this.f10275b.F().b("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            a.this.f10275b.G().a(new com.applovin.impl.sdk.e.y(eVar, a.this.f10275b), r.b.REWARD);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.utils.o.a(this.f10292c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.utils.o.a(this.f10291b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof f) {
                appLovinAd = ((f) appLovinAd).a();
            }
            if (appLovinAd instanceof e) {
                a((e) appLovinAd);
                return;
            }
            a.this.f10275b.F();
            if (y.a()) {
                a.this.f10275b.F().e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        @Override // com.applovin.impl.sdk.ad.h
        public void onAdDisplayFailed(String str) {
            com.applovin.impl.sdk.utils.o.a(this.f10291b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            com.applovin.impl.sdk.utils.o.b(this.f10294e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            com.applovin.impl.sdk.utils.o.c(this.f10294e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            com.applovin.impl.sdk.utils.o.a(this.f10294e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            a.this.a("network_timeout");
            com.applovin.impl.sdk.utils.o.a(this.f10294e, appLovinAd, i10);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.utils.o.a(this.f10293d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            com.applovin.impl.sdk.utils.o.a(this.f10293d, appLovinAd, d10, z10);
            a.this.f10282i = z10;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.f10275b = appLovinSdk.a();
        this.f10276c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f10278e = str;
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            y.j("IncentivizedAdController", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED || appLovinAd2.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            return null;
        }
        StringBuilder sbA = defpackage.a.a("Attempting to display ad with invalid ad type: ");
        sbA.append(appLovinAd2.getType());
        y.j("IncentivizedAdController", sbA.toString());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAd appLovinAdA = w.a((AppLovinAd) appLovinAdImpl, this.f10275b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f10275b.aA(), context);
        for (String str : this.f10274a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f10274a.get(str));
        }
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(bVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((e) appLovinAdA, bVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAd appLovinAdA = w.a((AppLovinAd) appLovinAdImpl, this.f10275b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f10275b.aA(), context);
        for (String str : this.f10274a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f10274a.get(str));
        }
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(bVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, iVar);
        a((e) appLovinAdA, bVar);
    }

    private void a(e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f10275b.G().a(new ad(eVar, appLovinAdRewardListener, this.f10275b), r.b.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f10277d;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof f) {
                if (appLovinAd != ((f) appLovinAd2).a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f10277d = null;
        }
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f10277d;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            y.j("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            c();
        }
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f10275b.J().a(com.applovin.impl.sdk.d.f.f10474l);
        com.applovin.impl.sdk.utils.o.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        if (appLovinAdDisplayListener instanceof h) {
            com.applovin.impl.sdk.utils.o.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.sdk.utils.o.b(appLovinAdDisplayListener, appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f10280g) {
            this.f10281h = str;
        }
    }

    private void b(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f10277d;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, iVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            y.j("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            c();
        }
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10276c.loadNextIncentivizedAd(this.f10278e, appLovinAdLoadListener);
    }

    private void c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f10279f;
        if (softReference == null || (appLovinAdLoadListener = softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(-300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        String str;
        synchronized (this.f10280g) {
            str = this.f10281h;
        }
        return str;
    }

    private AppLovinAdRewardListener e() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f10275b.F();
                if (y.a()) {
                    a.this.f10275b.F().e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f10275b.F();
                if (y.a()) {
                    a.this.f10275b.F().e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f10275b.F();
                if (y.a()) {
                    a.this.f10275b.F().b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
                a.this.f10275b.F();
                if (y.a()) {
                    a.this.f10275b.F().e("IncentivizedAdController", "Reward validation failed: " + i10);
                }
            }
        };
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = e();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        b(appLovinAd, viewGroup, iVar, context, appLovinAdRewardListener == null ? e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10275b.F();
        if (y.a()) {
            this.f10275b.F().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f10279f = new SoftReference<>(appLovinAdLoadListener);
        if (!a()) {
            b(new C0138a(appLovinAdLoadListener));
            return;
        }
        y.j("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f10277d);
        }
    }

    public void a(String str, Object obj) {
        this.f10274a.put(str, obj);
    }

    public boolean a() {
        return this.f10277d != null;
    }

    public String b() {
        return this.f10278e;
    }
}
