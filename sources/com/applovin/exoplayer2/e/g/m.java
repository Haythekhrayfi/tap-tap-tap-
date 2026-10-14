package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f5606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5611f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5618m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f5620o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5624s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f5612g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f5613h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f5614i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f5615j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f5616k = new long[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean[] f5617l = new boolean[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f5619n = new boolean[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f5621p = new y();

    public void a() {
        this.f5610e = 0;
        this.f5623r = 0L;
        this.f5624s = false;
        this.f5618m = false;
        this.f5622q = false;
        this.f5620o = null;
    }

    public void a(int i10) {
        this.f5621p.a(i10);
        this.f5618m = true;
        this.f5622q = true;
    }

    public void a(int i10, int i11) {
        this.f5610e = i10;
        this.f5611f = i11;
        if (this.f5613h.length < i10) {
            this.f5612g = new long[i10];
            this.f5613h = new int[i10];
        }
        if (this.f5614i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f5614i = new int[i12];
            this.f5615j = new int[i12];
            this.f5616k = new long[i12];
            this.f5617l = new boolean[i12];
            this.f5619n = new boolean[i12];
        }
    }

    public void a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        iVar.b(this.f5621p.d(), 0, this.f5621p.b());
        this.f5621p.d(0);
        this.f5622q = false;
    }

    public void a(y yVar) {
        yVar.a(this.f5621p.d(), 0, this.f5621p.b());
        this.f5621p.d(0);
        this.f5622q = false;
    }

    public long b(int i10) {
        return this.f5616k[i10] + ((long) this.f5615j[i10]);
    }

    public boolean c(int i10) {
        return this.f5618m && this.f5619n[i10];
    }
}
