package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.t;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.y;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5269a = p.f4000p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f5275g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f5284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f5285q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f5270b = new y(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f5271c = new y(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f5272d = new y(11);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f5273e = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f5274f = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5276h = 1;

    private void a() {
        if (this.f5283o) {
            return;
        }
        this.f5275g.a(new v.b(-9223372036854775807L));
        this.f5283o = true;
    }

    private long b() {
        if (this.f5277i) {
            return this.f5278j + this.f5282n;
        }
        if (this.f5274f.a() == -9223372036854775807L) {
            return 0L;
        }
        return this.f5282n;
    }

    private boolean b(i iVar) throws IOException {
        if (!iVar.a(this.f5271c.d(), 0, 9, true)) {
            return false;
        }
        this.f5271c.d(0);
        this.f5271c.e(4);
        int iH = this.f5271c.h();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f5284p == null) {
            this.f5284p = new a(this.f5275g.a(8, 1));
        }
        if (z11 && this.f5285q == null) {
            this.f5285q = new e(this.f5275g.a(9, 2));
        }
        this.f5275g.a();
        this.f5279k = (this.f5271c.q() - 9) + 4;
        this.f5276h = 2;
        return true;
    }

    private void c(i iVar) throws IOException {
        iVar.b(this.f5279k);
        this.f5279k = 0;
        this.f5276h = 3;
    }

    private boolean d(i iVar) throws IOException {
        if (!iVar.a(this.f5272d.d(), 0, 11, true)) {
            return false;
        }
        this.f5272d.d(0);
        this.f5280l = this.f5272d.h();
        this.f5281m = this.f5272d.m();
        this.f5282n = this.f5272d.m();
        this.f5282n = (((long) (this.f5272d.h() << 24)) | this.f5282n) * 1000;
        this.f5272d.e(3);
        this.f5276h = 4;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new b()};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    private boolean e(i iVar) throws IOException {
        boolean z10;
        d dVar;
        long j10;
        long jB = b();
        int i10 = this.f5280l;
        boolean zB = false;
        if (i10 != 8 || this.f5284p == null) {
            if (i10 == 9 && this.f5285q != null) {
                a();
                dVar = this.f5285q;
            } else if (i10 != 18 || this.f5283o) {
                iVar.b(this.f5281m);
                z10 = false;
            } else {
                zB = this.f5274f.b(f(iVar), jB);
                long jA = this.f5274f.a();
                if (jA != -9223372036854775807L) {
                    this.f5275g.a(new t(this.f5274f.c(), this.f5274f.b(), jA));
                    this.f5283o = true;
                }
                z10 = true;
            }
            if (!this.f5277i && zB) {
                this.f5277i = true;
                if (this.f5274f.a() == -9223372036854775807L) {
                    j10 = -this.f5282n;
                } else {
                    j10 = 0;
                }
                this.f5278j = j10;
            }
            this.f5279k = 4;
            this.f5276h = 2;
            return z10;
        }
        a();
        dVar = this.f5284p;
        zB = dVar.b(f(iVar), jB);
        z10 = true;
        if (!this.f5277i) {
            this.f5277i = true;
            if (this.f5274f.a() == -9223372036854775807L) {
                j10 = -this.f5282n;
            } else {
                j10 = 0;
            }
            this.f5278j = j10;
        }
        this.f5279k = 4;
        this.f5276h = 2;
        return z10;
    }

    private y f(i iVar) throws IOException {
        if (this.f5281m > this.f5273e.e()) {
            y yVar = this.f5273e;
            yVar.a(new byte[Math.max(yVar.e() * 2, this.f5281m)], 0);
        } else {
            this.f5273e.d(0);
        }
        this.f5273e.c(this.f5281m);
        iVar.b(this.f5273e.d(), 0, this.f5281m);
        return this.f5273e;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f5275g);
        while (true) {
            int i10 = this.f5276h;
            if (i10 != 1) {
                if (i10 == 2) {
                    c(iVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (e(iVar)) {
                        return 0;
                    }
                } else if (!d(iVar)) {
                    return -1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f5276h = 1;
            this.f5277i = false;
        } else {
            this.f5276h = 3;
        }
        this.f5279k = 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f5275g = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        iVar.d(this.f5270b.d(), 0, 3);
        this.f5270b.d(0);
        if (this.f5270b.m() != 4607062) {
            return false;
        }
        iVar.d(this.f5270b.d(), 0, 2);
        this.f5270b.d(0);
        if ((this.f5270b.i() & BaseTransientBottomBar.ANIMATION_DURATION) != 0) {
            return false;
        }
        iVar.d(this.f5270b.d(), 0, 4);
        this.f5270b.d(0);
        int iQ = this.f5270b.q();
        iVar.a();
        iVar.c(iQ);
        iVar.d(this.f5270b.d(), 0, 4);
        this.f5270b.d(0);
        return this.f5270b.q() == 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
