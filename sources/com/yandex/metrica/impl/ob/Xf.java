package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Xf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f15510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15513e;

    public Xf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA = C1519b.a(1, this.f15510b) + 0;
        long j10 = this.f15511c;
        if (j10 != 0) {
            iA += C1519b.b(2, j10);
        }
        long j11 = this.f15512d;
        if (j11 != 0) {
            iA += C1519b.b(3, j11);
        }
        int i10 = this.f15513e;
        return i10 != 0 ? iA + C1519b.a(4, i10) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.f15510b = c1494a.d();
            } else if (iL == 16) {
                this.f15511c = c1494a.i();
            } else if (iL == 24) {
                this.f15512d = c1494a.i();
            } else if (iL == 32) {
                int iH = c1494a.h();
                if (iH == 0 || iH == 1 || iH == 2) {
                    this.f15513e = iH;
                }
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        c1519b.b(1, this.f15510b);
        long j10 = this.f15511c;
        if (j10 != 0) {
            c1519b.e(2, j10);
        }
        long j11 = this.f15512d;
        if (j11 != 0) {
            c1519b.e(3, j11);
        }
        int i10 = this.f15513e;
        if (i10 != 0) {
            c1519b.d(4, i10);
        }
    }

    public Xf b() {
        this.f15510b = C1644g.f16157d;
        this.f15511c = 0L;
        this.f15512d = 0L;
        this.f15513e = 0;
        this.f15981a = -1;
        return this;
    }
}
