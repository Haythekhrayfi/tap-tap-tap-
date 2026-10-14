package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1719j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f16369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16370b = false;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j0$a */
    public static class a {
        public C1719j0 a(BroadcastReceiver broadcastReceiver) {
            return new C1719j0(broadcastReceiver);
        }
    }

    public C1719j0(BroadcastReceiver broadcastReceiver) {
        this.f16369a = broadcastReceiver;
    }

    public synchronized Intent a(Context context, IntentFilter intentFilter) {
        Intent intentRegisterReceiver;
        try {
            intentRegisterReceiver = context.registerReceiver(this.f16369a, intentFilter);
            try {
                this.f16370b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intentRegisterReceiver = null;
        }
        return intentRegisterReceiver;
    }

    public synchronized void a(Context context) {
        if (this.f16370b) {
            try {
                context.unregisterReceiver(this.f16369a);
                this.f16370b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
