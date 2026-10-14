package com.applovin.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba f4275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f4277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f4278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4280i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4281j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4285n;

    public interface a {
        void a(ao aoVar);
    }

    public interface b {
        void a(int i10, Object obj) throws p;
    }

    public ao(a aVar, b bVar, ba baVar, int i10, com.applovin.exoplayer2.l.d dVar, Looper looper) {
        this.f4273b = aVar;
        this.f4272a = bVar;
        this.f4275d = baVar;
        this.f4278g = looper;
        this.f4274c = dVar;
        this.f4279h = i10;
    }

    public ao a(int i10) {
        com.applovin.exoplayer2.l.a.b(!this.f4282k);
        this.f4276e = i10;
        return this;
    }

    public ao a(Object obj) {
        com.applovin.exoplayer2.l.a.b(!this.f4282k);
        this.f4277f = obj;
        return this;
    }

    public ba a() {
        return this.f4275d;
    }

    public synchronized void a(boolean z10) {
        this.f4283l = z10 | this.f4283l;
        this.f4284m = true;
        notifyAll();
    }

    public synchronized boolean a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        com.applovin.exoplayer2.l.a.b(this.f4282k);
        com.applovin.exoplayer2.l.a.b(this.f4278g.getThread() != Thread.currentThread());
        long jA = this.f4274c.a() + j10;
        while (true) {
            z10 = this.f4284m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f4274c.c();
            wait(j10);
            j10 = jA - this.f4274c.a();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f4283l;
    }

    public b b() {
        return this.f4272a;
    }

    public int c() {
        return this.f4276e;
    }

    public Object d() {
        return this.f4277f;
    }

    public Looper e() {
        return this.f4278g;
    }

    public long f() {
        return this.f4280i;
    }

    public int g() {
        return this.f4279h;
    }

    public boolean h() {
        return this.f4281j;
    }

    public ao i() {
        com.applovin.exoplayer2.l.a.b(!this.f4282k);
        if (this.f4280i == -9223372036854775807L) {
            com.applovin.exoplayer2.l.a.a(this.f4281j);
        }
        this.f4282k = true;
        this.f4273b.a(this);
        return this;
    }

    public synchronized boolean j() {
        return this.f4285n;
    }
}
