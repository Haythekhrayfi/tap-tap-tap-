package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    private static volatile ClassLoader zza;
    private static volatile Thread zzb;

    public static synchronized ClassLoader zza() {
        if (zza == null) {
            zza = zzb();
        }
        return zza;
    }

    private static synchronized ClassLoader zzb() {
        ClassLoader contextClassLoader = null;
        if (zzb == null) {
            zzb = zzc();
            if (zzb == null) {
                return null;
            }
        }
        synchronized (zzb) {
            try {
                contextClassLoader = zzb.getContextClassLoader();
            } catch (SecurityException e10) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e10.getMessage());
            }
        }
        return contextClassLoader;
    }

    private static synchronized Thread zzc() {
        SecurityException e10;
        Thread zzaVar;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i11];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i11++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i10 >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i10];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i10++;
                }
                if (thread == null) {
                    try {
                        zzaVar = new zza(threadGroup, "GmsDynamite");
                        try {
                            zzaVar.setContextClassLoader(null);
                            zzaVar.start();
                        } catch (SecurityException e11) {
                            e10 = e11;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                        }
                    } catch (SecurityException e12) {
                        e10 = e12;
                        zzaVar = thread;
                    }
                    thread = zzaVar;
                }
            } catch (SecurityException e13) {
                e10 = e13;
                zzaVar = null;
            }
        }
        return thread;
    }
}
