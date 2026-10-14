package bb;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import fd.c0;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.z;
import jc.w;
import kd.q;
import ma.t;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.ui.settings.SettingsApi$openCMPDialog$1", f = "SettingsApi.kt", l = {}, m = "invokeSuspend")
public final class c extends oc.h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, mc.d<? super c> dVar) {
        super(2, dVar);
        this.f3491c = context;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new c(this.f3491c, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        c cVar = new c(this.f3491c, dVar);
        w wVar = w.f31842a;
        cVar.invokeSuspend(wVar);
        return wVar;
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        ma.h hVarA = ma.h.f33410y.a();
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f3491c;
        j0.i(appCompatActivity, "activity");
        j0.i(appCompatActivity, "activity");
        c0 c0Var = s0.f29619a;
        y8.c0.z(z.a(q.f32064a), null, null, new t(hVarA, appCompatActivity, null, null), 3, null);
        return w.f31842a;
    }
}
