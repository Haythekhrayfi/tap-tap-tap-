package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Of extends AbstractC1594e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Of[] f14631h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14637g;

    public Of() {
        b();
    }

    public static Of[] c() {
        if (f14631h == null) {
            synchronized (C1544c.f15862a) {
                if (f14631h == null) {
                    f14631h = new Of[0];
                }
            }
        }
        return f14631h;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int iA = this.f14632b.equals("") ? 0 : 0 + C1519b.a(1, this.f14632b);
        if (!this.f14633c.equals("")) {
            iA += C1519b.a(2, this.f14633c);
        }
        int i10 = this.f14634d;
        if (i10 != -1) {
            iA += C1519b.b(3, i10);
        }
        if (!this.f14635e.equals("")) {
            iA += C1519b.a(4, this.f14635e);
        }
        boolean z10 = this.f14636f;
        if (z10) {
            iA += C1519b.a(5, z10);
        }
        int i11 = this.f14637g;
        return i11 != -1 ? iA + C1519b.b(6, i11) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.f14632b = c1494a.k();
            } else if (iL == 18) {
                this.f14633c = c1494a.k();
            } else if (iL == 24) {
                this.f14634d = c1494a.j();
            } else if (iL == 34) {
                this.f14635e = c1494a.k();
            } else if (iL == 40) {
                this.f14636f = c1494a.c();
            } else if (iL == 48) {
                this.f14637g = c1494a.j();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        if (!this.f14632b.equals("")) {
            c1519b.b(1, this.f14632b);
        }
        if (!this.f14633c.equals("")) {
            c1519b.b(2, this.f14633c);
        }
        int i10 = this.f14634d;
        if (i10 != -1) {
            c1519b.e(3, i10);
        }
        if (!this.f14635e.equals("")) {
            c1519b.b(4, this.f14635e);
        }
        boolean z10 = this.f14636f;
        if (z10) {
            c1519b.b(5, z10);
        }
        int i11 = this.f14637g;
        if (i11 != -1) {
            c1519b.e(6, i11);
        }
    }

    public Of b() {
        this.f14632b = "";
        this.f14633c = "";
        this.f14634d = -1;
        this.f14635e = "";
        this.f14636f = false;
        this.f14637g = -1;
        this.f15981a = -1;
        return this;
    }
}
