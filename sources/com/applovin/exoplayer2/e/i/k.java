package com.applovin.exoplayer2.e.i;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[] f5842c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5844b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final af f5845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f5847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f5848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f5849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5858q;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final byte[] f5859d = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f5862c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5863e;

        public a(int i10) {
            this.f5862c = new byte[i10];
        }

        public void a() {
            this.f5863e = false;
            this.f5860a = 0;
            this.f5861b = 0;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5863e) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f5862c;
                int length = bArr2.length;
                int i13 = this.f5860a;
                if (length < i13 + i12) {
                    this.f5862c = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f5862c, this.f5860a, i12);
                this.f5860a += i12;
            }
        }

        public boolean a(int i10, int i11) {
            if (this.f5863e) {
                int i12 = this.f5860a - i11;
                this.f5860a = i12;
                if (this.f5861b != 0 || i10 != 181) {
                    this.f5863e = false;
                    return true;
                }
                this.f5861b = i12;
            } else if (i10 == 179) {
                this.f5863e = true;
            }
            byte[] bArr = f5859d;
            a(bArr, 0, bArr.length);
            return false;
        }
    }

    public k() {
        this(null);
    }

    public k(af afVar) {
        com.applovin.exoplayer2.l.y yVar;
        this.f5845d = afVar;
        this.f5848g = new boolean[4];
        this.f5849h = new a(128);
        if (afVar != null) {
            this.f5847f = new r(178, 128);
            yVar = new com.applovin.exoplayer2.l.y();
        } else {
            yVar = null;
            this.f5847f = null;
        }
        this.f5846e = yVar;
        this.f5854m = -9223372036854775807L;
        this.f5856o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    private static Pair<com.applovin.exoplayer2.v, Long> a(a aVar, String str) {
        float f10;
        int i10;
        float f11;
        long j10;
        int i11;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f5862c, aVar.f5860a);
        int i14 = bArrCopyOf[4] & 255;
        int i15 = bArrCopyOf[5] & 255;
        int i16 = (i14 << 4) | (i15 >> 4);
        int i17 = ((i15 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f10 = i17 * 4;
            i10 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i17 * 121;
                    i10 = i16 * 100;
                }
                com.applovin.exoplayer2.v vVarA = new com.applovin.exoplayer2.v.a().a(str).f("video/mpeg2").g(i16).h(i17).b(f11).a(Collections.singletonList(bArrCopyOf)).a();
                j10 = 0;
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f5842c;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        int i19 = aVar.f5861b + 9;
                        i12 = (bArrCopyOf[i19] & 96) >> 5;
                        i13 = bArrCopyOf[i19] & Ascii.US;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    }
                }
                return Pair.create(vVarA, Long.valueOf(j10));
            }
            f10 = i17 * 16;
            i10 = i16 * 9;
        }
        f11 = f10 / i10;
        com.applovin.exoplayer2.v vVarA2 = new com.applovin.exoplayer2.v.a().a(str).f("video/mpeg2").g(i16).h(i17).b(f11).a(Collections.singletonList(bArrCopyOf)).a();
        j10 = 0;
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f5842c;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                int i110 = aVar.f5861b + 9;
                i12 = (bArrCopyOf[i110] & 96) >> 5;
                i13 = bArrCopyOf[i110] & Ascii.US;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(vVarA2, Long.valueOf(j10));
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        com.applovin.exoplayer2.l.v.a(this.f5848g);
        this.f5849h.a();
        r rVar = this.f5847f;
        if (rVar != null) {
            rVar.a();
        }
        this.f5850i = 0L;
        this.f5851j = false;
        this.f5854m = -9223372036854775807L;
        this.f5856o = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        this.f5854m = j10;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5843a = dVar.c();
        this.f5844b = jVar.a(dVar.b(), 2);
        af afVar = this.f5845d;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
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
    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        boolean z10;
        int i10;
        com.applovin.exoplayer2.l.a.a(this.f5844b);
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        this.f5850i += (long) yVar.a();
        this.f5844b.a(yVar, yVar.a());
        while (true) {
            int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.f5848g);
            if (iA == iB) {
                break;
            }
            int i11 = iA + 3;
            int i12 = yVar.d()[i11] & 255;
            int i13 = iA - iC;
            if (!this.f5852k) {
                if (i13 > 0) {
                    this.f5849h.a(bArrD, iC, iA);
                }
                if (this.f5849h.a(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<com.applovin.exoplayer2.v, Long> pairA = a(this.f5849h, (String) com.applovin.exoplayer2.l.a.b(this.f5843a));
                    this.f5844b.a((com.applovin.exoplayer2.v) pairA.first);
                    this.f5853l = ((Long) pairA.second).longValue();
                    this.f5852k = true;
                }
            }
            r rVar = this.f5847f;
            if (rVar != null) {
                if (i13 > 0) {
                    rVar.a(bArrD, iC, iA);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f5847f.b(i10)) {
                    r rVar2 = this.f5847f;
                    ((com.applovin.exoplayer2.l.y) ai.a(this.f5846e)).a(this.f5847f.f6005a, com.applovin.exoplayer2.l.v.a(rVar2.f6005a, rVar2.f6006b));
                    ((af) ai.a(this.f5845d)).a(this.f5856o, this.f5846e);
                }
                if (i12 == 178 && yVar.d()[iA + 2] == 1) {
                    this.f5847f.a(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iB - iA;
                if (this.f5858q && this.f5852k) {
                    long j10 = this.f5856o;
                    if (j10 != -9223372036854775807L) {
                        this.f5844b.a(j10, this.f5857p ? 1 : 0, ((int) (this.f5850i - this.f5855n)) - i14, i14, null);
                    }
                }
                if (!this.f5851j || this.f5858q) {
                    this.f5855n = this.f5850i - ((long) i14);
                    long j11 = this.f5854m;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.f5856o;
                        j11 = j12 != -9223372036854775807L ? j12 + this.f5853l : -9223372036854775807L;
                    }
                    this.f5856o = j11;
                    this.f5857p = false;
                    this.f5854m = -9223372036854775807L;
                    z10 = true;
                    this.f5851j = true;
                } else {
                    z10 = true;
                }
                this.f5858q = i12 == 0 ? z10 : false;
            } else if (i12 == 184) {
                this.f5857p = true;
            }
            iC = i11;
        }
        if (!this.f5852k) {
            this.f5849h.a(bArrD, iC, iB);
        }
        r rVar3 = this.f5847f;
        if (rVar3 != null) {
            rVar3.a(bArrD, iC, iB);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
