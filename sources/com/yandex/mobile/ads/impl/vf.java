package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f25972a;

    public static IBinder a(Bundle bundle, String str) {
        String str2;
        if (da1.f19803a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f25972a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f25972a = method2;
                method2.setAccessible(true);
                method = f25972a;
            } catch (NoSuchMethodException e10) {
                e = e10;
                str2 = "Failed to retrieve getIBinder method";
                p90.a(str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            e = e11;
            str2 = "Failed to invoke getIBinder via reflection";
            p90.a(str2, e);
            return null;
        }
    }
}
