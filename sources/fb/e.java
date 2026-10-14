package fb;

import android.app.Activity;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import jc.w;
import ma.h;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends l implements uc.l<AppUpdateInfo, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppUpdateManager f29531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f29532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppUpdateManager appUpdateManager, Activity activity) {
        super(1);
        this.f29531c = appUpdateManager;
        this.f29532d = activity;
    }

    @Override // uc.l
    public w invoke(AppUpdateInfo appUpdateInfo) {
        AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
        if (appUpdateInfo2.updateAvailability() == 3) {
            xe.a.b("PremiumHelper").a("UpdateManager: resuming update flow " + appUpdateInfo2, new Object[0]);
            this.f29531c.startUpdateFlow(appUpdateInfo2, this.f29532d, AppUpdateOptions.defaultOptions(1));
            h.f33410y.a().j();
        }
        return w.f31842a;
    }
}
