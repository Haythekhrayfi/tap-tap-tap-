package wa;

import androidx.appcompat.app.AppCompatActivity;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements com.zipoapps.premiumhelper.ui.rate.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37245b;

    public o(AppCompatActivity appCompatActivity, uc.a<w> aVar) {
        this.f37244a = appCompatActivity;
        this.f37245b = aVar;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.c.a
    public void a(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c, boolean z10) {
        j0.i(enumC0239c, "reviewUiShown");
        if (enumC0239c == com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE) {
            ma.h.f33410y.a().o(this.f37244a, this.f37245b);
            return;
        }
        uc.a<w> aVar = this.f37245b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
