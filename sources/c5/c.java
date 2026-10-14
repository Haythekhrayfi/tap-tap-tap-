package c5;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f3601b = null;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3603b;

        public b(c cVar, a aVar) {
            int iF = f5.e.f(cVar.f3600a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iF != 0) {
                this.f3602a = "Unity";
                String string = cVar.f3600a.getResources().getString(iF);
                this.f3603b = string;
                d.f3604c.e("Unity Editor version is: " + string);
                return;
            }
            boolean z10 = false;
            if (cVar.f3600a.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = cVar.f3600a.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    z10 = true;
                } catch (IOException unused) {
                }
            }
            if (!z10) {
                this.f3602a = null;
                this.f3603b = null;
            } else {
                this.f3602a = "Flutter";
                this.f3603b = null;
                d.f3604c.e("Development platform is: Flutter");
            }
        }
    }

    public c(Context context) {
        this.f3600a = context;
    }
}
