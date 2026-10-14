package p6;

import com.inscode.autoclicker.ClickerApplication;
import com.inscode.autoclicker.service.BackgroundService;
import fd.f;
import fd.j0;
import java.util.Objects;
import jc.w;
import vc.b0;
import vc.l;
import yd.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends l implements uc.l<Boolean, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClickerApplication f34464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ClickerApplication clickerApplication) {
        super(1);
        this.f34464c = clickerApplication;
    }

    @Override // uc.l
    public w invoke(Boolean bool) {
        Boolean bool2 = bool;
        xe.a.c cVar = xe.a.f37601c;
        cVar.a("[BackgroundService] Received rx event: " + bool2, new Object[0]);
        j0.h(bool2, "start");
        if (bool2.booleanValue()) {
            ClickerApplication clickerApplication = this.f34464c;
            int i10 = ClickerApplication.f13026f;
            Objects.requireNonNull(clickerApplication);
            cVar.a("[BackgroundService] Starting background service. Checking if enabled.", new Object[0]);
            r6.e eVar = (r6.e) f.d(clickerApplication).f37311a.c(new h("", b0.a(r6.e.class), null, ae.b.f348c));
            StringBuilder sbA = defpackage.a.a("[BackgroundService] Enabled: ");
            sbA.append(eVar.a());
            cVar.a(sbA.toString(), new Object[0]);
            if (eVar.a()) {
                if (!BackgroundService.a(clickerApplication)) {
                    clickerApplication.startService(clickerApplication.a());
                }
                clickerApplication.startService(clickerApplication.a());
            }
        } else {
            ClickerApplication clickerApplication2 = this.f34464c;
            int i11 = ClickerApplication.f13026f;
            if (BackgroundService.a(clickerApplication2)) {
                clickerApplication2.stopService(clickerApplication2.a());
            }
        }
        return w.f31842a;
    }
}
