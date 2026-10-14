package e2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class a extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28974i = m.e("BatteryChrgTracker");

    public a(Context context, j2.a aVar) {
        super(context, aVar);
    }

    @Override // e2.d
    public Object a() {
        Intent intentRegisterReceiver = this.f28981b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            m.c().b(f28974i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // e2.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // e2.c
    public void g(Context context, Intent intent) {
        Boolean bool;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b10 = 1;
        m.c().a(f28974i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                b10 = !action.equals("android.intent.action.ACTION_POWER_DISCONNECTED") ? (byte) -1 : (byte) 0;
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b10 = -1;
                }
                break;
            case 948344062:
                b10 = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b10 = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                bool = Boolean.FALSE;
                break;
            case 2:
            case 3:
                bool = Boolean.TRUE;
                break;
            default:
                return;
        }
        c(bool);
    }
}
