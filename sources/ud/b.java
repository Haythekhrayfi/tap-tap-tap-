package ud;

import android.app.Application;
import android.content.Context;
import fd.j0;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends l implements uc.l<ae.a, Application> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f36366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(1);
        this.f36366c = context;
    }

    @Override // uc.l
    public Application invoke(ae.a aVar) {
        j0.j(aVar, "it");
        return (Application) this.f36366c;
    }
}
