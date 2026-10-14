package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sr f25765a = new sr();

    public final String a(Context context, w01 w01Var, d8 d8Var, wr wrVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(wrVar, "environmentConfiguration");
        fd.j0.i(d8Var, "advertisingConfiguration");
        fd.j0.i(w01Var, "sensitiveModeChecker");
        String strA = yu.a(w01.c(context)).e(wrVar.f()).d(wrVar.d()).a(d8Var.a(), d8Var.c()).a(d8Var.b()).c().j(context).b().a(w01.a(context)).a(context, wrVar.b()).a(context).f().g().a();
        fd.j0.h(strA, "builder(sensitiveModeEna…nt()\n            .build()");
        List<fu0> listE = wrVar.e();
        fd.j0.h(listE, "environmentConfiguration.queryParams");
        String[] strArr = {strA, kc.t.w(listE, "&", null, null, 0, null, tz0.f25524a, 30)};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            if (!ed.q.k(str)) {
                arrayList.add(str);
            }
        }
        return this.f25765a.a(context, kc.t.w(arrayList, "&", null, null, 0, null, null, 62));
    }
}
