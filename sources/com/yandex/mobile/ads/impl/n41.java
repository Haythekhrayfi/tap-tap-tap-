package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class n41 implements wt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wt f23225c;

    public class a implements p01 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p01 f23226a;

        public a(p01 p01Var) {
            this.f23226a = p01Var;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final p01.a b(long j10) {
            p01.a aVarB = this.f23226a.b(j10);
            r01 r01Var = aVarB.f23940a;
            r01 r01Var2 = new r01(r01Var.f24583a, n41.this.f23224b + r01Var.f24584b);
            r01 r01Var3 = aVarB.f23941b;
            return new p01.a(r01Var2, new r01(r01Var3.f24583a, n41.this.f23224b + r01Var3.f24584b));
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final boolean b() {
            return this.f23226a.b();
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final long c() {
            return this.f23226a.c();
        }
    }

    public n41(long j10, wt wtVar) {
        this.f23224b = j10;
        this.f23225c = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final j71 a(int i10, int i11) {
        return this.f23225c.a(i10, i11);
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a() {
        this.f23225c.a();
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a(p01 p01Var) {
        this.f23225c.a(new a(p01Var));
    }
}
