package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp0 f22198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f22199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j71 f22202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private yv f22208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22210m;

    public k() {
        this(null);
    }

    public k(String str) {
        lp0 lp0Var = new lp0(new byte[16]);
        this.f22198a = lp0Var;
        this.f22199b = new mp0(lp0Var.f22755a);
        this.f22203f = 0;
        this.f22204g = 0;
        this.f22205h = false;
        this.f22206i = false;
        this.f22210m = -9223372036854775807L;
        this.f22200c = str;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f22203f = 0;
        this.f22204g = 0;
        this.f22205h = false;
        this.f22206i = false;
        this.f22210m = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f22210m = j10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        boolean z10;
        pa.b(this.f22202e);
        while (mp0Var.a() > 0) {
            int i10 = this.f22203f;
            if (i10 == 0) {
                while (true) {
                    if (mp0Var.a() <= 0) {
                        z10 = false;
                        break;
                    }
                    if (this.f22205h) {
                        int iT = mp0Var.t();
                        this.f22205h = iT == 172;
                        if (iT == 64 || iT == 65) {
                            this.f22206i = iT == 65;
                            z10 = true;
                            break;
                        }
                    } else {
                        this.f22205h = mp0Var.t() == 172;
                    }
                }
                if (z10) {
                    this.f22203f = 1;
                    this.f22199b.c()[0] = -84;
                    this.f22199b.c()[1] = (byte) (this.f22206i ? 65 : 64);
                    this.f22204g = 2;
                }
            } else if (i10 == 1) {
                byte[] bArrC = this.f22199b.c();
                int iMin = Math.min(mp0Var.a(), 16 - this.f22204g);
                mp0Var.a(bArrC, this.f22204g, iMin);
                int i11 = this.f22204g + iMin;
                this.f22204g = i11;
                if (i11 == 16) {
                    this.f22198a.c(0);
                    l.a aVarA = l.a(this.f22198a);
                    yv yvVar = this.f22208k;
                    if (yvVar == null || 2 != yvVar.f27128y || aVarA.f22579a != yvVar.f27129z || !"audio/ac4".equals(yvVar.f27115l)) {
                        yv yvVarA = new yv.a().c(this.f22201d).f("audio/ac4").c(2).n(aVarA.f22579a).e(this.f22200c).a();
                        this.f22208k = yvVarA;
                        this.f22202e.a(yvVarA);
                    }
                    this.f22209l = aVarA.f22580b;
                    this.f22207j = (((long) aVarA.f22581c) * 1000000) / ((long) this.f22208k.f27129z);
                    this.f22199b.e(0);
                    this.f22202e.a(16, this.f22199b);
                    this.f22203f = 2;
                }
            } else if (i10 == 2) {
                int iMin2 = Math.min(mp0Var.a(), this.f22209l - this.f22204g);
                this.f22202e.a(iMin2, mp0Var);
                int i12 = this.f22204g + iMin2;
                this.f22204g = i12;
                int i13 = this.f22209l;
                if (i12 == i13) {
                    long j10 = this.f22210m;
                    if (j10 != -9223372036854775807L) {
                        this.f22202e.a(j10, 1, i13, 0, null);
                        this.f22210m += this.f22207j;
                    }
                    this.f22203f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        this.f22201d = dVar.b();
        this.f22202e = wtVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
    }
}
