package za;

import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements com.zipoapps.premiumhelper.ui.rate.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f45253a;

    public j(uc.a<w> aVar) {
        this.f45253a = aVar;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.c.a
    public void a(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c, boolean z10) {
        j0.i(enumC0239c, "reviewUiShown");
        uc.a<w> aVar = this.f45253a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
