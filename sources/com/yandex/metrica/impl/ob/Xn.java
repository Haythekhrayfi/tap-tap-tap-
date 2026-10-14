package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(30)
@DoNotInline
public final class Xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xn f15533a = new Xn();

    private Xn() {
    }

    public static final String a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(str);
        fd.j0.h(installSourceInfo, "packageManager.getInstallSourceInfo(packageName)");
        return installSourceInfo.getInstallingPackageName();
    }
}
