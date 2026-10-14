package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.b.a.k;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.t;
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f9315a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f9317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f9318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0121a f9319e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference<Context> f9320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Queue<com.applovin.impl.mediation.a.a> f9321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f9322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Queue<com.applovin.impl.mediation.a.a> f9323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f9324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f9325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f9326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f9327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f9328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f9329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f9330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.applovin.impl.mediation.a.a f9331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private t f9332u;

    public class a extends com.applovin.impl.sdk.e.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f9338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f9339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f9340e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f9341i;

        private a(com.applovin.impl.mediation.a.a aVar, b bVar) {
            super(e.this.f10535g, e.this.f10534f, e.this.f9316b);
            this.f9337b = this.f10535g + ":" + bVar;
            this.f9338c = SystemClock.elapsedRealtime();
            this.f9339d = aVar;
            this.f9340e = bVar;
            this.f9341i = aVar.H() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(com.applovin.impl.mediation.a.a aVar) {
            if (e.this.f9331t == null) {
                return false;
            }
            if (aVar == null) {
                return true;
            }
            double dE = e.this.f9331t.e();
            double dE2 = aVar.e();
            if (dE < 0.0d || dE2 < 0.0d) {
                return e.this.f9331t.H() < aVar.H();
            }
            return dE > dE2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f9337b;
                StringBuilder sbA = defpackage.a.a("Loading ad ");
                sbA.append(this.f9341i);
                sbA.append(" of ");
                sbA.append(e.this.f9325n);
                sbA.append(" from ");
                sbA.append(this.f9339d.ac());
                sbA.append(" for ");
                sbA.append(e.this.f9317c);
                sbA.append(" ad unit ");
                sbA.append(e.this.f9316b);
                yVar.b(str, sbA.toString());
            }
            b("started to load ad");
            Context context = (Context) e.this.f9320i.get();
            this.f10534f.am().loadThirdPartyMediatedAd(e.this.f9316b, this.f9339d, context instanceof Activity ? (Activity) context : this.f10534f.at(), new com.applovin.impl.mediation.d.a(e.this.f9319e) { // from class: com.applovin.impl.mediation.c.e.a.1
                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str2, MaxError maxError) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f9338c;
                    y unused = a.this.f10536h;
                    if (y.a()) {
                        y yVar2 = a.this.f10536h;
                        String str3 = a.this.f9337b;
                        StringBuilder sbA2 = defpackage.a.a("Ad (");
                        sbA2.append(a.this.f9341i);
                        sbA2.append(") failed to load in ");
                        sbA2.append(jElapsedRealtime);
                        sbA2.append("ms for ");
                        sbA2.append(e.this.f9317c);
                        sbA2.append(" ad unit ");
                        sbA2.append(str2);
                        sbA2.append(" with error: ");
                        sbA2.append(maxError);
                        yVar2.b(str3, sbA2.toString());
                    }
                    a aVar = a.this;
                    StringBuilder sbA3 = defpackage.a.a("failed to load ad: ");
                    sbA3.append(maxError.getCode());
                    aVar.b(sbA3.toString());
                    a aVar2 = a.this;
                    e.this.a(aVar2.f9339d, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                    if (e.this.f9330s.get()) {
                        return;
                    }
                    if (e.this.f9331t != null) {
                        a aVar3 = a.this;
                        if (a.this.a(e.this.b(aVar3.f9340e))) {
                            e eVar = e.this;
                            eVar.a(eVar.f9331t);
                            return;
                        }
                    }
                    a aVar4 = a.this;
                    if ((!e.this.a(aVar4.f9340e)) && e.this.f9329r.get() && e.this.f9328q.get()) {
                        e.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                    }
                }

                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    boolean z10;
                    long jB;
                    com.applovin.impl.mediation.a.a aVar;
                    a.this.b("loaded ad");
                    com.applovin.impl.mediation.a.a aVar2 = (com.applovin.impl.mediation.a.a) maxAd;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f9338c;
                    y unused = a.this.f10536h;
                    if (y.a()) {
                        y yVar2 = a.this.f10536h;
                        String str2 = a.this.f9337b;
                        StringBuilder sbA2 = defpackage.a.a("Ad (");
                        sbA2.append(a.this.f9341i);
                        sbA2.append(") loaded in ");
                        sbA2.append(jElapsedRealtime);
                        sbA2.append("ms for ");
                        sbA2.append(e.this.f9317c);
                        sbA2.append(" ad unit ");
                        sbA2.append(e.this.f9316b);
                        yVar2.b(str2, sbA2.toString());
                    }
                    e.this.a(aVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                    a aVar3 = a.this;
                    e.this.d(aVar3.f9340e);
                    if (b.BIDDING == a.this.f9340e) {
                        z10 = e.this.f9329r.get();
                        jB = aVar2.c();
                    } else {
                        z10 = e.this.f9328q.get();
                        jB = aVar2.b();
                    }
                    if (z10 || jB == 0) {
                        if (a.this.a(aVar2)) {
                            aVar = aVar2;
                            aVar2 = e.this.f9331t;
                        } else {
                            aVar = e.this.f9331t;
                        }
                        e.this.a(aVar2, aVar);
                        return;
                    }
                    e.this.f9331t = aVar2;
                    if (jB < 0) {
                        return;
                    }
                    a aVar4 = a.this;
                    e.this.f9332u = t.a(jB, aVar4.f10534f, new Runnable() { // from class: com.applovin.impl.mediation.c.e.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            e eVar = e.this;
                            eVar.a(eVar.f9331t);
                        }
                    });
                }
            });
        }
    }

    public enum b {
        BIDDING,
        TAG
    }

    public e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, o oVar, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        super("TaskProcessMediationWaterfallV2", oVar, str);
        this.f9321j = new LinkedList();
        this.f9322k = new Object();
        this.f9323l = new LinkedList();
        this.f9324m = new Object();
        this.f9328q = new AtomicBoolean();
        this.f9329r = new AtomicBoolean();
        this.f9330s = new AtomicBoolean();
        this.f9316b = str;
        this.f9317c = maxAdFormat;
        this.f9318d = jSONObject;
        this.f9319e = interfaceC0121a;
        this.f9320i = new WeakReference<>(context);
        JSONArray jSONArrayA = k.a(jSONObject, "ads");
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            com.applovin.impl.mediation.a.a aVarA = com.applovin.impl.mediation.a.a.a(i10, map, JsonUtils.getJSONObject(jSONArrayA, i10, (JSONObject) null), jSONObject, oVar);
            (aVarA.q() ? this.f9323l : this.f9321j).add(aVarA);
        }
        int size = this.f9323l.size() + this.f9321j.size();
        this.f9325n = size;
        this.f9327p = new ArrayList(size);
    }

    private com.applovin.impl.mediation.a.a a(b bVar, boolean z10) {
        com.applovin.impl.mediation.a.a aVarPeek;
        com.applovin.impl.mediation.a.a aVarPeek2;
        if (bVar == b.BIDDING) {
            synchronized (this.f9324m) {
                try {
                    aVarPeek2 = z10 ? this.f9323l.peek() : this.f9323l.poll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVarPeek2;
        }
        synchronized (this.f9322k) {
            try {
                aVarPeek = z10 ? this.f9321j.peek() : this.f9321j.poll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarPeek;
    }

    private void a() {
        a(this.f9321j);
        a(this.f9323l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        a(aVar, (com.applovin.impl.mediation.a.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, com.applovin.impl.mediation.a.a aVar2) {
        if (this.f9330s.compareAndSet(false, true)) {
            b();
            a();
            this.f10534f.aq().a(aVar, aVar2);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9326o;
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = i2.a.a("Waterfall loaded in ", jElapsedRealtime, "ms from ");
                sbA.append(aVar.ac());
                sbA.append(" for ");
                sbA.append(this.f9317c);
                sbA.append(" ad unit ");
                sbA.append(this.f9316b);
                yVar.c(str, sbA.toString());
            }
            aVar.a(new MaxAdWaterfallInfoImpl(aVar, jElapsedRealtime, this.f9327p));
            com.applovin.impl.sdk.utils.o.a((MaxAdListener) this.f9319e, (MaxAd) aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
        this.f9327p.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.ab(), this.f10534f)), aVar.o(), aVar.q(), j10, maxError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        com.applovin.impl.sdk.d.g gVarJ;
        com.applovin.impl.sdk.d.f fVar;
        int i10 = 0;
        if (this.f9330s.compareAndSet(false, true)) {
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
            ArrayList arrayList = new ArrayList(this.f9327p.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f9327p) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
                while (true) {
                    sb2.append("\n");
                    if (i10 >= arrayList.size()) {
                        break;
                    }
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
                }
                ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9326o;
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = i2.a.a("Waterfall failed in ", jElapsedRealtime, "ms for ");
                sbA.append(this.f9317c);
                sbA.append(" ad unit ");
                sbA.append(this.f9316b);
                sbA.append(" with error: ");
                sbA.append(maxError);
                yVar.c(str, sbA.toString());
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f9318d, "waterfall_name", ""), JsonUtils.getString(this.f9318d, "waterfall_test_name", ""), jElapsedRealtime, this.f9327p));
            com.applovin.impl.sdk.utils.o.a(this.f9319e, this.f9316b, maxError);
        }
    }

    private void a(Queue<com.applovin.impl.mediation.a.a> queue) {
        Iterator<com.applovin.impl.mediation.a.a> it = queue.iterator();
        while (it.hasNext()) {
            a(it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(b bVar) {
        com.applovin.impl.mediation.a.a aVarC = c(bVar);
        if (aVarC == null) {
            d(bVar);
            return false;
        }
        this.f10534f.G().a(new a(aVarC, bVar), r.b.MEDIATION_MAIN);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.a.a b(b bVar) {
        return a(bVar, true);
    }

    private void b() {
        t tVar = this.f9332u;
        if (tVar == null) {
            return;
        }
        tVar.d();
        this.f9332u = null;
    }

    private com.applovin.impl.mediation.a.a c(b bVar) {
        return a(bVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        AtomicBoolean atomicBoolean;
        if (b.BIDDING == bVar) {
            atomicBoolean = this.f9328q;
        } else if (b.TAG != bVar) {
            return;
        } else {
            atomicBoolean = this.f9329r;
        }
        atomicBoolean.compareAndSet(false, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9326o = SystemClock.elapsedRealtime();
        if (this.f9318d.optBoolean("is_testing", false) && !this.f10534f.as().a() && f9315a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    w.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", e.this.f10534f.at());
                }
            });
        }
        if (this.f9325n != 0) {
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Starting waterfall for ");
                sbA.append(this.f9317c.getLabel());
                sbA.append(" ad unit ");
                sbA.append(this.f9316b);
                sbA.append(" with ");
                sbA.append(this.f9325n);
                sbA.append(" ad(s)...");
                yVar.b(str, sbA.toString());
            }
            a(b.TAG);
            a(b.BIDDING);
            return;
        }
        if (y.a()) {
            y yVar2 = this.f10536h;
            String str2 = this.f10535g;
            StringBuilder sbA2 = defpackage.a.a("No ads were returned from the server for ");
            sbA2.append(this.f9317c.getLabel());
            sbA2.append(" ad unit ");
            sbA2.append(this.f9316b);
            yVar2.d(str2, sbA2.toString());
        }
        w.a(this.f9316b, this.f9317c, this.f9318d, this.f10534f);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9318d, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j10 <= 0) {
            a(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            com.applovin.impl.sdk.utils.f.a(millis, this.f10534f, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
