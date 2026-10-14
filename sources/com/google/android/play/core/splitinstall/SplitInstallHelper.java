package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import com.developer.filepicker.model.DialogConfigs;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class SplitInstallHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12368a = new com.google.android.play.core.internal.af("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(Context context, String str) throws UnsatisfiedLinkError {
        synchronized (k.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e10) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String strMapLibraryName = System.mapLibraryName(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strMapLibraryName).length());
                sb2.append(str2);
                sb2.append(DialogConfigs.DIRECTORY_SEPERATOR);
                sb2.append(strMapLibraryName);
                String string = sb2.toString();
                if (!new File(string).exists()) {
                    throw e10;
                }
                System.load(string);
            }
        }
    }

    public static void updateAppInfo(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 25 || i10 >= 28) {
            return;
        }
        com.google.android.play.core.internal.af afVar = f12368a;
        afVar.c("Calling dispatchPackageBroadcast", new Object[0]);
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
            afVar.c("Called dispatchPackageBroadcast", new Object[0]);
        } catch (Exception e10) {
            f12368a.a(e10, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
        }
    }
}
