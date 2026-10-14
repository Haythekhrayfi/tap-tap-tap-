package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f7415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a[] f7416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a[] f7420h;

    public m(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public m(boolean z10, int i10, int i11) {
        com.applovin.exoplayer2.l.a.a(i10 > 0);
        com.applovin.exoplayer2.l.a.a(i11 >= 0);
        this.f7413a = z10;
        this.f7414b = i10;
        this.f7419g = i11;
        this.f7420h = new a[i11 + 100];
        if (i11 > 0) {
            this.f7415c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f7420h[i12] = new a(this.f7415c, i12 * i10);
            }
        } else {
            this.f7415c = null;
        }
        this.f7416d = new a[1];
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized a a() {
        a aVar;
        this.f7418f++;
        int i10 = this.f7419g;
        if (i10 > 0) {
            a[] aVarArr = this.f7420h;
            int i11 = i10 - 1;
            this.f7419g = i11;
            aVar = (a) com.applovin.exoplayer2.l.a.b(aVarArr[i11]);
            this.f7420h[this.f7419g] = null;
        } else {
            aVar = new a(new byte[this.f7414b], 0);
        }
        return aVar;
    }

    public synchronized void a(int i10) {
        boolean z10 = i10 < this.f7417e;
        this.f7417e = i10;
        if (z10) {
            b();
        }
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f7416d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized void a(a[] aVarArr) {
        int i10 = this.f7419g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f7420h;
        if (length >= aVarArr2.length) {
            this.f7420h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f7420h;
            int i11 = this.f7419g;
            this.f7419g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f7418f -= aVarArr.length;
        notifyAll();
    }

    @Override // com.applovin.exoplayer2.k.b
    public synchronized void b() {
        int i10 = 0;
        int iMax = Math.max(0, ai.a(this.f7417e, this.f7414b) - this.f7418f);
        int i11 = this.f7419g;
        if (iMax >= i11) {
            return;
        }
        if (this.f7415c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) com.applovin.exoplayer2.l.a.b(this.f7420h[i10]);
                if (aVar.f7342a == this.f7415c) {
                    i10++;
                } else {
                    a aVar2 = (a) com.applovin.exoplayer2.l.a.b(this.f7420h[i12]);
                    if (aVar2.f7342a != this.f7415c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f7420h;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f7419g) {
                return;
            }
        }
        Arrays.fill(this.f7420h, iMax, this.f7419g, (Object) null);
        this.f7419g = iMax;
    }

    @Override // com.applovin.exoplayer2.k.b
    public int c() {
        return this.f7414b;
    }

    public synchronized void d() {
        if (this.f7413a) {
            a(0);
        }
    }

    public synchronized int e() {
        return this.f7418f * this.f7414b;
    }
}
