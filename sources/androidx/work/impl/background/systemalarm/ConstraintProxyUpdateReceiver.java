package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.g;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3142a = m.e("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f3143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f3144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3145e;

        public a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3143c = intent;
            this.f3144d = context;
            this.f3145e = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f3143c.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3143c.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3143c.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3143c.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m.c().a(ConstraintProxyUpdateReceiver.f3142a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f3144d, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f3144d, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f3144d, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f3144d, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3145e.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            m.c().a(f3142a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            ((j2.b) k.c(context).f38011d).f31695a.execute(new a(this, intent, context, goAsync()));
        }
    }
}
