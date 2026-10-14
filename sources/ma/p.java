package ma;

import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import fd.j0;
import gb.x;
import jc.w;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$initTotoConfig$2", f = "PremiumHelper.kt", l = {886}, m = "invokeSuspend")
public final class p extends oc.h implements uc.l<mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f33498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.v f33499e;

    public static final class a extends vc.l implements uc.l<Object, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f33500c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(1);
            this.f33500c = hVar;
        }

        @Override // uc.l
        public w invoke(Object obj) {
            j0.i(obj, "it");
            StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
            if (startupData != null) {
                startupData.setTotoConfigEndTimestamp(System.currentTimeMillis());
            }
            this.f33500c.f33434w.b();
            this.f33500c.f33417f.o("toto_get_config_timestamp", Long.valueOf(System.currentTimeMillis()));
            return w.f31842a;
        }
    }

    public static final class b extends vc.l implements uc.l<x.b, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc.v f33501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vc.v vVar) {
            super(1);
            this.f33501c = vVar;
        }

        @Override // uc.l
        public w invoke(x.b bVar) {
            j0.i(bVar, "it");
            StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
            if (startupData != null) {
                startupData.setTotoConfigEndTimestamp(System.currentTimeMillis());
            }
            this.f33501c.f37003c = false;
            return w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar, vc.v vVar, mc.d<? super p> dVar) {
        super(1, dVar);
        this.f33498d = hVar;
        this.f33499e = vVar;
    }

    @Override // oc.a
    public final mc.d<w> create(mc.d<?> dVar) {
        return new p(this.f33498d, this.f33499e, dVar);
    }

    @Override // uc.l
    public Object invoke(mc.d<? super w> dVar) {
        return new p(this.f33498d, this.f33499e, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f33497c;
        if (i10 == 0) {
            h9.d.t(obj);
            StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
            if (startupData != null) {
                startupData.setTotoConfigStartTimestamp(System.currentTimeMillis());
            }
            TotoFeature totoFeature = this.f33498d.f33426o;
            this.f33497c = 1;
            obj = totoFeature.getConfig(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        x xVar = (x) obj;
        c0.D(xVar, new a(this.f33498d));
        c0.C(xVar, new b(this.f33499e));
        return w.f31842a;
    }
}
