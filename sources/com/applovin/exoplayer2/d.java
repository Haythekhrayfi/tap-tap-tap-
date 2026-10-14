package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba.c f5050a = new ba.c();

    private void b(long j10) {
        long jI = I() + j10;
        long jH = H();
        if (jH != -9223372036854775807L) {
            jI = Math.min(jI, jH);
        }
        a(Math.max(jI, 0L));
    }

    private int q() {
        int iY = y();
        if (iY == 1) {
            return 0;
        }
        return iY;
    }

    public an.a a(an.a aVar) {
        return new an.a.C0071a().a(aVar).a(3, !K()).a(4, o() && !K()).a(5, a_() && !K()).a(6, !S().d() && (a_() || !n() || o()) && !K()).a(7, h() && !K()).a(8, !S().d() && (h() || (n() && m())) && !K()).a(9, !K()).a(10, o() && !K()).a(11, o() && !K()).a();
    }

    @Override // com.applovin.exoplayer2.an
    public final void a(long j10) {
        a(G(), j10);
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean a() {
        return t() == 3 && x() && u() == 0;
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean a(int i10) {
        return s().a(i10);
    }

    public final boolean a_() {
        return l() != -1;
    }

    public final void b(int i10) {
        a(i10, -9223372036854775807L);
    }

    public final void b_() {
        b(G());
    }

    @Override // com.applovin.exoplayer2.an
    public final void c() {
        b(-A());
    }

    @Override // com.applovin.exoplayer2.an
    public final void d() {
        b(B());
    }

    public final void f() {
        int iL = l();
        if (iL != -1) {
            b(iL);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public final void g() {
        if (S().d() || K()) {
            return;
        }
        boolean zA_ = a_();
        if (!n() || o()) {
            if (!zA_ || I() > C()) {
                a(0L);
                return;
            }
        } else if (!zA_) {
            return;
        }
        f();
    }

    public final boolean h() {
        return k() != -1;
    }

    public final void i() {
        int iK = k();
        if (iK != -1) {
            b(iK);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public final void j() {
        if (S().d() || K()) {
            return;
        }
        if (h()) {
            i();
        } else if (n() && m()) {
            b_();
        }
    }

    public final int k() {
        ba baVarS = S();
        if (baVarS.d()) {
            return -1;
        }
        return baVarS.a(G(), q(), z());
    }

    public final int l() {
        ba baVarS = S();
        if (baVarS.d()) {
            return -1;
        }
        return baVarS.b(G(), q(), z());
    }

    public final boolean m() {
        ba baVarS = S();
        return !baVarS.d() && baVarS.a(G(), this.f5050a).f4699j;
    }

    public final boolean n() {
        ba baVarS = S();
        return !baVarS.d() && baVarS.a(G(), this.f5050a).e();
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean o() {
        ba baVarS = S();
        return !baVarS.d() && baVarS.a(G(), this.f5050a).f4698i;
    }

    public final long p() {
        ba baVarS = S();
        if (baVarS.d()) {
            return -9223372036854775807L;
        }
        return baVarS.a(G(), this.f5050a).c();
    }
}
