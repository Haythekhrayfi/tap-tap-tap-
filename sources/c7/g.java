package c7;

import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import fd.j0;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends l implements uc.l<String, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WidgetManualSettingsActivity f3622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WidgetManualSettingsActivity widgetManualSettingsActivity) {
        super(1);
        this.f3622c = widgetManualSettingsActivity;
    }

    @Override // uc.l
    public w invoke(String str) {
        String str2 = str;
        j0.i(str2, "name");
        WidgetManualSettingsActivity widgetManualSettingsActivity = this.f3622c;
        int i10 = WidgetManualSettingsActivity.f13265f;
        u6.a aVar = widgetManualSettingsActivity.g().f161c;
        aVar.k(str2);
        aVar.s(System.currentTimeMillis());
        this.f3622c.updateUi();
        this.f3622c.h(aVar);
        return w.f31842a;
    }
}
