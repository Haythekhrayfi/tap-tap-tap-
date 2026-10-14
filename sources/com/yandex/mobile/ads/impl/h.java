package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp0 f21246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f21247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j71 f21250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private yv f21255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21257l;

    public h() {
        this(null);
    }

    public h(String str) {
        lp0 lp0Var = new lp0(new byte[128]);
        this.f21246a = lp0Var;
        this.f21247b = new mp0(lp0Var.f22755a);
        this.f21251f = 0;
        this.f21257l = -9223372036854775807L;
        this.f21248c = str;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f21251f = 0;
        this.f21252g = 0;
        this.f21253h = false;
        this.f21257l = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f21257l = j10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        boolean z10;
        boolean z11;
        pa.b(this.f21250e);
        while (mp0Var.a() > 0) {
            int i10 = this.f21251f;
            if (i10 == 0) {
                while (true) {
                    if (mp0Var.a() <= 0) {
                        z10 = false;
                        break;
                    }
                    if (this.f21253h) {
                        int iT = mp0Var.t();
                        if (iT == 119) {
                            this.f21253h = false;
                            z10 = true;
                            break;
                        } else if (iT == 11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else if (mp0Var.t() == 11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f21253h = z11;
                }
                if (z10) {
                    this.f21251f = 1;
                    this.f21247b.c()[0] = 11;
                    this.f21247b.c()[1] = 119;
                    this.f21252g = 2;
                }
            } else if (i10 == 1) {
                byte[] bArrC = this.f21247b.c();
                int iMin = Math.min(mp0Var.a(), 128 - this.f21252g);
                mp0Var.a(bArrC, this.f21252g, iMin);
                int i11 = this.f21252g + iMin;
                this.f21252g = i11;
                if (i11 == 128) {
                    this.f21246a.c(0);
                    i.a aVarA = i.a(this.f21246a);
                    yv yvVar = this.f21255j;
                    if (yvVar == null || aVarA.f21544c != yvVar.f27128y || aVarA.f21543b != yvVar.f27129z || !da1.a(aVarA.f21542a, yvVar.f27115l)) {
                        yv yvVarA = new yv.a().c(this.f21249d).f(aVarA.f21542a).c(aVarA.f21544c).n(aVarA.f21543b).e(this.f21248c).a();
                        this.f21255j = yvVarA;
                        this.f21250e.a(yvVarA);
                    }
                    this.f21256k = aVarA.f21545d;
                    this.f21254i = (((long) aVarA.f21546e) * 1000000) / ((long) this.f21255j.f27129z);
                    this.f21247b.e(0);
                    this.f21250e.a(128, this.f21247b);
                    this.f21251f = 2;
                }
            } else if (i10 == 2) {
                int iMin2 = Math.min(mp0Var.a(), this.f21256k - this.f21252g);
                this.f21250e.a(iMin2, mp0Var);
                int i12 = this.f21252g + iMin2;
                this.f21252g = i12;
                int i13 = this.f21256k;
                if (i12 == i13) {
                    long j10 = this.f21257l;
                    if (j10 != -9223372036854775807L) {
                        this.f21250e.a(j10, 1, i13, 0, null);
                        this.f21257l += this.f21254i;
                    }
                    this.f21251f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f21249d = dVar.b();
        this.f21250e = wtVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
