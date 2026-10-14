package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.nx;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class ul1<T extends nx<T>> implements pw<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vw<T> f25690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nk1 f25691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk0 f25692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f25693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mj0 f25694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dx f25695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AdResponse<String> f25696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private NativeAd f25697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25698i;

    public final class a implements mx0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f25699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AdResponse<String> f25700b;

        public a(Context context, AdResponse<String> adResponse) {
            this.f25699a = context.getApplicationContext();
            this.f25700b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a() {
            ul1.this.f25691b.a(this.f25699a, this.f25700b, ul1.this.f25694e);
            ul1.this.f25691b.a(this.f25699a, this.f25700b, (nj0) null);
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a(cj0 cj0Var) {
            nj0 nj0Var = new nj0(cj0Var);
            ul1.this.f25691b.a(this.f25699a, this.f25700b, ul1.this.f25694e);
            ul1.this.f25691b.a(this.f25699a, this.f25700b, nj0Var);
        }
    }

    public final class b implements uk0.b {
        private b() {
        }

        public /* synthetic */ b(ul1 ul1Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.uk0.b
        public final void a(t2 t2Var) {
            if (ul1.this.f25698i) {
                return;
            }
            ul1.this.f25697h = null;
            ul1.this.f25690a.b(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.uk0.b
        public final void a(NativeAd nativeAd) {
            if (ul1.this.f25698i) {
                return;
            }
            ul1.this.f25697h = nativeAd;
            ul1.this.f25690a.p();
        }
    }

    public ul1(vw<T> vwVar) {
        this.f25690a = vwVar;
        Context contextI = vwVar.i();
        k2 k2VarD = vwVar.d();
        this.f25693d = k2VarD;
        this.f25694e = new mj0(k2VarD);
        w3 w3VarE = vwVar.e();
        this.f25691b = new nk1(k2VarD);
        this.f25692c = new uk0(contextI, k2VarD, w3VarE);
        this.f25695f = new dx();
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context) {
        this.f25698i = true;
        this.f25696g = null;
        this.f25697h = null;
        this.f25692c.a();
        x60.d("YandexNativeInterstitialController invalidate", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context, AdResponse<String> adResponse) {
        if (this.f25698i) {
            return;
        }
        this.f25696g = adResponse;
        this.f25692c.a(adResponse, new b(this, 0), new a(context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(T t10) {
        AdResponse<String> adResponse = this.f25696g;
        if (adResponse == null || this.f25697h == null) {
            return;
        }
        o0 o0Var = new o0(new o0.a(adResponse).a(this.f25693d.l()).a(this.f25697h));
        this.f25695f.a(t10.c(), o0Var, t10.h());
        this.f25696g = null;
        this.f25697h = null;
    }
}
