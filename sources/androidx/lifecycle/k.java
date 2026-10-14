package androidx.lifecycle;

import fd.j1;
import fd.s0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements fd.g0 {

    @oc.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<fd.g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2218c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ uc.p<fd.g0, mc.d<? super jc.w>, Object> f2220e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(uc.p<? super fd.g0, ? super mc.d<? super jc.w>, ? extends Object> pVar, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f2220e = pVar;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return k.this.new a(this.f2220e, dVar);
        }

        @Override // uc.p
        public Object invoke(fd.g0 g0Var, mc.d<? super jc.w> dVar) {
            return k.this.new a(this.f2220e, dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f2218c;
            if (i10 == 0) {
                h9.d.t(obj);
                i iVarH = k.this.h();
                uc.p<fd.g0, mc.d<? super jc.w>, Object> pVar = this.f2220e;
                this.f2218c = 1;
                i.c cVar = i.c.CREATED;
                fd.c0 c0Var = s0.f29619a;
                if (y8.c0.V(kd.q.f32064a.e0(), new z(iVarH, cVar, pVar, null), this) == aVar) {
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

    public abstract i h();

    public final j1 i(uc.p<? super fd.g0, ? super mc.d<? super jc.w>, ? extends Object> pVar) {
        return y8.c0.z(this, null, null, new a(pVar, null), 3, null);
    }
}
