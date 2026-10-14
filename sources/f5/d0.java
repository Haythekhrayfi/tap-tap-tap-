package f5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f29255b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f29259f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29256c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskCompletionSource<Void> f29257d = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TaskCompletionSource<Void> f29260g = new TaskCompletionSource<>();

    public d0(u4.d dVar) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f29258e = false;
        dVar.a();
        Context context = dVar.f36011a;
        this.f29255b = dVar;
        SharedPreferences sharedPreferencesG = e.g(context);
        this.f29254a = sharedPreferencesG;
        if (sharedPreferencesG.contains("firebase_crashlytics_collection_enabled")) {
            this.f29258e = false;
            boolValueOf = Boolean.valueOf(sharedPreferencesG.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e10) {
                c5.d dVar2 = c5.d.f3604c;
                if (dVar2.a(6)) {
                    Log.e(dVar2.f3605a, "Could not read data collection permission from manifest", e10);
                }
            }
            if (boolValueOf2 == null) {
                this.f29258e = false;
                boolValueOf = null;
            } else {
                this.f29258e = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f29259f = boolValueOf;
        synchronized (this.f29256c) {
            if (a()) {
                this.f29257d.trySetResult(null);
            }
        }
    }

    public synchronized boolean a() {
        boolean zBooleanValue;
        String str;
        Boolean bool = this.f29259f;
        zBooleanValue = bool != null ? bool.booleanValue() : this.f29255b.g();
        String str2 = zBooleanValue ? "ENABLED" : "DISABLED";
        if (this.f29259f == null) {
            str = "global Firebase setting";
        } else {
            str = this.f29258e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        c5.d.f3604c.b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
        return zBooleanValue;
    }
}
