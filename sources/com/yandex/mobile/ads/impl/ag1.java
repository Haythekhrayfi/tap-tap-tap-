package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ag1 extends w51 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f18928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f18929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18933g;

    public ag1(j71 j71Var) {
        super(j71Var);
        this.f18928b = new mp0(oh0.f23795a);
        this.f18929c = new mp0(4);
    }

    public final boolean a(long j10, mp0 mp0Var) throws qp0 {
        int iT = mp0Var.t();
        long jI = (((long) mp0Var.i()) * 1000) + j10;
        if (iT == 0 && !this.f18931e) {
            mp0 mp0Var2 = new mp0(new byte[mp0Var.a()]);
            mp0Var.a(mp0Var2.c(), 0, mp0Var.a());
            rc rcVarA = rc.a(mp0Var2);
            this.f18930d = rcVarA.f24662b;
            this.f26180a.a(new yv.a().f("video/avc").a(rcVarA.f24666f).q(rcVarA.f24663c).g(rcVarA.f24664d).b(rcVarA.f24665e).a(rcVarA.f24661a).a());
            this.f18931e = true;
            return false;
        }
        if (iT != 1 || !this.f18931e) {
            return false;
        }
        int i10 = this.f18933g == 1 ? 1 : 0;
        if (!this.f18932f && i10 == 0) {
            return false;
        }
        byte[] bArrC = this.f18929c.c();
        bArrC[0] = 0;
        bArrC[1] = 0;
        bArrC[2] = 0;
        int i11 = 4 - this.f18930d;
        int i12 = 0;
        while (mp0Var.a() > 0) {
            mp0Var.a(this.f18929c.c(), i11, this.f18930d);
            this.f18929c.e(0);
            int iX = this.f18929c.x();
            this.f18928b.e(0);
            this.f26180a.a(4, this.f18928b);
            this.f26180a.a(iX, mp0Var);
            i12 = i12 + 4 + iX;
        }
        this.f26180a.a(jI, i10, i12, 0, null);
        this.f18932f = true;
        return true;
    }

    public final boolean a(mp0 mp0Var) throws w51.a {
        int iT = mp0Var.t();
        int i10 = (iT >> 4) & 15;
        int i11 = iT & 15;
        if (i11 != 7) {
            throw new w51.a(u60.a("Video format not supported: ", i11));
        }
        this.f18933g = i10;
        return i10 != 5;
    }
}
