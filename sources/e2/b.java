package e2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Objects;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class b extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28975i = m.e("BatteryNotLowTracker");

    public b(Context context, j2.a aVar) {
        super(context, aVar);
    }

    @Override // e2.d
    public Object a() {
        Intent intentRegisterReceiver = this.f28981b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        m.c().b(f28975i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // e2.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // e2.c
    public void g(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        m.c().a(f28975i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        c(bool);
    }
}
