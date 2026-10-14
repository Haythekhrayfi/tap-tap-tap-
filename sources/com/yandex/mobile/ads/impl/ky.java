package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ky implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u01 f22528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22530c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22534g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f22536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j71 f22537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f22538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22539l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f22541n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f22535h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nh0 f22531d = new nh0(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nh0 f22532e = new nh0(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nh0 f22533f = new nh0(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22540m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final mp0 f22542o = new mp0();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j71 f22543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f22545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<oh0.c> f22546d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<oh0.b> f22547e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final np0 f22548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f22549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f22550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f22551i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f22552j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f22553k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f22554l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private C0208a f22555m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C0208a f22556n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f22557o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f22558p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f22559q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f22560r;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ky$a$a, reason: collision with other inner class name */
        public static final class C0208a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f22562b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private oh0.c f22563c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f22564d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f22565e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f22566f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f22567g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f22568h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f22569i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f22570j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f22571k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f22572l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f22573m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f22574n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f22575o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f22576p;

            private C0208a() {
            }

            public /* synthetic */ C0208a(int i10) {
                this();
            }

            public static boolean a(C0208a c0208a, C0208a c0208a2) {
                boolean z10;
                if (c0208a.f22561a) {
                    if (!c0208a2.f22561a) {
                        return true;
                    }
                    oh0.c cVar = (oh0.c) pa.b(c0208a.f22563c);
                    oh0.c cVar2 = (oh0.c) pa.b(c0208a2.f22563c);
                    if (c0208a.f22566f != c0208a2.f22566f || c0208a.f22567g != c0208a2.f22567g || c0208a.f22568h != c0208a2.f22568h) {
                        return true;
                    }
                    if (c0208a.f22569i && c0208a2.f22569i && c0208a.f22570j != c0208a2.f22570j) {
                        return true;
                    }
                    int i10 = c0208a.f22564d;
                    int i11 = c0208a2.f22564d;
                    if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                        return true;
                    }
                    int i12 = cVar.f23819k;
                    if (i12 == 0 && cVar2.f23819k == 0 && (c0208a.f22573m != c0208a2.f22573m || c0208a.f22574n != c0208a2.f22574n)) {
                        return true;
                    }
                    if ((i12 == 1 && cVar2.f23819k == 1 && (c0208a.f22575o != c0208a2.f22575o || c0208a.f22576p != c0208a2.f22576p)) || (z10 = c0208a.f22571k) != c0208a2.f22571k) {
                        return true;
                    }
                    if (z10 && c0208a.f22572l != c0208a2.f22572l) {
                        return true;
                    }
                }
                return false;
            }

            public final void a() {
                this.f22562b = false;
                this.f22561a = false;
            }

            public final void a(int i10) {
                this.f22565e = i10;
                this.f22562b = true;
            }

            public final void a(oh0.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f22563c = cVar;
                this.f22564d = i10;
                this.f22565e = i11;
                this.f22566f = i12;
                this.f22567g = i13;
                this.f22568h = z10;
                this.f22569i = z11;
                this.f22570j = z12;
                this.f22571k = z13;
                this.f22572l = i14;
                this.f22573m = i15;
                this.f22574n = i16;
                this.f22575o = i17;
                this.f22576p = i18;
                this.f22561a = true;
                this.f22562b = true;
            }

            public final boolean b() {
                int i10;
                return this.f22562b && ((i10 = this.f22565e) == 7 || i10 == 2);
            }
        }

        public a(j71 j71Var, boolean z10, boolean z11) {
            this.f22543a = j71Var;
            this.f22544b = z10;
            this.f22545c = z11;
            int i10 = 0;
            this.f22555m = new C0208a(i10);
            this.f22556n = new C0208a(i10);
            byte[] bArr = new byte[128];
            this.f22549g = bArr;
            this.f22548f = new np0(bArr, 0, 0);
            b();
        }

        public final void a(int i10, long j10, long j11) {
            this.f22551i = i10;
            this.f22554l = j11;
            this.f22552j = j10;
            if (!this.f22544b || i10 != 1) {
                if (!this.f22545c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            C0208a c0208a = this.f22555m;
            this.f22555m = this.f22556n;
            this.f22556n = c0208a;
            c0208a.a();
            this.f22550h = 0;
            this.f22553k = true;
        }

        public final void a(oh0.b bVar) {
            this.f22547e.append(bVar.f23806a, bVar);
        }

        public final void a(oh0.c cVar) {
            this.f22546d.append(cVar.f23812d, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:56:0x0102  */
        /* JADX WARN: Code duplicated, block: B:58:0x010a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010b  */
        /* JADX WARN: Code duplicated, block: B:60:0x0114  */
        /* JADX WARN: Code duplicated, block: B:63:0x011a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0124 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0125  */
        /* JADX WARN: Code duplicated, block: B:74:0x014e  */
        public final void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zB;
            boolean z12;
            int iD;
            int i12;
            int i13;
            int iC;
            int i14;
            int iC2;
            int iB;
            if (this.f22553k) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.f22549g;
                int length = bArr2.length;
                int i16 = this.f22550h + i15;
                if (length < i16) {
                    this.f22549g = Arrays.copyOf(bArr2, i16 * 2);
                }
                System.arraycopy(bArr, i10, this.f22549g, this.f22550h, i15);
                int i17 = this.f22550h + i15;
                this.f22550h = i17;
                this.f22548f.a(this.f22549g, 0, i17);
                if (this.f22548f.a(8)) {
                    this.f22548f.e();
                    int iB2 = this.f22548f.b(2);
                    this.f22548f.d(5);
                    if (this.f22548f.a()) {
                        this.f22548f.d();
                        if (this.f22548f.a()) {
                            int iD2 = this.f22548f.d();
                            if (!this.f22545c) {
                                this.f22553k = false;
                                this.f22556n.a(iD2);
                                return;
                            }
                            if (this.f22548f.a()) {
                                int iD3 = this.f22548f.d();
                                if (this.f22547e.indexOfKey(iD3) < 0) {
                                    this.f22553k = false;
                                    return;
                                }
                                oh0.b bVar = this.f22547e.get(iD3);
                                oh0.c cVar = this.f22546d.get(bVar.f23807b);
                                if (cVar.f23816h) {
                                    if (!this.f22548f.a(2)) {
                                        return;
                                    } else {
                                        this.f22548f.d(2);
                                    }
                                }
                                if (this.f22548f.a(cVar.f23818j)) {
                                    int iB3 = this.f22548f.b(cVar.f23818j);
                                    if (!cVar.f23817i) {
                                        if (this.f22548f.a(1)) {
                                            boolean zB2 = this.f22548f.b();
                                            if (!zB2) {
                                                z10 = zB2;
                                                z11 = false;
                                            } else {
                                                if (!this.f22548f.a(1)) {
                                                    return;
                                                }
                                                z10 = zB2;
                                                z11 = true;
                                                zB = this.f22548f.b();
                                            }
                                            if (this.f22551i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iD = 0;
                                            } else if (!this.f22548f.a()) {
                                                return;
                                            } else {
                                                iD = this.f22548f.d();
                                            }
                                            i12 = cVar.f23819k;
                                            if (i12 != 0) {
                                                if (this.f22548f.a(cVar.f23820l)) {
                                                    iB = this.f22548f.b(cVar.f23820l);
                                                    if (bVar.f23808c || z10) {
                                                        i13 = iB;
                                                        iC = 0;
                                                    } else {
                                                        if (!this.f22548f.a()) {
                                                            return;
                                                        }
                                                        iC = this.f22548f.c();
                                                        i13 = iB;
                                                        i14 = 0;
                                                    }
                                                    iC2 = i14;
                                                    this.f22556n.a(cVar, iB2, iD2, iB3, iD3, z10, z11, zB, z12, iD, i13, iC, i14, iC2);
                                                    this.f22553k = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || cVar.f23821m) {
                                                i13 = 0;
                                                iC = 0;
                                            } else {
                                                if (!this.f22548f.a()) {
                                                    return;
                                                }
                                                int iC3 = this.f22548f.c();
                                                if (!bVar.f23808c || z10) {
                                                    i14 = iC3;
                                                    i13 = 0;
                                                    iC = 0;
                                                    iC2 = 0;
                                                } else {
                                                    if (!this.f22548f.a()) {
                                                        return;
                                                    }
                                                    iC2 = this.f22548f.c();
                                                    i14 = iC3;
                                                    i13 = 0;
                                                    iC = 0;
                                                }
                                            }
                                            this.f22556n.a(cVar, iB2, iD2, iB3, iD3, z10, z11, zB, z12, iD, i13, iC, i14, iC2);
                                            this.f22553k = false;
                                            i14 = iC;
                                            iC2 = i14;
                                            this.f22556n.a(cVar, iB2, iD2, iB3, iD3, z10, z11, zB, z12, iD, i13, iC, i14, iC2);
                                            this.f22553k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zB = z11;
                                    if (this.f22551i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iD = 0;
                                    } else if (!this.f22548f.a()) {
                                        return;
                                    } else {
                                        iD = this.f22548f.d();
                                    }
                                    i12 = cVar.f23819k;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        iC = 0;
                                    } else {
                                        if (this.f22548f.a(cVar.f23820l)) {
                                            return;
                                        }
                                        iB = this.f22548f.b(cVar.f23820l);
                                        if (bVar.f23808c) {
                                        }
                                        i13 = iB;
                                        iC = 0;
                                    }
                                    i14 = iC;
                                    iC2 = i14;
                                    this.f22556n.a(cVar, iB2, iD2, iB3, iD3, z10, z11, zB, z12, iD, i13, iC, i14, iC2);
                                    this.f22553k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public final boolean a() {
            return this.f22545c;
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
        public final boolean a(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f22551i == 9 || (this.f22545c && C0208a.a(this.f22556n, this.f22555m))) {
                if (z10 && this.f22557o) {
                    long j11 = this.f22552j;
                    int i11 = i10 + ((int) (j10 - j11));
                    long j12 = this.f22559q;
                    if (j12 != -9223372036854775807L) {
                        this.f22543a.a(j12, this.f22560r ? 1 : 0, (int) (j11 - this.f22558p), i11, null);
                    }
                }
                this.f22558p = this.f22552j;
                this.f22559q = this.f22554l;
                this.f22560r = false;
                this.f22557o = true;
            }
            boolean zB = this.f22544b ? this.f22556n.b() : z11;
            boolean z13 = this.f22560r;
            int i12 = this.f22551i;
            if (i12 == 5 || (zB && i12 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f22560r = z14;
            return z14;
        }

        public final void b() {
            this.f22553k = false;
            this.f22557o = false;
            this.f22556n.a();
        }
    }

    public ky(u01 u01Var, boolean z10, boolean z11) {
        this.f22528a = u01Var;
        this.f22529b = z10;
        this.f22530c = z11;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f22534g = 0L;
        this.f22541n = false;
        this.f22540m = -9223372036854775807L;
        oh0.a(this.f22535h);
        this.f22531d.b();
        this.f22532e.b();
        this.f22533f.b();
        a aVar = this.f22538k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f22540m = j10;
        }
        this.f22541n = ((i10 & 2) != 0) | this.f22541n;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        int i10;
        nh0 nh0Var;
        pa.b(this.f22537j);
        int i11 = da1.f19803a;
        int iD = mp0Var.d();
        int iE = mp0Var.e();
        byte[] bArrC = mp0Var.c();
        this.f22534g += (long) mp0Var.a();
        this.f22537j.a(mp0Var.a(), mp0Var);
        while (true) {
            int iA = oh0.a(bArrC, iD, iE, this.f22535h);
            if (iA == iE) {
                break;
            }
            int i12 = iA + 3;
            int i13 = bArrC[i12] & Ascii.US;
            int i14 = iA - iD;
            if (i14 > 0) {
                if (!this.f22539l || this.f22538k.a()) {
                    this.f22531d.a(bArrC, iD, iA);
                    this.f22532e.a(bArrC, iD, iA);
                }
                this.f22533f.a(bArrC, iD, iA);
                this.f22538k.a(bArrC, iD, iA);
            }
            int i15 = iE - iA;
            long j10 = this.f22534g - ((long) i15);
            int i16 = i14 < 0 ? -i14 : 0;
            long j11 = this.f22540m;
            if (!this.f22539l || this.f22538k.a()) {
                this.f22531d.a(i16);
                this.f22532e.a(i16);
                if (this.f22539l) {
                    i10 = iE;
                    if (this.f22531d.a()) {
                        nh0 nh0Var2 = this.f22531d;
                        this.f22538k.a(oh0.b(nh0Var2.f23389d, 3, nh0Var2.f23390e));
                        nh0Var = this.f22531d;
                        nh0Var.b();
                    } else if (this.f22532e.a()) {
                        nh0 nh0Var3 = this.f22532e;
                        np0 np0Var = new np0(nh0Var3.f23389d, 4, nh0Var3.f23390e);
                        int iD2 = np0Var.d();
                        int iD3 = np0Var.d();
                        np0Var.e();
                        this.f22538k.a(new oh0.b(iD2, iD3, np0Var.b()));
                    }
                } else if (this.f22531d.a() && this.f22532e.a()) {
                    ArrayList arrayList = new ArrayList();
                    nh0 nh0Var4 = this.f22531d;
                    arrayList.add(Arrays.copyOf(nh0Var4.f23389d, nh0Var4.f23390e));
                    nh0 nh0Var5 = this.f22532e;
                    arrayList.add(Arrays.copyOf(nh0Var5.f23389d, nh0Var5.f23390e));
                    nh0 nh0Var6 = this.f22531d;
                    oh0.c cVarB = oh0.b(nh0Var6.f23389d, 3, nh0Var6.f23390e);
                    nh0 nh0Var7 = this.f22532e;
                    np0 np0Var2 = new np0(nh0Var7.f23389d, 4, nh0Var7.f23390e);
                    int iD4 = np0Var2.d();
                    int iD5 = np0Var2.d();
                    np0Var2.e();
                    oh0.b bVar = new oh0.b(iD4, iD5, np0Var2.b());
                    i10 = iE;
                    this.f22537j.a(new yv.a().c(this.f22536i).f("video/avc").a(String.format("avc1.%02X%02X%02X", Integer.valueOf(cVarB.f23809a), Integer.valueOf(cVarB.f23810b), Integer.valueOf(cVarB.f23811c))).q(cVarB.f23813e).g(cVarB.f23814f).b(cVarB.f23815g).a(arrayList).a());
                    this.f22539l = true;
                    this.f22538k.a(cVarB);
                    this.f22538k.a(bVar);
                    this.f22531d.b();
                } else {
                    i10 = iE;
                }
                nh0Var = this.f22532e;
                nh0Var.b();
            } else {
                i10 = iE;
            }
            if (this.f22533f.a(i16)) {
                nh0 nh0Var8 = this.f22533f;
                this.f22542o.a(oh0.a(nh0Var8.f23390e, nh0Var8.f23389d), this.f22533f.f23389d);
                this.f22542o.e(4);
                this.f22528a.a(j11, this.f22542o);
            }
            if (this.f22538k.a(j10, i15, this.f22539l, this.f22541n)) {
                this.f22541n = false;
            }
            long j12 = this.f22540m;
            if (!this.f22539l || this.f22538k.a()) {
                this.f22531d.b(i13);
                this.f22532e.b(i13);
            }
            this.f22533f.b(i13);
            this.f22538k.a(i13, j10, j12);
            iD = i12;
            iE = i10;
        }
        if (!this.f22539l || this.f22538k.a()) {
            this.f22531d.a(bArrC, iD, iE);
            this.f22532e.a(bArrC, iD, iE);
        }
        this.f22533f.a(bArrC, iD, iE);
        this.f22538k.a(bArrC, iD, iE);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f22536i = dVar.b();
        j71 j71VarA = wtVar.a(dVar.c(), 2);
        this.f22537j = j71VarA;
        this.f22538k = new a(j71VarA, this.f22529b, this.f22530c);
        this.f22528a.a(wtVar, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
