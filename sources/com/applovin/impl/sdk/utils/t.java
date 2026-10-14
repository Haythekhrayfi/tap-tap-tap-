package com.applovin.impl.sdk.utils;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f11372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f11375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f11376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11377g = new Object();

    private t(com.applovin.impl.sdk.o oVar, Runnable runnable) {
        this.f11371a = oVar;
        this.f11375e = runnable;
    }

    public static t a(long j10, com.applovin.impl.sdk.o oVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
        t tVar = new t(oVar, runnable);
        tVar.f11373c = System.currentTimeMillis();
        tVar.f11374d = j10;
        try {
            Timer timer = new Timer();
            tVar.f11372b = timer;
            timer.schedule(tVar.e(), j10);
        } catch (OutOfMemoryError e10) {
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().b("Timer", "Failed to create timer due to OOM error", e10);
            }
        }
        return tVar;
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.t.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    t.this.f11375e.run();
                    synchronized (t.this.f11377g) {
                        t.this.f11372b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (t.this.f11371a != null) {
                            t.this.f11371a.F();
                            if (com.applovin.impl.sdk.y.a()) {
                                t.this.f11371a.F();
                                if (com.applovin.impl.sdk.y.a()) {
                                    t.this.f11371a.F().b("Timer", "Encountered error while executing timed task", th);
                                }
                            }
                        }
                    } finally {
                        synchronized (t.this.f11377g) {
                            t.this.f11372b = null;
                        }
                    }
                }
            }
        };
    }

    public long a() {
        if (this.f11372b == null) {
            return this.f11374d - this.f11376f;
        }
        return this.f11374d - (System.currentTimeMillis() - this.f11373c);
    }

    public void b() {
        synchronized (this.f11377g) {
            Timer timer = this.f11372b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f11376f = Math.max(1L, System.currentTimeMillis() - this.f11373c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.o oVar = this.f11371a;
                        if (oVar != null) {
                            oVar.F();
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f11371a.F();
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f11371a.F().b("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        this.f11372b = null;
                        throw th2;
                    }
                }
                this.f11372b = null;
            }
        }
    }

    public void c() {
        synchronized (this.f11377g) {
            long j10 = this.f11376f;
            if (j10 > 0) {
                try {
                    long j11 = this.f11374d - j10;
                    this.f11374d = j11;
                    if (j11 < 0) {
                        this.f11374d = 0L;
                    }
                    Timer timer = new Timer();
                    this.f11372b = timer;
                    timer.schedule(e(), this.f11374d);
                    this.f11373c = System.currentTimeMillis();
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.o oVar = this.f11371a;
                        if (oVar != null) {
                            oVar.F();
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f11371a.F();
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f11371a.F().b("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        this.f11376f = 0L;
                        throw th2;
                    }
                }
                this.f11376f = 0L;
            }
        }
    }

    public void d() {
        synchronized (this.f11377g) {
            Timer timer = this.f11372b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f11372b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.o oVar = this.f11371a;
                        if (oVar != null) {
                            oVar.F();
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f11371a.F();
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f11371a.F().b("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f11372b = null;
                    } catch (Throwable th2) {
                        this.f11372b = null;
                        this.f11376f = 0L;
                        throw th2;
                    }
                }
                this.f11376f = 0L;
            }
        }
    }
}
