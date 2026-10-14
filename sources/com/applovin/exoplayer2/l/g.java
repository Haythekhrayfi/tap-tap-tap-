package com.applovin.exoplayer2.l;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7621b;

    public g() {
        this(d.f7613a);
    }

    public g(d dVar) {
        this.f7620a = dVar;
    }

    public synchronized boolean a() {
        if (this.f7621b) {
            return false;
        }
        this.f7621b = true;
        notifyAll();
        return true;
    }

    public synchronized boolean b() {
        boolean z10;
        z10 = this.f7621b;
        this.f7621b = false;
        return z10;
    }

    public synchronized void c() throws InterruptedException {
        while (!this.f7621b) {
            wait();
        }
    }

    public synchronized void d() {
        boolean z10 = false;
        while (!this.f7621b) {
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

    public synchronized boolean e() {
        return this.f7621b;
    }
}
