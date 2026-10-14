package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jy implements lr {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f22170l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca1 f22171a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f22176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f22178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j71 f22179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22180j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f22173c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f22174d = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22181k = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nh0 f22175e = new nh0(178);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f22172b = new mp0();

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f22182f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f22187e = new byte[128];

        public final void a() {
            this.f22183a = false;
            this.f22185c = 0;
            this.f22184b = 0;
        }

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f22183a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f22187e;
                int length = bArr2.length;
                int i13 = this.f22185c + i12;
                if (length < i13) {
                    this.f22187e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f22187e, this.f22185c, i12);
                this.f22185c += i12;
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0041  */
        public final boolean a(int i10, int i11) {
            int i12 = this.f22184b;
            if (i12 != 0) {
                int i13 = 2;
                if (i12 != 1) {
                    if (i12 != 2) {
                        i13 = 4;
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f22185c -= i11;
                                this.f22183a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            p90.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f22186d = this.f22185c;
                            this.f22184b = i13;
                        }
                    } else if (i10 > 31) {
                        p90.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f22184b = 3;
                    }
                } else if (i10 != 181) {
                    p90.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f22184b = i13;
                }
            } else if (i10 == 176) {
                this.f22184b = 1;
                this.f22183a = true;
            }
            a(f22182f, 0, 3);
            return false;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j71 f22188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f22194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f22195h;

        public b(j71 j71Var) {
            this.f22188a = j71Var;
        }

        public final void a() {
            this.f22189b = false;
            this.f22190c = false;
            this.f22191d = false;
            this.f22192e = -1;
        }

        public final void a(int i10, long j10) {
            this.f22192e = i10;
            this.f22191d = false;
            this.f22189b = i10 == 182 || i10 == 179;
            this.f22190c = i10 == 182;
            this.f22193f = 0;
            this.f22195h = j10;
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
            if (this.f22192e == 182 && z10 && this.f22189b) {
                long j11 = this.f22195h;
                if (j11 != -9223372036854775807L) {
                    this.f22188a.a(j11, this.f22191d ? 1 : 0, (int) (j10 - this.f22194g), i10, null);
                }
            }
            if (this.f22192e != 179) {
                this.f22194g = j10;
            }
        }

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f22190c) {
                int i12 = this.f22193f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f22193f = (i11 - i10) + i12;
                } else {
                    this.f22191d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f22190c = false;
                }
            }
        }
    }

    public jy(ca1 ca1Var) {
        this.f22171a = ca1Var;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        oh0.a(this.f22173c);
        this.f22174d.a();
        b bVar = this.f22176f;
        if (bVar != null) {
            bVar.a();
        }
        nh0 nh0Var = this.f22175e;
        if (nh0Var != null) {
            nh0Var.b();
        }
        this.f22177g = 0L;
        this.f22181k = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f22181k = j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        int i10;
        int i11;
        pa.b(this.f22176f);
        pa.b(this.f22179i);
        int iD = mp0Var.d();
        int iE = mp0Var.e();
        byte[] bArrC = mp0Var.c();
        this.f22177g += (long) mp0Var.a();
        this.f22179i.a(mp0Var.a(), mp0Var);
        while (true) {
            int iA = oh0.a(bArrC, iD, iE, this.f22173c);
            if (iA == iE) {
                break;
            }
            int i12 = iA + 3;
            int i13 = mp0Var.c()[i12] & 255;
            int i14 = iA - iD;
            if (this.f22180j) {
                i10 = i12;
            } else {
                if (i14 > 0) {
                    this.f22174d.a(bArrC, iD, iA);
                }
                if (this.f22174d.a(i13, i14 < 0 ? -i14 : 0)) {
                    j71 j71Var = this.f22179i;
                    a aVar = this.f22174d;
                    int i15 = aVar.f22186d;
                    String str = this.f22178h;
                    Objects.requireNonNull(str);
                    byte[] bArrCopyOf = Arrays.copyOf(aVar.f22187e, aVar.f22185c);
                    lp0 lp0Var = new lp0(bArrCopyOf.length, bArrCopyOf);
                    lp0Var.e(i15);
                    lp0Var.e(4);
                    lp0Var.h();
                    lp0Var.d(8);
                    if (lp0Var.f()) {
                        lp0Var.d(4);
                        lp0Var.d(3);
                    }
                    int iB = lp0Var.b(4);
                    float f10 = 1.0f;
                    if (iB == 15) {
                        int iB2 = lp0Var.b(8);
                        int iB3 = lp0Var.b(8);
                        if (iB3 == 0) {
                            p90.d("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iB2 / iB3;
                        }
                        i10 = i12;
                    } else {
                        float[] fArr = f22170l;
                        i10 = i12;
                        if (iB < 7) {
                            f10 = fArr[iB];
                        } else {
                            p90.d("H263Reader", "Invalid aspect ratio");
                        }
                    }
                    float f11 = f10;
                    if (lp0Var.f()) {
                        lp0Var.d(2);
                        lp0Var.d(1);
                        if (lp0Var.f()) {
                            lp0Var.d(15);
                            lp0Var.h();
                            lp0Var.d(15);
                            lp0Var.h();
                            lp0Var.d(15);
                            lp0Var.h();
                            lp0Var.d(3);
                            lp0Var.d(11);
                            lp0Var.h();
                            lp0Var.d(15);
                            lp0Var.h();
                        }
                    }
                    if (lp0Var.b(2) != 0) {
                        p90.d("H263Reader", "Unhandled video object layer shape");
                    }
                    lp0Var.h();
                    int iB4 = lp0Var.b(16);
                    lp0Var.h();
                    if (lp0Var.f()) {
                        if (iB4 == 0) {
                            p90.d("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i16 = 0;
                            for (int i17 = iB4 - 1; i17 > 0; i17 >>= 1) {
                                i16++;
                            }
                            lp0Var.d(i16);
                        }
                    }
                    lp0Var.h();
                    int iB5 = lp0Var.b(13);
                    lp0Var.h();
                    int iB6 = lp0Var.b(13);
                    lp0Var.h();
                    lp0Var.h();
                    j71Var.a(new yv.a().c(str).f("video/mp4v-es").q(iB5).g(iB6).b(f11).a(Collections.singletonList(bArrCopyOf)).a());
                    this.f22180j = true;
                } else {
                    i10 = i12;
                }
            }
            this.f22176f.a(bArrC, iD, iA);
            nh0 nh0Var = this.f22175e;
            if (nh0Var != null) {
                if (i14 > 0) {
                    nh0Var.a(bArrC, iD, iA);
                    i11 = 0;
                } else {
                    i11 = -i14;
                }
                if (this.f22175e.a(i11)) {
                    nh0 nh0Var2 = this.f22175e;
                    int iA2 = oh0.a(nh0Var2.f23390e, nh0Var2.f23389d);
                    mp0 mp0Var2 = this.f22172b;
                    int i18 = da1.f19803a;
                    mp0Var2.a(iA2, this.f22175e.f23389d);
                    this.f22171a.a(this.f22181k, this.f22172b);
                }
                if (i13 == 178 && mp0Var.c()[iA + 2] == 1) {
                    this.f22175e.b(i13);
                }
            }
            int i19 = iE - iA;
            this.f22176f.a(i19, this.f22177g - ((long) i19), this.f22180j);
            this.f22176f.a(i13, this.f22181k);
            iD = i10;
        }
        if (!this.f22180j) {
            this.f22174d.a(bArrC, iD, iE);
        }
        this.f22176f.a(bArrC, iD, iE);
        nh0 nh0Var3 = this.f22175e;
        if (nh0Var3 != null) {
            nh0Var3.a(bArrC, iD, iE);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f22178h = dVar.b();
        j71 j71VarA = wtVar.a(dVar.c(), 2);
        this.f22179i = j71VarA;
        this.f22176f = new b(j71VarA);
        ca1 ca1Var = this.f22171a;
        if (ca1Var != null) {
            ca1Var.a(wtVar, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
