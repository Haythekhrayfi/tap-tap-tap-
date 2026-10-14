package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hr implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<r81.a> f21490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j71[] f21491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21495f = -9223372036854775807L;

    public hr(List<r81.a> list) {
        this.f21490a = list;
        this.f21491b = new j71[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f21492c = false;
        this.f21495f = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f21492c = true;
        if (j10 != -9223372036854775807L) {
            this.f21495f = j10;
        }
        this.f21494e = 0;
        this.f21493d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        boolean z10;
        boolean z11;
        if (this.f21492c) {
            if (this.f21493d == 2) {
                if (mp0Var.a() == 0) {
                    z11 = false;
                } else {
                    if (mp0Var.t() != 32) {
                        this.f21492c = false;
                    }
                    this.f21493d--;
                    z11 = this.f21492c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f21493d == 1) {
                if (mp0Var.a() == 0) {
                    z10 = false;
                } else {
                    if (mp0Var.t() != 0) {
                        this.f21492c = false;
                    }
                    this.f21493d--;
                    z10 = this.f21492c;
                }
                if (!z10) {
                    return;
                }
            }
            int iD = mp0Var.d();
            int iA = mp0Var.a();
            for (j71 j71Var : this.f21491b) {
                mp0Var.e(iD);
                j71Var.a(iA, mp0Var);
            }
            this.f21494e += iA;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        for (int i10 = 0; i10 < this.f21491b.length; i10++) {
            r81.a aVar = this.f21490a.get(i10);
            dVar.a();
            j71 j71VarA = wtVar.a(dVar.c(), 3);
            j71VarA.a(new yv.a().c(dVar.b()).f("application/dvbsubs").a(Collections.singletonList(aVar.f24627b)).e(aVar.f24626a).a());
            this.f21491b[i10] = j71VarA;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
        if (this.f21492c) {
            if (this.f21495f != -9223372036854775807L) {
                for (j71 j71Var : this.f21491b) {
                    j71Var.a(this.f21495f, 1, this.f21494e, 0, null);
                }
            }
            this.f21492c = false;
        }
    }
}
