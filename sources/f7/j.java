package f7;

import com.inscode.autoclicker.shortcut.ShortcutActivity;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends vc.l implements uc.l<w, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ShortcutActivity f29396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, ShortcutActivity shortcutActivity) {
        super(1);
        this.f29395c = z10;
        this.f29396d = shortcutActivity;
    }

    @Override // uc.l
    public w invoke(w wVar) {
        if (this.f29395c) {
            ShortcutActivity shortcutActivity = this.f29396d;
            int i10 = ShortcutActivity.f13310h;
            shortcutActivity.getServiceHolder().e();
        }
        ShortcutActivity.h(this.f29396d);
        return w.f31842a;
    }
}
