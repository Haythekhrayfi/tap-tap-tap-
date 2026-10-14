package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceConnection f14473b;

    public class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public M6(Context context) {
        this(context, new a());
    }

    public M6(Context context, ServiceConnection serviceConnection) {
        this.f14472a = context;
        this.f14473b = serviceConnection;
    }

    public void a() {
        this.f14472a.unbindService(this.f14473b);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.f14472a;
        Intent action = null;
        try {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(H2.a(context).setPackage(str), 0);
            if (resolveInfoResolveService != null) {
                Intent intent = new Intent();
                ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
                action = intent.setClassName(serviceInfo.packageName, serviceInfo.name).setAction("com.yandex.metrica.ACTION_C_BG_L");
            }
        } catch (Throwable unused) {
        }
        if (action != null) {
            this.f14472a.bindService(action, this.f14473b, 1);
        }
    }
}
