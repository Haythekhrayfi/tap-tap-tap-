package la;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.w;
import fd.j0;
import ka.d;

/* JADX INFO: loaded from: classes3.dex */
public class c extends com.zipoapps.blytics.a {
    @Override // com.zipoapps.blytics.a
    public void b(Application application, boolean z10) {
        j0.i(application, "application");
        xe.a.b("TestLogPlatform").g("Initialized", new Object[0]);
    }

    @Override // com.zipoapps.blytics.a
    public boolean c(Application application) {
        return true;
    }

    @Override // com.zipoapps.blytics.a
    public void d(d dVar) {
        xe.a.b("TestLogPlatform").a("Session finish: %s", dVar.f31971b);
    }

    @Override // com.zipoapps.blytics.a
    public void e(d dVar) {
        xe.a.b("TestLogPlatform").a("Session start: %s", dVar.f31971b);
    }

    @Override // com.zipoapps.blytics.a
    public void f(String str) {
        xe.a.b("TestLogPlatform").a("Set user id: %s", str);
    }

    @Override // com.zipoapps.blytics.a
    public void g(String str, String str2) {
        xe.a.b("TestLogPlatform").a(w.a("Set user property: ", str, "=", str2), new Object[0]);
    }

    @Override // com.zipoapps.blytics.a
    public void h(String str, Bundle bundle) {
        xe.a.c cVarB = xe.a.b("TestLogPlatform");
        StringBuilder sbA = androidx.activity.result.c.a("Event: ", str, " Params: ");
        sbA.append(bundle.toString());
        cVarB.a(sbA.toString(), new Object[0]);
    }
}
