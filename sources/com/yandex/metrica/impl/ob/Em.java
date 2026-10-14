package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import com.yandex.metrica.MetricaService;

/* JADX INFO: loaded from: classes.dex */
public final class Em implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13948a;

    public Em(Context context) {
        this.f13948a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.f13948a;
        try {
            PackageInfo packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 516);
            } catch (Throwable unused) {
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (MetricaService.class.getName().equals(serviceInfo.name) && !serviceInfo.enabled) {
                        try {
                            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MetricaService.class), 1, 1);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
