package ab;

import android.app.Activity;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends vc.l implements uc.l<com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Activity activity) {
        super(1);
        this.f293c = cVar;
        this.f294d = activity;
    }

    @Override // uc.l
    public jc.w invoke(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c) {
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c2 = enumC0239c;
        j0.i(enumC0239c2, "result");
        c cVar = this.f293c;
        cVar.f284g = enumC0239c2 != com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        c.f(cVar, this.f294d, false, 2);
        return jc.w.f31842a;
    }
}
