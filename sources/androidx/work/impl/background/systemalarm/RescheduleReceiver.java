package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3146a = m.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m.c().a(f3146a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k kVarC = k.c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Objects.requireNonNull(kVarC);
            synchronized (k.f38007l) {
                try {
                    kVarC.f38016i = pendingResultGoAsync;
                    if (kVarC.f38015h) {
                        pendingResultGoAsync.finish();
                        kVarC.f38016i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e10) {
            m.c().b(f3146a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
