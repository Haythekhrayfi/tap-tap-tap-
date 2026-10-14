package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class sk1 implements fl1<rk1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f25132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.e f25133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rk1 f25134c;

    public sk1(k2 k2Var, com.yandex.mobile.ads.banner.e eVar) {
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(eVar, "adLoadController");
        this.f25132a = k2Var;
        this.f25133b = eVar;
    }

    @Override // com.yandex.mobile.ads.impl.fl1
    public final void a() {
        rk1 rk1Var = this.f25134c;
        if (rk1Var != null) {
            rk1Var.a();
        }
        this.f25134c = null;
    }

    @Override // com.yandex.mobile.ads.impl.fl1
    public final void a(AdResponse<String> adResponse, SizeInfo sizeInfo, String str, hl1<rk1> hl1Var) throws xi1 {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(sizeInfo, "sizeInfo");
        fd.j0.i(str, "htmlResponse");
        fd.j0.i(hl1Var, "creationListener");
        Context contextI = this.f25133b.i();
        fd.j0.h(contextI, "adLoadController.context");
        com.yandex.mobile.ads.banner.g gVarY = this.f25133b.y();
        fd.j0.h(gVarY, "adLoadController.adView");
        ve1 ve1VarA = this.f25133b.A();
        fd.j0.h(ve1VarA, "adLoadController.videoEventController");
        rk1 rk1Var = new rk1(contextI, this.f25132a, adResponse, gVarY, this.f25133b);
        this.f25134c = rk1Var;
        rk1Var.a(sizeInfo, str, ve1VarA, hl1Var);
    }
}
