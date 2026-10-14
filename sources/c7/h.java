package c7;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import java.util.List;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends l implements uc.l<List<? extends String>, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WidgetManualSettingsActivity f3623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WidgetManualSettingsActivity widgetManualSettingsActivity) {
        super(1);
        this.f3623c = widgetManualSettingsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.l
    public w invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        if (list2.size() <= 2 || ma.h.f33410y.a().i()) {
            ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
            WidgetManualSettingsActivity widgetManualSettingsActivity = this.f3623c;
            companion.showSaveAsDialog(widgetManualSettingsActivity, list2, new g(widgetManualSettingsActivity));
        } else {
            u1.a.o(this.f3623c, R.string.more_3_in_pro, -2).setAction(this.f3623c.getString(R.string.buy_pro), new a(this.f3623c, 5)).show();
        }
        return w.f31842a;
    }
}
