package ma;

import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$initTotoConfig$3", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
public final class q extends oc.h implements uc.l<mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar, mc.d<? super q> dVar) {
        super(1, dVar);
        this.f33502c = hVar;
    }

    @Override // oc.a
    public final mc.d<w> create(mc.d<?> dVar) {
        return new q(this.f33502c, dVar);
    }

    @Override // uc.l
    public Object invoke(mc.d<? super w> dVar) {
        q qVar = new q(this.f33502c, dVar);
        w wVar = w.f31842a;
        qVar.invokeSuspend(wVar);
        return wVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        h hVar = this.f33502c;
        h.a aVar2 = h.f33410y;
        hVar.g().k(3, null, "Toto configuration skipped due to capping", new Object[0]);
        StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.f28309b.a();
        StartupPerformanceTracker.StartupData startupData = startupPerformanceTrackerA.f28311a;
        if (startupData != null) {
            startupData.setTotoConfigCapped(true);
        }
        startupPerformanceTrackerA.c("success");
        return w.f31842a;
    }
}
