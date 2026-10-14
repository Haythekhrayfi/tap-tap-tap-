package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5892c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5896g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f5898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f5900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5901l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5903n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f5897h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f5893d = new r(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f5894e = new r(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f5895f = new r(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5902m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5904o = new com.applovin.exoplayer2.l.y();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f5905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f5906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f5907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<com.applovin.exoplayer2.l.v.b> f5908d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<com.applovin.exoplayer2.l.v.a> f5909e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.z f5910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f5911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f5912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f5913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f5914j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f5915k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f5916l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private C0089a f5917m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C0089a f5918n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f5919o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f5920p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f5921q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f5922r;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.e.i.m$a$a, reason: collision with other inner class name */
        public static final class C0089a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f5923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f5924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.applovin.exoplayer2.l.v.b f5925c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f5926d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f5927e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f5928f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f5929g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f5930h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f5931i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f5932j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f5933k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f5934l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f5935m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f5936n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f5937o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f5938p;

            private C0089a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(C0089a c0089a) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f5923a) {
                    return false;
                }
                if (!c0089a.f5923a) {
                    return true;
                }
                com.applovin.exoplayer2.l.v.b bVar = (com.applovin.exoplayer2.l.v.b) com.applovin.exoplayer2.l.a.a(this.f5925c);
                com.applovin.exoplayer2.l.v.b bVar2 = (com.applovin.exoplayer2.l.v.b) com.applovin.exoplayer2.l.a.a(c0089a.f5925c);
                return (this.f5928f == c0089a.f5928f && this.f5929g == c0089a.f5929g && this.f5930h == c0089a.f5930h && (!this.f5931i || !c0089a.f5931i || this.f5932j == c0089a.f5932j) && (((i10 = this.f5926d) == (i11 = c0089a.f5926d) || (i10 != 0 && i11 != 0)) && (((i12 = bVar.f7677k) != 0 || bVar2.f7677k != 0 || (this.f5935m == c0089a.f5935m && this.f5936n == c0089a.f5936n)) && ((i12 != 1 || bVar2.f7677k != 1 || (this.f5937o == c0089a.f5937o && this.f5938p == c0089a.f5938p)) && (z10 = this.f5933k) == c0089a.f5933k && (!z10 || this.f5934l == c0089a.f5934l))))) ? false : true;
            }

            public void a() {
                this.f5924b = false;
                this.f5923a = false;
            }

            public void a(int i10) {
                this.f5927e = i10;
                this.f5924b = true;
            }

            public void a(com.applovin.exoplayer2.l.v.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f5925c = bVar;
                this.f5926d = i10;
                this.f5927e = i11;
                this.f5928f = i12;
                this.f5929g = i13;
                this.f5930h = z10;
                this.f5931i = z11;
                this.f5932j = z12;
                this.f5933k = z13;
                this.f5934l = i14;
                this.f5935m = i15;
                this.f5936n = i16;
                this.f5937o = i17;
                this.f5938p = i18;
                this.f5923a = true;
                this.f5924b = true;
            }

            public boolean b() {
                int i10;
                return this.f5924b && ((i10 = this.f5927e) == 7 || i10 == 2);
            }
        }

        public a(com.applovin.exoplayer2.e.x xVar, boolean z10, boolean z11) {
            this.f5905a = xVar;
            this.f5906b = z10;
            this.f5907c = z11;
            this.f5917m = new C0089a();
            this.f5918n = new C0089a();
            byte[] bArr = new byte[128];
            this.f5911g = bArr;
            this.f5910f = new com.applovin.exoplayer2.l.z(bArr, 0, 0);
            b();
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
            long j10 = this.f5921q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f5922r;
            this.f5905a.a(j10, z10 ? 1 : 0, (int) (this.f5914j - this.f5920p), i10, null);
        }

        public void a(long j10, int i10, long j11) {
            this.f5913i = i10;
            this.f5916l = j11;
            this.f5914j = j10;
            if (!this.f5906b || i10 != 1) {
                if (!this.f5907c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            C0089a c0089a = this.f5917m;
            this.f5917m = this.f5918n;
            this.f5918n = c0089a;
            c0089a.a();
            this.f5912h = 0;
            this.f5915k = true;
        }

        public void a(com.applovin.exoplayer2.l.v.a aVar) {
            this.f5909e.append(aVar.f7664a, aVar);
        }

        public void a(com.applovin.exoplayer2.l.v.b bVar) {
            this.f5908d.append(bVar.f7670d, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0118  */
        /* JADX WARN: Code duplicated, block: B:63:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0129  */
        /* JADX WARN: Code duplicated, block: B:74:0x0152  */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zB;
            boolean z12;
            int iD;
            int i12;
            int i13;
            int iE;
            int i14;
            int iE2;
            int iC;
            if (this.f5915k) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.f5911g;
                int length = bArr2.length;
                int i16 = this.f5912h;
                if (length < i16 + i15) {
                    this.f5911g = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i10, this.f5911g, this.f5912h, i15);
                int i17 = this.f5912h + i15;
                this.f5912h = i17;
                this.f5910f.a(this.f5911g, 0, i17);
                if (this.f5910f.b(8)) {
                    this.f5910f.a();
                    int iC2 = this.f5910f.c(2);
                    this.f5910f.a(5);
                    if (this.f5910f.c()) {
                        this.f5910f.d();
                        if (this.f5910f.c()) {
                            int iD2 = this.f5910f.d();
                            if (!this.f5907c) {
                                this.f5915k = false;
                                this.f5918n.a(iD2);
                                return;
                            }
                            if (this.f5910f.c()) {
                                int iD3 = this.f5910f.d();
                                if (this.f5909e.indexOfKey(iD3) < 0) {
                                    this.f5915k = false;
                                    return;
                                }
                                com.applovin.exoplayer2.l.v.a aVar = this.f5909e.get(iD3);
                                com.applovin.exoplayer2.l.v.b bVar = this.f5908d.get(aVar.f7665b);
                                if (bVar.f7674h) {
                                    if (!this.f5910f.b(2)) {
                                        return;
                                    } else {
                                        this.f5910f.a(2);
                                    }
                                }
                                if (this.f5910f.b(bVar.f7676j)) {
                                    int iC3 = this.f5910f.c(bVar.f7676j);
                                    if (!bVar.f7675i) {
                                        if (this.f5910f.b(1)) {
                                            boolean zB2 = this.f5910f.b();
                                            if (!zB2) {
                                                z10 = zB2;
                                                z11 = false;
                                            } else {
                                                if (!this.f5910f.b(1)) {
                                                    return;
                                                }
                                                z10 = zB2;
                                                z11 = true;
                                                zB = this.f5910f.b();
                                            }
                                            if (this.f5913i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iD = 0;
                                            } else if (!this.f5910f.c()) {
                                                return;
                                            } else {
                                                iD = this.f5910f.d();
                                            }
                                            i12 = bVar.f7677k;
                                            if (i12 != 0) {
                                                if (this.f5910f.b(bVar.f7678l)) {
                                                    iC = this.f5910f.c(bVar.f7678l);
                                                    if (aVar.f7666c || z10) {
                                                        i13 = iC;
                                                        iE = 0;
                                                    } else {
                                                        if (!this.f5910f.c()) {
                                                            return;
                                                        }
                                                        iE = this.f5910f.e();
                                                        i13 = iC;
                                                        i14 = 0;
                                                    }
                                                    iE2 = i14;
                                                    this.f5918n.a(bVar, iC2, iD2, iC3, iD3, z10, z11, zB, z12, iD, i13, iE, i14, iE2);
                                                    this.f5915k = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || bVar.f7679m) {
                                                i13 = 0;
                                                iE = 0;
                                            } else {
                                                if (!this.f5910f.c()) {
                                                    return;
                                                }
                                                int iE3 = this.f5910f.e();
                                                if (!aVar.f7666c || z10) {
                                                    i14 = iE3;
                                                    i13 = 0;
                                                    iE = 0;
                                                    iE2 = 0;
                                                } else {
                                                    if (!this.f5910f.c()) {
                                                        return;
                                                    }
                                                    iE2 = this.f5910f.e();
                                                    i14 = iE3;
                                                    i13 = 0;
                                                    iE = 0;
                                                }
                                            }
                                            this.f5918n.a(bVar, iC2, iD2, iC3, iD3, z10, z11, zB, z12, iD, i13, iE, i14, iE2);
                                            this.f5915k = false;
                                            i14 = iE;
                                            iE2 = i14;
                                            this.f5918n.a(bVar, iC2, iD2, iC3, iD3, z10, z11, zB, z12, iD, i13, iE, i14, iE2);
                                            this.f5915k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zB = z11;
                                    if (this.f5913i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iD = 0;
                                    } else if (!this.f5910f.c()) {
                                        return;
                                    } else {
                                        iD = this.f5910f.d();
                                    }
                                    i12 = bVar.f7677k;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        iE = 0;
                                    } else {
                                        if (this.f5910f.b(bVar.f7678l)) {
                                            return;
                                        }
                                        iC = this.f5910f.c(bVar.f7678l);
                                        if (aVar.f7666c) {
                                        }
                                        i13 = iC;
                                        iE = 0;
                                    }
                                    i14 = iE;
                                    iE2 = i14;
                                    this.f5918n.a(bVar, iC2, iD2, iC3, iD3, z10, z11, zB, z12, iD, i13, iE, i14, iE2);
                                    this.f5915k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean a() {
            return this.f5907c;
        }

        public boolean a(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f5913i == 9 || (this.f5907c && this.f5918n.a(this.f5917m))) {
                if (z10 && this.f5919o) {
                    a(i10 + ((int) (j10 - this.f5914j)));
                }
                this.f5920p = this.f5914j;
                this.f5921q = this.f5916l;
                this.f5922r = false;
                this.f5919o = true;
            }
            if (this.f5906b) {
                z11 = this.f5918n.b();
            }
            boolean z13 = this.f5922r;
            int i11 = this.f5913i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f5922r = z14;
            return z14;
        }

        public void b() {
            this.f5915k = false;
            this.f5919o = false;
            this.f5918n.a();
        }
    }

    public m(z zVar, boolean z10, boolean z11) {
        this.f5890a = zVar;
        this.f5891b = z10;
        this.f5892c = z11;
    }

    private void a(long j10, int i10, int i11, long j11) {
        r rVar;
        if (!this.f5901l || this.f5900k.a()) {
            this.f5893d.b(i11);
            this.f5894e.b(i11);
            if (this.f5901l) {
                if (this.f5893d.b()) {
                    r rVar2 = this.f5893d;
                    this.f5900k.a(com.applovin.exoplayer2.l.v.a(rVar2.f6005a, 3, rVar2.f6006b));
                    rVar = this.f5893d;
                    rVar.a();
                } else if (this.f5894e.b()) {
                    r rVar3 = this.f5894e;
                    this.f5900k.a(com.applovin.exoplayer2.l.v.b(rVar3.f6005a, 3, rVar3.f6006b));
                    rVar = this.f5894e;
                    rVar.a();
                }
            } else if (this.f5893d.b() && this.f5894e.b()) {
                ArrayList arrayList = new ArrayList();
                r rVar4 = this.f5893d;
                arrayList.add(Arrays.copyOf(rVar4.f6005a, rVar4.f6006b));
                r rVar5 = this.f5894e;
                arrayList.add(Arrays.copyOf(rVar5.f6005a, rVar5.f6006b));
                r rVar6 = this.f5893d;
                com.applovin.exoplayer2.l.v.b bVarA = com.applovin.exoplayer2.l.v.a(rVar6.f6005a, 3, rVar6.f6006b);
                r rVar7 = this.f5894e;
                com.applovin.exoplayer2.l.v.a aVarB = com.applovin.exoplayer2.l.v.b(rVar7.f6005a, 3, rVar7.f6006b);
                this.f5899j.a(new com.applovin.exoplayer2.v.a().a(this.f5898i).f("video/avc").d(com.applovin.exoplayer2.l.e.a(bVarA.f7667a, bVarA.f7668b, bVarA.f7669c)).g(bVarA.f7671e).h(bVarA.f7672f).b(bVarA.f7673g).a(arrayList).a());
                this.f5901l = true;
                this.f5900k.a(bVarA);
                this.f5900k.a(aVarB);
                this.f5893d.a();
                rVar = this.f5894e;
                rVar.a();
            }
        }
        if (this.f5895f.b(i11)) {
            r rVar8 = this.f5895f;
            this.f5904o.a(this.f5895f.f6005a, com.applovin.exoplayer2.l.v.a(rVar8.f6005a, rVar8.f6006b));
            this.f5904o.d(4);
            this.f5890a.a(j11, this.f5904o);
        }
        if (this.f5900k.a(j10, i10, this.f5901l, this.f5903n)) {
            this.f5903n = false;
        }
    }

    private void a(long j10, int i10, long j11) {
        if (!this.f5901l || this.f5900k.a()) {
            this.f5893d.a(i10);
            this.f5894e.a(i10);
        }
        this.f5895f.a(i10);
        this.f5900k.a(j10, i10, j11);
    }

    private void a(byte[] bArr, int i10, int i11) {
        if (!this.f5901l || this.f5900k.a()) {
            this.f5893d.a(bArr, i10, i11);
            this.f5894e.a(bArr, i10, i11);
        }
        this.f5895f.a(bArr, i10, i11);
        this.f5900k.a(bArr, i10, i11);
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.f5899j);
        ai.a(this.f5900k);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5896g = 0L;
        this.f5903n = false;
        this.f5902m = -9223372036854775807L;
        com.applovin.exoplayer2.l.v.a(this.f5897h);
        this.f5893d.a();
        this.f5894e.a();
        this.f5895f.a();
        a aVar = this.f5900k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5902m = j10;
        }
        this.f5903n |= (i10 & 2) != 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5898i = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 2);
        this.f5899j = xVarA;
        this.f5900k = new a(xVarA, this.f5891b, this.f5892c);
        this.f5890a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        c();
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        this.f5896g += (long) yVar.a();
        this.f5899j.a(yVar, yVar.a());
        while (true) {
            int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.f5897h);
            if (iA == iB) {
                a(bArrD, iC, iB);
                return;
            }
            int iB2 = com.applovin.exoplayer2.l.v.b(bArrD, iA);
            int i10 = iA - iC;
            if (i10 > 0) {
                a(bArrD, iC, iA);
            }
            int i11 = iB - iA;
            long j10 = this.f5896g - ((long) i11);
            a(j10, i11, i10 < 0 ? -i10 : 0, this.f5902m);
            a(j10, iB2, this.f5902m);
            iC = iA + 3;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
