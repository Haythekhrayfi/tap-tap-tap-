package f7;

import com.inscode.autoclicker.shortcut.ShortcutActivity;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends vc.l implements uc.l<v6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ShortcutActivity f29387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f29388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, ShortcutActivity shortcutActivity, boolean z11) {
        super(1);
        this.f29386c = z10;
        this.f29387d = shortcutActivity;
        this.f29388e = z11;
    }

    @Override // uc.l
    public w invoke(v6.a aVar) {
        j0.i(aVar, "it");
        if (this.f29386c) {
            ShortcutActivity shortcutActivity = this.f29387d;
            int i10 = ShortcutActivity.f13310h;
            shortcutActivity.getServiceHolder().b();
            ShortcutActivity.g(this.f29387d, this.f29388e);
        }
        return w.f31842a;
    }
}
