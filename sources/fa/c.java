package fa;

import android.app.Activity;
import fd.g0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.AdManager$loadInterstitial$1", f = "AdManager.kt", l = {231}, m = "invokeSuspend")
public final class c extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.a f29427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f29428e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.zipoapps.ads.a aVar, Activity activity, mc.d<? super c> dVar) {
        super(2, dVar);
        this.f29427d = aVar;
        this.f29428e = activity;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new c(this.f29427d, this.f29428e, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        return new c(this.f29427d, this.f29428e, dVar).invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f29426c;
        if (i10 == 0) {
            h9.d.t(obj);
            com.zipoapps.ads.a aVar2 = this.f29427d;
            this.f29426c = 1;
            if (aVar2.l(this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        com.zipoapps.ads.a aVar3 = this.f29427d;
        f fVar = aVar3.f28030g;
        k kVar = aVar3.f28029f;
        if (fVar == null) {
            aVar3.d().k(6, null, "loadInterstitial()-> AdUnitIdProvider is not initialized !", new Object[0]);
        } else if (kVar == null) {
            aVar3.d().k(6, null, "loadInterstitial()-> AdManager is not initialized !", new Object[0]);
        } else {
            kVar.c(this.f29428e, fVar, aVar3.f28027d);
        }
        return jc.w.f31842a;
    }
}
