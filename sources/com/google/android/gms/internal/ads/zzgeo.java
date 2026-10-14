package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgeo {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgeo(Class cls, Class cls2, zzgen zzgenVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgeo zzb(zzgem zzgemVar, Class cls, Class cls2) {
        return new zzgel(cls, cls2, zzgemVar);
    }

    public abstract zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
