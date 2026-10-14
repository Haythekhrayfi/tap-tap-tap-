package gb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<? extends Activity> f30188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f30189d;

    public c(Class<? extends Activity> cls, b bVar) {
        j0.i(cls, "activityClass");
        j0.i(bVar, "callbacks");
        this.f30188c = cls;
        this.f30189d = bVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        j0.i(activity, "activity");
        if (j0.d(activity.getClass(), this.f30188c)) {
            this.f30189d.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        j0.i(activity, "activity");
        if (j0.d(activity.getClass(), this.f30188c)) {
            this.f30189d.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j0.i(activity, "activity");
        if (j0.d(activity.getClass(), this.f30188c)) {
            this.f30189d.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j0.i(activity, "activity");
        if (j0.d(activity.getClass(), this.f30188c)) {
            this.f30189d.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j0.i(activity, "activity");
        j0.i(bundle, "outState");
        if (j0.d(activity.getClass(), this.f30188c)) {
            this.f30189d.onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        j0.i(activity, "activity");
        if (j0.d(activity.getClass(), this.f30188c)) {
            Objects.requireNonNull(this.f30189d);
            j0.i(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        j0.i(activity, "activity");
        if (j0.d(activity.getClass(), this.f30188c)) {
            Objects.requireNonNull(this.f30189d);
            j0.i(activity, "activity");
        }
    }
}
