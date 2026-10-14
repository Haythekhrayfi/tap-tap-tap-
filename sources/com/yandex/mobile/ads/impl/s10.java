package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.BuildConfigFieldProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class s10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr f24922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i01 f24923b;

    public s10(wr wrVar, i01 i01Var) {
        fd.j0.i(wrVar, "environmentConfiguration");
        fd.j0.i(i01Var, "sdkSettings");
        this.f24922a = wrVar;
        this.f24923b = i01Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    public final void a(Context context, r10 r10Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(r10Var, "identifiers");
        w9 w9VarA = r10Var.a();
        String strC = r10Var.c();
        v10 v10VarB = r10Var.b();
        nz0 nz0VarA = this.f24923b.a(context);
        String strA = null;
        String strB = nz0VarA != null ? nz0VarA.b() : null;
        String strA2 = w9VarA.a();
        String strB2 = w9VarA.b();
        String strC2 = w9VarA.c();
        int iOrdinal = v10VarB.ordinal();
        if (iOrdinal == 0) {
            String prodUrl = BuildConfigFieldProvider.getProdUrl();
            if (!(prodUrl.length() == 0)) {
                strA = prodUrl;
            } else if (strB != null) {
                strA = fn1.a("https://", strB);
            }
            if (strA != null) {
                strA2 = strA;
            } else if (strA2 == null) {
                strA2 = "https://mobile.yandexadexchange.net";
            }
        } else {
            if (iOrdinal != 1) {
                throw new jc.g();
            }
            if (strA2 == null) {
                strA2 = "https://mobile.yandexadexchange.net";
            }
        }
        this.f24922a.a(strA2);
        this.f24922a.b(strB2);
        this.f24922a.d(strC2);
        this.f24922a.c(strC);
    }
}
