package e7;

import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import fd.j0;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends l implements uc.l<String, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WidgetRecordSettingsActivity f29063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WidgetRecordSettingsActivity widgetRecordSettingsActivity) {
        super(1);
        this.f29063c = widgetRecordSettingsActivity;
    }

    @Override // uc.l
    public w invoke(String str) {
        String str2 = str;
        j0.i(str2, "name");
        WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f29063c;
        int i10 = WidgetRecordSettingsActivity.f13283g;
        v6.a aVar = widgetRecordSettingsActivity.g().f28802c;
        aVar.j(str2);
        aVar.o(System.currentTimeMillis());
        this.f29063c.updateUi();
        this.f29063c.h(aVar);
        return w.f31842a;
    }
}
