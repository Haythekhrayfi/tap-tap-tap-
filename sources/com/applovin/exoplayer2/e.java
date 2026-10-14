package com.applovin.exoplayer2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ar, as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5185a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private at f5187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.applovin.exoplayer2.h.x f5190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v[] f5191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5193i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5196l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f5186b = new w();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5194j = Long.MIN_VALUE;

    public e(int i10) {
        this.f5185a = i10;
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public final int a() {
        return this.f5185a;
    }

    public final int a(w wVar, com.applovin.exoplayer2.c.g gVar, int i10) {
        int iA = ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f5190f)).a(wVar, gVar, i10);
        if (iA == -4) {
            if (gVar.c()) {
                this.f5194j = Long.MIN_VALUE;
                return this.f5195k ? -4 : -3;
            }
            long j10 = gVar.f4754d + this.f5192h;
            gVar.f4754d = j10;
            this.f5194j = Math.max(this.f5194j, j10);
        } else if (iA == -5) {
            v vVar = (v) com.applovin.exoplayer2.l.a.b(wVar.f8240b);
            if (vVar.f8202p != RecyclerView.FOREVER_NS) {
                wVar.f8240b = vVar.a().a(vVar.f8202p + this.f5192h).a();
            }
        }
        return iA;
    }

    public final p a(Throwable th, v vVar, int i10) {
        return a(th, vVar, false, i10);
    }

    public final p a(Throwable th, v vVar, boolean z10, int i10) {
        int iC;
        if (vVar == null || this.f5196l) {
            iC = 4;
        } else {
            this.f5196l = true;
            try {
                iC = as.c(a(vVar));
                this.f5196l = false;
            } catch (p unused) {
                this.f5196l = false;
                iC = 4;
            } catch (Throwable th2) {
                this.f5196l = false;
                throw th2;
            }
        }
        return p.a(th, y(), w(), vVar, iC, z10, i10);
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(int i10) {
        this.f5188d = i10;
    }

    @Override // com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws p {
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(long j10) throws p {
        this.f5195k = false;
        this.f5193i = j10;
        this.f5194j = j10;
        a(j10, false);
    }

    public void a(long j10, boolean z10) throws p {
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(at atVar, v[] vVarArr, com.applovin.exoplayer2.h.x xVar, long j10, boolean z10, boolean z11, long j11, long j12) throws p {
        com.applovin.exoplayer2.l.a.b(this.f5189e == 0);
        this.f5187c = atVar;
        this.f5189e = 1;
        this.f5193i = j10;
        a(z10, z11);
        a(vVarArr, xVar, j11, j12);
        a(j10, z10);
    }

    public void a(boolean z10, boolean z11) throws p {
    }

    public void a(v[] vVarArr, long j10, long j11) throws p {
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(v[] vVarArr, com.applovin.exoplayer2.h.x xVar, long j10, long j11) throws p {
        com.applovin.exoplayer2.l.a.b(!this.f5195k);
        this.f5190f = xVar;
        if (this.f5194j == Long.MIN_VALUE) {
            this.f5194j = j10;
        }
        this.f5191g = vVarArr;
        this.f5192h = j11;
        a(vVarArr, j10, j11);
    }

    public int b(long j10) {
        return ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f5190f)).a(j10 - this.f5192h);
    }

    @Override // com.applovin.exoplayer2.ar
    public final as b() {
        return this;
    }

    @Override // com.applovin.exoplayer2.ar
    public com.applovin.exoplayer2.l.s c() {
        return null;
    }

    @Override // com.applovin.exoplayer2.ar
    public final int d_() {
        return this.f5189e;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void e() throws p {
        com.applovin.exoplayer2.l.a.b(this.f5189e == 1);
        this.f5189e = 2;
        p();
    }

    @Override // com.applovin.exoplayer2.ar
    public final com.applovin.exoplayer2.h.x f() {
        return this.f5190f;
    }

    @Override // com.applovin.exoplayer2.ar
    public final boolean g() {
        return this.f5194j == Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.ar
    public final long h() {
        return this.f5194j;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void i() {
        this.f5195k = true;
    }

    @Override // com.applovin.exoplayer2.ar
    public final boolean j() {
        return this.f5195k;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void k() throws IOException {
        ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f5190f)).c();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void l() {
        com.applovin.exoplayer2.l.a.b(this.f5189e == 2);
        this.f5189e = 1;
        q();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void m() {
        com.applovin.exoplayer2.l.a.b(this.f5189e == 1);
        this.f5186b.a();
        this.f5189e = 0;
        this.f5190f = null;
        this.f5191g = null;
        this.f5195k = false;
        r();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void n() {
        com.applovin.exoplayer2.l.a.b(this.f5189e == 0);
        this.f5186b.a();
        s();
    }

    @Override // com.applovin.exoplayer2.as
    public int o() throws p {
        return 0;
    }

    public void p() throws p {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public final w t() {
        this.f5186b.a();
        return this.f5186b;
    }

    public final v[] u() {
        return (v[]) com.applovin.exoplayer2.l.a.b(this.f5191g);
    }

    public final at v() {
        return (at) com.applovin.exoplayer2.l.a.b(this.f5187c);
    }

    public final int w() {
        return this.f5188d;
    }

    public final boolean x() {
        return g() ? this.f5195k : ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f5190f)).b();
    }
}
