package ab;

import android.app.Activity;
import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import com.android.billingclient.api.ProxyBillingActivity;
import fd.j0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends vc.l implements uc.p<Activity, Application.ActivityLifecycleCallbacks, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar) {
        super(2);
        this.f316c = cVar;
    }

    @Override // uc.p
    public jc.w invoke(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity2 = activity;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
        j0.i(activity2, "activity");
        j0.i(activityLifecycleCallbacks2, "callbacks");
        if (c0.t(activity2)) {
            if (activity2 instanceof AppCompatActivity) {
                c cVar = this.f316c;
                n nVar = new n(activity2, cVar);
                c.a aVar = c.f275h;
                cVar.g(activity2, "relaunch", nVar);
            } else {
                this.f316c.e(activity2, true);
                String str = "Please use AppCompatActivity for " + activity2.getClass().getName();
                j0.i(str, "message");
                if (ma.h.f33410y.a().k()) {
                    throw new IllegalStateException(str.toString());
                }
                xe.a.f37601c.b(str, new Object[0]);
            }
        }
        if (!(activity2 instanceof ProxyBillingActivity)) {
            this.f316c.f278a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
        }
        return jc.w.f31842a;
    }
}
