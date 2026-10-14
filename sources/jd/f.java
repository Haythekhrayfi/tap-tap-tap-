package jd;

import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
public final class f extends oc.h implements uc.p<hd.p<Object>, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g<Object> f31856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<Object> gVar, mc.d<? super f> dVar) {
        super(2, dVar);
        this.f31856e = gVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        f fVar = new f(this.f31856e, dVar);
        fVar.f31855d = obj;
        return fVar;
    }

    @Override // uc.p
    public Object invoke(hd.p<Object> pVar, mc.d<? super w> dVar) {
        f fVar = new f(this.f31856e, dVar);
        fVar.f31855d = pVar;
        return fVar.invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f31854c;
        if (i10 == 0) {
            h9.d.t(obj);
            hd.p<? super Object> pVar = (hd.p) this.f31855d;
            g<Object> gVar = this.f31856e;
            this.f31854c = 1;
            if (gVar.c(pVar, this) == aVar) {
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
