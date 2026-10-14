package x6;

import android.content.Context;
import android.widget.Toast;
import com.inscode.autoclicker.R;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.l<Throwable, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f37507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String str) {
        super(1);
        this.f37507c = context;
        this.f37508d = str;
    }

    @Override // uc.l
    public w invoke(Throwable th) {
        Context context = this.f37507c;
        Toast.makeText(context, context.getString(R.string.not_settings_with_name, this.f37508d), 1).show();
        return w.f31842a;
    }
}
