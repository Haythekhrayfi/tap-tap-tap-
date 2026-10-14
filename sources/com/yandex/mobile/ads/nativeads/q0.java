package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.r6;
import com.yandex.mobile.ads.impl.ra;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class q0 implements jm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa<?>> f27812a;

    public q0(List<qa<?>> list) {
        this.f27812a = list;
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a(w wVar) {
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a(w wVar, b bVar) {
        List<qa<?>> list = this.f27812a;
        if (list != null) {
            r6 r6Var = new r6(wVar, bVar);
            for (qa<?> qaVar : list) {
                ra raVarA = wVar.a(qaVar);
                if (raVarA != null) {
                    raVarA.c(qaVar.d());
                    raVarA.a(qaVar, r6Var);
                }
            }
        }
    }
}
