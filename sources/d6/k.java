package d6;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28719c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h0 f28720d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f28722b;

    public k(Context context) {
        this.f28721a = context;
        this.f28722b = j.f28715d;
    }

    public k(Context context, ExecutorService executorService) {
        this.f28721a = context;
        this.f28722b = executorService;
    }

    public static Task<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (y.a().c(context)) {
            h0 h0VarB = b(context, "com.google.firebase.MESSAGING_EVENT");
            synchronized (f0.f28696b) {
                if (f0.f28697c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f0.f28697c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f0.f28697c.acquire(f0.f28695a);
                }
                h0VarB.c(intent).addOnCompleteListener(j.f28716e, new e0(intent));
            }
        } else {
            b(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return Tasks.forResult(-1);
    }

    public static h0 b(Context context, String str) {
        h0 h0Var;
        synchronized (f28719c) {
            if (f28720d == null) {
                f28720d = new h0(context, str);
            }
            h0Var = f28720d;
        }
        return h0Var;
    }

    @KeepForSdk
    public Task<Integer> c(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f28721a;
        return (!(PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? Tasks.call(this.f28722b, new i(context, intent)).continueWithTask(this.f28722b, new g(context, intent)) : a(context, intent);
    }
}
