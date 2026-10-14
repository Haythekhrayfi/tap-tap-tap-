package y6;

import android.os.Build;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38113c = recordSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        Throwable th2 = th;
        fd.j0.i(th2, "it");
        String message = th2.getMessage();
        if (!(message != null && ed.u.x(message, "Operation", false, 2)) || Build.VERSION.SDK_INT < 30) {
            RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38113c;
            String string = recordSettingsLoadActivity.getString(R.string.export_setting_error);
            fd.j0.h(string, "getString(R.string.export_setting_error)");
            RecordSettingsLoadActivity.h(recordSettingsLoadActivity, string);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[RECORD_SETTINGS] [ERROR] (removeSettings) ");
            sb2.append(th2);
            sb2.append(' ');
            xe.a.f37601c.b(r2.a.a(th2, sb2), new Object[0]);
        } else {
            RecordSettingsLoadActivity recordSettingsLoadActivity2 = this.f38113c;
            String string2 = recordSettingsLoadActivity2.getString(R.string.only_download_folder);
            fd.j0.h(string2, "getString(R.string.only_download_folder)");
            RecordSettingsLoadActivity.h(recordSettingsLoadActivity2, string2);
        }
        return jc.w.f31842a;
    }
}
