package fb;

import android.app.Activity;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import java.util.Objects;
import jc.w;
import ma.f;
import ma.h;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    public static final class a extends l implements uc.l<AppUpdateInfo, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f29527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f29528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AppUpdateManager f29529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Activity f29530f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, long j10, AppUpdateManager appUpdateManager, Activity activity) {
            super(1);
            this.f29527c = hVar;
            this.f29528d = j10;
            this.f29529e = appUpdateManager;
            this.f29530f = activity;
        }

        @Override // uc.l
        public w invoke(AppUpdateInfo appUpdateInfo) {
            AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
            if (appUpdateInfo2.updateAvailability() == 2 && appUpdateInfo2.isUpdateTypeAllowed(1)) {
                f fVar = this.f29527c.f33417f;
                Objects.requireNonNull(fVar);
                j0.i("latest_update_version", Action.KEY_ATTRIBUTE);
                int i10 = fVar.f33405a.getInt("latest_update_version", -1);
                f fVar2 = this.f29527c.f33417f;
                Objects.requireNonNull(fVar2);
                j0.i("update_attempts", Action.KEY_ATTRIBUTE);
                int i11 = fVar2.f33405a.getInt("update_attempts", 0);
                if (i10 != appUpdateInfo2.availableVersionCode() || i11 < this.f29528d) {
                    xe.a.b("PremiumHelper").a("UpdateManager: starting update flow " + appUpdateInfo2, new Object[0]);
                    this.f29529e.startUpdateFlow(appUpdateInfo2, this.f29530f, AppUpdateOptions.defaultOptions(1));
                    this.f29527c.j();
                    if (i10 != appUpdateInfo2.availableVersionCode()) {
                        this.f29527c.f33417f.m("latest_update_version", appUpdateInfo2.availableVersionCode());
                        this.f29527c.f33417f.m("update_attempts", 1);
                    } else {
                        this.f29527c.f33417f.m("update_attempts", i11 + 1);
                    }
                } else {
                    xe.a.b("PremiumHelper").a("UpdateManager: max update attempts reached", new Object[0]);
                }
            } else {
                xe.a.b("PremiumHelper").a("UpdateManager: no updates available " + appUpdateInfo2, new Object[0]);
            }
            return w.f31842a;
        }
    }

    public static final void a(Activity activity) {
        h.a aVar = h.f33410y;
        h hVarA = aVar.a();
        if (!((Boolean) aVar.a().f33418g.h(oa.b.V)).booleanValue()) {
            xe.a.b("PremiumHelper").a("UpdateManager: updates disabled", new Object[0]);
            return;
        }
        long jLongValue = ((Number) hVarA.f33418g.h(oa.b.U)).longValue();
        if (jLongValue <= 0) {
            xe.a.b("PremiumHelper").a("UpdateManager: updates disabled by maxUpdateAttempts", new Object[0]);
            return;
        }
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(activity);
        j0.h(appUpdateManagerCreate, "create(activity)");
        Task<AppUpdateInfo> appUpdateInfo = appUpdateManagerCreate.getAppUpdateInfo();
        j0.h(appUpdateInfo, "appUpdateManager.appUpdateInfo");
        appUpdateInfo.addOnSuccessListener(new c(new a(hVarA, jLongValue, appUpdateManagerCreate, activity), 0));
        appUpdateInfo.addOnFailureListener(new OnFailureListener() { // from class: fb.a
            @Override // com.google.android.play.core.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                xe.a.b("PremiumHelper").c(exc);
            }
        });
    }
}
