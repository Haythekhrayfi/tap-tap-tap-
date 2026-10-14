package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc0 f21678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz0[] f21680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kc0 f21683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f21685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final qv0[] f21686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o71 f21687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qc0 f21688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ic0 f21689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i71 f21690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p71 f21691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f21692o;

    public ic0(qv0[] qv0VarArr, long j10, o71 o71Var, u8 u8Var, qc0 qc0Var, kc0 kc0Var, p71 p71Var) {
        this.f21686i = qv0VarArr;
        this.f21692o = j10;
        this.f21687j = o71Var;
        this.f21688k = qc0Var;
        nc0.b bVar = kc0Var.f22375a;
        this.f21679b = bVar.f22012a;
        this.f21683f = kc0Var;
        this.f21690m = i71.f21617d;
        this.f21691n = p71Var;
        this.f21680c = new fz0[qv0VarArr.length];
        this.f21685h = new boolean[qv0VarArr.length];
        this.f21678a = a(bVar, qc0Var, u8Var, kc0Var.f22376b, kc0Var.f22378d);
    }

    private static hc0 a(nc0.b bVar, qc0 qc0Var, u8 u8Var, long j10, long j11) {
        ja0 ja0VarA = qc0Var.a(bVar, u8Var, j10);
        return j11 != -9223372036854775807L ? new ji(ja0VarA, true, 0L, j11) : ja0VarA;
    }

    private void a() {
        int i10 = 0;
        if (!(this.f21689l == null)) {
            return;
        }
        while (true) {
            p71 p71Var = this.f21691n;
            if (i10 >= p71Var.f23998a) {
                return;
            }
            boolean zA = p71Var.a(i10);
            et etVar = this.f21691n.f24000c[i10];
            if (zA && etVar != null) {
                etVar.b();
            }
            i10++;
        }
    }

    public final long a(p71 p71Var, long j10) {
        return a(p71Var, j10, false, new boolean[this.f21686i.length]);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final long a(p71 p71Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= p71Var.f23998a) {
                break;
            }
            boolean[] zArr2 = this.f21685h;
            if (z10) {
                z11 = false;
            } else {
                p71 p71Var2 = this.f21691n;
                if (!(p71Var2 != null && da1.a(p71Var.f23999b[i10], p71Var2.f23999b[i10]) && da1.a(p71Var.f24000c[i10], p71Var2.f24000c[i10]))) {
                    z11 = false;
                }
            }
            zArr2[i10] = z11;
            i10++;
        }
        fz0[] fz0VarArr = this.f21680c;
        int i11 = 0;
        while (true) {
            qv0[] qv0VarArr = this.f21686i;
            if (i11 >= qv0VarArr.length) {
                break;
            }
            if (((me) qv0VarArr[i11]).m() == -2) {
                fz0VarArr[i11] = null;
            }
            i11++;
        }
        a();
        this.f21691n = p71Var;
        if (this.f21689l == null) {
            int i12 = 0;
            while (true) {
                p71 p71Var3 = this.f21691n;
                if (i12 >= p71Var3.f23998a) {
                    break;
                }
                boolean zA = p71Var3.a(i12);
                et etVar = this.f21691n.f24000c[i12];
                if (zA && etVar != null) {
                    etVar.c();
                }
                i12++;
            }
        }
        long jA = this.f21678a.a(p71Var.f24000c, this.f21685h, this.f21680c, zArr, j10);
        fz0[] fz0VarArr2 = this.f21680c;
        int i13 = 0;
        while (true) {
            qv0[] qv0VarArr2 = this.f21686i;
            if (i13 >= qv0VarArr2.length) {
                break;
            }
            if (((me) qv0VarArr2[i13]).m() == -2 && this.f21691n.a(i13)) {
                fz0VarArr2[i13] = new nr();
            }
            i13++;
        }
        this.f21682e = false;
        int i14 = 0;
        while (true) {
            fz0[] fz0VarArr3 = this.f21680c;
            if (i14 >= fz0VarArr3.length) {
                return jA;
            }
            if (fz0VarArr3[i14] != null) {
                pa.b(p71Var.a(i14));
                if (((me) this.f21686i[i14]).m() != -2) {
                    this.f21682e = true;
                }
            } else {
                pa.b(p71Var.f24000c[i14] == null);
            }
            i14++;
        }
    }

    public final void a(float f10, v61 v61Var) throws ns {
        this.f21681d = true;
        this.f21690m = this.f21678a.getTrackGroups();
        p71 p71VarB = b(f10, v61Var);
        kc0 kc0Var = this.f21683f;
        long jMax = kc0Var.f22376b;
        long j10 = kc0Var.f22379e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(p71VarB, jMax);
        long j11 = this.f21692o;
        kc0 kc0Var2 = this.f21683f;
        long j12 = kc0Var2.f22376b;
        this.f21692o = (j12 - jA) + j11;
        if (jA != j12) {
            kc0Var2 = new kc0(kc0Var2.f22375a, jA, kc0Var2.f22377c, kc0Var2.f22378d, kc0Var2.f22379e, kc0Var2.f22380f, kc0Var2.f22381g, kc0Var2.f22382h, kc0Var2.f22383i);
        }
        this.f21683f = kc0Var2;
    }

    public final void a(long j10) {
        pa.b(this.f21689l == null);
        this.f21678a.continueLoading(j10 - this.f21692o);
    }

    public final void a(ic0 ic0Var) {
        if (ic0Var == this.f21689l) {
            return;
        }
        a();
        this.f21689l = ic0Var;
        int i10 = 0;
        if (!(ic0Var == null)) {
            return;
        }
        while (true) {
            p71 p71Var = this.f21691n;
            if (i10 >= p71Var.f23998a) {
                return;
            }
            boolean zA = p71Var.a(i10);
            et etVar = this.f21691n.f24000c[i10];
            if (zA && etVar != null) {
                etVar.c();
            }
            i10++;
        }
    }

    public final ic0 b() {
        return this.f21689l;
    }

    public final p71 b(float f10, v61 v61Var) throws ns {
        p71 p71VarA = this.f21687j.a(this.f21686i, this.f21690m, this.f21683f.f22375a, v61Var);
        for (et etVar : p71VarA.f24000c) {
            if (etVar != null) {
                etVar.a(f10);
            }
        }
        return p71VarA;
    }

    public final void b(long j10) {
        pa.b(this.f21689l == null);
        if (this.f21681d) {
            this.f21678a.reevaluateBuffer(j10 - this.f21692o);
        }
    }

    public final long c() {
        return this.f21692o;
    }

    public final long c(long j10) {
        return j10 - this.f21692o;
    }

    public final long d() {
        return this.f21683f.f22376b + this.f21692o;
    }

    public final long d(long j10) {
        return j10 + this.f21692o;
    }

    public final i71 e() {
        return this.f21690m;
    }

    public final p71 f() {
        return this.f21691n;
    }

    public final void g() {
        a();
        qc0 qc0Var = this.f21688k;
        hc0 hc0Var = this.f21678a;
        try {
            if (hc0Var instanceof ji) {
                hc0Var = ((ji) hc0Var).f22050b;
            }
            qc0Var.a(hc0Var);
        } catch (RuntimeException e10) {
            p90.a("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void h() {
        this.f21692o = 1000000000000L;
    }
}
