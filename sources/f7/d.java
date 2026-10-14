package f7;

import com.inscode.autoclicker.shortcut.ShortcutActivity;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends vc.l implements uc.l<u6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ShortcutActivity f29384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z10, ShortcutActivity shortcutActivity) {
        super(1);
        this.f29383c = z10;
        this.f29384d = shortcutActivity;
    }

    @Override // uc.l
    public w invoke(u6.a aVar) {
        if (!this.f29383c) {
            ShortcutActivity.h(this.f29384d);
        }
        return w.f31842a;
    }
}
