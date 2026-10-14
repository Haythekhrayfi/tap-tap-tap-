package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ek0;
import com.yandex.mobile.ads.impl.g11;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.t71;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.wh0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t71 f27756a = new t71();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ek0 f27757b = new ek0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f27758c = new o0();

    public final lm0 a(wh0 wh0Var, qh0 qh0Var) {
        t71 t71Var = this.f27756a;
        ArrayList arrayListH = qh0Var.h();
        List<g11> listH = wh0Var.c().h();
        Objects.requireNonNull(t71Var);
        ArrayList arrayListA = t71.a(arrayListH, listH);
        t71 t71Var2 = this.f27756a;
        ArrayList arrayListF = qh0Var.f();
        List<String> listF = wh0Var.c().f();
        Objects.requireNonNull(t71Var2);
        return new lm0(qh0Var.b(), arrayListA, t71.a(arrayListF, listF), qh0Var.a(), qh0Var.c());
    }

    public final k0 a(Context context, wh0 wh0Var, g20 g20Var, pi0 pi0Var) {
        vv vvVar = new vv();
        j0 j0Var = new j0(this.f27757b.a(context, wh0Var, g20Var, pi0Var, vvVar));
        return new k0(context, j0Var, g20Var, this.f27758c.a(context, wh0Var, j0Var, pi0Var, vvVar));
    }
}
