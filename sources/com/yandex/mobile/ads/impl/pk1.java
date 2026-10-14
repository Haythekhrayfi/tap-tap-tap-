package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class pk1 implements ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.e f24074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gl1<rk1> f24075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nk1 f24076c;

    public static final class a implements hl1<rk1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.yandex.mobile.ads.banner.e f24077a;

        public a(com.yandex.mobile.ads.banner.e eVar) {
            fd.j0.i(eVar, "adViewController");
            this.f24077a = eVar;
        }

        @Override // com.yandex.mobile.ads.impl.hl1
        public final void a(t2 t2Var) {
            fd.j0.i(t2Var, "adFetchRequestError");
            this.f24077a.b(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.hl1
        public final void a(rk1 rk1Var) {
            rk1 rk1Var2 = rk1Var;
            fd.j0.i(rk1Var2, "ad");
            rk1Var2.a(new ok1(this));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pk1(com.yandex.mobile.ads.banner.e eVar) {
        this(eVar, 0);
        fd.j0.i(eVar, "adLoadController");
    }

    public /* synthetic */ pk1(com.yandex.mobile.ads.banner.e eVar, int i10) {
        k2 k2VarD = eVar.d();
        fd.j0.h(k2VarD, "adLoadController.adConfiguration");
        dd ddVar = new dd();
        sk1 sk1Var = new sk1(k2VarD, eVar);
        this(eVar, k2VarD, ddVar, sk1Var, new gl1(k2VarD, ddVar, sk1Var), new nk1(k2VarD));
    }

    public pk1(com.yandex.mobile.ads.banner.e eVar, k2 k2Var, dd ddVar, sk1 sk1Var, gl1<rk1> gl1Var, nk1 nk1Var) {
        fd.j0.i(eVar, "adLoadController");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(ddVar, "bannerAdSizeValidator");
        fd.j0.i(sk1Var, "yandexBannerHtmlAdCreator");
        fd.j0.i(gl1Var, "adCreationHandler");
        fd.j0.i(nk1Var, "yandexAdapterReporter");
        this.f24074a = eVar;
        this.f24075b = gl1Var;
        this.f24076c = nk1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ed
    public final void a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        x60.d("YandexBannerController invalidate", new Object[0]);
        this.f24075b.a();
    }

    @Override // com.yandex.mobile.ads.impl.ed
    public final void a(Context context, AdResponse<String> adResponse) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        this.f24076c.a(context, adResponse, (mj0) null);
        this.f24076c.a(context, adResponse, (nj0) null);
        this.f24075b.a(context, adResponse, new a(this.f24074a));
    }
}
