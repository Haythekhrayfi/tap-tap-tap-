package ab;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Activity activity, c cVar) {
        super(0);
        this.f314c = activity;
        this.f315d = cVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        com.zipoapps.premiumhelper.ui.rate.c cVar = ma.h.f33410y.a().f33424m;
        Activity activity = this.f314c;
        cVar.f((AppCompatActivity) activity, h9.d.g(activity), "relaunch", new m(this.f315d, this.f314c));
        return jc.w.f31842a;
    }
}
