package ma;

import androidx.appcompat.app.AppCompatActivity;
import fd.g0;
import fd.j0;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$showConsentDialog$1", f = "PremiumHelper.kt", l = {1108}, m = "invokeSuspend")
public final class t extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f33511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f33512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f33513f;

    public static final class a extends vc.l implements uc.l<com.zipoapps.ads.c.C0231c, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f33514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uc.a<w> aVar) {
            super(1);
            this.f33514c = aVar;
        }

        @Override // uc.l
        public w invoke(com.zipoapps.ads.c.C0231c c0231c) {
            com.zipoapps.ads.c.C0231c c0231c2 = c0231c;
            j0.i(c0231c2, "it");
            xe.a.f37601c.a("On contest done. Code: " + c0231c2.f28161a + " Message: " + c0231c2.f28162b, new Object[0]);
            uc.a<w> aVar = this.f33514c;
            if (aVar != null) {
                aVar.invoke();
            }
            return w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h hVar, AppCompatActivity appCompatActivity, uc.a<w> aVar, mc.d<? super t> dVar) {
        super(2, dVar);
        this.f33511d = hVar;
        this.f33512e = appCompatActivity;
        this.f33513f = aVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new t(this.f33511d, this.f33512e, this.f33513f, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new t(this.f33511d, this.f33512e, this.f33513f, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f33510c;
        if (i10 == 0) {
            h9.d.t(obj);
            com.zipoapps.ads.c cVarC = this.f33511d.f33421j.c();
            AppCompatActivity appCompatActivity = this.f33512e;
            Objects.requireNonNull(cVarC);
            j0.i(appCompatActivity, "activity");
            if (cVarC.f28154c == null) {
                cVarC.e(appCompatActivity, null, fa.r.f29502c);
            }
            com.zipoapps.ads.c cVarC2 = this.f33511d.f33421j.c();
            AppCompatActivity appCompatActivity2 = this.f33512e;
            a aVar2 = new a(this.f33513f);
            this.f33510c = 1;
            if (cVarC2.a(appCompatActivity2, true, aVar2, this) == aVar) {
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
