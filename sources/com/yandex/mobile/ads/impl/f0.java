package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.MobileAds;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {
    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, MobileAds.class.getClassLoader());
            fd.j0.h(cls, "forName(\n        \"androi…ss.java.classLoader\n    )");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object objInvoke = declaredMethod2.invoke(declaredMethod.invoke(null, new Object[0]), new Object[0]);
            fd.j0.g(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable th) {
            x60.a(th, "Failed to get process name", new Object[0]);
            return null;
        }
    }

    public static String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, MobileAds.class.getClassLoader());
            fd.j0.h(cls, "forName(\n        \"androi…ss.java.classLoader\n    )");
            Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            fd.j0.g(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable th) {
            x60.a(th, "Failed to get process name", new Object[0]);
            return null;
        }
    }
}
