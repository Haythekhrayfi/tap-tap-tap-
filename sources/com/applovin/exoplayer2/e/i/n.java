package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ai;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f5939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f5942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5943e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5950l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f5944f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f5945g = new r(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r f5946h = new r(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r f5947i = new r(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f5948j = new r(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r f5949k = new r(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5951m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5952n = new com.applovin.exoplayer2.l.y();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f5953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f5954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f5959g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f5960h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f5961i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f5962j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f5963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f5964l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f5965m;

        public a(com.applovin.exoplayer2.e.x xVar) {
            this.f5953a = xVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void a(int i10) {
            long j10 = this.f5964l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f5965m;
            this.f5953a.a(j10, z10 ? 1 : 0, (int) (this.f5954b - this.f5963k), i10, null);
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public void a() {
            this.f5958f = false;
            this.f5959g = false;
            this.f5960h = false;
            this.f5961i = false;
            this.f5962j = false;
        }

        public void a(long j10, int i10, int i11, long j11, boolean z10) {
            this.f5959g = false;
            this.f5960h = false;
            this.f5957e = j11;
            this.f5956d = 0;
            this.f5954b = j10;
            if (!c(i11)) {
                if (this.f5961i && !this.f5962j) {
                    if (z10) {
                        a(i10);
                    }
                    this.f5961i = false;
                }
                if (b(i11)) {
                    this.f5960h = !this.f5962j;
                    this.f5962j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f5955c = z11;
            this.f5958f = z11 || i11 <= 9;
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f5962j && this.f5959g) {
                this.f5965m = this.f5955c;
                this.f5962j = false;
            } else if (this.f5960h || this.f5959g) {
                if (z10 && this.f5961i) {
                    a(i10 + ((int) (j10 - this.f5954b)));
                }
                this.f5963k = this.f5954b;
                this.f5964l = this.f5957e;
                this.f5965m = this.f5955c;
                this.f5961i = true;
            }
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5958f) {
                int i12 = this.f5956d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f5956d = (i11 - i10) + i12;
                } else {
                    this.f5959g = (bArr[i13] & 128) != 0;
                    this.f5958f = false;
                }
            }
        }
    }

    public n(z zVar) {
        this.f5939a = zVar;
    }

    private static com.applovin.exoplayer2.v a(String str, r rVar, r rVar2, r rVar3) {
        int i10 = rVar.f6006b;
        byte[] bArr = new byte[rVar2.f6006b + i10 + rVar3.f6006b];
        System.arraycopy(rVar.f6005a, 0, bArr, 0, i10);
        System.arraycopy(rVar2.f6005a, 0, bArr, rVar.f6006b, rVar2.f6006b);
        System.arraycopy(rVar3.f6005a, 0, bArr, rVar.f6006b + rVar2.f6006b, rVar3.f6006b);
        com.applovin.exoplayer2.l.z zVar = new com.applovin.exoplayer2.l.z(rVar2.f6005a, 0, rVar2.f6006b);
        zVar.a(44);
        int iC = zVar.c(3);
        zVar.a();
        zVar.a(88);
        zVar.a(8);
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            if (zVar.b()) {
                i11 += 89;
            }
            if (zVar.b()) {
                i11 += 8;
            }
        }
        zVar.a(i11);
        if (iC > 0) {
            zVar.a((8 - iC) * 2);
        }
        zVar.d();
        int iD = zVar.d();
        if (iD == 3) {
            zVar.a();
        }
        int iD2 = zVar.d();
        int iD3 = zVar.d();
        if (zVar.b()) {
            int iD4 = zVar.d();
            int iD5 = zVar.d();
            int iD6 = zVar.d();
            int iD7 = zVar.d();
            iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
            iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
        }
        zVar.d();
        zVar.d();
        int iD8 = zVar.d();
        int i13 = zVar.b() ? 0 : iC;
        while (true) {
            zVar.d();
            zVar.d();
            zVar.d();
            if (i13 > iC) {
                break;
            }
            i13++;
        }
        zVar.d();
        zVar.d();
        zVar.d();
        if (zVar.b() && zVar.b()) {
            a(zVar);
        }
        zVar.a(2);
        if (zVar.b()) {
            zVar.a(8);
            zVar.d();
            zVar.d();
            zVar.a();
        }
        b(zVar);
        if (zVar.b()) {
            for (int i14 = 0; i14 < zVar.d(); i14++) {
                zVar.a(iD8 + 4 + 1);
            }
        }
        zVar.a(2);
        float f10 = 1.0f;
        if (zVar.b()) {
            if (zVar.b()) {
                int iC2 = zVar.c(8);
                if (iC2 == 255) {
                    int iC3 = zVar.c(16);
                    int iC4 = zVar.c(16);
                    if (iC3 != 0 && iC4 != 0) {
                        f10 = iC3 / iC4;
                    }
                } else {
                    float[] fArr = com.applovin.exoplayer2.l.v.f7661b;
                    if (iC2 < fArr.length) {
                        f10 = fArr[iC2];
                    } else {
                        com.applovin.exoplayer2.l.q.c("H265Reader", "Unexpected aspect_ratio_idc value: " + iC2);
                    }
                }
            }
            if (zVar.b()) {
                zVar.a();
            }
            if (zVar.b()) {
                zVar.a(4);
                if (zVar.b()) {
                    zVar.a(24);
                }
            }
            if (zVar.b()) {
                zVar.d();
                zVar.d();
            }
            zVar.a();
            if (zVar.b()) {
                iD3 *= 2;
            }
        }
        zVar.a(rVar2.f6005a, 0, rVar2.f6006b);
        zVar.a(24);
        return new com.applovin.exoplayer2.v.a().a(str).f("video/hevc").d(com.applovin.exoplayer2.l.e.a(zVar)).g(iD2).h(iD3).b(f10).a(Collections.singletonList(bArr)).a();
    }

    private void a(long j10, int i10, int i11, long j11) {
        this.f5942d.a(j10, i10, i11, j11, this.f5943e);
        if (!this.f5943e) {
            this.f5945g.a(i11);
            this.f5946h.a(i11);
            this.f5947i.a(i11);
        }
        this.f5948j.a(i11);
        this.f5949k.a(i11);
    }

    private static void a(com.applovin.exoplayer2.l.z zVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (zVar.b()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        zVar.e();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        zVar.e();
                    }
                } else {
                    zVar.d();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private void a(byte[] bArr, int i10, int i11) {
        this.f5942d.a(bArr, i10, i11);
        if (!this.f5943e) {
            this.f5945g.a(bArr, i10, i11);
            this.f5946h.a(bArr, i10, i11);
            this.f5947i.a(bArr, i10, i11);
        }
        this.f5948j.a(bArr, i10, i11);
        this.f5949k.a(bArr, i10, i11);
    }

    private void b(long j10, int i10, int i11, long j11) {
        this.f5942d.a(j10, i10, this.f5943e);
        if (!this.f5943e) {
            this.f5945g.b(i11);
            this.f5946h.b(i11);
            this.f5947i.b(i11);
            if (this.f5945g.b() && this.f5946h.b() && this.f5947i.b()) {
                this.f5941c.a(a(this.f5940b, this.f5945g, this.f5946h, this.f5947i));
                this.f5943e = true;
            }
        }
        if (this.f5948j.b(i11)) {
            r rVar = this.f5948j;
            this.f5952n.a(this.f5948j.f6005a, com.applovin.exoplayer2.l.v.a(rVar.f6005a, rVar.f6006b));
            this.f5952n.e(5);
            this.f5939a.a(j11, this.f5952n);
        }
        if (this.f5949k.b(i11)) {
            r rVar2 = this.f5949k;
            this.f5952n.a(this.f5949k.f6005a, com.applovin.exoplayer2.l.v.a(rVar2.f6005a, rVar2.f6006b));
            this.f5952n.e(5);
            this.f5939a.a(j11, this.f5952n);
        }
    }

    private static void b(com.applovin.exoplayer2.l.z zVar) {
        int iD = zVar.d();
        boolean zB = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (i11 != 0) {
                zB = zVar.b();
            }
            if (zB) {
                zVar.a();
                zVar.d();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (zVar.b()) {
                        zVar.a();
                    }
                }
            } else {
                int iD2 = zVar.d();
                int iD3 = zVar.d();
                int i13 = iD2 + iD3;
                for (int i14 = 0; i14 < iD2; i14++) {
                    zVar.d();
                    zVar.a();
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    zVar.d();
                    zVar.a();
                }
                i10 = i13;
            }
        }
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.f5941c);
        ai.a(this.f5942d);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5950l = 0L;
        this.f5951m = -9223372036854775807L;
        com.applovin.exoplayer2.l.v.a(this.f5944f);
        this.f5945g.a();
        this.f5946h.a();
        this.f5947i.a();
        this.f5948j.a();
        this.f5949k.a();
        a aVar = this.f5942d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5951m = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5940b = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 2);
        this.f5941c = xVarA;
        this.f5942d = new a(xVarA);
        this.f5939a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        c();
        while (yVar.a() > 0) {
            int iC = yVar.c();
            int iB = yVar.b();
            byte[] bArrD = yVar.d();
            this.f5950l += (long) yVar.a();
            this.f5941c.a(yVar, yVar.a());
            while (iC < iB) {
                int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.f5944f);
                if (iA == iB) {
                    a(bArrD, iC, iB);
                    return;
                }
                int iC2 = com.applovin.exoplayer2.l.v.c(bArrD, iA);
                int i10 = iA - iC;
                if (i10 > 0) {
                    a(bArrD, iC, iA);
                }
                int i11 = iB - iA;
                long j10 = this.f5950l - ((long) i11);
                b(j10, i11, i10 < 0 ? -i10 : 0, this.f5951m);
                a(j10, i11, iC2, this.f5951m);
                iC = iA + 3;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
