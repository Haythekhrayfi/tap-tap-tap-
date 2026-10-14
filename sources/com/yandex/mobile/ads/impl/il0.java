package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class il0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qs f21743a;

    public il0(Context context, AdResponse adResponse, k2 k2Var) {
        this.f21743a = new qs(context, adResponse, k2Var);
    }

    public final ft a(sc1 sc1Var) {
        ft ftVarA = ct.a().a(sc1Var);
        if (ftVarA != null && !ftVarA.g()) {
            return ftVarA;
        }
        ft ftVarA2 = this.f21743a.a();
        ct.a().a(sc1Var, ftVarA2);
        return ftVarA2;
    }
}
