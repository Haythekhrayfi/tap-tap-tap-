package jd;

import fd.b0;
import fd.g0;
import fd.h0;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
public final class e extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id.e<Object> f31852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g<Object> f31853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(id.e<Object> eVar, g<Object> gVar, mc.d<? super e> dVar) {
        super(2, dVar);
        this.f31852e = eVar;
        this.f31853f = gVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        e eVar = new e(this.f31852e, this.f31853f, dVar);
        eVar.f31851d = obj;
        return eVar;
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        e eVar = new e(this.f31852e, this.f31853f, dVar);
        eVar.f31851d = g0Var;
        return eVar.invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f31850c;
        if (i10 == 0) {
            h9.d.t(obj);
            g0 g0Var = (g0) this.f31851d;
            id.e<Object> eVar = this.f31852e;
            g<Object> gVar = this.f31853f;
            mc.f fVar = gVar.f31857c;
            int i11 = gVar.f31858d;
            if (i11 == -3) {
                i11 = -2;
            }
            hd.e eVar2 = gVar.f31859e;
            h0 h0Var = h0.ATOMIC;
            f fVar2 = new f(gVar, null);
            hd.o oVar = new hd.o(b0.c(g0Var, fVar), fd.f.a(i11, eVar2, null, 4));
            h0Var.invoke(fVar2, oVar, oVar);
            this.f31850c = 1;
            Object objA = id.f.a(eVar, oVar, true, this);
            if (objA != obj2) {
                objA = w.f31842a;
            }
            if (objA == obj2) {
                return obj2;
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
