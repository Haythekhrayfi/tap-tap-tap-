package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.c.f;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.c.i;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class j<I extends g, O extends i, E extends f> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f4767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4768b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f4769c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f4770d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f4771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f4772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f4775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f4776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4779m;

    public j(I[] iArr, O[] oArr) {
        this.f4771e = iArr;
        this.f4773g = iArr.length;
        for (int i10 = 0; i10 < this.f4773g; i10++) {
            ((I[]) this.f4771e)[i10] = g();
        }
        this.f4772f = oArr;
        this.f4774h = oArr.length;
        for (int i11 = 0; i11 < this.f4774h; i11++) {
            ((O[]) this.f4772f)[i11] = h();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.applovin.exoplayer2.c.j.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                j.this.k();
            }
        };
        this.f4767a = thread;
        thread.start();
    }

    private void b(I i10) {
        i10.a();
        I[] iArr = this.f4771e;
        int i11 = this.f4773g;
        this.f4773g = i11 + 1;
        iArr[i11] = i10;
    }

    private void b(O o10) {
        o10.a();
        O[] oArr = this.f4772f;
        int i10 = this.f4774h;
        this.f4774h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.applovin.exoplayer2.c.f */
    private void i() throws f, E {
        E e10 = this.f4776j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void j() {
        if (m()) {
            this.f4768b.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (l());
    }

    private boolean l() throws InterruptedException {
        E e10;
        synchronized (this.f4768b) {
            while (!this.f4778l && !m()) {
                this.f4768b.wait();
            }
            if (this.f4778l) {
                return false;
            }
            I iRemoveFirst = this.f4769c.removeFirst();
            O[] oArr = this.f4772f;
            int i10 = this.f4774h - 1;
            this.f4774h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f4777k;
            this.f4777k = false;
            if (iRemoveFirst.c()) {
                o10.b(4);
            } else {
                if (iRemoveFirst.b()) {
                    o10.b(Integer.MIN_VALUE);
                }
                try {
                    e10 = (E) a(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e11) {
                    e10 = (E) a(e11);
                }
                if (e10 != null) {
                    synchronized (this.f4768b) {
                        this.f4776j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f4768b) {
                if (this.f4777k) {
                    o10.f();
                } else if (o10.b()) {
                    this.f4779m++;
                    o10.f();
                } else {
                    o10.f4766b = this.f4779m;
                    this.f4779m = 0;
                    this.f4770d.addLast(o10);
                }
                b(iRemoveFirst);
            }
            return true;
        }
    }

    private boolean m() {
        return !this.f4769c.isEmpty() && this.f4774h > 0;
    }

    public abstract E a(I i10, O o10, boolean z10);

    public abstract E a(Throwable th);

    public final void a(int i10) {
        com.applovin.exoplayer2.l.a.b(this.f4773g == this.f4771e.length);
        for (I i11 : this.f4771e) {
            i11.f(i10);
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public final void a(I i10) throws f {
        synchronized (this.f4768b) {
            i();
            com.applovin.exoplayer2.l.a.a(i10 == this.f4775i);
            this.f4769c.addLast(i10);
            j();
            this.f4775i = null;
        }
    }

    public void a(O o10) {
        synchronized (this.f4768b) {
            b(o10);
            j();
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public final void c() {
        synchronized (this.f4768b) {
            this.f4777k = true;
            this.f4779m = 0;
            I i10 = this.f4775i;
            if (i10 != null) {
                b(i10);
                this.f4775i = null;
            }
            while (!this.f4769c.isEmpty()) {
                b(this.f4769c.removeFirst());
            }
            while (!this.f4770d.isEmpty()) {
                this.f4770d.removeFirst().f();
            }
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
        synchronized (this.f4768b) {
            this.f4778l = true;
            this.f4768b.notify();
        }
        try {
            this.f4767a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final I a() throws f {
        I i10;
        synchronized (this.f4768b) {
            i();
            com.applovin.exoplayer2.l.a.b(this.f4775i == null);
            int i11 = this.f4773g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f4771e;
                int i12 = i11 - 1;
                this.f4773g = i12;
                i10 = iArr[i12];
            }
            this.f4775i = i10;
        }
        return i10;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final O b() throws f {
        synchronized (this.f4768b) {
            i();
            if (this.f4770d.isEmpty()) {
                return null;
            }
            return this.f4770d.removeFirst();
        }
    }

    public abstract I g();

    public abstract O h();
}
