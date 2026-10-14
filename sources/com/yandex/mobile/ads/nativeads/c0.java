package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.vo;
import com.yandex.mobile.ads.impl.w6;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements jm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qh0 f27723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w f27724b;

    public c0(qh0 qh0Var) {
        this.f27723a = qh0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a() {
        if (this.f27724b != null) {
            for (qa<?> qaVar : this.f27723a.b()) {
                ra raVarA = this.f27724b.a(qaVar);
                if (raVarA instanceof vo) {
                    ((vo) raVarA).b(qaVar.d());
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a(w wVar) {
        wVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.jm0
    public final void a(w wVar, b bVar) {
        this.f27724b = wVar;
        w6 w6Var = new w6(wVar, bVar, this.f27723a.e());
        for (qa<?> qaVar : this.f27723a.b()) {
            ra raVarA = wVar.a(qaVar);
            if (raVarA != null) {
                raVarA.c(qaVar.d());
                raVarA.a(qaVar, w6Var);
            }
        }
    }
}
