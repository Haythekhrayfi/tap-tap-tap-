package com.yandex.mobile.ads.impl;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class ly implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u01 f22810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j71 f22812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f22813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22814e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22821l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f22815f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nh0 f22816g = new nh0(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nh0 f22817h = new nh0(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nh0 f22818i = new nh0(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final nh0 f22819j = new nh0(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final nh0 f22820k = new nh0(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22822m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mp0 f22823n = new mp0();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j71 f22824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f22825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f22828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f22830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f22831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f22832i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f22833j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f22834k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f22835l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f22836m;

        public a(j71 j71Var) {
            this.f22824a = j71Var;
        }

        public final void a() {
            this.f22829f = false;
            this.f22830g = false;
            this.f22831h = false;
            this.f22832i = false;
            this.f22833j = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public final void a(int i10, int i11, long j10, long j11, boolean z10) {
            this.f22830g = false;
            this.f22831h = false;
            this.f22828e = j11;
            this.f22827d = 0;
            this.f22825b = j10;
            if ((i11 < 32 || i11 == 40) == false) {
                if (this.f22832i && !this.f22833j) {
                    if (z10) {
                        long j12 = this.f22835l;
                        if (j12 != -9223372036854775807L) {
                            this.f22824a.a(j12, this.f22836m ? 1 : 0, (int) (j10 - this.f22834k), i10, null);
                        }
                    }
                    this.f22832i = false;
                }
                if (((32 <= i11 && i11 <= 35) || i11 == 39) != false) {
                    this.f22831h = !this.f22833j;
                    this.f22833j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f22826c = z11;
            this.f22829f = z11 || i11 <= 9;
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
        public final void a(int i10, long j10, boolean z10) {
            if (this.f22833j && this.f22830g) {
                this.f22836m = this.f22826c;
                this.f22833j = false;
                return;
            }
            if (this.f22831h || this.f22830g) {
                if (z10 && this.f22832i) {
                    long j11 = this.f22825b;
                    int i11 = i10 + ((int) (j10 - j11));
                    long j12 = this.f22835l;
                    if (j12 != -9223372036854775807L) {
                        boolean z11 = this.f22836m;
                        this.f22824a.a(j12, z11 ? 1 : 0, (int) (j11 - this.f22834k), i11, null);
                    }
                }
                this.f22834k = this.f22825b;
                this.f22835l = this.f22828e;
                this.f22836m = this.f22826c;
                this.f22832i = true;
            }
        }

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f22829f) {
                int i12 = this.f22827d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f22827d = (i11 - i10) + i12;
                } else {
                    this.f22830g = (bArr[i13] & 128) != 0;
                    this.f22829f = false;
                }
            }
        }
    }

    public ly(u01 u01Var) {
        this.f22810a = u01Var;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f22821l = 0L;
        this.f22822m = -9223372036854775807L;
        oh0.a(this.f22815f);
        this.f22816g.b();
        this.f22817h.b();
        this.f22818i.b();
        this.f22819j.b();
        this.f22820k.b();
        a aVar = this.f22813d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f22822m = j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0372  */
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        int i10;
        int i11;
        int i12;
        pa.b(this.f22812c);
        int i13 = da1.f19803a;
        while (mp0Var.a() > 0) {
            int iD = mp0Var.d();
            int iE = mp0Var.e();
            byte[] bArrC = mp0Var.c();
            this.f22821l += (long) mp0Var.a();
            this.f22812c.a(mp0Var.a(), mp0Var);
            while (iD < iE) {
                int iA = oh0.a(bArrC, iD, iE, this.f22815f);
                if (iA == iE) {
                    this.f22813d.a(bArrC, iD, iE);
                    if (!this.f22814e) {
                        this.f22816g.a(bArrC, iD, iE);
                        this.f22817h.a(bArrC, iD, iE);
                        this.f22818i.a(bArrC, iD, iE);
                    }
                    this.f22819j.a(bArrC, iD, iE);
                    this.f22820k.a(bArrC, iD, iE);
                    return;
                }
                int i14 = iA + 3;
                int i15 = (bArrC[i14] & 126) >> 1;
                int i16 = iA - iD;
                if (i16 > 0) {
                    this.f22813d.a(bArrC, iD, iA);
                    if (!this.f22814e) {
                        this.f22816g.a(bArrC, iD, iA);
                        this.f22817h.a(bArrC, iD, iA);
                        this.f22818i.a(bArrC, iD, iA);
                    }
                    this.f22819j.a(bArrC, iD, iA);
                    this.f22820k.a(bArrC, iD, iA);
                }
                int i17 = iE - iA;
                long j10 = this.f22821l - ((long) i17);
                int i18 = i16 < 0 ? -i16 : 0;
                long j11 = this.f22822m;
                this.f22813d.a(i17, j10, this.f22814e);
                if (this.f22814e) {
                    i10 = i15;
                    i11 = i17;
                } else {
                    this.f22816g.a(i18);
                    this.f22817h.a(i18);
                    this.f22818i.a(i18);
                    if (this.f22816g.a() && this.f22817h.a() && this.f22818i.a()) {
                        j71 j71Var = this.f22812c;
                        String str = this.f22811b;
                        nh0 nh0Var = this.f22816g;
                        nh0 nh0Var2 = this.f22817h;
                        nh0 nh0Var3 = this.f22818i;
                        int i19 = nh0Var.f23390e;
                        byte[] bArr = new byte[nh0Var2.f23390e + i19 + nh0Var3.f23390e];
                        System.arraycopy(nh0Var.f23389d, 0, bArr, 0, i19);
                        System.arraycopy(nh0Var2.f23389d, 0, bArr, nh0Var.f23390e, nh0Var2.f23390e);
                        System.arraycopy(nh0Var3.f23389d, 0, bArr, nh0Var.f23390e + nh0Var2.f23390e, nh0Var3.f23390e);
                        np0 np0Var = new np0(nh0Var2.f23389d, 0, nh0Var2.f23390e);
                        np0Var.d(44);
                        int iB = np0Var.b(3);
                        np0Var.e();
                        int i20 = 2;
                        int iB2 = np0Var.b(2);
                        boolean zB = np0Var.b();
                        int iB3 = np0Var.b(5);
                        int i21 = 0;
                        for (int i22 = 0; i22 < 32; i22++) {
                            if (np0Var.b()) {
                                i21 |= 1 << i22;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i23 = 0; i23 < 6; i23++) {
                            iArr[i23] = np0Var.b(8);
                        }
                        int iB4 = np0Var.b(8);
                        int i24 = 0;
                        for (int i25 = 0; i25 < iB; i25++) {
                            if (np0Var.b()) {
                                i24 += 89;
                            }
                            if (np0Var.b()) {
                                i24 += 8;
                            }
                        }
                        np0Var.d(i24);
                        if (iB > 0) {
                            np0Var.d((8 - iB) * 2);
                        }
                        np0Var.d();
                        int iD2 = np0Var.d();
                        if (iD2 == 3) {
                            np0Var.e();
                        }
                        int iD3 = np0Var.d();
                        int iD4 = np0Var.d();
                        if (np0Var.b()) {
                            int iD5 = np0Var.d();
                            int iD6 = np0Var.d();
                            int iD7 = np0Var.d();
                            int iD8 = np0Var.d();
                            iD3 -= (iD5 + iD6) * ((iD2 == 1 || iD2 == 2) ? 2 : 1);
                            iD4 -= (iD7 + iD8) * (iD2 == 1 ? 2 : 1);
                        }
                        np0Var.d();
                        np0Var.d();
                        int iD9 = np0Var.d();
                        int i26 = np0Var.b() ? 0 : iB;
                        while (true) {
                            np0Var.d();
                            np0Var.d();
                            np0Var.d();
                            if (i26 > iB) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        np0Var.d();
                        np0Var.d();
                        np0Var.d();
                        if (np0Var.b() && np0Var.b()) {
                            int i27 = 0;
                            for (int i28 = 4; i27 < i28; i28 = 4) {
                                int i29 = 0;
                                while (i29 < 6) {
                                    if (np0Var.b()) {
                                        int iMin = Math.min(64, 1 << ((i27 << 1) + 4));
                                        if (i27 > 1) {
                                            np0Var.c();
                                        }
                                        for (int i30 = 0; i30 < iMin; i30++) {
                                            np0Var.c();
                                        }
                                    } else {
                                        np0Var.d();
                                    }
                                    i29 += i27 == 3 ? 3 : 1;
                                    i17 = i17;
                                    i15 = i15;
                                }
                                i27++;
                                i15 = i15;
                                i20 = 2;
                            }
                        }
                        i10 = i15;
                        i11 = i17;
                        np0Var.d(i20);
                        if (np0Var.b()) {
                            np0Var.d(8);
                            np0Var.d();
                            np0Var.d();
                            np0Var.e();
                        }
                        int i31 = 0;
                        boolean zB2 = false;
                        int i32 = 0;
                        for (int iD10 = np0Var.d(); i31 < iD10; iD10 = iD10) {
                            if (i31 != 0) {
                                zB2 = np0Var.b();
                            }
                            if (zB2) {
                                np0Var.e();
                                np0Var.d();
                                for (int i33 = 0; i33 <= i32; i33++) {
                                    if (np0Var.b()) {
                                        np0Var.e();
                                    }
                                }
                            } else {
                                int iD11 = np0Var.d();
                                int iD12 = np0Var.d();
                                int i34 = iD11 + iD12;
                                for (int i35 = 0; i35 < iD11; i35++) {
                                    np0Var.d();
                                    np0Var.e();
                                }
                                for (int i36 = 0; i36 < iD12; i36++) {
                                    np0Var.d();
                                    np0Var.e();
                                }
                                i32 = i34;
                            }
                            i31++;
                        }
                        if (np0Var.b()) {
                            for (int i37 = 0; i37 < np0Var.d(); i37++) {
                                np0Var.d(iD9 + 4 + 1);
                            }
                        }
                        np0Var.d(2);
                        float f10 = 1.0f;
                        if (np0Var.b()) {
                            if (np0Var.b()) {
                                int iB5 = np0Var.b(8);
                                if (iB5 == 255) {
                                    int iB6 = np0Var.b(16);
                                    int iB7 = np0Var.b(16);
                                    if (iB6 != 0 && iB7 != 0) {
                                        f10 = iB6 / iB7;
                                    }
                                } else {
                                    float[] fArr = oh0.f23796b;
                                    if (iB5 < 17) {
                                        f10 = fArr[iB5];
                                    } else {
                                        o80.a("Unexpected aspect_ratio_idc value: ", iB5, "H265Reader");
                                    }
                                }
                            }
                            if (np0Var.b()) {
                                np0Var.e();
                            }
                            if (np0Var.b()) {
                                np0Var.d(4);
                                if (np0Var.b()) {
                                    np0Var.d(24);
                                }
                            }
                            if (np0Var.b()) {
                                np0Var.d();
                                np0Var.d();
                            }
                            np0Var.e();
                            if (np0Var.b()) {
                                iD4 *= 2;
                            }
                        }
                        j71Var.a(new yv.a().c(str).f("video/hevc").a(mj.a(iB2, zB, iB3, i21, iArr, iB4)).q(iD3).g(iD4).b(f10).a(Collections.singletonList(bArr)).a());
                        this.f22814e = true;
                    } else {
                        i10 = i15;
                        i11 = i17;
                    }
                }
                if (this.f22819j.a(i18)) {
                    nh0 nh0Var4 = this.f22819j;
                    this.f22823n.a(oh0.a(nh0Var4.f23390e, nh0Var4.f23389d), this.f22819j.f23389d);
                    this.f22823n.f(5);
                    this.f22810a.a(j11, this.f22823n);
                }
                if (this.f22820k.a(i18)) {
                    nh0 nh0Var5 = this.f22820k;
                    this.f22823n.a(oh0.a(nh0Var5.f23390e, nh0Var5.f23389d), this.f22820k.f23389d);
                    this.f22823n.f(5);
                    this.f22810a.a(j11, this.f22823n);
                }
                this.f22813d.a(i11, i10, j10, this.f22822m, this.f22814e);
                if (this.f22814e) {
                    i12 = i10;
                } else {
                    i12 = i10;
                    this.f22816g.b(i12);
                    this.f22817h.b(i12);
                    this.f22818i.b(i12);
                }
                this.f22819j.b(i12);
                this.f22820k.b(i12);
                iE = iE;
                bArrC = bArrC;
                iD = i14;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f22811b = dVar.b();
        j71 j71VarA = wtVar.a(dVar.c(), 2);
        this.f22812c = j71VarA;
        this.f22813d = new a(j71VarA);
        this.f22810a.a(wtVar, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
