package wa;

import androidx.appcompat.app.AppCompatActivity;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements com.zipoapps.premiumhelper.ui.rate.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37236b;

    public l(AppCompatActivity appCompatActivity, uc.a<w> aVar) {
        this.f37235a = appCompatActivity;
        this.f37236b = aVar;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.c.a
    public void a(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c, boolean z10) {
        j0.i(enumC0239c, "reviewUiShown");
        if (enumC0239c == com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE) {
            ma.h.f33410y.a().o(this.f37235a, this.f37236b);
            return;
        }
        uc.a<w> aVar = this.f37236b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
