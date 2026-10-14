package gb;

import android.app.Activity;
import android.app.Application;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Application f30191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.l<Activity, jc.w> f30192d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Application application, uc.l<? super Activity, jc.w> lVar) {
        this.f30191c = application;
        this.f30192d = lVar;
    }

    @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j0.i(activity, "activity");
        if (y8.c0.s(activity)) {
            return;
        }
        this.f30191c.unregisterActivityLifecycleCallbacks(this);
        this.f30192d.invoke(activity);
    }
}
