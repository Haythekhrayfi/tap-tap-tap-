package y6;

import android.app.Activity;
import android.widget.Toast;
import com.inscode.autoclicker.R;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends vc.l implements uc.l<List<String>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f38389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f38390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Activity activity, File file) {
        super(1);
        this.f38389c = activity;
        this.f38390d = file;
    }

    @Override // uc.l
    public jc.w invoke(List<String> list) {
        Activity activity = this.f38389c;
        Toast.makeText(activity, activity.getString(R.string.config_saved_to_path, new Object[]{this.f38390d.getPath()}), 1).show();
        return jc.w.f31842a;
    }
}
