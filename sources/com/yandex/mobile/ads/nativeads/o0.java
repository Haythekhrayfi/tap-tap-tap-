package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.p6;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.q6;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.wh0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6 f27800a = new q6();

    public final a a(Context context, wh0 wh0Var, j0 j0Var, pi0 pi0Var, vv vvVar) {
        lm0 lm0VarA = this.f27800a.a(wh0Var);
        oj0 oj0VarA = oj0.a();
        n0 n0Var = new n0(lm0VarA.b(), oj0VarA);
        return new a(wh0Var, new p0(j0Var, n0Var, i01.b(), wh0Var.b()), lm0VarA, new q0(lm0VarA.b()), pi0Var, new p6(vvVar), new d0(context, n0Var, oj0VarA), null);
    }
}
