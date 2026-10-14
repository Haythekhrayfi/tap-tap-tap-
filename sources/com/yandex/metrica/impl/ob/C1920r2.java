package com.yandex.metrica.impl.ob;

import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1920r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final L0 f17201a = new L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f17202b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static int a() {
        return (b() || c()) ? 1 : 0;
    }

    public static boolean b() {
        try {
            return (U2.a(21) ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        for (String str : f17202b) {
            try {
                if (U2.a(31) ? false : new File(str + "su").exists()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
