package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class e implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.t f10489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10490b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10491c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f10493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference<a> f10494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10495g;

    public interface a {
        void onAdRefresh();
    }

    public e(o oVar, a aVar) {
        this.f10494f = new WeakReference<>(aVar);
        this.f10493e = oVar;
    }

    private void i() {
        synchronized (this.f10490b) {
            com.applovin.impl.sdk.utils.t tVar = this.f10489a;
            if (tVar != null) {
                tVar.b();
            } else {
                this.f10493e.F();
                if (y.a()) {
                    this.f10493e.F().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f10491c.set(true);
            }
        }
    }

    private void j() {
        synchronized (this.f10490b) {
            com.applovin.impl.sdk.utils.t tVar = this.f10489a;
            if (tVar != null) {
                tVar.c();
            } else {
                this.f10491c.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.f10490b) {
            this.f10489a = null;
            if (!((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10333r)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void l() {
        if (((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10332q)).booleanValue()) {
            i();
        }
    }

    private void m() {
        if (((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10332q)).booleanValue()) {
            synchronized (this.f10490b) {
                if (this.f10492d) {
                    this.f10493e.F();
                    if (y.a()) {
                        this.f10493e.F().b("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f10493e.U().isApplicationPaused()) {
                    this.f10493e.F();
                    if (y.a()) {
                        this.f10493e.F().b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    com.applovin.impl.sdk.utils.t tVar = this.f10489a;
                    if (tVar != null) {
                        tVar.c();
                    }
                }
            }
        }
    }

    public void a(long j10) {
        synchronized (this.f10490b) {
            c();
            this.f10495g = j10;
            this.f10489a = com.applovin.impl.sdk.utils.t.a(j10, this.f10493e, new Runnable() { // from class: com.applovin.impl.sdk.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.k();
                    a aVar = (a) e.this.f10494f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10333r)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10332q)).booleanValue() && (this.f10493e.V().b() || this.f10493e.U().isApplicationPaused())) {
                this.f10489a.b();
            }
            if (this.f10491c.compareAndSet(true, false) && ((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10334s)).booleanValue()) {
                this.f10493e.F();
                if (y.a()) {
                    this.f10493e.F().b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f10489a.b();
            }
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f10490b) {
            z10 = this.f10489a != null;
        }
        return z10;
    }

    public long b() {
        long jA;
        synchronized (this.f10490b) {
            com.applovin.impl.sdk.utils.t tVar = this.f10489a;
            jA = tVar != null ? tVar.a() : -1L;
        }
        return jA;
    }

    public void c() {
        synchronized (this.f10490b) {
            com.applovin.impl.sdk.utils.t tVar = this.f10489a;
            if (tVar != null) {
                tVar.d();
                k();
            }
        }
    }

    public void d() {
        synchronized (this.f10490b) {
            i();
            this.f10492d = true;
        }
    }

    public void e() {
        synchronized (this.f10490b) {
            j();
            this.f10492d = false;
        }
    }

    public boolean f() {
        return this.f10492d;
    }

    public void g() {
        if (((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10331p)).booleanValue()) {
            i();
        }
    }

    public void h() {
        a aVar;
        if (((Boolean) this.f10493e.a(com.applovin.impl.sdk.c.a.f10331p)).booleanValue()) {
            synchronized (this.f10490b) {
                if (this.f10492d) {
                    this.f10493e.F();
                    if (y.a()) {
                        this.f10493e.F().b("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f10493e.V().b()) {
                    this.f10493e.F();
                    if (y.a()) {
                        this.f10493e.F().b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                boolean z10 = false;
                if (this.f10489a != null) {
                    long jB = this.f10495g - b();
                    long jLongValue = ((Long) this.f10493e.a(com.applovin.impl.sdk.c.a.f10330o)).longValue();
                    if (jLongValue < 0 || jB <= jLongValue) {
                        this.f10489a.c();
                    } else {
                        c();
                        z10 = true;
                    }
                }
                if (!z10 || (aVar = this.f10494f.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            g();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m();
        }
    }
}
