package w6;

import android.content.SharedPreferences;
import android.view.accessibility.AccessibilityManager;
import fd.j0;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends vc.l implements uc.l<ae.a, i7.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fe.a aVar) {
        super(1);
        this.f37116c = aVar;
    }

    @Override // uc.l
    public i7.d invoke(ae.a aVar) {
        j0.i(aVar, "it");
        fe.a aVar2 = this.f37116c;
        ae.b bVar = ae.b.f348c;
        Object objC = aVar2.f29652f.f37311a.c(new yd.h("", b0.a(AccessibilityManager.class), null, bVar));
        j0.g(objC, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return new i7.d((AccessibilityManager) objC, (SharedPreferences) this.f37116c.f29652f.f37311a.c(new yd.h("", b0.a(SharedPreferences.class), null, bVar)));
    }
}
