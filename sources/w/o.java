package w;

/* JADX INFO: loaded from: classes.dex */
public class o extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f37061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f37062l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37063a;

        static {
            int[] iArr = new int[q.b.values().length];
            f37063a = iArr;
            try {
                iArr[q.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37063a[q.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37063a[q.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o(v.f fVar) {
        super(fVar);
        g gVar = new g(this);
        this.f37061k = gVar;
        this.f37062l = null;
        this.f37077h.f37044e = g.a.TOP;
        this.f37078i.f37044e = g.a.BOTTOM;
        gVar.f37044e = g.a.BASELINE;
        this.f37075f = 1;
    }

    @Override // w.q, w.d
    public void a(d dVar) {
        int i10;
        if (a.f37063a[this.f37079j.ordinal()] == 3) {
            v.f fVar = this.f37071b;
            l(fVar.N, fVar.P, 1);
            return;
        }
        h hVar = this.f37074e;
        if (hVar.f37042c && !hVar.f37049j && this.f37073d == v.f.b.MATCH_CONSTRAINT) {
            v.f fVar2 = this.f37071b;
            int i11 = fVar2.f36613t;
            if (i11 == 2) {
                v.f fVar3 = fVar2.Y;
                if (fVar3 != null) {
                    h hVar2 = fVar3.f36583e.f37074e;
                    if (hVar2.f37049j) {
                        hVar.c((int) ((hVar2.f37046g * fVar2.A) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                h hVar3 = fVar2.f36581d.f37074e;
                if (hVar3.f37049j) {
                    int i12 = fVar2.f36580c0;
                    if (i12 == -1) {
                        i10 = (int) ((hVar3.f37046g / fVar2.f36578b0) + 0.5f);
                    } else if (i12 != 0) {
                        i10 = i12 != 1 ? 0 : (int) ((hVar3.f37046g / fVar2.f36578b0) + 0.5f);
                    } else {
                        i10 = (int) ((hVar3.f37046g * fVar2.f36578b0) + 0.5f);
                    }
                    hVar.c(i10);
                }
            }
        }
        g gVar = this.f37077h;
        if (gVar.f37042c) {
            g gVar2 = this.f37078i;
            if (gVar2.f37042c) {
                if (gVar.f37049j && gVar2.f37049j && this.f37074e.f37049j) {
                    return;
                }
                if (!this.f37074e.f37049j && this.f37073d == v.f.b.MATCH_CONSTRAINT) {
                    v.f fVar4 = this.f37071b;
                    if (fVar4.f36611s == 0 && !fVar4.H()) {
                        g gVar3 = this.f37077h.f37051l.get(0);
                        g gVar4 = this.f37078i.f37051l.get(0);
                        int i13 = gVar3.f37046g;
                        g gVar5 = this.f37077h;
                        int i14 = i13 + gVar5.f37045f;
                        int i15 = gVar4.f37046g + this.f37078i.f37045f;
                        gVar5.c(i14);
                        this.f37078i.c(i15);
                        this.f37074e.c(i15 - i14);
                        return;
                    }
                }
                if (!this.f37074e.f37049j && this.f37073d == v.f.b.MATCH_CONSTRAINT && this.f37070a == 1 && this.f37077h.f37051l.size() > 0 && this.f37078i.f37051l.size() > 0) {
                    int i16 = (this.f37078i.f37051l.get(0).f37046g + this.f37078i.f37045f) - (this.f37077h.f37051l.get(0).f37046g + this.f37077h.f37045f);
                    h hVar4 = this.f37074e;
                    int i17 = hVar4.f37052m;
                    if (i16 < i17) {
                        hVar4.c(i16);
                    } else {
                        hVar4.c(i17);
                    }
                }
                if (this.f37074e.f37049j && this.f37077h.f37051l.size() > 0 && this.f37078i.f37051l.size() > 0) {
                    g gVar6 = this.f37077h.f37051l.get(0);
                    g gVar7 = this.f37078i.f37051l.get(0);
                    int i18 = gVar6.f37046g;
                    g gVar8 = this.f37077h;
                    int i19 = gVar8.f37045f + i18;
                    int i20 = gVar7.f37046g;
                    int i21 = this.f37078i.f37045f + i20;
                    float f10 = this.f37071b.f36602n0;
                    if (gVar6 == gVar7) {
                        f10 = 0.5f;
                    } else {
                        i18 = i19;
                        i20 = i21;
                    }
                    gVar8.c((int) ((((i20 - i18) - this.f37074e.f37046g) * f10) + i18 + 0.5f));
                    this.f37078i.c(this.f37077h.f37046g + this.f37074e.f37046g);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0431 A[PHI: r0
  0x0431: PHI (r0v30 w.m) = (r0v17 w.m), (r0v44 w.m) binds: [B:162:0x042f, B:136:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0328, code lost:
    
        if (r9.f37071b.H != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x032a, code lost:
    
        r0 = r9.f37061k;
        r1 = r9.f37077h;
        r2 = r9.f37062l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03bf, code lost:
    
        if (r9.f37071b.H != false) goto L122;
     */
    @Override // w.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o.d():void");
    }

    @Override // w.q
    public void e() {
        g gVar = this.f37077h;
        if (gVar.f37049j) {
            this.f37071b.f36584e0 = gVar.f37046g;
        }
    }

    @Override // w.q
    public void f() {
        this.f37072c = null;
        this.f37077h.b();
        this.f37078i.b();
        this.f37061k.b();
        this.f37074e.b();
        this.f37076g = false;
    }

    @Override // w.q
    public boolean k() {
        return this.f37073d != v.f.b.MATCH_CONSTRAINT || this.f37071b.f36613t == 0;
    }

    public void m() {
        this.f37076g = false;
        this.f37077h.b();
        this.f37077h.f37049j = false;
        this.f37078i.b();
        this.f37078i.f37049j = false;
        this.f37061k.b();
        this.f37061k.f37049j = false;
        this.f37074e.f37049j = false;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VerticalRun ");
        sbA.append(this.f37071b.f36612s0);
        return sbA.toString();
    }
}
