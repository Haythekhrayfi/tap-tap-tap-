package bb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import fd.g0;
import fd.j0;
import java.util.Objects;
import jc.w;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.ui.settings.SettingsApi$openSecretSettingActivity$1", f = "SettingsApi.kt", l = {38}, m = "invokeSuspend")
public final class d extends oc.h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f3493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AppCompatActivity appCompatActivity, mc.d<? super d> dVar) {
        super(2, dVar);
        this.f3493d = appCompatActivity;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new d(this.f3493d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new d(this.f3493d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f3492c;
        if (i10 == 0) {
            h9.d.t(obj);
            ra.b bVar = ra.b.f35351a;
            AppCompatActivity appCompatActivity = this.f3493d;
            this.f3492c = 1;
            obj = bVar.a(appCompatActivity, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            PhSecretSettingsActivity.a aVar2 = PhSecretSettingsActivity.f28398d;
            AppCompatActivity appCompatActivity2 = this.f3493d;
            Objects.requireNonNull(aVar2);
            j0.i(appCompatActivity2, CoreConstants.CONTEXT_SCOPE_VALUE);
            appCompatActivity2.startActivity(new Intent(appCompatActivity2, (Class<?>) PhSecretSettingsActivity.class));
        }
        return w.f31842a;
    }
}
