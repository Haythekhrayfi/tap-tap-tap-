package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f8998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<JSONObject> f8999c = new AtomicReference<>();

    public class a implements com.applovin.impl.mediation.ads.a.InterfaceC0121a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f9021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.impl.mediation.ads.a.InterfaceC0121a f9022c;

        public a(com.applovin.impl.mediation.a.a aVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
            this.f9021b = aVar;
            this.f9022c = interfaceC0121a;
        }

        public void a(com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
            this.f9022c = interfaceC0121a;
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f9021b.a(bundle);
            this.f9021b.D();
            MediationServiceImpl.this.a(this.f9021b);
            com.applovin.impl.sdk.utils.o.a((MaxAdListener) this.f9022c, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f9021b.a(bundle);
            MediationServiceImpl.this.b(this.f9021b, maxError, this.f9022c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.mediation.a.c)) {
                ((com.applovin.impl.mediation.a.c) maxAd).R();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f9021b.a(bundle);
            com.applovin.impl.sdk.utils.o.a(this.f9022c, maxAd, maxReward);
            MediationServiceImpl.this.f8997a.G().a(new com.applovin.impl.mediation.c.g((com.applovin.impl.mediation.a.c) maxAd, MediationServiceImpl.this.f8997a), r.b.MEDIATION_REWARD);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f9021b.a(bundle);
            y unused = MediationServiceImpl.this.f8998b;
            if (y.a()) {
                MediationServiceImpl.this.f8998b.b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f9021b, this.f9022c);
            MediationServiceImpl.this.f8997a.J().a(com.applovin.impl.sdk.d.f.f10465c);
            MediationServiceImpl.this.f8997a.J().a(com.applovin.impl.sdk.d.f.f10468f);
            if (maxAd.getFormat().isFullscreenAd()) {
                com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
                if (!cVar.W()) {
                    y unused2 = MediationServiceImpl.this.f8998b;
                    if (y.a()) {
                        y yVar = MediationServiceImpl.this.f8998b;
                        StringBuilder sbA = defpackage.a.a("Received ad display callback before attempting show");
                        sbA.append(cVar.u() ? " for hybrid ad" : "");
                        yVar.d("MediationService", sbA.toString());
                        return;
                    }
                    return;
                }
                MediationServiceImpl.this.f8997a.X().a(this.f9021b, "DID_DISPLAY");
                MediationServiceImpl.this.f8997a.V().a(this.f9021b);
            } else {
                MediationServiceImpl.this.f8997a.X().a(this.f9021b, "DID_DISPLAY");
            }
            com.applovin.impl.sdk.utils.o.b(this.f9022c, maxAd);
        }

        public void c(final MaxAd maxAd, Bundle bundle) {
            this.f9021b.a(bundle);
            MediationServiceImpl.this.f8997a.X().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f8997a.V().b(maxAd);
                    }
                    com.applovin.impl.sdk.utils.o.c(a.this.f9022c, maxAd);
                }
            }, maxAd instanceof com.applovin.impl.mediation.a.c ? ((com.applovin.impl.mediation.a.c) maxAd).N() : 0L);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f9021b.a(bundle);
            MediationServiceImpl.this.a(this.f9021b, this.f9022c);
            com.applovin.impl.sdk.utils.o.d(this.f9022c, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.f9021b.a(bundle);
            com.applovin.impl.sdk.utils.o.g(this.f9022c, maxAd);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f9021b.a(bundle);
            com.applovin.impl.sdk.utils.o.h(this.f9022c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f9021b.D();
            MediationServiceImpl.this.a(this.f9021b, maxError, this.f9022c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            com.applovin.impl.sdk.utils.o.f(this.f9022c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            com.applovin.impl.sdk.utils.o.e(this.f9022c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }
    }

    public MediationServiceImpl(o oVar) {
        this.f8997a = oVar;
        this.f8998b = oVar.F();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    private g a(com.applovin.impl.mediation.a.c cVar) {
        g gVarM = cVar.m();
        if (gVarM != null) {
            return gVarM;
        }
        this.f8997a.V().a(false);
        if (y.a()) {
            this.f8998b.d("MediationService", "Failed to show " + cVar + ": adapter not found");
        }
        StringBuilder sbA = defpackage.a.a("There may be an integration problem with the adapter for ad unit id '");
        sbA.append(cVar.getAdUnitId());
        sbA.append("'. Please check if you have a supported version of that SDK integrated into your project.");
        y.j("MediationService", sbA.toString());
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f8997a.X().a(aVar, "DID_LOAD");
        if (aVar.i().endsWith("load")) {
            this.f8997a.X().a(aVar);
        }
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(aVar.A()));
        if (aVar.getFormat().isFullscreenAd()) {
            v.a aVarB = this.f8997a.V().b(aVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.b()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.a()));
        }
        a("load", map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        this.f8997a.X().a(aVar, "DID_CLICKED");
        this.f8997a.X().a(aVar, "DID_CLICK");
        if (aVar.i().endsWith("click")) {
            this.f8997a.X().a(aVar);
            com.applovin.impl.sdk.utils.o.a((MaxAdRevenueListener) interfaceC0121a, (MaxAd) aVar);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8997a.q());
        if (!((Boolean) this.f8997a.a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        com.applovin.impl.sdk.utils.o.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        this.f8997a.V().a(false);
        a(cVar, (MaxAdListener) interfaceC0121a);
        if (y.a()) {
            this.f8998b.b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, interfaceC0121a);
    }

    private void a(final com.applovin.impl.mediation.a.c cVar, final MaxAdListener maxAdListener) {
        final long jLongValue = ((Long) this.f8997a.a(com.applovin.impl.sdk.c.a.F)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                if (cVar.E().get()) {
                    return;
                }
                StringBuilder sbA = defpackage.a.a("Ad (");
                sbA.append(cVar.ad());
                sbA.append(") has not been displayed after ");
                sbA.append(jLongValue);
                sbA.append("ms. Failing ad display...");
                String string = sbA.toString();
                y.j("MediationService", string);
                MediationServiceImpl.this.b(cVar, new MaxErrorImpl(-1, string), maxAdListener);
                MediationServiceImpl.this.f8997a.V().b(cVar);
            }
        }, jLongValue);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(aVar.A()));
        if (aVar.getFormat().isFullscreenAd()) {
            v.a aVarB = this.f8997a.V().b(aVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.b()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.a()));
        }
        a("mlerr", map, maxError, aVar);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar, boolean z10) {
        a("mierr", Collections.EMPTY_MAP, maxError, aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.h hVar, g gVar) {
        HashMap map = new HashMap(2);
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.i(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.h(), map);
        a("serr", map, new MaxErrorImpl(str), hVar);
    }

    private void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, (MaxError) null, fVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, maxError, fVar, true);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, boolean z10) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(fVar.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z10 ? StringUtils.emptyIfNull(fVar.aq()) : "");
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            map2.put("{CREATIVE_ID}", z10 ? StringUtils.emptyIfNull(((com.applovin.impl.mediation.a.a) fVar).getCreativeId()) : "");
        }
        this.f8997a.G().a(new com.applovin.impl.mediation.c.d(str, map2, maxError, fVar, this.f8997a, z10), r.b.MEDIATION_POSTBACKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f8997a.X().a(aVar, "DID_FAIL_DISPLAY");
        a(maxError, aVar, true);
        if (aVar.E().compareAndSet(false, true)) {
            com.applovin.impl.sdk.utils.o.a(maxAdListener, aVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f8997a.G().a(new com.applovin.impl.mediation.c.h(cVar, this.f8997a), r.b.MEDIATION_REWARD);
        }
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, final com.applovin.impl.mediation.a.h hVar, Context context, final com.applovin.impl.mediation.a.g.a aVar) {
        String str2;
        y yVar;
        StringBuilder sb2;
        String str3;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final g gVarA = this.f8997a.ak().a(hVar, hVar.b());
        if (gVarA != null) {
            Activity activityAt = context instanceof Activity ? (Activity) context : this.f8997a.at();
            MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(hVar, str, maxAdFormat);
            if (((Boolean) this.f8997a.a(com.applovin.impl.sdk.c.a.Q)).booleanValue()) {
                this.f8997a.al().a(hVar, activityAt);
            }
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str4) {
                    aVar.a(com.applovin.impl.mediation.a.g.a(hVar, gVarA, str4));
                    gVarA.j();
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str4) {
                    MediationServiceImpl.this.a(str4, hVar, gVarA);
                    aVar.a(com.applovin.impl.mediation.a.g.b(hVar, gVarA, str4));
                    gVarA.j();
                }
            };
            if (hVar.a()) {
                if (!this.f8997a.al().a(hVar)) {
                    if (y.a()) {
                        y yVar2 = this.f8998b;
                        StringBuilder sbA = defpackage.a.a("Skip collecting signal for not-initialized adapter: ");
                        sbA.append(gVarA.d());
                        yVar2.e("MediationService", sbA.toString());
                    }
                    str2 = "Adapter not initialized yet";
                } else if (y.a()) {
                    yVar = this.f8998b;
                    sb2 = new StringBuilder();
                    str3 = "Collecting signal for now-initialized adapter: ";
                    sb2.append(str3);
                    sb2.append(gVarA.d());
                    yVar.b("MediationService", sb2.toString());
                }
            } else if (y.a()) {
                yVar = this.f8998b;
                sb2 = new StringBuilder();
                str3 = "Collecting signal for adapter: ";
                sb2.append(str3);
                sb2.append(gVarA.d());
                yVar.b("MediationService", sb2.toString());
            }
            gVarA.a(maxAdapterParametersImplA, hVar, activityAt, maxSignalCollectionListener);
            return;
        }
        str2 = "Could not load adapter";
        aVar.a(com.applovin.impl.mediation.a.g.a(hVar, str2));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            if (y.a()) {
                this.f8998b.c("MediationService", "Destroying " + maxAd);
            }
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            g gVarM = aVar.m();
            if (gVarM != null) {
                gVarM.j();
                aVar.G();
            }
            this.f8997a.aj().b(aVar.j());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f8999c.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, d.a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0121a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f8997a.u())) {
            y.j("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (!this.f8997a.d()) {
            y.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f8997a.a();
        if (str.length() != 16 && !str.startsWith("test_mode") && !this.f8997a.ax().startsWith("05TMD")) {
            StringBuilder sbA = androidx.activity.result.c.a("Please double-check the ad unit ", str, " for ");
            sbA.append(maxAdFormat.getLabel());
            sbA.append(" : ");
            sbA.append(Log.getStackTraceString(new Throwable("")));
            y.j("MediationService", sbA.toString());
        }
        if (!this.f8997a.a(maxAdFormat)) {
            com.applovin.impl.sdk.utils.o.a((MaxAdRequestListener) interfaceC0121a, str, true, true);
            this.f8997a.ar().a(str, str2, maxAdFormat, aVar, map, map2, context, interfaceC0121a);
            return;
        }
        StringBuilder sbA2 = defpackage.a.a("Ad load failed due to disabled ad format ");
        sbA2.append(maxAdFormat.getLabel());
        y.j("MediationService", sbA2.toString());
        StringBuilder sbA3 = defpackage.a.a("Disabled ad format ");
        sbA3.append(maxAdFormat.getLabel());
        com.applovin.impl.sdk.utils.o.a(interfaceC0121a, str, new MaxErrorImpl(-1, sbA3.toString()));
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (y.a()) {
            this.f8998b.b("MediationService", "Loading " + aVar + "...");
        }
        this.f8997a.X().a(aVar, "WILL_LOAD");
        g gVarA = this.f8997a.ak().a(aVar);
        if (gVarA != null) {
            MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(aVar);
            if (((Boolean) this.f8997a.a(com.applovin.impl.sdk.c.a.R)).booleanValue()) {
                this.f8997a.al().a(aVar, activity);
            }
            com.applovin.impl.mediation.a.a aVarA = aVar.a(gVarA);
            gVarA.a(str, aVarA);
            aVarA.B();
            gVarA.a(str, maxAdapterParametersImplA, aVarA, activity, new a(aVarA, interfaceC0121a));
            return;
        }
        String str2 = "Failed to load " + aVar + ": adapter not loaded";
        y.j("MediationService", str2);
        a(aVar, new MaxErrorImpl(-5001, str2), interfaceC0121a);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objC = this.f8997a.V().c();
            if (objC instanceof com.applovin.impl.mediation.a.a) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) objC, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a(maxError, aVar, false);
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f10) {
        String string = f10 != null ? f10.toString() : "";
        HashMap map = new HashMap(1);
        map.put("{MBR}", string);
        a("mloss", map, aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.f fVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", map, new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (aVar.i().endsWith("cimp")) {
            this.f8997a.X().a(aVar);
            com.applovin.impl.sdk.utils.o.a((MaxAdRevenueListener) interfaceC0121a, (MaxAd) aVar);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8997a.q());
        if (!((Boolean) this.f8997a.a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, aVar);
    }

    public void processRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        this.f8997a.X().a(aVar, "WILL_DISPLAY");
        if (aVar.i().endsWith("mimp")) {
            this.f8997a.X().a(aVar);
            com.applovin.impl.sdk.utils.o.a((MaxAdRevenueListener) interfaceC0121a, (MaxAd) aVar);
        }
        HashMap map = new HashMap(2);
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(((com.applovin.impl.mediation.a.c) aVar).L()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8997a.q());
        if (!((Boolean) this.f8997a.a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, aVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.e eVar, long j10, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (eVar.i().endsWith("vimp")) {
            this.f8997a.X().a(eVar);
            com.applovin.impl.sdk.utils.o.a((MaxAdRevenueListener) interfaceC0121a, (MaxAd) eVar);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.X()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f8997a.q());
        if (!((Boolean) this.f8997a.a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, eVar);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f8999c.set(jSONObject);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final Activity activity, final com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != cVar.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f8997a.V().a(true);
        final g gVarA = a(cVar);
        long jM = cVar.M();
        if (y.a()) {
            y yVar = this.f8998b;
            StringBuilder sbA = defpackage.a.a("Showing ad ");
            sbA.append(cVar.getAdUnitId());
            sbA.append(" with delay of ");
            sbA.append(jM);
            sbA.append("ms...");
            yVar.c("MediationService", sbA.toString());
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(true);
                MediationServiceImpl.this.b(cVar);
                gVarA.a(cVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0121a);
            }
        }, jM);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final ViewGroup viewGroup, final androidx.lifecycle.i iVar, final Activity activity, final com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f8997a.V().a(true);
        final g gVarA = a(cVar);
        long jM = cVar.M();
        if (y.a()) {
            y yVar = this.f8998b;
            StringBuilder sbA = defpackage.a.a("Showing ad ");
            sbA.append(cVar.getAdUnitId());
            sbA.append(" with delay of ");
            sbA.append(jM);
            sbA.append("ms...");
            yVar.c("MediationService", sbA.toString());
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(true);
                MediationServiceImpl.this.b(cVar);
                gVarA.a(cVar, viewGroup, iVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0121a);
            }
        }, jM);
    }
}
