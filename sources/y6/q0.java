package y6;

import android.os.Build;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38364c = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        Throwable th2 = th;
        fd.j0.i(th2, "e");
        String message = th2.getMessage();
        if (!(message != null && ed.u.x(message, "Operation", false, 2)) || Build.VERSION.SDK_INT < 30) {
            ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38364c;
            String string = manualSettingsLoadActivity.getString(R.string.export_setting_error);
            fd.j0.h(string, "getString(R.string.export_setting_error)");
            ManualSettingsLoadActivity.h(manualSettingsLoadActivity, string);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[MANUAL_SETTINGS] [ERROR] (performExport) ");
            sb2.append(th2);
            sb2.append(' ');
            xe.a.f37601c.b(r2.a.a(th2, sb2), new Object[0]);
        } else {
            ManualSettingsLoadActivity manualSettingsLoadActivity2 = this.f38364c;
            String string2 = manualSettingsLoadActivity2.getString(R.string.only_download_folder);
            fd.j0.h(string2, "getString(R.string.only_download_folder)");
            ManualSettingsLoadActivity.h(manualSettingsLoadActivity2, string2);
        }
        return jc.w.f31842a;
    }
}
