package x6;

import android.content.Context;
import android.widget.Toast;
import com.inscode.autoclicker.R;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends vc.l implements uc.l<Throwable, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f37515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, String str) {
        super(1);
        this.f37515c = context;
        this.f37516d = str;
    }

    @Override // uc.l
    public w invoke(Throwable th) {
        Context context = this.f37515c;
        Toast.makeText(context, context.getString(R.string.not_settings_with_name, this.f37516d), 1).show();
        return w.f31842a;
    }
}
