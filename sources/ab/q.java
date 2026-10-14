package ab;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import fd.j0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends vc.l implements uc.p<Activity, Application.ActivityLifecycleCallbacks, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c cVar, boolean z10) {
        super(2);
        this.f320c = cVar;
        this.f321d = z10;
    }

    @Override // uc.p
    public jc.w invoke(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity2 = activity;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
        j0.i(activity2, "activity");
        j0.i(activityLifecycleCallbacks2, "callbacks");
        boolean z10 = false;
        if ((activity2 instanceof AppCompatActivity) && c0.t(activity2)) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity2;
            Intent intent = appCompatActivity.getIntent();
            if (intent != null && !intent.getBooleanExtra("show_relaunch", true)) {
                z10 = true;
            }
            if (z10) {
                this.f320c.e(activity2, this.f321d);
            } else {
                ma.h.f33410y.a().f33424m.f(appCompatActivity, h9.d.g(activity2), "relaunch", new p(this.f320c, activity2, this.f321d));
            }
        } else {
            c.f(this.f320c, activity2, false, 2);
        }
        this.f320c.f278a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
        return jc.w.f31842a;
    }
}
