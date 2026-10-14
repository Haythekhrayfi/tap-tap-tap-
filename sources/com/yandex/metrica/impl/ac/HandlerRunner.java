package com.yandex.metrica.impl.ac;

import android.annotation.SuppressLint;
import com.yandex.metrica.impl.ob.U2;
import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes.dex */
public class HandlerRunner {
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    private static void a(String str) {
        try {
            String strFindLibrary = new PathClassLoader(System.getProperty("java.class.path"), System.getProperty("java.library.path"), ClassLoader.getSystemClassLoader()).findLibrary(str);
            if (strFindLibrary != null) {
                System.load(strFindLibrary);
            }
        } catch (Throwable unused) {
        }
    }

    public static void main(String[] strArr) {
        if (U2.a(24)) {
            try {
                System.loadLibrary("appmetrica-native-runner");
            } catch (Throwable unused) {
                a("appmetrica-native-runner");
            }
        } else {
            a("appmetrica-native-runner");
        }
        runHandler(strArr);
    }

    private static native void runHandler(String[] strArr);
}
