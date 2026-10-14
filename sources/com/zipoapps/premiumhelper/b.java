package com.zipoapps.premiumhelper;

import fd.g0;
import gb.g;
import jc.w;
import mc.d;
import oc.e;
import oc.h;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$1$1", f = "PremiumHelper.kt", l = {1012}, m = "invokeSuspend")
public final class b extends h implements p<g0, d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma.h f28292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ma.h hVar, d<? super b> dVar) {
        super(2, dVar);
        this.f28292d = hVar;
    }

    @Override // oc.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new b(this.f28292d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, d<? super w> dVar) {
        return new b(this.f28292d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f28291c;
        if (i10 == 0) {
            h9.d.t(obj);
            g gVar = this.f28292d.f33427p;
            this.f28291c = 1;
            if (gVar.k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        return w.f31842a;
    }
}
