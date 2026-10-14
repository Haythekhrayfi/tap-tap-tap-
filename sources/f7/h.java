package f7;

import android.widget.Toast;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.shortcut.ShortcutActivity;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends vc.l implements uc.l<Throwable, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShortcutActivity f29391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ShortcutActivity shortcutActivity) {
        super(1);
        this.f29391c = shortcutActivity;
    }

    @Override // uc.l
    public w invoke(Throwable th) {
        ShortcutActivity shortcutActivity = this.f29391c;
        Toast.makeText(shortcutActivity, shortcutActivity.getString(R.string.error_load_settings_from_shortcut), 1).show();
        this.f29391c.f13315g.d();
        ShortcutActivity.h(this.f29391c);
        return w.f31842a;
    }
}
