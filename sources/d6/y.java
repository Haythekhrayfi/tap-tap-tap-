package d6;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static y f28743e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28744a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f28745b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f28746c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<Intent> f28747d = new ArrayDeque();

    public static synchronized y a() {
        if (f28743e == null) {
            f28743e = new y();
        }
        return f28743e;
    }

    public boolean b(Context context) {
        if (this.f28746c == null) {
            this.f28746c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f28745b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f28746c.booleanValue();
    }

    public boolean c(Context context) {
        if (this.f28745b == null) {
            this.f28745b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f28745b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f28745b.booleanValue();
    }
}
