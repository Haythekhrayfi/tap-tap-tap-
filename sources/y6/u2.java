package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k1 f38397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r6.k f38398b = r6.k.NONE;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38399a;

        static {
            int[] iArr = new int[r6.k.values().length];
            try {
                iArr[r6.k.RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r6.k.COMBINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r6.k.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r6.k.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38399a = iArr;
        }
    }

    public final void a(r6.k kVar) {
        fd.j0.i(kVar, "<set-?>");
        this.f38398b = kVar;
    }

    public final void b() {
        k1 k1Var = this.f38397a;
        if (k1Var != null) {
            k1Var.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    public final void c(r6.k kVar) {
        k1 o1Var;
        k1 k1Var;
        fd.j0.i(kVar, "mode");
        if (this.f38398b == kVar) {
            return;
        }
        xe.a.f37601c.a("Starting service: " + kVar, new Object[0]);
        this.f38398b = kVar;
        int i10 = a.f38399a[kVar.ordinal()];
        if (i10 == 1) {
            o1Var = new o1();
        } else if (i10 == 2) {
            o1Var = new j();
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    k1 k1Var2 = this.f38397a;
                    if (k1Var2 != null) {
                        k1Var2.a();
                    }
                    o1Var = null;
                }
                k1Var = this.f38397a;
                if (k1Var != null) {
                    k1Var.d();
                }
            }
            o1Var = new d0();
        }
        this.f38397a = o1Var;
        k1Var = this.f38397a;
        if (k1Var != null) {
            k1Var.d();
        }
    }

    public final void d() {
        this.f38398b = r6.k.NONE;
        k1 k1Var = this.f38397a;
        if (k1Var != null) {
            k1Var.a();
        }
        this.f38397a = null;
    }

    public final void e() {
        StringBuilder sbA = defpackage.a.a("ToggleVisibility: Mode service: ");
        k1 k1Var = this.f38397a;
        sbA.append(k1Var != null ? k1Var.c() : null);
        xe.a.f37601c.a(sbA.toString(), new Object[0]);
        k1 k1Var2 = this.f38397a;
        if (k1Var2 != null) {
            synchronized (k1Var2) {
                if (k1Var2.f38269e) {
                    k1Var2.b();
                } else {
                    k1Var2.e();
                }
            }
        }
    }
}
