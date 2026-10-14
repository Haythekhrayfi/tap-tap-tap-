package gb;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.TimeCappingSuspendable$runWithCapping$3", f = "TimeCappingSuspendable.kt", l = {}, m = "invokeSuspend")
public final class e0 extends oc.h implements uc.l<mc.d<? super jc.w>, Object> {
    public e0(mc.d<? super e0> dVar) {
        super(1, dVar);
    }

    @Override // oc.a
    public final mc.d<jc.w> create(mc.d<?> dVar) {
        return new e0(dVar);
    }

    @Override // uc.l
    public Object invoke(mc.d<? super jc.w> dVar) {
        new e0(dVar);
        jc.w wVar = jc.w.f31842a;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(wVar);
        return wVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        return jc.w.f31842a;
    }
}
