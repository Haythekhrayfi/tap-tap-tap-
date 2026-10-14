package z6;

import android.os.Build;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45156c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        Throwable th2 = th;
        fd.j0.i(th2, "it");
        String message = th2.getMessage();
        if (!(message != null && ed.u.x(message, "Operation", false, 2)) || Build.VERSION.SDK_INT < 30) {
            CombinedRecordingsActivity combinedRecordingsActivity = this.f45156c;
            String string = combinedRecordingsActivity.getString(R.string.export_setting_error);
            fd.j0.h(string, "getString(R.string.export_setting_error)");
            CombinedRecordingsActivity.g(combinedRecordingsActivity, string);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[COMBINE_RECORDINGS] [ERROR] (performExport) ");
            sb2.append(th2);
            sb2.append(' ');
            xe.a.f37601c.b(r2.a.a(th2, sb2), new Object[0]);
        } else {
            CombinedRecordingsActivity combinedRecordingsActivity2 = this.f45156c;
            String string2 = combinedRecordingsActivity2.getString(R.string.only_download_folder);
            fd.j0.h(string2, "getString(R.string.only_download_folder)");
            CombinedRecordingsActivity.g(combinedRecordingsActivity2, string2);
        }
        return jc.w.f31842a;
    }
}
