package bb;

import androidx.activity.i;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.n;
import fd.g0;
import fd.j0;
import fd.s0;
import java.util.Objects;
import jc.w;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.ui.settings.SettingsFragment$setupAppVersionSection$1$1$1", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
public final class h extends oc.h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, mc.d<? super h> dVar) {
        super(2, dVar);
        this.f3500c = gVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new h(this.f3500c, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new h(this.f3500c, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        n nVarRequireActivity = this.f3500c.requireActivity();
        AppCompatActivity appCompatActivity = nVarRequireActivity instanceof AppCompatActivity ? (AppCompatActivity) nVarRequireActivity : null;
        if (appCompatActivity == null) {
            return w.f31842a;
        }
        Objects.requireNonNull(ma.h.f33410y.a().f33435x);
        j0.i(appCompatActivity, "activity");
        c0.z(i.l(appCompatActivity), s0.f29620b, null, new d(appCompatActivity, null), 2, null);
        return w.f31842a;
    }
}
