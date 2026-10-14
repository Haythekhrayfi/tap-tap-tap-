package fa;

import fd.g0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.AdManager$prepareConsentInfo$1$1", f = "AdManager.kt", l = {78}, m = "invokeSuspend")
public final class d extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.a f29430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.zipoapps.ads.a aVar, mc.d<? super d> dVar) {
        super(2, dVar);
        this.f29430d = aVar;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new d(this.f29430d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        return new d(this.f29430d, dVar).invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f29429c;
        if (i10 == 0) {
            h9.d.t(obj);
            com.zipoapps.ads.a aVar2 = this.f29430d;
            this.f29429c = 1;
            KProperty<Object>[] kPropertyArr = com.zipoapps.ads.a.f28022o;
            if (aVar2.e(this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        return jc.w.f31842a;
    }
}
