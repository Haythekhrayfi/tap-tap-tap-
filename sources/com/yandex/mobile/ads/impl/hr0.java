package com.yandex.mobile.ads.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f21497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ki f21498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f21500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Looper f21501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21504i;

    public interface a {
    }

    public interface b {
        void a(int i10, Object obj) throws ns;
    }

    public hr0(a aVar, b bVar, v61 v61Var, int i10, ki kiVar, Looper looper) {
        this.f21497b = aVar;
        this.f21496a = bVar;
        this.f21501f = looper;
        this.f21498c = kiVar;
    }

    public final Looper a() {
        return this.f21501f;
    }

    public final hr0 a(int i10) {
        pa.b(!this.f21502g);
        this.f21499d = i10;
        return this;
    }

    public final hr0 a(Object obj) {
        pa.b(!this.f21502g);
        this.f21500e = obj;
        return this;
    }

    public final synchronized void a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        pa.b(this.f21502g);
        pa.b(this.f21501f.getThread() != Thread.currentThread());
        long jC = this.f21498c.c() + j10;
        while (true) {
            z10 = this.f21504i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f21498c.b();
            wait(j10);
            j10 = jC - this.f21498c.c();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void a(boolean z10) {
        this.f21503h = z10 | this.f21503h;
        this.f21504i = true;
        notifyAll();
    }

    public final Object b() {
        return this.f21500e;
    }

    public final b c() {
        return this.f21496a;
    }

    public final int d() {
        return this.f21499d;
    }

    public final hr0 e() {
        pa.b(!this.f21502g);
        this.f21502g = true;
        ((ts) this.f21497b).b(this);
        return this;
    }
}
