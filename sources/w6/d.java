package w6;

import android.view.accessibility.AccessibilityManager;
import fd.j0;
import fd.z;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends vc.l implements uc.l<ae.a, AccessibilityManager> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fe.a aVar) {
        super(1);
        this.f37115c = aVar;
    }

    @Override // uc.l
    public AccessibilityManager invoke(ae.a aVar) {
        j0.i(aVar, "it");
        Object systemService = z.c(this.f37115c).getSystemService("accessibility");
        j0.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return (AccessibilityManager) systemService;
    }
}
