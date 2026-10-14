package d6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f28695a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f28696b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WakeLock f28697c;

    public static void a(Intent intent) {
        synchronized (f28696b) {
            if (f28697c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f28697c.release();
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (f28696b) {
            if (f28697c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f28697c = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f28697c.acquire(f28695a);
            }
            return componentNameStartService;
        }
    }
}
