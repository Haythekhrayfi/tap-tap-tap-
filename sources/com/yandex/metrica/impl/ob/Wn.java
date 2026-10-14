package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public class Wn {
    public ApplicationInfo a(Context context, String str, int i10) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean a(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public PackageInfo b(Context context, String str, int i10) {
        try {
            return context.getPackageManager().getPackageInfo(str, i10);
        } catch (Throwable unused) {
            return null;
        }
    }
}
