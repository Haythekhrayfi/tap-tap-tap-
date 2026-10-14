package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class vl1 implements pw<by0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dy0 f26014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nk1 f26015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk0 f26016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f26017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mj0 f26018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dx f26019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AdResponse<String> f26020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private NativeAd f26021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26022i;

    public final class a implements mx0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f26023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AdResponse<String> f26024b;

        public a(Context context, AdResponse<String> adResponse) {
            this.f26023a = context.getApplicationContext();
            this.f26024b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a() {
            vl1.this.f26015b.a(this.f26023a, this.f26024b, vl1.this.f26018e);
            vl1.this.f26015b.a(this.f26023a, this.f26024b, (nj0) null);
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a(cj0 cj0Var) {
            nj0 nj0Var = new nj0(cj0Var);
            vl1.this.f26015b.a(this.f26023a, this.f26024b, vl1.this.f26018e);
            vl1.this.f26015b.a(this.f26023a, this.f26024b, nj0Var);
        }
    }

    public final class b implements uk0.b {
        private b() {
        }

        public /* synthetic */ b(vl1 vl1Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.uk0.b
        public final void a(t2 t2Var) {
            if (vl1.this.f26022i) {
                return;
            }
            vl1.this.f26021h = null;
            vl1.this.f26014a.b(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.uk0.b
        public final void a(NativeAd nativeAd) {
            if (vl1.this.f26022i) {
                return;
            }
            vl1.this.f26021h = nativeAd;
            vl1.this.f26014a.p();
        }
    }

    public vl1(dy0 dy0Var) {
        this.f26014a = dy0Var;
        Context contextI = dy0Var.i();
        k2 k2VarD = dy0Var.d();
        this.f26017d = k2VarD;
        this.f26018e = new mj0(k2VarD);
        w3 w3VarE = dy0Var.e();
        this.f26015b = new nk1(k2VarD);
        this.f26016c = new uk0(contextI, k2VarD, w3VarE);
        this.f26019f = new dx();
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context) {
        this.f26022i = true;
        this.f26020g = null;
        this.f26021h = null;
        this.f26016c.a();
        x60.d("YandexNativeRewardedController invalidate", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context, AdResponse<String> adResponse) {
        if (this.f26022i) {
            return;
        }
        this.f26020g = adResponse;
        this.f26016c.a(adResponse, new b(this, 0), new a(context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(nx nxVar) {
        by0 by0Var = (by0) nxVar;
        AdResponse<String> adResponse = this.f26020g;
        if (adResponse == null || this.f26021h == null) {
            return;
        }
        o0 o0Var = new o0(new o0.a(adResponse).a(this.f26017d.l()).a(this.f26021h));
        this.f26019f.a(by0Var.c(), o0Var, by0Var.h());
        this.f26020g = null;
        this.f26021h = null;
    }
}
