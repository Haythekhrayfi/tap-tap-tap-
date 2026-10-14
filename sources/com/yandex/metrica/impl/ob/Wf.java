package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Wf extends AbstractC1594e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile Wf[] f15390g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15395f;

    public Wf() {
        b();
    }

    public static Wf[] c() {
        if (f15390g == null) {
            synchronized (C1544c.f15862a) {
                if (f15390g == null) {
                    f15390g = new Wf[0];
                }
            }
        }
        return f15390g;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA = C1519b.a(1, this.f15391b) + 0;
        int i10 = this.f15392c;
        if (i10 != 0) {
            iA += C1519b.b(2, i10);
        }
        if (!this.f15393d.equals("")) {
            iA += C1519b.a(3, this.f15393d);
        }
        boolean z10 = this.f15394e;
        if (z10) {
            iA += C1519b.a(4, z10);
        }
        long j10 = this.f15395f;
        return j10 != 0 ? iA + C1519b.b(5, j10) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.f15391b = c1494a.k();
            } else if (iL == 16) {
                this.f15392c = c1494a.j();
            } else if (iL == 26) {
                this.f15393d = c1494a.k();
            } else if (iL == 32) {
                this.f15394e = c1494a.c();
            } else if (iL == 40) {
                this.f15395f = c1494a.i();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        c1519b.b(1, this.f15391b);
        int i10 = this.f15392c;
        if (i10 != 0) {
            c1519b.e(2, i10);
        }
        if (!this.f15393d.equals("")) {
            c1519b.b(3, this.f15393d);
        }
        boolean z10 = this.f15394e;
        if (z10) {
            c1519b.b(4, z10);
        }
        long j10 = this.f15395f;
        if (j10 != 0) {
            c1519b.e(5, j10);
        }
    }

    public Wf b() {
        this.f15391b = "";
        this.f15392c = 0;
        this.f15393d = "";
        this.f15394e = false;
        this.f15395f = 0L;
        this.f15981a = -1;
        return this;
    }
}
