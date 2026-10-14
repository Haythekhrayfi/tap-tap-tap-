package com.google.android.gms.cloudmessaging;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z10);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return zzd.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return zzd.class;
    }
}
