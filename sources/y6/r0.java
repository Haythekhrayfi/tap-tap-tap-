package y6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38371c = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38371c;
        String string = manualSettingsLoadActivity.getString(R.string.settings_exported_to_directory);
        fd.j0.h(string, "getString(R.string.settings_exported_to_directory)");
        ManualSettingsLoadActivity.h(manualSettingsLoadActivity, string);
        xe.a.f37601c.a("[MANUAL_SETTINGS] Export successful: " + str, new Object[0]);
        return jc.w.f31842a;
    }
}
