package com.zipoapps.ads;

import fd.g0;
import jc.w;
import kotlin.reflect.KProperty;
import mc.d;
import oc.e;
import oc.h;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.ads.AdManager$askForConsentIfRequired$2$1", f = "AdManager.kt", l = {91}, m = "invokeSuspend")
public final class b extends h implements p<g0, d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f28150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f28150d = aVar;
    }

    @Override // oc.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new b(this.f28150d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, d<? super w> dVar) {
        return new b(this.f28150d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f28149c;
        if (i10 == 0) {
            h9.d.t(obj);
            a aVar2 = this.f28150d;
            this.f28149c = 1;
            KProperty<Object>[] kPropertyArr = a.f28022o;
            if (aVar2.e(this) == aVar) {
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
