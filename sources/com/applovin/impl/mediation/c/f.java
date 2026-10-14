package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.b.a.k;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f9347a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f9349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f9350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.a> f9351e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0121a f9352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference<Context> f9353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f9355l;

    public class a extends com.applovin.impl.sdk.e.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f9360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f9362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.a> f9363e;

        public a(int i10, List<com.applovin.impl.mediation.a.a> list) {
            super(f.this.f10535g, f.this.f10534f, f.this.f9348b);
            this.f9360b = SystemClock.elapsedRealtime();
            this.f9361c = i10;
            this.f9362d = list.get(i10);
            this.f9363e = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            f.this.f9355l.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.ab(), this.f10534f)), aVar.o(), aVar.q(), j10, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Loading ad ");
                sbA.append(this.f9361c + 1);
                sbA.append(" of ");
                sbA.append(this.f9363e.size());
                sbA.append(" from ");
                sbA.append(this.f9362d.ac());
                sbA.append(" for ");
                sbA.append(f.this.f9349c.getLabel());
                sbA.append(" ad unit ");
                sbA.append(f.this.f9348b);
                yVar.b(str, sbA.toString());
            }
            b("started to load ad");
            Context context = (Context) f.this.f9353j.get();
            this.f10534f.am().loadThirdPartyMediatedAd(f.this.f9348b, this.f9362d, context instanceof Activity ? (Activity) context : this.f10534f.at(), new com.applovin.impl.mediation.d.a(f.this.f9352i) { // from class: com.applovin.impl.mediation.c.f.a.1
                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str2, MaxError maxError) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f9360b;
                    y unused = a.this.f10536h;
                    if (y.a()) {
                        y yVar2 = a.this.f10536h;
                        String str3 = a.this.f10535g;
                        StringBuilder sbA2 = i2.a.a("Ad failed to load in ", jElapsedRealtime, " ms for ");
                        sbA2.append(f.this.f9349c.getLabel());
                        sbA2.append(" ad unit ");
                        sbA2.append(f.this.f9348b);
                        sbA2.append(" with error: ");
                        sbA2.append(maxError);
                        yVar2.b(str3, sbA2.toString());
                    }
                    a aVar = a.this;
                    StringBuilder sbA3 = defpackage.a.a("failed to load ad: ");
                    sbA3.append(maxError.getCode());
                    aVar.b(sbA3.toString());
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f9362d, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                    if (a.this.f9361c >= a.this.f9363e.size() - 1) {
                        f.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                    } else {
                        a aVar3 = a.this;
                        a.this.f10534f.G().a(f.this.new a(aVar3.f9361c + 1, a.this.f9363e), com.applovin.impl.mediation.d.c.a(f.this.f9349c));
                    }
                }

                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.b("loaded ad");
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f9360b;
                    y unused = a.this.f10536h;
                    if (y.a()) {
                        y yVar2 = a.this.f10536h;
                        String str2 = a.this.f10535g;
                        StringBuilder sbA2 = i2.a.a("Ad loaded in ", jElapsedRealtime, "ms for ");
                        sbA2.append(f.this.f9349c.getLabel());
                        sbA2.append(" ad unit ");
                        sbA2.append(f.this.f9348b);
                        yVar2.b(str2, sbA2.toString());
                    }
                    com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                    int i10 = a.this.f9361c;
                    while (true) {
                        i10++;
                        if (i10 >= a.this.f9363e.size()) {
                            f.this.a(aVar);
                            return;
                        } else {
                            a aVar2 = a.this;
                            aVar2.a((com.applovin.impl.mediation.a.a) aVar2.f9363e.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                        }
                    }
                }
            });
        }
    }

    public f(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, o oVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        super("TaskProcessMediationWaterfall", oVar, str);
        this.f9348b = str;
        this.f9349c = maxAdFormat;
        this.f9350d = jSONObject;
        this.f9352i = interfaceC0121a;
        this.f9353j = new WeakReference<>(context);
        JSONArray jSONArrayA = k.a(jSONObject, "ads");
        this.f9351e = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            this.f9351e.add(com.applovin.impl.mediation.a.a.a(i10, map, JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null), jSONObject, oVar));
        }
        this.f9355l = new ArrayList(this.f9351e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f10534f.aq().a(aVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9354k;
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = i2.a.a("Waterfall loaded in ", jElapsedRealtime, "ms from ");
            sbA.append(aVar.ac());
            sbA.append(" for ");
            sbA.append(this.f9349c.getLabel());
            sbA.append(" ad unit ");
            sbA.append(this.f9348b);
            yVar.c(str, sbA.toString());
        }
        aVar.a(new MaxAdWaterfallInfoImpl(aVar, jElapsedRealtime, this.f9355l));
        com.applovin.impl.sdk.utils.o.a((MaxAdListener) this.f9352i, (MaxAd) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        com.applovin.impl.sdk.d.g gVarJ;
        com.applovin.impl.sdk.d.f fVar;
        if (maxError.getCode() == 204) {
            gVarJ = this.f10534f.J();
            fVar = com.applovin.impl.sdk.d.f.f10480r;
        } else if (maxError.getCode() == -5001) {
            gVarJ = this.f10534f.J();
            fVar = com.applovin.impl.sdk.d.f.f10481s;
        } else {
            gVarJ = this.f10534f.J();
            fVar = com.applovin.impl.sdk.d.f.f10482t;
        }
        gVarJ.a(fVar);
        ArrayList arrayList = new ArrayList(this.f9355l.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f9355l) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n");
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n");
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9354k;
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = i2.a.a("Waterfall failed in ", jElapsedRealtime, "ms for ");
            sbA.append(this.f9349c.getLabel());
            sbA.append(" ad unit ");
            sbA.append(this.f9348b);
            sbA.append(" with error: ");
            sbA.append(maxError);
            yVar.c(str, sbA.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f9350d, "waterfall_name", ""), JsonUtils.getString(this.f9350d, "waterfall_test_name", ""), jElapsedRealtime, this.f9355l));
        com.applovin.impl.sdk.utils.o.a(this.f9352i, this.f9348b, maxError);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9354k = SystemClock.elapsedRealtime();
        if (this.f9350d.optBoolean("is_testing", false) && !this.f10534f.as().a() && f9347a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.f.1
                @Override // java.lang.Runnable
                public void run() {
                    w.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", f.this.f10534f.at());
                }
            });
        }
        if (this.f9351e.size() > 0) {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Starting waterfall for ");
                sbA.append(this.f9349c.getLabel());
                sbA.append(" ad unit ");
                sbA.append(this.f9348b);
                sbA.append(" with ");
                sbA.append(this.f9351e.size());
                sbA.append(" ad(s)...");
                yVar.b(str, sbA.toString());
            }
            this.f10534f.G().a((com.applovin.impl.sdk.e.d) new a(0, this.f9351e));
            return;
        }
        if (y.a()) {
            y yVar2 = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("No ads were returned from the server for ");
            sbA2.append(this.f9349c.getLabel());
            sbA2.append(" ad unit ");
            sbA2.append(this.f9348b);
            yVar2.d(str2, sbA2.toString());
        }
        w.a(this.f9348b, this.f9349c, this.f9350d, this.f10534f);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9350d, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j10 <= 0) {
            a(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.f.2
            @Override // java.lang.Runnable
            public void run() {
                f.this.a(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            com.applovin.impl.sdk.utils.f.a(millis, this.f10534f, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
