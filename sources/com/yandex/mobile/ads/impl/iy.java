package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class iy implements lr {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double[] f21841q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j71 f21843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ca1 f21844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp0 f21845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nh0 f21846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f21847f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f21848g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f21854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f21855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21857p;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f21858e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f21862d = new byte[128];

        public final void a() {
            this.f21859a = false;
            this.f21860b = 0;
            this.f21861c = 0;
        }

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f21859a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f21862d;
                int length = bArr2.length;
                int i13 = this.f21860b + i12;
                if (length < i13) {
                    this.f21862d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f21862d, this.f21860b, i12);
                this.f21860b += i12;
            }
        }

        public final boolean a(int i10, int i11) {
            if (this.f21859a) {
                int i12 = this.f21860b - i11;
                this.f21860b = i12;
                if (this.f21861c != 0 || i10 != 181) {
                    this.f21859a = false;
                    return true;
                }
                this.f21861c = i12;
            } else if (i10 == 179) {
                this.f21859a = true;
            }
            a(f21858e, 0, 3);
            return false;
        }
    }

    public iy(ca1 ca1Var) {
        mp0 mp0Var;
        this.f21844c = ca1Var;
        if (ca1Var != null) {
            this.f21846e = new nh0(178);
            mp0Var = new mp0();
        } else {
            mp0Var = null;
            this.f21846e = null;
        }
        this.f21845d = mp0Var;
        this.f21853l = -9223372036854775807L;
        this.f21855n = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        oh0.a(this.f21847f);
        this.f21848g.a();
        nh0 nh0Var = this.f21846e;
        if (nh0Var != null) {
            nh0Var.b();
        }
        this.f21849h = 0L;
        this.f21850i = false;
        this.f21853l = -9223372036854775807L;
        this.f21855n = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        this.f21853l = j10;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
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
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        boolean z10;
        boolean z11;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        long j10;
        double[] dArr;
        double d10;
        int i13;
        int i14;
        pa.b(this.f21843b);
        int iD = mp0Var.d();
        int iE = mp0Var.e();
        byte[] bArrC = mp0Var.c();
        this.f21849h += (long) mp0Var.a();
        this.f21843b.a(mp0Var.a(), mp0Var);
        while (true) {
            int iA = oh0.a(bArrC, iD, iE, this.f21847f);
            if (iA == iE) {
                break;
            }
            int i15 = iA + 3;
            int i16 = mp0Var.c()[i15] & 255;
            int i17 = iA - iD;
            if (this.f21851j) {
                i15 = i15;
            } else {
                if (i17 > 0) {
                    this.f21848g.a(bArrC, iD, iA);
                }
                if (this.f21848g.a(i16, i17 < 0 ? -i17 : 0)) {
                    a aVar = this.f21848g;
                    String str = this.f21842a;
                    Objects.requireNonNull(str);
                    byte[] bArrCopyOf = Arrays.copyOf(aVar.f21862d, aVar.f21860b);
                    int i18 = bArrCopyOf[4] & 255;
                    int i19 = bArrCopyOf[5] & 255;
                    int i20 = (i18 << 4) | (i19 >> 4);
                    int i21 = ((i19 & 15) << 8) | (bArrCopyOf[6] & 255);
                    int i22 = (bArrCopyOf[7] & 240) >> 4;
                    if (i22 == 2) {
                        f10 = i21 * 4;
                        i11 = i20 * 3;
                    } else if (i22 != 3) {
                        if (i22 != 4) {
                            f11 = 1.0f;
                        } else {
                            f10 = i21 * 121;
                            i11 = i20 * 100;
                        }
                        yv yvVarA = new yv.a().c(str).f("video/mpeg2").q(i20).g(i21).b(f11).a(Collections.singletonList(bArrCopyOf)).a();
                        i12 = (bArrCopyOf[7] & 15) - 1;
                        if (i12 >= 0) {
                            dArr = f21841q;
                            if (i12 < 8) {
                                d10 = dArr[i12];
                                byte b10 = bArrCopyOf[aVar.f21861c + 9];
                                i13 = (b10 & 96) >> 5;
                                i14 = b10 & Ascii.US;
                                if (i13 != i14) {
                                    d10 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                                }
                                j10 = (long) (1000000.0d / d10);
                            } else {
                                i15 = i15;
                                j10 = 0;
                            }
                        } else {
                            i15 = i15;
                            j10 = 0;
                        }
                        Pair pairCreate = Pair.create(yvVarA, Long.valueOf(j10));
                        this.f21843b.a((yv) pairCreate.first);
                        this.f21852k = ((Long) pairCreate.second).longValue();
                        this.f21851j = true;
                    } else {
                        f10 = i21 * 16;
                        i11 = i20 * 9;
                    }
                    f11 = f10 / i11;
                    yv yvVarA2 = new yv.a().c(str).f("video/mpeg2").q(i20).g(i21).b(f11).a(Collections.singletonList(bArrCopyOf)).a();
                    i12 = (bArrCopyOf[7] & 15) - 1;
                    if (i12 >= 0) {
                        dArr = f21841q;
                        if (i12 < 8) {
                            d10 = dArr[i12];
                            byte b11 = bArrCopyOf[aVar.f21861c + 9];
                            i13 = (b11 & 96) >> 5;
                            i14 = b11 & Ascii.US;
                            if (i13 != i14) {
                                d10 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                            }
                            j10 = (long) (1000000.0d / d10);
                        } else {
                            i15 = i15;
                            j10 = 0;
                        }
                    } else {
                        i15 = i15;
                        j10 = 0;
                    }
                    Pair pairCreate2 = Pair.create(yvVarA2, Long.valueOf(j10));
                    this.f21843b.a((yv) pairCreate2.first);
                    this.f21852k = ((Long) pairCreate2.second).longValue();
                    this.f21851j = true;
                } else {
                    i15 = i15;
                }
            }
            nh0 nh0Var = this.f21846e;
            if (nh0Var != null) {
                if (i17 > 0) {
                    nh0Var.a(bArrC, iD, iA);
                    i10 = 0;
                } else {
                    i10 = -i17;
                }
                if (this.f21846e.a(i10)) {
                    nh0 nh0Var2 = this.f21846e;
                    int iA2 = oh0.a(nh0Var2.f23390e, nh0Var2.f23389d);
                    mp0 mp0Var2 = this.f21845d;
                    int i23 = da1.f19803a;
                    mp0Var2.a(iA2, this.f21846e.f23389d);
                    this.f21844c.a(this.f21855n, this.f21845d);
                }
                if (i16 == 178 && mp0Var.c()[iA + 2] == 1) {
                    this.f21846e.b(i16);
                }
            }
            if (i16 == 0 || i16 == 179) {
                int i24 = iE - iA;
                if (this.f21857p && this.f21851j) {
                    long j11 = this.f21855n;
                    if (j11 != -9223372036854775807L) {
                        this.f21843b.a(j11, this.f21856o ? 1 : 0, ((int) (this.f21849h - this.f21854m)) - i24, i24, null);
                    }
                }
                if (!this.f21850i || this.f21857p) {
                    this.f21854m = this.f21849h - ((long) i24);
                    long j12 = this.f21853l;
                    if (j12 == -9223372036854775807L) {
                        long j13 = this.f21855n;
                        j12 = j13 != -9223372036854775807L ? j13 + this.f21852k : -9223372036854775807L;
                    }
                    this.f21855n = j12;
                    z10 = false;
                    this.f21856o = false;
                    this.f21853l = -9223372036854775807L;
                    z11 = true;
                    this.f21850i = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                this.f21857p = i16 == 0 ? z11 : z10;
            } else if (i16 == 184) {
                this.f21856o = true;
            }
            iD = i15;
        }
        if (!this.f21851j) {
            this.f21848g.a(bArrC, iD, iE);
        }
        nh0 nh0Var3 = this.f21846e;
        if (nh0Var3 != null) {
            nh0Var3.a(bArrC, iD, iE);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f21842a = dVar.b();
        this.f21843b = wtVar.a(dVar.c(), 2);
        ca1 ca1Var = this.f21844c;
        if (ca1Var != null) {
            ca1Var.a(wtVar, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
