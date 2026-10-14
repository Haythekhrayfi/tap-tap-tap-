package f7;

import com.inscode.autoclicker.shortcut.ShortcutActivity;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.l<Boolean, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ShortcutActivity f29399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z10, ShortcutActivity shortcutActivity) {
        super(1);
        this.f29398c = z10;
        this.f29399d = shortcutActivity;
    }

    @Override // uc.l
    public w invoke(Boolean bool) {
        if (this.f29398c) {
            ShortcutActivity shortcutActivity = this.f29399d;
            int i10 = ShortcutActivity.f13310h;
            shortcutActivity.stopWidgetService();
        }
        this.f29399d.f13315g.d();
        return w.f31842a;
    }
}
