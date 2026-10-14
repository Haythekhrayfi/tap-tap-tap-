package y6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends vc.l implements uc.l<List<Boolean>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38417c = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(List<Boolean> list) {
        boolean z10;
        boolean z11;
        ManualSettingsLoadActivity manualSettingsLoadActivity;
        String string;
        String str;
        List<Boolean> list2 = list;
        xe.a.f37601c.a("[MANUAL_SETTINGS] Import successful: " + list2, new Object[0]);
        fd.j0.h(list2, "it");
        if (!list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Boolean bool = (Boolean) it.next();
                fd.j0.h(bool, "it");
                if (bool.booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z10) {
            if (!list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                    Boolean bool2 = (Boolean) it2.next();
                    fd.j0.h(bool2, "it");
                    if (bool2.booleanValue()) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            if (z11) {
                manualSettingsLoadActivity = this.f38417c;
                string = manualSettingsLoadActivity.getString(R.string.import_some_setting_error);
                str = "getString(R.string.import_some_setting_error)";
            }
            return jc.w.f31842a;
        }
        manualSettingsLoadActivity = this.f38417c;
        string = manualSettingsLoadActivity.getString(R.string.all_settings_imported);
        str = "getString(R.string.all_settings_imported)";
        fd.j0.h(string, str);
        ManualSettingsLoadActivity.h(manualSettingsLoadActivity, string);
        ManualSettingsLoadActivity.k(this.f38417c, false, 1);
        return jc.w.f31842a;
    }
}
