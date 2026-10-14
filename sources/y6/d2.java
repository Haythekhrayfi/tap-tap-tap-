package y6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38184c = recordSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38184c;
        String string = recordSettingsLoadActivity.getString(R.string.settings_exported_to_directory);
        fd.j0.h(string, "getString(R.string.settings_exported_to_directory)");
        RecordSettingsLoadActivity.h(recordSettingsLoadActivity, string);
        xe.a.f37601c.a("export successful: " + str, new Object[0]);
        return jc.w.f31842a;
    }
}
