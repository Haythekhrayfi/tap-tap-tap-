package com.zipoapps.premiumhelper.toto;

import fd.j0;
import java.util.Map;
import jc.w;
import mc.d;
import nc.a;
import oc.e;
import oc.h;
import uc.l;
import ue.z;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.toto.TotoFeature$postConfig$response$1", f = "TotoFeature.kt", l = {138}, m = "invokeSuspend")
public final class TotoFeature$postConfig$response$1 extends h implements l<d<? super z<Void>>, Object> {
    public final /* synthetic */ Map<String, String> $config;
    public final /* synthetic */ TotoService.PostConfigParameters $parameters;
    public int label;
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$postConfig$response$1(TotoFeature totoFeature, TotoService.PostConfigParameters postConfigParameters, Map<String, String> map, d<? super TotoFeature$postConfig$response$1> dVar) {
        super(1, dVar);
        this.this$0 = totoFeature;
        this.$parameters = postConfigParameters;
        this.$config = map;
    }

    @Override // oc.a
    public final d<w> create(d<?> dVar) {
        return new TotoFeature$postConfig$response$1(this.this$0, this.$parameters, this.$config, dVar);
    }

    @Override // uc.l
    public final Object invoke(d<? super z<Void>> dVar) {
        return ((TotoFeature$postConfig$response$1) create(dVar)).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 == 0) {
            h9.d.t(obj);
            TotoService.TotoServiceApi service = this.this$0.getService();
            String packageName = this.this$0.context.getPackageName();
            j0.h(packageName, "context.packageName");
            String userAgent = this.this$0.getUserAgent();
            Map<String, String> mapAsMap = this.$parameters.asMap();
            Map<String, String> map = this.$config;
            this.label = 1;
            obj = service.postConfig(packageName, userAgent, mapAsMap, map, this);
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
