package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class p10 implements lr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j71 f23948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23949c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23952f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f23947a = new mp0(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23950d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a() {
        this.f23949c = false;
        this.f23950d = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f23949c = true;
        if (j10 != -9223372036854775807L) {
            this.f23950d = j10;
        }
        this.f23951e = 0;
        this.f23952f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(mp0 mp0Var) {
        pa.b(this.f23948b);
        if (this.f23949c) {
            int iA = mp0Var.a();
            int i10 = this.f23952f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(mp0Var.c(), mp0Var.d(), this.f23947a.c(), this.f23952f, iMin);
                if (this.f23952f + iMin == 10) {
                    this.f23947a.e(0);
                    if (73 != this.f23947a.t() || 68 != this.f23947a.t() || 51 != this.f23947a.t()) {
                        p90.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f23949c = false;
                        return;
                    } else {
                        this.f23947a.f(3);
                        this.f23951e = this.f23947a.s() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f23951e - this.f23952f);
            this.f23948b.a(iMin2, mp0Var);
            this.f23952f += iMin2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void a(wt wtVar, r81.d dVar) {
        dVar.a();
        j71 j71VarA = wtVar.a(dVar.c(), 5);
        this.f23948b = j71VarA;
        j71VarA.a(new yv.a().c(dVar.b()).f("application/id3").a());
    }

    @Override // com.yandex.mobile.ads.impl.lr
    public final void b() {
        int i10;
        pa.b(this.f23948b);
        if (this.f23949c && (i10 = this.f23951e) != 0 && this.f23952f == i10) {
            long j10 = this.f23950d;
            if (j10 != -9223372036854775807L) {
                this.f23948b.a(j10, 1, i10, 0, null);
            }
            this.f23949c = false;
        }
    }
}
