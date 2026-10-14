package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.ei;
import com.yandex.mobile.ads.impl.f2;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.g2;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.ov0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.v20;
import com.yandex.mobile.ads.impl.wv;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2 f27711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ov0 f27712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wv f27713c;

    public b(f2 f2Var, ov0 ov0Var, v20 v20Var) {
        this.f27711a = f2Var;
        this.f27712b = ov0Var;
        this.f27713c = v20Var;
    }

    public final void a(qa qaVar, m80 m80Var, w wVar, ei eiVar) {
        if (!qaVar.e() || m80Var == null) {
            return;
        }
        eiVar.a(m80Var, new fi(qaVar, this.f27711a, wVar, this.f27712b, this.f27713c));
    }
}
