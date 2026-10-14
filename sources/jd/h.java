package jd;

import ch.qos.logback.core.net.SyslogConstants;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend")
public final class h extends oc.h implements uc.p<id.e<Object>, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i<Object, Object> f31862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i<Object, Object> iVar, mc.d<? super h> dVar) {
        super(2, dVar);
        this.f31862e = iVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        h hVar = new h(this.f31862e, dVar);
        hVar.f31861d = obj;
        return hVar;
    }

    @Override // uc.p
    public Object invoke(id.e<Object> eVar, mc.d<? super w> dVar) {
        h hVar = new h(this.f31862e, dVar);
        hVar.f31861d = eVar;
        return hVar.invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f31860c;
        if (i10 == 0) {
            h9.d.t(obj);
            id.e<? super Object> eVar = (id.e) this.f31861d;
            i<Object, Object> iVar = this.f31862e;
            this.f31860c = 1;
            if (iVar.e(eVar, this) == aVar) {
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
