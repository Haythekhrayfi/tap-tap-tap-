package f0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes.dex */
public class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntentSender f29192a;

    public c(IntentSender intentSender) {
        this.f29192a = intentSender;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            this.f29192a.sendIntent(context, 0, null, null, null);
        } catch (IntentSender.SendIntentException unused) {
        }
    }
}
