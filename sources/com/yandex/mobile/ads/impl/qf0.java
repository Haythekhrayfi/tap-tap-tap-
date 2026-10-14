package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class qf0 implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f24467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rf0.a f24468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j71 f24470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f24471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24472f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f24476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24478l;

    public qf0(String str) {
        mp0 mp0Var = new mp0(4);
        this.f24467a = mp0Var;
        mp0Var.c()[0] = -1;
        this.f24468b = new rf0.a();
        this.f24478l = -9223372036854775807L;
        this.f24469c = str;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f24472f = 0;
        this.f24473g = 0;
        this.f24475i = false;
        this.f24478l = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f24478l = j10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        pa.b(this.f24470d);
        while (mp0Var.a() > 0) {
            int i10 = this.f24472f;
            if (i10 == 0) {
                byte[] bArrC = mp0Var.c();
                int iD = mp0Var.d();
                int iE = mp0Var.e();
                while (true) {
                    if (iD >= iE) {
                        mp0Var.e(iE);
                        break;
                    }
                    byte b10 = bArrC[iD];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f24475i && (b10 & 224) == 224;
                    this.f24475i = z10;
                    if (z11) {
                        mp0Var.e(iD + 1);
                        this.f24475i = false;
                        this.f24467a.c()[1] = bArrC[iD];
                        this.f24473g = 2;
                        this.f24472f = 1;
                        break;
                        break;
                    }
                    iD++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(mp0Var.a(), 4 - this.f24473g);
                mp0Var.a(this.f24467a.c(), this.f24473g, iMin);
                int i11 = this.f24473g + iMin;
                this.f24473g = i11;
                if (i11 >= 4) {
                    this.f24467a.e(0);
                    if (!this.f24468b.a(this.f24467a.h())) {
                        this.f24473g = 0;
                        this.f24472f = 1;
                        break;
                    }
                    rf0.a aVar = this.f24468b;
                    this.f24477k = aVar.f24698c;
                    if (!this.f24474h) {
                        this.f24476j = (((long) aVar.f24702g) * 1000000) / ((long) aVar.f24699d);
                        this.f24470d.a(new yv.a().c(this.f24471e).f(this.f24468b.f24697b).i(4096).c(this.f24468b.f24700e).n(this.f24468b.f24699d).e(this.f24469c).a());
                        this.f24474h = true;
                    }
                    this.f24467a.e(0);
                    this.f24470d.a(4, this.f24467a);
                    this.f24472f = 2;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(mp0Var.a(), this.f24477k - this.f24473g);
                this.f24470d.a(iMin2, mp0Var);
                int i12 = this.f24473g + iMin2;
                this.f24473g = i12;
                int i13 = this.f24477k;
                if (i12 >= i13) {
                    long j10 = this.f24478l;
                    if (j10 != -9223372036854775807L) {
                        this.f24470d.a(j10, 1, i13, 0, null);
                        this.f24478l += this.f24476j;
                    }
                    this.f24473g = 0;
                    this.f24472f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f24471e = dVar.b();
        this.f24470d = wtVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
