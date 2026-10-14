package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f5864a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final af f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f5867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f5868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f5869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f5870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f5872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5875l;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final byte[] f5876d = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f5879c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f5881f;

        public a(int i10) {
            this.f5879c = new byte[i10];
        }

        public void a() {
            this.f5880e = false;
            this.f5877a = 0;
            this.f5881f = 0;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5880e) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f5879c;
                int length = bArr2.length;
                int i13 = this.f5877a;
                if (length < i13 + i12) {
                    this.f5879c = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f5879c, this.f5877a, i12);
                this.f5877a += i12;
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0041  */
        public boolean a(int i10, int i11) {
            int i12 = this.f5881f;
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
                                this.f5877a -= i11;
                                this.f5880e = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f5878b = this.f5877a;
                            this.f5881f = i13;
                        }
                    } else if (i10 > 31) {
                        com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f5881f = 3;
                    }
                } else if (i10 != 181) {
                    com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f5881f = i13;
                }
            } else if (i10 == 176) {
                this.f5881f = 1;
                this.f5880e = true;
            }
            byte[] bArr = f5876d;
            a(bArr, 0, bArr.length);
            return false;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f5882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f5887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f5888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5889h;

        public b(com.applovin.exoplayer2.e.x xVar) {
            this.f5882a = xVar;
        }

        public void a() {
            this.f5883b = false;
            this.f5884c = false;
            this.f5885d = false;
            this.f5886e = -1;
        }

        public void a(int i10, long j10) {
            this.f5886e = i10;
            this.f5885d = false;
            this.f5883b = i10 == 182 || i10 == 179;
            this.f5884c = i10 == 182;
            this.f5887f = 0;
            this.f5889h = j10;
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
        public void a(long j10, int i10, boolean z10) {
            if (this.f5886e == 182 && z10 && this.f5883b) {
                long j11 = this.f5889h;
                if (j11 != -9223372036854775807L) {
                    this.f5882a.a(j11, this.f5885d ? 1 : 0, (int) (j10 - this.f5888g), i10, null);
                }
            }
            if (this.f5886e != 179) {
                this.f5888g = j10;
            }
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5884c) {
                int i12 = this.f5887f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f5887f = (i11 - i10) + i12;
                } else {
                    this.f5885d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f5884c = false;
                }
            }
        }
    }

    public l() {
        this(null);
    }

    public l(af afVar) {
        com.applovin.exoplayer2.l.y yVar;
        this.f5865b = afVar;
        this.f5867d = new boolean[4];
        this.f5868e = new a(128);
        this.f5875l = -9223372036854775807L;
        if (afVar != null) {
            this.f5869f = new r(178, 128);
            yVar = new com.applovin.exoplayer2.l.y();
        } else {
            yVar = null;
            this.f5869f = null;
        }
        this.f5866c = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    private static com.applovin.exoplayer2.v a(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f5879c, aVar.f5877a);
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(bArrCopyOf);
        xVar.e(i10);
        xVar.e(4);
        xVar.d();
        xVar.b(8);
        if (xVar.e()) {
            xVar.b(4);
            xVar.b(3);
        }
        int iC = xVar.c(4);
        float f10 = 1.0f;
        if (iC == 15) {
            int iC2 = xVar.c(8);
            int iC3 = xVar.c(8);
            if (iC3 == 0) {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iC2 / iC3;
            }
        } else {
            float[] fArr = f5864a;
            if (iC < fArr.length) {
                f10 = fArr[iC];
            } else {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xVar.e()) {
            xVar.b(2);
            xVar.b(1);
            if (xVar.e()) {
                xVar.b(15);
                xVar.d();
                xVar.b(15);
                xVar.d();
                xVar.b(15);
                xVar.d();
                xVar.b(3);
                xVar.b(11);
                xVar.d();
                xVar.b(15);
                xVar.d();
            }
        }
        if (xVar.c(2) != 0) {
            com.applovin.exoplayer2.l.q.c("H263Reader", "Unhandled video object layer shape");
        }
        xVar.d();
        int iC4 = xVar.c(16);
        xVar.d();
        if (xVar.e()) {
            if (iC4 == 0) {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iC4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                xVar.b(i11);
            }
        }
        xVar.d();
        int iC5 = xVar.c(13);
        xVar.d();
        int iC6 = xVar.c(13);
        xVar.d();
        xVar.d();
        return new com.applovin.exoplayer2.v.a().a(str).f("video/mp4v-es").g(iC5).h(iC6).b(f10).a(Collections.singletonList(bArrCopyOf)).a();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        com.applovin.exoplayer2.l.v.a(this.f5867d);
        this.f5868e.a();
        b bVar = this.f5870g;
        if (bVar != null) {
            bVar.a();
        }
        r rVar = this.f5869f;
        if (rVar != null) {
            rVar.a();
        }
        this.f5871h = 0L;
        this.f5875l = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5875l = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5872i = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 2);
        this.f5873j = xVarA;
        this.f5870g = new b(xVarA);
        af afVar = this.f5865b;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f5870g);
        com.applovin.exoplayer2.l.a.a(this.f5873j);
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        this.f5871h += (long) yVar.a();
        this.f5873j.a(yVar, yVar.a());
        while (true) {
            int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.f5867d);
            if (iA == iB) {
                break;
            }
            int i10 = iA + 3;
            int i11 = yVar.d()[i10] & 255;
            int i12 = iA - iC;
            int i13 = 0;
            if (!this.f5874k) {
                if (i12 > 0) {
                    this.f5868e.a(bArrD, iC, iA);
                }
                if (this.f5868e.a(i11, i12 < 0 ? -i12 : 0)) {
                    com.applovin.exoplayer2.e.x xVar = this.f5873j;
                    a aVar = this.f5868e;
                    xVar.a(a(aVar, aVar.f5878b, (String) com.applovin.exoplayer2.l.a.b(this.f5872i)));
                    this.f5874k = true;
                }
            }
            this.f5870g.a(bArrD, iC, iA);
            r rVar = this.f5869f;
            if (rVar != null) {
                if (i12 > 0) {
                    rVar.a(bArrD, iC, iA);
                } else {
                    i13 = -i12;
                }
                if (this.f5869f.b(i13)) {
                    r rVar2 = this.f5869f;
                    ((com.applovin.exoplayer2.l.y) ai.a(this.f5866c)).a(this.f5869f.f6005a, com.applovin.exoplayer2.l.v.a(rVar2.f6005a, rVar2.f6006b));
                    ((af) ai.a(this.f5865b)).a(this.f5875l, this.f5866c);
                }
                if (i11 == 178 && yVar.d()[iA + 2] == 1) {
                    this.f5869f.a(i11);
                }
            }
            int i14 = iB - iA;
            this.f5870g.a(this.f5871h - ((long) i14), i14, this.f5874k);
            this.f5870g.a(i11, this.f5875l);
            iC = i10;
        }
        if (!this.f5874k) {
            this.f5868e.a(bArrD, iC, iB);
        }
        this.f5870g.a(bArrD, iC, iB);
        r rVar3 = this.f5869f;
        if (rVar3 != null) {
            rVar3.a(bArrD, iC, iB);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
