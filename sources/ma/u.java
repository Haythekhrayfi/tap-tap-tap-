package ma;

import android.app.Application;
import fd.g0;
import fd.z;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$startInitialization$1", f = "PremiumHelper.kt", l = {850}, m = "invokeSuspend")
public final class u extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f33516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(h hVar, mc.d<? super u> dVar) {
        super(2, dVar);
        this.f33516d = hVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new u(this.f33516d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new u(this.f33516d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f33515c;
        if (i10 == 0) {
            h9.d.t(obj);
            Application application = this.f33516d.f33412a;
            if (!j7.a.f31713a.getAndSet(true)) {
                j7.b bVar = new j7.b(application, "org/threeten/bp/TZDB.dat");
                if (se.h.f35536a.get()) {
                    throw new IllegalStateException("Already initialized");
                }
                if (!se.h.f35537b.compareAndSet(null, bVar)) {
                    throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
                }
            }
            h hVar = this.f33516d;
            this.f33515c = 1;
            hVar.g().k(4, null, "PREMIUM HELPER: 4.4.2-alpha5", new Object[0]);
            hVar.g().g(hVar.f33418g.toString(), new Object[0]);
            ua.a.f36179c.a(hVar.f33412a);
            Object objL = z.l(new i(hVar, null), this);
            if (objL != obj2) {
                objL = w.f31842a;
            }
            if (objL == obj2) {
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
