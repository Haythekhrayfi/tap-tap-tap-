package ma;

import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import fd.g0;
import fd.z;
import jc.w;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.Analytics$onOnboarding$1", f = "Analytics.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend")
public final class d extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.a f33401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.zipoapps.premiumhelper.a aVar, mc.d<? super d> dVar) {
        super(2, dVar);
        this.f33401d = aVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new d(this.f33401d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new d(this.f33401d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        String code;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f33400c;
        if (i10 == 0) {
            h9.d.t(obj);
            this.f33400c = 1;
            if (z.m(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        TotoFeature.ResponseStats getConfigResponseStats = h.f33410y.a().f33426o.getGetConfigResponseStats();
        com.zipoapps.premiumhelper.a aVar2 = this.f33401d;
        Bundle[] bundleArr = new Bundle[1];
        jc.h[] hVarArr = new jc.h[4];
        hVarArr[0] = new jc.h(AppLovinEventParameters.PRODUCT_IDENTIFIER, aVar2.f28254b.h(oa.b.f34179k));
        hVarArr[1] = new jc.h("timeout", String.valueOf(this.f33401d.f28257e));
        if (getConfigResponseStats == null || (code = getConfigResponseStats.getCode()) == null) {
            code = "not available";
        }
        hVarArr[2] = new jc.h("toto_response_code", code);
        hVarArr[3] = new jc.h("toto_latency", getConfigResponseStats != null ? new Long(getConfigResponseStats.getLatency()) : "not available");
        bundleArr[0] = androidx.activity.i.a(hVarArr);
        aVar2.t("Onboarding", bundleArr);
        return w.f31842a;
    }
}
