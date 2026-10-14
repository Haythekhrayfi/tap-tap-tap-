package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f11406a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f11407b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11409d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f11412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f11413h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f11408c = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11410e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f11411f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, a> f11414i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f11415j = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f11421a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11422b;

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f11422b;
            aVar.f11422b = i10 + 1;
            return i10;
        }

        public long a() {
            return this.f11421a;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f11422b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && a() == aVar.a() && b() == aVar.b();
        }

        public int hashCode() {
            long jA = a();
            return b() + ((((int) (jA ^ (jA >>> 32))) + 59) * 59);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=");
            sbA.append(a());
            sbA.append(", attemptCount=");
            sbA.append(b());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public v(o oVar) {
        this.f11407b = oVar;
    }

    public void a(final Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.f11408c.compareAndSet(false, true)) {
            this.f11413h = obj;
            this.f11409d = System.currentTimeMillis();
            this.f11407b.F();
            if (y.a()) {
                y yVarF = this.f11407b.F();
                StringBuilder sbA = defpackage.a.a("Setting fullscreen ad displayed: ");
                sbA.append(this.f11409d);
                yVarF.b("FullScreenAdTracker", sbA.toString());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long jLongValue = ((Long) this.f11407b.a(com.applovin.impl.sdk.c.b.cy)).longValue();
            if (jLongValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.v.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (v.this.f11408c.get() && System.currentTimeMillis() - v.this.f11409d >= jLongValue) {
                            v.this.f11407b.F();
                            if (y.a()) {
                                v.this.f11407b.F().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            v.this.b(obj);
                        }
                    }
                }, jLongValue);
            }
        }
    }

    public void a(String str) {
        synchronized (this.f11415j) {
            a aVar = this.f11414i.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f11414i.put(str, aVar);
            }
            aVar.f11421a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public void a(boolean z10) {
        synchronized (this.f11410e) {
            this.f11411f.set(z10);
            if (z10) {
                this.f11412g = System.currentTimeMillis();
                this.f11407b.F();
                if (y.a()) {
                    this.f11407b.F().b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f11412g);
                }
                final long jLongValue = ((Long) this.f11407b.a(com.applovin.impl.sdk.c.b.cx)).longValue();
                if (jLongValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.v.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (v.this.a() && System.currentTimeMillis() - v.this.f11412g >= jLongValue) {
                                v.this.f11407b.F();
                                if (y.a()) {
                                    v.this.f11407b.F().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                v.this.f11411f.set(false);
                            }
                        }
                    }, jLongValue);
                }
            } else {
                this.f11412g = 0L;
                this.f11407b.F();
                if (y.a()) {
                    this.f11407b.F().b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public boolean a() {
        return this.f11411f.get();
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f11415j) {
            aVar = this.f11414i.get(str);
            if (aVar == null) {
                aVar = f11406a;
            }
        }
        return aVar;
    }

    public void b(Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.f11408c.compareAndSet(true, false)) {
            this.f11413h = null;
            this.f11407b.F();
            if (y.a()) {
                y yVarF = this.f11407b.F();
                StringBuilder sbA = defpackage.a.a("Setting fullscreen ad hidden: ");
                sbA.append(System.currentTimeMillis());
                yVarF.b("FullScreenAdTracker", sbA.toString());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public boolean b() {
        return this.f11408c.get();
    }

    public Object c() {
        return this.f11413h;
    }

    public void c(String str) {
        synchronized (this.f11415j) {
            this.f11414i.remove(str);
        }
    }
}
