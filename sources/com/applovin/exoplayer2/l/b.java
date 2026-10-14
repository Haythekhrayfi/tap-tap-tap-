package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f7610a;

    public static IBinder a(Bundle bundle, String str) {
        return ai.f7595a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        String str2;
        Method method = f7610a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f7610a = method2;
                method2.setAccessible(true);
                method = f7610a;
            } catch (NoSuchMethodException e10) {
                e = e10;
                str2 = "Failed to retrieve getIBinder method";
                q.a("BundleUtil", str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            e = e11;
            str2 = "Failed to invoke getIBinder via reflection";
            q.a("BundleUtil", str2, e);
            return null;
        }
    }
}
