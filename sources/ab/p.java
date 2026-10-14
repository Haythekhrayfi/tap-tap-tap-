package ab;

import android.app.Activity;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends vc.l implements uc.l<com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c cVar, Activity activity, boolean z10) {
        super(1);
        this.f317c = cVar;
        this.f318d = activity;
        this.f319e = z10;
    }

    @Override // uc.l
    public jc.w invoke(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c) {
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c2 = enumC0239c;
        j0.i(enumC0239c2, "result");
        c cVar = this.f317c;
        cVar.f284g = enumC0239c2 != com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        cVar.e(this.f318d, this.f319e);
        return jc.w.f31842a;
    }
}
