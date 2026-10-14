package com.applovin.exoplayer2.e.b;

import ch.qos.logback.core.util.FileUtil;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5244a = z.f4651g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f5245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f5246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m.a f5248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f5249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x f5250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.applovin.exoplayer2.g.a f5252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p f5253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f5256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5258o;

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f5245b = new byte[42];
        this.f5246c = new y(new byte[FileUtil.BUF_SIZE], 0);
        this.f5247d = (i10 & 1) != 0;
        this.f5248e = new m.a();
        this.f5251h = 0;
    }

    private long a(y yVar, boolean z10) {
        boolean zA;
        com.applovin.exoplayer2.l.a.b(this.f5253j);
        int iC = yVar.c();
        while (iC <= yVar.b() - 16) {
            yVar.d(iC);
            if (m.a(yVar, this.f5253j, this.f5255l, this.f5248e)) {
                yVar.d(iC);
                return this.f5248e.f6107a;
            }
            iC++;
        }
        if (!z10) {
            yVar.d(iC);
            return -1L;
        }
        while (iC <= yVar.b() - this.f5254k) {
            yVar.d(iC);
            try {
                zA = m.a(yVar, this.f5253j, this.f5255l, this.f5248e);
            } catch (IndexOutOfBoundsException unused) {
                zA = false;
            }
            if (yVar.c() <= yVar.b() ? zA : false) {
                yVar.d(iC);
                return this.f5248e.f6107a;
            }
            iC++;
        }
        yVar.d(yVar.b());
        return -1L;
    }

    private void a() {
        ((x) ai.a(this.f5250g)).a((this.f5258o * 1000000) / ((long) ((p) ai.a(this.f5253j)).f6115e), 1, this.f5257n, 0, null);
    }

    private int b(i iVar, u uVar) throws IOException {
        boolean z10;
        com.applovin.exoplayer2.l.a.b(this.f5250g);
        com.applovin.exoplayer2.l.a.b(this.f5253j);
        a aVar = this.f5256m;
        if (aVar != null && aVar.b()) {
            return this.f5256m.a(iVar, uVar);
        }
        if (this.f5258o == -1) {
            this.f5258o = m.a(iVar, this.f5253j);
            return 0;
        }
        int iB = this.f5246c.b();
        if (iB < 32768) {
            int iA = iVar.a(this.f5246c.d(), iB, FileUtil.BUF_SIZE - iB);
            z10 = iA == -1;
            if (!z10) {
                this.f5246c.c(iB + iA);
            } else if (this.f5246c.a() == 0) {
                a();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iC = this.f5246c.c();
        int i10 = this.f5257n;
        int i11 = this.f5254k;
        if (i10 < i11) {
            y yVar = this.f5246c;
            yVar.e(Math.min(i11 - i10, yVar.a()));
        }
        long jA = a(this.f5246c, z10);
        int iC2 = this.f5246c.c() - iC;
        this.f5246c.d(iC);
        this.f5250g.a(this.f5246c, iC2);
        this.f5257n += iC2;
        if (jA != -1) {
            a();
            this.f5257n = 0;
            this.f5258o = jA;
        }
        if (this.f5246c.a() < 16) {
            int iA2 = this.f5246c.a();
            System.arraycopy(this.f5246c.d(), this.f5246c.c(), this.f5246c.d(), 0, iA2);
            this.f5246c.d(0);
            this.f5246c.c(iA2);
        }
        return 0;
    }

    private v b(long j10, long j11) {
        com.applovin.exoplayer2.l.a.b(this.f5253j);
        p pVar = this.f5253j;
        if (pVar.f6121k != null) {
            return new o(pVar, j10);
        }
        if (j11 == -1 || pVar.f6120j <= 0) {
            return new v.b(pVar.a());
        }
        a aVar = new a(pVar, this.f5255l, j10, j11);
        this.f5256m = aVar;
        return aVar.a();
    }

    private void b(i iVar) throws IOException {
        this.f5252i = n.b(iVar, !this.f5247d);
        this.f5251h = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] b() {
        return new h[]{new b()};
    }

    private void c(i iVar) throws IOException {
        byte[] bArr = this.f5245b;
        iVar.d(bArr, 0, bArr.length);
        iVar.a();
        this.f5251h = 2;
    }

    private void d(i iVar) throws IOException {
        n.b(iVar);
        this.f5251h = 3;
    }

    private void e(i iVar) throws IOException {
        n.a aVar = new n.a(this.f5253j);
        boolean zA = false;
        while (!zA) {
            zA = n.a(iVar, aVar);
            this.f5253j = (p) ai.a(aVar.f6108a);
        }
        com.applovin.exoplayer2.l.a.b(this.f5253j);
        this.f5254k = Math.max(this.f5253j.f6113c, 6);
        ((x) ai.a(this.f5250g)).a(this.f5253j.a(this.f5245b, this.f5252i));
        this.f5251h = 4;
    }

    private void f(i iVar) throws IOException {
        this.f5255l = n.c(iVar);
        ((j) ai.a(this.f5249f)).a(b(iVar.c(), iVar.d()));
        this.f5251h = 5;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        int i10 = this.f5251h;
        if (i10 == 0) {
            b(iVar);
            return 0;
        }
        if (i10 == 1) {
            c(iVar);
            return 0;
        }
        if (i10 == 2) {
            d(iVar);
            return 0;
        }
        if (i10 == 3) {
            e(iVar);
            return 0;
        }
        if (i10 == 4) {
            f(iVar);
            return 0;
        }
        if (i10 == 5) {
            return b(iVar, uVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f5251h = 0;
        } else {
            a aVar = this.f5256m;
            if (aVar != null) {
                aVar.a(j11);
            }
        }
        this.f5258o = j11 != 0 ? -1L : 0L;
        this.f5257n = 0;
        this.f5246c.a(0);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f5249f = jVar;
        this.f5250g = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        n.a(iVar, false);
        return n.a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
