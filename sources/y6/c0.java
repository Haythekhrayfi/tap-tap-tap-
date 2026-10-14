package y6;

import android.app.Activity;
import android.os.Build;
import android.widget.Toast;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f38111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Activity activity) {
        super(1);
        this.f38111c = activity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        Throwable th2 = th;
        fd.j0.i(th2, "it");
        boolean z10 = false;
        String string = this.f38111c.getString(R.string.error_saving_items, new Object[]{th2.getMessage()});
        fd.j0.h(string, "activity.getString(R.str…saving_items, it.message)");
        String message = th2.getMessage();
        if (message != null && ed.u.x(message, "Operation", false, 2)) {
            z10 = true;
        }
        if (z10 && Build.VERSION.SDK_INT >= 30) {
            string = this.f38111c.getString(R.string.only_download_folder);
            fd.j0.h(string, "activity.getString(R.string.only_download_folder)");
        }
        Toast.makeText(this.f38111c, string, 1).show();
        return jc.w.f31842a;
    }
}
