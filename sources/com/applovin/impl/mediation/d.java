package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, c> f9368b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9369c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f9370d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9371e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Integer> f9372f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9373g = new Object();

    public enum a {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f9389g;

        a(String str) {
            this.f9389g = str;
        }

        public String a() {
            return this.f9389g;
        }
    }

    public static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0121a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f9390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Context> f9391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f9392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f9393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f9394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map<String, Object> f9395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map<String, Object> f9396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map<String, Object> f9397h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f9398i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9399j;

        private b(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, c cVar, MaxAdFormat maxAdFormat, long j10, d dVar, o oVar, Context context) {
            this.f9390a = oVar;
            this.f9391b = new WeakReference<>(context);
            this.f9392c = dVar;
            this.f9393d = cVar;
            this.f9394e = maxAdFormat;
            this.f9396g = map2;
            this.f9395f = map;
            this.f9397h = map3;
            this.f9399j = j10;
            this.f9398i = CollectionUtils.getBoolean(map2, AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES) ? -1 : (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? Math.min(2, ((Integer) oVar.a(com.applovin.impl.sdk.c.a.N)).intValue()) : ((Integer) oVar.a(com.applovin.impl.sdk.c.a.N)).intValue();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f9392c.b(str);
            if (this.f9390a.a(com.applovin.impl.sdk.c.a.O, this.f9394e) && this.f9393d.f9405c < this.f9398i) {
                c.e(this.f9393d);
                final int iPow = (int) Math.pow(2.0d, this.f9393d.f9405c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f9396g.put("retry_delay_sec", Integer.valueOf(iPow));
                        b.this.f9396g.put("retry_attempt", Integer.valueOf(b.this.f9393d.f9405c));
                        Context contextAu = (Context) b.this.f9391b.get();
                        if (contextAu == null) {
                            o unused = b.this.f9390a;
                            contextAu = o.au();
                        }
                        b.this.f9397h.put("art", a.EXPONENTIAL_RETRY.a());
                        b.this.f9397h.put("era", Integer.valueOf(b.this.f9393d.f9405c));
                        b.this.f9392c.a(str, b.this.f9394e, b.this.f9395f, b.this.f9396g, b.this.f9397h, contextAu, b.this);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f9393d.f9405c = 0;
            this.f9393d.f9404b.set(false);
            if (this.f9393d.f9406d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f9393d.f9403a);
                maxErrorImpl.setRequestLatencyMillis(SystemClock.elapsedRealtime() - this.f9399j);
                com.applovin.impl.sdk.utils.o.a(this.f9393d.f9406d, str, maxError);
                this.f9393d.f9406d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            aVar.a(this.f9393d.f9403a);
            aVar.a(SystemClock.elapsedRealtime() - this.f9399j);
            this.f9392c.e(maxAd.getAdUnitId());
            this.f9393d.f9405c = 0;
            if (this.f9393d.f9406d != null) {
                aVar.m().e().a(this.f9393d.f9406d);
                this.f9393d.f9406d.onAdLoaded(aVar);
                if (aVar.i().endsWith("load")) {
                    this.f9393d.f9406d.onAdRevenuePaid(aVar);
                }
                com.applovin.impl.mediation.ads.a.InterfaceC0121a unused = this.f9393d.f9406d;
                this.f9393d.f9406d = null;
                if ((this.f9390a.b(com.applovin.impl.sdk.c.a.M).contains(maxAd.getAdUnitId()) || this.f9390a.a(com.applovin.impl.sdk.c.a.L, maxAd.getFormat())) && !this.f9390a.as().a() && !this.f9390a.as().b()) {
                    Context contextAu = this.f9391b.get();
                    if (contextAu == null) {
                        contextAu = o.au();
                    }
                    this.f9399j = SystemClock.elapsedRealtime();
                    this.f9397h.put("art", a.SEQUENTIAL_OR_PRECACHE.a());
                    this.f9392c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9395f, this.f9396g, this.f9397h, contextAu, this);
                    return;
                }
            } else {
                this.f9392c.a(aVar);
            }
            this.f9393d.f9404b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0121a f9406d;

        private c(String str) {
            this.f9404b = new AtomicBoolean();
            this.f9403a = str;
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f9405c;
            cVar.f9405c = i10 + 1;
            return i10;
        }
    }

    public d(o oVar) {
        this.f9367a = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f9371e) {
            if (this.f9370d.containsKey(aVar.getAdUnitId())) {
                y.j("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f9370d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final MaxAdFormat maxAdFormat, final Map<String, Object> map, final Map<String, Object> map2, final Map<String, Object> map3, final Context context, final com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        this.f9367a.G().a(new com.applovin.impl.mediation.c.b(str, maxAdFormat, map, context, this.f9367a, new com.applovin.impl.mediation.c.b.a() { // from class: com.applovin.impl.mediation.d.1
            @Override // com.applovin.impl.mediation.c.b.a
            public void a(JSONArray jSONArray) {
                map3.put("calfc", Integer.valueOf(d.this.c(str)));
                d.this.f9367a.G().a((com.applovin.impl.sdk.e.d) new com.applovin.impl.mediation.c.c(str, maxAdFormat, map, map2, map3, jSONArray, context, d.this.f9367a, interfaceC0121a));
            }
        }), com.applovin.impl.mediation.d.c.a(maxAdFormat));
    }

    private c b(String str, String str2) {
        c cVar;
        synchronized (this.f9369c) {
            String strC = c(str, str2);
            cVar = this.f9368b.get(strC);
            if (cVar == null) {
                cVar = new c(str2);
                this.f9368b.put(strC, cVar);
            }
        }
        return cVar;
    }

    private String c(String str, String str2) {
        StringBuilder sbA = defpackage.a.a(str);
        sbA.append(str2 != null ? i.f.a("-", str2) : "");
        return sbA.toString();
    }

    private com.applovin.impl.mediation.a.a d(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f9371e) {
            aVar = this.f9370d.get(str);
            this.f9370d.remove(str);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        synchronized (this.f9373g) {
            this.f9367a.F();
            if (y.a()) {
                this.f9367a.F().b("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f9372f.remove(str);
        }
    }

    public void a(String str, String str2) {
        synchronized (this.f9369c) {
            this.f9368b.remove(c(str, str2));
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        com.applovin.impl.mediation.a.a aVarD = (this.f9367a.as().b() || w.g(o.au())) ? null : d(str);
        if (aVarD != null) {
            aVarD.a(str2);
            aVarD.m().e().a(interfaceC0121a);
            interfaceC0121a.onAdLoaded(aVarD);
            if (aVarD.i().endsWith("load")) {
                interfaceC0121a.onAdRevenuePaid(aVarD);
            }
        }
        c cVarB = b(str, str2);
        if (cVarB.f9404b.compareAndSet(false, true)) {
            if (aVarD == null) {
                cVarB.f9406d = interfaceC0121a;
            }
            Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            mapSynchronizedMap.put("art", aVar.a());
            if (StringUtils.isValidString(str2)) {
                mapSynchronizedMap.put("alt", str2);
            }
            a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarB, maxAdFormat, SystemClock.elapsedRealtime(), this, this.f9367a, context));
            return;
        }
        if (cVarB.f9406d != null && cVarB.f9406d != interfaceC0121a) {
            y.h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        cVarB.f9406d = interfaceC0121a;
    }

    public boolean a(String str) {
        boolean z10;
        synchronized (this.f9371e) {
            z10 = this.f9370d.get(str) != null;
        }
        return z10;
    }

    public void b(String str) {
        synchronized (this.f9373g) {
            this.f9367a.F();
            if (y.a()) {
                this.f9367a.F().b("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = this.f9372f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f9372f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public int c(String str) {
        int iIntValue;
        synchronized (this.f9373g) {
            Integer num = this.f9372f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }
}
