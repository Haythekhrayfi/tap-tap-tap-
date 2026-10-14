package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.an;
import com.yandex.mobile.ads.impl.bn;
import com.yandex.mobile.ads.impl.zm;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o11<I extends an, O extends bn, E extends zm> implements xm<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f23671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23672b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f23673c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f23674d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f23675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f23676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f23679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j51 f23680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23682l;

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o11 f23683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t11 t11Var) {
            super("ExoPlayer:SimpleDecoder");
            this.f23683b = t11Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            o11.a(this.f23683b);
        }
    }

    public o11(I[] iArr, O[] oArr) {
        this.f23675e = iArr;
        this.f23677g = iArr.length;
        for (int i10 = 0; i10 < this.f23677g; i10++) {
            this.f23675e[i10] = c();
        }
        this.f23676f = oArr;
        this.f23678h = oArr.length;
        for (int i11 = 0; i11 < this.f23678h; i11++) {
            ((O[]) this.f23676f)[i11] = d();
        }
        a aVar = new a((t11) this);
        this.f23671a = aVar;
        aVar.start();
    }

    public static void a(o11 o11Var) {
        Objects.requireNonNull(o11Var);
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (o11Var.e());
    }

    private boolean e() throws InterruptedException {
        j51 j51Var;
        j51 j51VarA;
        synchronized (this.f23672b) {
            while (!this.f23682l) {
                if (!this.f23673c.isEmpty() && this.f23678h > 0) {
                    break;
                }
                this.f23672b.wait();
            }
            if (this.f23682l) {
                return false;
            }
            I iRemoveFirst = this.f23673c.removeFirst();
            O[] oArr = this.f23676f;
            int i10 = this.f23678h - 1;
            this.f23678h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f23681k;
            this.f23681k = false;
            if (iRemoveFirst.c(4)) {
                o10.b(4);
            } else {
                if (iRemoveFirst.c(Integer.MIN_VALUE)) {
                    o10.b(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.c(134217728)) {
                    o10.b(134217728);
                }
                try {
                    j51VarA = a(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e10) {
                    j51Var = new j51("Unexpected decode error", e10);
                    j51VarA = j51Var;
                } catch (RuntimeException e11) {
                    j51Var = new j51("Unexpected decode error", e11);
                    j51VarA = j51Var;
                }
                if (j51VarA != null) {
                    synchronized (this.f23672b) {
                        this.f23680j = j51VarA;
                    }
                    return false;
                }
            }
            synchronized (this.f23672b) {
                if (this.f23681k || o10.c(Integer.MIN_VALUE)) {
                    o10.h();
                } else {
                    this.f23674d.addLast(o10);
                }
                iRemoveFirst.b();
                I[] iArr = this.f23675e;
                int i11 = this.f23677g;
                this.f23677g = i11 + 1;
                iArr[i11] = iRemoveFirst;
            }
            return true;
        }
    }

    public abstract j51 a(an anVar, bn bnVar, boolean z10);

    @Override // com.yandex.mobile.ads.impl.xm
    public final Object a() throws zm {
        O oRemoveFirst;
        synchronized (this.f23672b) {
            j51 j51Var = this.f23680j;
            if (j51Var != null) {
                throw j51Var;
            }
            oRemoveFirst = this.f23674d.isEmpty() ? null : this.f23674d.removeFirst();
        }
        return oRemoveFirst;
    }

    public final void a(O o10) {
        synchronized (this.f23672b) {
            o10.b();
            O[] oArr = this.f23676f;
            int i10 = this.f23678h;
            this.f23678h = i10 + 1;
            oArr[i10] = o10;
            if (!this.f23673c.isEmpty() && this.f23678h > 0) {
                this.f23672b.notify();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void a(l51 l51Var) throws zm {
        synchronized (this.f23672b) {
            j51 j51Var = this.f23680j;
            if (j51Var != null) {
                throw j51Var;
            }
            boolean z10 = true;
            pa.a(l51Var == this.f23679i);
            this.f23673c.addLast(l51Var);
            if (this.f23673c.isEmpty() || this.f23678h <= 0) {
                z10 = false;
            }
            if (z10) {
                this.f23672b.notify();
            }
            this.f23679i = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final Object b() throws zm {
        I i10;
        synchronized (this.f23672b) {
            j51 j51Var = this.f23680j;
            if (j51Var != null) {
                throw j51Var;
            }
            pa.b(this.f23679i == null);
            int i11 = this.f23677g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f23675e;
                int i12 = i11 - 1;
                this.f23677g = i12;
                i10 = iArr[i12];
            }
            this.f23679i = i10;
        }
        return i10;
    }

    public abstract l51 c();

    public abstract O d();

    public final void f() {
        pa.b(this.f23677g == this.f23675e.length);
        for (I i10 : this.f23675e) {
            i10.e(1024);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void flush() {
        synchronized (this.f23672b) {
            this.f23681k = true;
            I i10 = this.f23679i;
            if (i10 != null) {
                i10.b();
                I[] iArr = this.f23675e;
                int i11 = this.f23677g;
                this.f23677g = i11 + 1;
                iArr[i11] = i10;
                this.f23679i = null;
            }
            while (!this.f23673c.isEmpty()) {
                I iRemoveFirst = this.f23673c.removeFirst();
                iRemoveFirst.b();
                I[] iArr2 = this.f23675e;
                int i12 = this.f23677g;
                this.f23677g = i12 + 1;
                iArr2[i12] = iRemoveFirst;
            }
            while (!this.f23674d.isEmpty()) {
                this.f23674d.removeFirst().h();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void release() {
        synchronized (this.f23672b) {
            this.f23682l = true;
            this.f23672b.notify();
        }
        try {
            this.f23671a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
