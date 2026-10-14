package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.nx;

/* JADX INFO: loaded from: classes3.dex */
public final class cl1<T extends nx<T>> implements pw<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vw<T> f19547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nk1 f19548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gl1<dl1> f19549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private dl1 f19550d;

    public final class a implements hl1<dl1> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.hl1
        public final void a(t2 t2Var) {
            fd.j0.i(t2Var, "adFetchRequestError");
            ((cl1) cl1.this).f19547a.b(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.hl1
        public final void a(dl1 dl1Var) {
            dl1 dl1Var2 = dl1Var;
            fd.j0.i(dl1Var2, "ad");
            ((cl1) cl1.this).f19550d = dl1Var2;
            ((cl1) cl1.this).f19547a.p();
        }
    }

    public /* synthetic */ cl1(vw vwVar) {
        k2 k2VarD = vwVar.d();
        fd.j0.h(k2VarD, "loadController.adConfiguration");
        Context contextI = vwVar.i();
        fd.j0.h(contextI, "loadController.context");
        jx jxVar = new jx();
        el1 el1Var = new el1(contextI, k2VarD);
        this(vwVar, k2VarD, contextI, jxVar, el1Var, new nk1(k2VarD), new gl1(k2VarD, jxVar, el1Var));
    }

    public cl1(vw<T> vwVar, k2 k2Var, Context context, jx jxVar, el1 el1Var, nk1 nk1Var, gl1<dl1> gl1Var) {
        fd.j0.i(vwVar, "loadController");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(jxVar, "fullscreenAdSizeValidator");
        fd.j0.i(el1Var, "fullscreenHtmlAdCreateController");
        fd.j0.i(nk1Var, "yandexAdapterReporter");
        fd.j0.i(gl1Var, "htmlAdCreationHandler");
        this.f19547a = vwVar;
        this.f19548b = nk1Var;
        this.f19549c = gl1Var;
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        x60.d("YandexInterstitialController invalidate", new Object[0]);
        this.f19549c.a();
        dl1 dl1Var = this.f19550d;
        if (dl1Var != null) {
            dl1Var.d();
        }
        this.f19550d = null;
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(Context context, AdResponse<String> adResponse) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        this.f19548b.a(context, adResponse, (mj0) null);
        this.f19548b.a(context, adResponse, (nj0) null);
        this.f19549c.a(context, adResponse, new a());
    }

    @Override // com.yandex.mobile.ads.impl.pw
    public final void a(T t10) {
        fd.j0.i(t10, "contentController");
        dl1 dl1Var = this.f19550d;
        Context contextC = t10.c();
        fd.j0.h(contextC, "contentController.context");
        if (dl1Var != null) {
            dl1Var.a(contextC, t10.h());
        }
        this.f19550d = null;
    }
}
