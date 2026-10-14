package ab;

import androidx.appcompat.app.AppCompatActivity;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends vc.l implements uc.l<com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, AppCompatActivity appCompatActivity) {
        super(1);
        this.f308c = cVar;
        this.f309d = appCompatActivity;
    }

    @Override // uc.l
    public jc.w invoke(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c) {
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c2 = enumC0239c;
        j0.i(enumC0239c2, "result");
        ma.h.f33410y.a().f33425n.a().b();
        c cVar = this.f308c;
        cVar.f284g = enumC0239c2 != com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        c.f(cVar, this.f309d, false, 2);
        return jc.w.f31842a;
    }
}
