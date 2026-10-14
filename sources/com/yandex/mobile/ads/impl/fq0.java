package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class fq0 implements r81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lr f20784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp0 f20785b = new lp0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20786c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a71 f20788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20795l;

    public fq0(lr lrVar) {
        this.f20784a = lrVar;
    }

    private boolean a(int i10, mp0 mp0Var, byte[] bArr) {
        int iMin = Math.min(mp0Var.a(), i10 - this.f20787d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            mp0Var.f(iMin);
        } else {
            mp0Var.a(bArr, this.f20787d, iMin);
        }
        int i11 = this.f20787d + iMin;
        this.f20787d = i11;
        return i11 == i10;
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a() {
        this.f20786c = 0;
        this.f20787d = 0;
        this.f20791h = false;
        this.f20784a.a();
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a(int i10, mp0 mp0Var) throws qp0 {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        pa.b(this.f20788e);
        int i15 = 2;
        int i16 = 3;
        int i17 = -1;
        int i18 = 0;
        if ((i10 & 1) != 0) {
            int i19 = this.f20786c;
            if (i19 != 0 && i19 != 1) {
                if (i19 == 2) {
                    p90.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i19 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f20793j != -1) {
                        StringBuilder sbA = v60.a("Unexpected start indicator: expected ");
                        sbA.append(this.f20793j);
                        sbA.append(" more bytes");
                        p90.d("PesReader", sbA.toString());
                    }
                    this.f20784a.b();
                }
            }
            this.f20786c = 1;
            this.f20787d = 0;
        }
        int i20 = i10;
        while (mp0Var.a() > 0) {
            int i21 = this.f20786c;
            if (i21 == 0) {
                i11 = i15;
                i12 = i16;
                i13 = i17;
                i14 = i18;
                mp0Var.f(mp0Var.a());
            } else if (i21 == 1) {
                i12 = i16;
                int i22 = i18;
                if (a(9, mp0Var, this.f20785b.f22755a)) {
                    this.f20785b.c(i22);
                    int iB = this.f20785b.b(24);
                    if (iB != 1) {
                        o80.a("Unexpected start code prefix: ", iB, "PesReader");
                        i13 = -1;
                        this.f20793j = -1;
                        z10 = false;
                        i11 = 2;
                    } else {
                        this.f20785b.d(8);
                        int iB2 = this.f20785b.b(16);
                        this.f20785b.d(5);
                        this.f20794k = this.f20785b.f();
                        i11 = 2;
                        this.f20785b.d(2);
                        this.f20789f = this.f20785b.f();
                        this.f20790g = this.f20785b.f();
                        this.f20785b.d(6);
                        int iB3 = this.f20785b.b(8);
                        this.f20792i = iB3;
                        if (iB2 == 0) {
                            this.f20793j = -1;
                            i13 = -1;
                        } else {
                            int i23 = ((iB2 + 6) - 9) - iB3;
                            this.f20793j = i23;
                            if (i23 < 0) {
                                StringBuilder sbA2 = v60.a("Found negative packet payload size: ");
                                sbA2.append(this.f20793j);
                                p90.d("PesReader", sbA2.toString());
                                i13 = -1;
                                this.f20793j = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        z10 = true;
                    }
                    this.f20786c = z10 ? i11 : 0;
                    i14 = 0;
                    this.f20787d = 0;
                } else {
                    i14 = i22;
                    i13 = -1;
                    i11 = 2;
                }
            } else if (i21 != i15) {
                if (i21 != i16) {
                    throw new IllegalStateException();
                }
                int iA = mp0Var.a();
                int i24 = this.f20793j;
                int i25 = i24 == i17 ? i18 : iA - i24;
                if (i25 > 0) {
                    iA -= i25;
                    mp0Var.d(mp0Var.d() + iA);
                }
                this.f20784a.a(mp0Var);
                int i26 = this.f20793j;
                if (i26 != i17) {
                    int i27 = i26 - iA;
                    this.f20793j = i27;
                    if (i27 == 0) {
                        this.f20784a.b();
                        this.f20786c = 1;
                        this.f20787d = i18;
                    }
                }
                i11 = i15;
                i12 = i16;
                i13 = i17;
                i14 = i18;
            } else if (a(Math.min(10, this.f20792i), mp0Var, this.f20785b.f22755a) && a(this.f20792i, mp0Var, (byte[]) null)) {
                this.f20785b.c(i18);
                this.f20795l = -9223372036854775807L;
                if (this.f20789f) {
                    this.f20785b.d(4);
                    long jB = ((long) this.f20785b.b(i16)) << 30;
                    this.f20785b.d(1);
                    long jB2 = ((long) (this.f20785b.b(15) << 15)) | jB;
                    this.f20785b.d(1);
                    long jB3 = jB2 | ((long) this.f20785b.b(15));
                    this.f20785b.d(1);
                    if (!this.f20791h && this.f20790g) {
                        this.f20785b.d(4);
                        long jB4 = ((long) this.f20785b.b(i16)) << 30;
                        this.f20785b.d(1);
                        long jB5 = ((long) (this.f20785b.b(15) << 15)) | jB4;
                        this.f20785b.d(1);
                        long jB6 = jB5 | ((long) this.f20785b.b(15));
                        this.f20785b.d(1);
                        this.f20788e.b(jB6);
                        this.f20791h = true;
                    }
                    this.f20795l = this.f20788e.b(jB3);
                }
                i20 |= this.f20794k ? 4 : 0;
                this.f20784a.a(i20, this.f20795l);
                this.f20786c = 3;
                this.f20787d = 0;
                i18 = 0;
                i17 = -1;
                i16 = 3;
                i15 = 2;
            } else {
                i12 = i16;
                i13 = i17;
                i14 = i18;
                i11 = 2;
            }
            i18 = i14;
            i17 = i13;
            i16 = i12;
            i15 = i11;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a(a71 a71Var, wt wtVar, r81.d dVar) {
        this.f20788e = a71Var;
        this.f20784a.a(wtVar, dVar);
    }
}
