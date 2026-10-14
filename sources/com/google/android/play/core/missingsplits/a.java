package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.android.play.core.internal.af;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final af f12312a = new af("MissingSplitsAppComponentsHelper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PackageManager f12314c;

    public a(Context context, PackageManager packageManager) {
        this.f12313b = context;
        this.f12314c = packageManager;
    }

    private final void a(List<ComponentInfo> list, int i10) {
        for (ComponentInfo componentInfo : list) {
            this.f12314c.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i10, 1);
        }
    }

    private final List<ComponentInfo> d() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f12314c.getPackageInfo(this.f12313b.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            f12312a.d("Failed to resolve own package : %s", e10);
            return Collections.emptyList();
        }
    }

    public final boolean a() {
        for (ComponentInfo componentInfo : d()) {
            if (this.f12314c.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                f12312a.a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f12312a.a("All non-activity components are disabled", new Object[0]);
        return true;
    }

    public final void b() {
        f12312a.c("Disabling all non-activity components", new Object[0]);
        a(d(), 2);
    }

    public final void c() {
        f12312a.c("Resetting enabled state of all non-activity components", new Object[0]);
        a(d(), 0);
    }
}
