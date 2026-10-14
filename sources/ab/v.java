package ab;

import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import fd.g0;
import fd.j0;
import gb.z;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$startPurchase$1", f = "RelaunchPremiumActivity.kt", l = {266}, m = "invokeSuspend")
public final class v extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RelaunchPremiumActivity f329d;

    public static final class a<T> implements id.e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RelaunchPremiumActivity f330c;

        public a(RelaunchPremiumActivity relaunchPremiumActivity) {
            this.f330c = relaunchPremiumActivity;
        }

        @Override // id.e
        public Object emit(Object obj, mc.d dVar) {
            z zVar = (z) obj;
            if (c0.v(zVar.f30421a)) {
                RelaunchPremiumActivity relaunchPremiumActivity = this.f330c;
                ma.h hVar = relaunchPremiumActivity.f28379j;
                if (hVar == null) {
                    j0.r("premiumHelper");
                    throw null;
                }
                com.zipoapps.premiumhelper.a aVar = hVar.f33419h;
                ma.e eVar = relaunchPremiumActivity.f28380k;
                if (eVar == null) {
                    j0.r("offer");
                    throw null;
                }
                aVar.p(eVar.f33402a);
                this.f330c.finish();
            } else {
                xe.a.c cVarB = xe.a.b("PremiumHelper");
                StringBuilder sbA = defpackage.a.a("Purchase error ");
                sbA.append(zVar.f30421a.f3848a);
                cVarB.b(sbA.toString(), new Object[0]);
            }
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RelaunchPremiumActivity relaunchPremiumActivity, mc.d<? super v> dVar) {
        super(2, dVar);
        this.f329d = relaunchPremiumActivity;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new v(this.f329d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        return new v(this.f329d, dVar).invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f328c;
        if (i10 == 0) {
            h9.d.t(obj);
            ma.h hVarA = ma.h.f33410y.a();
            RelaunchPremiumActivity relaunchPremiumActivity = this.f329d;
            ma.e eVar = relaunchPremiumActivity.f28380k;
            if (eVar == null) {
                j0.r("offer");
                throw null;
            }
            id.d<z> dVarM = hVarA.m(relaunchPremiumActivity, eVar);
            a aVar2 = new a(this.f329d);
            this.f328c = 1;
            if (dVarM.a(aVar2, this) == aVar) {
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
