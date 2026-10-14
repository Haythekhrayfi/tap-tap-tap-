package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgvw {
    public static zzgvw zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgvr(cls.getSimpleName()) : new zzgvt(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
