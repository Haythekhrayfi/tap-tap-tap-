package ta;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f35867c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f35868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gb.b f35869b;

    /* JADX INFO: renamed from: ta.a$a, reason: collision with other inner class name */
    public final class C0420a extends gb.b {
        public C0420a(a aVar) {
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            j0.i(activity, "activity");
            b5.d dVarA = b5.d.a();
            StringBuilder sbA = defpackage.a.a("Lifecycle Event: ");
            sbA.append(activity.getComponentName().getClassName());
            sbA.append(" created");
            dVarA.b(sbA.toString());
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            j0.i(activity, "activity");
            b5.d dVarA = b5.d.a();
            StringBuilder sbA = defpackage.a.a("Lifecycle Event: ");
            sbA.append(activity.getComponentName().getClassName());
            sbA.append(" destroyed");
            dVarA.b(sbA.toString());
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            j0.i(activity, "activity");
            b5.d dVarA = b5.d.a();
            StringBuilder sbA = defpackage.a.a("Lifecycle Event: ");
            sbA.append(activity.getComponentName().getClassName());
            sbA.append(" resumed");
            dVarA.b(sbA.toString());
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
        }
    }

    static {
        new b(null);
        f35867c = a.class.getSimpleName();
    }

    public a(Application application) {
        j0.i(application, "application");
        this.f35868a = application;
    }
}
