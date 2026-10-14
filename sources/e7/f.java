package e7;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import java.util.List;
import jc.w;
import ma.h;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends l implements uc.l<List<? extends String>, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WidgetRecordSettingsActivity f29064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WidgetRecordSettingsActivity widgetRecordSettingsActivity) {
        super(1);
        this.f29064c = widgetRecordSettingsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.l
    public w invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        if (list2.size() <= 1 || h.f33410y.a().i()) {
            ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
            WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f29064c;
            companion.showSaveAsDialog(widgetRecordSettingsActivity, list2, new e(widgetRecordSettingsActivity));
        } else {
            u1.a.o(this.f29064c, R.string.more_2_in_pro, -2).setAction(this.f29064c.getString(R.string.buy_pro), new a(this.f29064c, 6)).show();
        }
        return w.f31842a;
    }
}
