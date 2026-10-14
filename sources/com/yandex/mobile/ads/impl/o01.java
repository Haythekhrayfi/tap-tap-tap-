package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class o01 implements r81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n01 f23663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f23664b = new mp0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23668f;

    public o01(n01 n01Var) {
        this.f23663a = n01Var;
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a() {
        this.f23668f = true;
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a(int i10, mp0 mp0Var) {
        boolean z10 = (i10 & 1) != 0;
        int iT = z10 ? mp0Var.t() + mp0Var.d() : -1;
        if (this.f23668f) {
            if (!z10) {
                return;
            }
            this.f23668f = false;
            mp0Var.e(iT);
            this.f23666d = 0;
        }
        while (mp0Var.a() > 0) {
            int i11 = this.f23666d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iT2 = mp0Var.t();
                    mp0Var.e(mp0Var.d() - 1);
                    if (iT2 == 255) {
                        this.f23668f = true;
                        return;
                    }
                }
                int iMin = Math.min(mp0Var.a(), 3 - this.f23666d);
                mp0Var.a(this.f23664b.c(), this.f23666d, iMin);
                int i12 = this.f23666d + iMin;
                this.f23666d = i12;
                if (i12 == 3) {
                    this.f23664b.e(0);
                    this.f23664b.d(3);
                    this.f23664b.f(1);
                    int iT3 = this.f23664b.t();
                    int iT4 = this.f23664b.t();
                    this.f23667e = (iT3 & 128) != 0;
                    this.f23665c = (((iT3 & 15) << 8) | iT4) + 3;
                    int iB = this.f23664b.b();
                    int i13 = this.f23665c;
                    if (iB < i13) {
                        this.f23664b.a(Math.min(4098, Math.max(i13, this.f23664b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(mp0Var.a(), this.f23665c - this.f23666d);
                mp0Var.a(this.f23664b.c(), this.f23666d, iMin2);
                int i14 = this.f23666d + iMin2;
                this.f23666d = i14;
                int i15 = this.f23665c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f23667e) {
                        if (da1.a(this.f23665c, this.f23664b.c()) != 0) {
                            this.f23668f = true;
                            return;
                        }
                        this.f23664b.d(this.f23665c - 4);
                    } else {
                        this.f23664b.d(i15);
                    }
                    this.f23664b.e(0);
                    this.f23663a.a(this.f23664b);
                    this.f23666d = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a(a71 a71Var, wt wtVar, r81.d dVar) {
        this.f23663a.a(a71Var, wtVar, dVar);
        this.f23668f = true;
    }
}
