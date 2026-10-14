package ab;

import android.app.Activity;
import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import com.applovin.mediation.MaxDebuggerActivity;
import fd.j0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends vc.l implements uc.p<Activity, Application.ActivityLifecycleCallbacks, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(2);
        this.f305c = cVar;
    }

    @Override // uc.p
    public jc.w invoke(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity2 = activity;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
        j0.i(activity2, "activity");
        j0.i(activityLifecycleCallbacks2, "callbacks");
        if (!c0.t(activity2)) {
            c.f(this.f305c, activity2, false, 2);
        } else if (activity2 instanceof AppCompatActivity) {
            c.b(this.f305c, (AppCompatActivity) activity2);
        } else {
            c.f(this.f305c, activity2, false, 2);
            if (!(activity2 instanceof MaxDebuggerActivity)) {
                StringBuilder sbA = defpackage.a.a("Please use AppCompatActivity for ");
                sbA.append(activity2.getClass().getName());
                String string = sbA.toString();
                j0.i(string, "message");
                if (ma.h.f33410y.a().k()) {
                    throw new IllegalStateException(string.toString());
                }
                xe.a.f37601c.b(string, new Object[0]);
            }
        }
        this.f305c.f278a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
        return jc.w.f31842a;
    }
}
