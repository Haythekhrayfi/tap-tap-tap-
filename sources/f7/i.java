package f7;

import com.inscode.autoclicker.shortcut.ShortcutActivity;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends vc.l implements uc.l<t6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ShortcutActivity f29393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f29394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, ShortcutActivity shortcutActivity, boolean z11) {
        super(1);
        this.f29392c = z10;
        this.f29393d = shortcutActivity;
        this.f29394e = z11;
    }

    @Override // uc.l
    public w invoke(t6.a aVar) {
        j0.i(aVar, "it");
        if (this.f29392c) {
            ShortcutActivity shortcutActivity = this.f29393d;
            int i10 = ShortcutActivity.f13310h;
            shortcutActivity.getServiceHolder().b();
            ShortcutActivity.g(this.f29393d, this.f29394e);
        }
        return w.f31842a;
    }
}
