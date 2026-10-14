package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzif implements Serializable {
    public static zzif zzc() {
        return zzid.zza;
    }

    public static zzif zzd(Object obj) {
        return new zzig(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}
