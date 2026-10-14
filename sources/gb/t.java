package gb;

import com.android.installreferrer.api.InstallReferrerClient;
import fd.g0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.util.InstallReferrer$get$2", f = "InstallReferrer.kt", l = {21}, m = "invokeSuspend")
public final class t extends oc.h implements uc.p<g0, mc.d<? super String>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f30405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, mc.d<? super t> dVar) {
        super(2, dVar);
        this.f30405d = vVar;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        return new t(this.f30405d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super String> dVar) {
        return new t(this.f30405d, dVar).invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f30404c;
        if (i10 == 0) {
            h9.d.t(obj);
            String string = this.f30405d.f30410b.f33405a.getString("install_referrer", null);
            if (string != null) {
                return string;
            }
            v vVar = this.f30405d;
            this.f30404c = 1;
            Objects.requireNonNull(vVar);
            fd.k kVar = new fd.k(nc.b.c(this), 1);
            kVar.u();
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(vVar.f30409a).build();
            installReferrerClientBuild.startConnection(new u(installReferrerClientBuild, vVar, kVar));
            obj = kVar.r();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        return (String) obj;
    }
}
