package e2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Objects;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class f extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28991i = m.e("StorageNotLowTracker");

    public f(Context context, j2.a aVar) {
        super(context, aVar);
    }

    @Override // e2.d
    public Object a() {
        Context context = this.f28981b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            Objects.requireNonNull(action);
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    @Override // e2.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // e2.c
    public void g(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        m.c().a(f28991i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        c(bool);
    }
}
