package ab;

import android.app.Activity;
import android.app.Application;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.p<Activity, Application.ActivityLifecycleCallbacks, jc.w> f292c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(uc.p<? super Activity, ? super Application.ActivityLifecycleCallbacks, jc.w> pVar) {
        this.f292c = pVar;
    }

    @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j0.i(activity, "activity");
        if ((activity instanceof PHSplashActivity) || (activity instanceof StartLikeProActivity)) {
            return;
        }
        j0.i(activity, "<this>");
        if (j0.d(activity.getClass(), ma.h.f33410y.a().f33418g.f34205b.getIntroActivityClass())) {
            return;
        }
        this.f292c.invoke(activity, this);
    }
}
