package la;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import fd.j0;
import ka.d;

/* JADX INFO: loaded from: classes3.dex */
public class a extends com.zipoapps.blytics.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FirebaseAnalytics f33049b;

    @Override // com.zipoapps.blytics.a
    @SuppressLint({"MissingPermission"})
    public void b(Application application, boolean z10) {
        j0.i(application, "application");
        this.f33049b = FirebaseAnalytics.getInstance(application);
        xe.a.b("FirebasePlatform").g("Initialized", new Object[0]);
    }

    @Override // com.zipoapps.blytics.a
    public boolean c(Application application) {
        return true;
    }

    @Override // com.zipoapps.blytics.a
    public void d(d dVar) {
    }

    @Override // com.zipoapps.blytics.a
    public void e(d dVar) {
    }

    @Override // com.zipoapps.blytics.a
    public void f(String str) {
        FirebaseAnalytics firebaseAnalytics = this.f33049b;
        if (str.length() > 36) {
            str = str.substring(0, 36);
        }
        firebaseAnalytics.f12556a.zzM(str);
    }

    @Override // com.zipoapps.blytics.a
    public void g(String str, String str2) {
        this.f33049b.f12556a.zzN(null, str, str2, false);
    }

    @Override // com.zipoapps.blytics.a
    public void h(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = this.f33049b;
        a(bundle, 100);
        firebaseAnalytics.f12556a.zzx(str, bundle);
    }
}
