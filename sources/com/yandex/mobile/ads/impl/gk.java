package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21087a;

    public gk() {
        this(0);
    }

    public gk(int i10) {
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f21087a) {
            wait();
        }
    }

    public final synchronized boolean a(long j10) throws InterruptedException {
        try {
            if (j10 <= 0) {
                return this.f21087a;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = j10 + jElapsedRealtime;
            if (j11 < jElapsedRealtime) {
                a();
            } else {
                while (!this.f21087a && jElapsedRealtime < j11) {
                    wait(j11 - jElapsedRealtime);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
            return this.f21087a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f21087a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f21087a = false;
    }

    public final synchronized boolean d() {
        return this.f21087a;
    }

    public final synchronized boolean e() {
        if (this.f21087a) {
            return false;
        }
        this.f21087a = true;
        notifyAll();
        return true;
    }
}
