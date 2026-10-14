package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.wh0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static a a(Context context, wh0 wh0Var, lm0 lm0Var, jm0 jm0Var, pi0 pi0Var, vv vvVar, qh0 qh0Var) {
        oj0 oj0VarA = oj0.a();
        g gVar = new g(lm0Var.b(), oj0VarA);
        return new a(wh0Var, new v(gVar, wh0Var.b()), lm0Var, jm0Var, pi0Var, new a4(vvVar), new d0(context, gVar, oj0VarA), qh0Var);
    }
}
