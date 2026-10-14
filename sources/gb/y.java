package gb;

import android.app.Activity;
import fd.g0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.PremiumHelperUtils$openGooglePlay$1", f = "PremiumHelperUtils.kt", l = {328}, m = "invokeSuspend")
public final class y extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f30420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z10, Activity activity, mc.d<? super y> dVar) {
        super(2, dVar);
        this.f30419d = z10;
        this.f30420e = activity;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new y(this.f30419d, this.f30420e, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        return new y(this.f30419d, this.f30420e, dVar).invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30418c;
        if (i10 == 0) {
            h9.d.t(obj);
            if (this.f30419d) {
                this.f30418c = 1;
                if (fd.z.m(500L, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        com.zipoapps.premiumhelper.util.c.n(this.f30420e);
        return jc.w.f31842a;
    }
}
