package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import x1.m;
import x1.n;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3188a = m.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m.c().a(f3188a, "Requesting diagnostics", new Throwable[0]);
        try {
            k.c(context).a(new n.a(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e10) {
            m.c().b(f3188a, "WorkManager is not initialized", e10);
        }
    }
}
