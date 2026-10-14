package ud;

import android.content.Context;
import fd.j0;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends l implements uc.l<ae.a, Context> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f36365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(1);
        this.f36365c = context;
    }

    @Override // uc.l
    public Context invoke(ae.a aVar) {
        j0.j(aVar, "it");
        return this.f36365c;
    }
}
