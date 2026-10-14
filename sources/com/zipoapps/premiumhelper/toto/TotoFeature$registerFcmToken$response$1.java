package com.zipoapps.premiumhelper.toto;

import jc.w;
import mc.d;
import nc.a;
import oc.e;
import oc.h;
import uc.l;
import ue.z;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature$registerFcmToken$response$1", f = "TotoFeature.kt", l = {165}, m = "invokeSuspend")
public final class TotoFeature$registerFcmToken$response$1 extends h implements l<d<? super z<Void>>, Object> {
    public final /* synthetic */ TotoService.RegisterRequest $request;
    public int label;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$registerFcmToken$response$1(TotoFeature totoFeature, TotoService.RegisterRequest registerRequest, d<? super TotoFeature$registerFcmToken$response$1> dVar) {
        super(1, dVar);
        this.this$0 = totoFeature;
        this.$request = registerRequest;
    }

    @Override // oc.a
    public final d<w> create(d<?> dVar) {
        return new TotoFeature$registerFcmToken$response$1(this.this$0, this.$request, dVar);
    }

    @Override // uc.l
    public final Object invoke(d<? super z<Void>> dVar) {
        return ((TotoFeature$registerFcmToken$response$1) create(dVar)).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 == 0) {
            h9.d.t(obj);
            TotoService.TotoServiceApi service = this.this$0.getService();
            TotoService.RegisterRequest registerRequest = this.$request;
            String userAgent = this.this$0.getUserAgent();
            this.label = 1;
            obj = service.register(registerRequest, userAgent, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        return obj;
    }
}
